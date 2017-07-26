package com.xblog.archi.context;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * Created by Administrator on 2017/4/25 0025.
 */
public class SpringContextTool implements ApplicationContextAware {
    private static ApplicationContext context;
    @Override
    public void setApplicationContext(ApplicationContext ac)
            throws BeansException {
        context = ac;
    }
    public static ApplicationContext getApplicationContext() {
        return context;
    }
    public static Object getBean(String beanId) {
        return context.getBean(beanId);
    }
}