package com.xblog.domain.article.dao;

import com.xblog.domain.article.entity.Article;

import java.util.List;

/**
 *
 * @author Administrator
 * @date 2017/4/23 0023
 */
public interface ArticleMapper {
    public int insert(Article article);
    public Article getArticleByID(int articleId);
    public Article getArticleByNo(String articleNo);
    public int update(Article article);
    // public List<Article> list();
}
