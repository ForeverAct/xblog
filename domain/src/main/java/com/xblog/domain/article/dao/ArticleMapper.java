package com.xblog.domain.article.dao;

import com.xblog.domain.article.entity.Article;

/**
 * Created by Administrator on 2017/4/23 0023.
 */
public interface ArticleMapper {
    public int insert(Article article);
    public Article getArticleByID(int articleId);
    public Article getArticleByNo(String articleNo);
}
