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

    public int updateArticleContent(ArticleContent content);

    public int updateArticleExt(ArticleExt ext);

    public int deleteArticle(long id, String articleNo);

    public Article getArticle(long id, String articleNo);

    public List<Article> getArticleList();
}
