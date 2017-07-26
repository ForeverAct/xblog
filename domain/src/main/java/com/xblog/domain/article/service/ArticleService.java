package com.xblog.domain.article.service;

import com.xblog.domain.article.dao.ArticleContentMapper;
import com.xblog.domain.article.dao.ArticleMapper;
import com.xblog.domain.article.entity.Article;
import com.xblog.domain.article.entity.ArticleContent;
import com.xblog.domain.article.entity.ArticleExt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2017/4/23 0023.
 */
@Service
public class ArticleService implements IArticleService {
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
    public int insertArticle(Article article, ArticleContent content) {
        article.setArticleNo("111111");
        articleMapper.insert(article);
        content.setArticleNo(article.getArticleNo());
        return articleContentMapper.insert(content);
    }

    public int insertArticle(Article article, ArticleContent content, ArticleExt ext) {
        return 0;
    }

    public int updateArticle(Article article, ArticleContent content, ArticleExt ext) {
        return 0;
    }

    public int updateArticle(Article article) {
        return 0;
    }

    public int updateArticleContent(ArticleContent content) {
        return 0;
    }

    public int updateArticleExt(ArticleExt ext) {
        return 0;
    }

    public int deleteArticle(long id, String articleNo) {
        return 0;
    }

    public Article getArticle(long id, String articleNo) {
        return null;
    }

    public List<Article> getArticleList() {
        return null;
    }
}
