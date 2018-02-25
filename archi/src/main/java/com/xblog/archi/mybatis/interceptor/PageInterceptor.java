package com.xblog.archi.mybatis.interceptor;

import org.apache.ibatis.executor.statement.PreparedStatementHandler;
import org.apache.ibatis.executor.statement.StatementHandler;
import org.apache.ibatis.mapping.BoundSql;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.plugin.*;
import org.apache.ibatis.reflection.DefaultReflectorFactory;
import org.apache.ibatis.reflection.MetaObject;
import org.apache.ibatis.reflection.SystemMetaObject;

import javax.xml.bind.PropertyException;
import java.sql.Connection;
import java.util.Map;
import java.util.Properties;

/**
 * 分页拦截器
 *
 * @author WangYue
 * @version 0.0.1
 * @created 2018-02-25 16:21
 * @modified 2018-02-25 16:21
 */
@Intercepts({@Signature(type = StatementHandler.class, method = "prepare", args = {Connection.class, Integer.class})})
public class PageInterceptor implements Interceptor {

    private String dialect = "";
    private String pageSqlId = "";

    @Override
    public Object intercept(Invocation invocation) throws Throwable {
        StatementHandler statementHandler = (StatementHandler) invocation.getTarget();
        // 通过MetaObject优雅访问对象的属性，这里是访问statementHandler的属性
        MetaObject metaObject = MetaObject.forObject(statementHandler, SystemMetaObject.DEFAULT_OBJECT_FACTORY, SystemMetaObject.DEFAULT_OBJECT_WRAPPER_FACTORY, new DefaultReflectorFactory());
        // 先拦截到RoutingStatementHandler，里面有个StatementHandler类型的delegate变量，其实现类是BaseStatementHandler，然后就到BaseStatementHandler的成员变量mappedStatement
        MappedStatement mappedStatement = (MappedStatement)metaObject.getValue("delegate.mappedStatement");
        // 配置文件中SQL语句的ID
        String id = mappedStatement.getId();
        // 需要拦截的ID(正则匹配)
        // String matchRegex = ".+ByPage$";
        //匹配在mybatis中定义的与分页有关的查询id
        if(id.matches(pageSqlId)) {
            // BoundSql中有原始的sql语句和对应的查询参数
            BoundSql boundSql = statementHandler.getBoundSql();
            // 获取原始SQL
            String sql = boundSql.getSql();

            Map<String, Object> params = (Map<String, Object>) boundSql.getParameterObject();
            Page page = (Page) params.get("page");
            String pageSql = buildPageSQL(sql, page);
            metaObject.setValue("delegate.boundSql.sql", pageSql);
        }
        return invocation.proceed();
    }

    @Override
    public Object plugin(Object target) {
        return Plugin.wrap(target, this);
    }

    @Override
    public void setProperties(Properties properties) {
        dialect = properties.getProperty("dialect");
        if ((dialect == null) || (dialect.equals(""))) {
            try {
                throw new PropertyException("dialect property is not found!");
            } catch (PropertyException e) {
                e.printStackTrace();
            }
        }
        pageSqlId = properties.getProperty("pageSqlId");
        if ((pageSqlId == null) || (pageSqlId.equals(""))) {
            try {
                throw new PropertyException("pageSqlId property is not found!");
            } catch (PropertyException e) {
                e.printStackTrace();
            }
        }
    }

    private String buildPageSQL(String sql, Page page) {
        if(dialect.equals(POSTGRESQLDIALECT)) {
            return sql + " limit " + page.getLimit() + " offset " + page.getOffset();
        }else if(dialect.equals(MYSQLDIALECT)) {
            return sql + " limit " + page.getOffset() + " , " + page.getLimit();
        }
        return null;
    }

    private static final String POSTGRESQLDIALECT = "postgresql";
    private static final String MYSQLDIALECT = "mysql";
}
