package com.xblog.domain.article.service;

import com.xblog.domain.article.entity.Article;
import com.xblog.domain.article.entity.ArticleContent;

import java.util.List;
import java.util.Map;

/**
 *
 * @author WangYue
 * @created 2018-02-25 10:07
 * @modified 2018-02-25 10:07
 * @version 0.0.1
 */
public interface IArticleService {
    /**
     * 插入文章
     * @param article
     * @param content
     * @return
     */
    public int insertArticle(Article article, ArticleContent content);

    /**
     * @param article
     * @param content
     *
     * @return
     */
    public int updateArticle(Article article, ArticleContent content);

    /**
     * @param article
     *
     * @return
     */
    public int updateArticle(Article article);

    /**
     * 更新文章内容
     *
     * @param content
     * @return
     */
    public int updateArticleContent(ArticleContent content);


    /**
     * 删除文章
     *
     * @param id
     * @param articleNo
     * @return
     */
    public int deleteArticle(long id, String articleNo);

    /**
     * 获取文章
     *
     * @param id
     * @param articleNo
     * @return
     */
    public Article getArticle(long id, String articleNo);

    /**
     * 获取文章列表
     *
     * @param map
     * @return
     */
    public List<Article> getArticleList(Map<String, String> map);
}
