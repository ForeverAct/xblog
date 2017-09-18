package com.xblog.domain.article.service;

import com.xblog.domain.article.entity.Article;
import com.xblog.domain.article.entity.ArticleContent;
import com.xblog.domain.article.entity.ArticleExt;

import java.util.List;

/**
 * Created by Administrator on 2017/6/7 0007.
 */
public interface IArticleService {
    /**
     * 插入文章
     * @param article
     * @param content
     * @return
     */
    public int insertArticle(Article article, ArticleContent content, ArticleExt ext);

    public int updateArticle(Article article, ArticleContent content, ArticleExt ext);

    public int updateArticle(Article article);

    /**
     * 更新文章内容
     *
     * @param content
     * @return
     */
    public int updateArticleContent(ArticleContent content);

    /**
     * 更新文章扩展信息
     *
     * @param ext
     * @return
     */
    public int updateArticleExt(ArticleExt ext);

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
     * @param page
     * @return
     */
    public List<Article> getArticleList(int page);
}
