package com.xblog.domain.article.service;

import com.xblog.archi.common.generator.IDGenerator;
import com.xblog.domain.article.dao.ArticleContentMapper;
import com.xblog.domain.article.dao.ArticleMapper;
import com.xblog.domain.article.entity.Article;
import com.xblog.domain.article.entity.ArticleContent;
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
     * @param page
     * @return
     */
    @Override
    public List<Article> getArticleList(int page) {
        return null;
    }
}
