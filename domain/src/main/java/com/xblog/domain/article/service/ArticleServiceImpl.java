package com.xblog.domain.article.service;

import com.xblog.archi.common.generator.IDGenerator;
import com.xblog.archi.mybatis.interceptor.Page;
import com.xblog.domain.article.dao.ArticleContentMapper;
import com.xblog.domain.article.dao.ArticleMapper;
import com.xblog.domain.article.entity.Article;
import com.xblog.domain.article.entity.ArticleContent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author WangYue
 * @created 2018-02-25 10:07
 * @modified 2018-02-25 10:07
 * @version 0.0.1
 */
@Service
public class ArticleServiceImpl implements IArticleService {
    @Autowired
    private ArticleMapper articleMapper;
    @Autowired
    private ArticleContentMapper articleContentMapper;

    /**
     * 新增文章
     * @param article
     * @param content
     * @return
     */
    @Override
    public int insertArticle(Article article, ArticleContent content) {
        article.setArticleNo(IDGenerator.randomNumberUniq8());
        articleMapper.insert(article);
        content.setArticleNo(article.getArticleNo());
        return articleContentMapper.insert(content);
    }

    @Override
    public int updateArticle(Article article, ArticleContent content) {
        return 0;
    }

    @Override
    public int updateArticle(Article article) {
        return articleMapper.update(article);
    }

    /**
     * 更新文章内容
     *
     * @param content
     * @return
     */
    @Override
    public int updateArticleContent(ArticleContent content) {
        return articleContentMapper.update(content);
    }

    /**
     * 删除文章
     *
     * @param id
     * @param articleNo
     * @return
     */
    @Override
    public int deleteArticle(long id, String articleNo) {
        return 0;
    }

    /**
     * 获取文章
     *
     * @param id
     * @param articleNo
     * @return
     */
    @Override
    public Article getArticle(long id, String articleNo) {
        return null;
    }

    /**
     * 获取文章列表
     *
     * @param map
     * @return
     */
    @Override
    public List<Article> getArticleList(Map<String, String> map) {
        Page page = new Page();
        page.setLimit(Integer.parseInt(map.get("numPerPage")));
        page.setOffset((Integer.parseInt(map.get("pageNum"))-1)*page.getLimit());
        Map<String, Object> param = new HashMap<String, Object>();
        param.put("page", page);
        List<Article> list = articleMapper.listByPage(param);
        return list;
    }
}
