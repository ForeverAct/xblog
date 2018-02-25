package com.xblog.domain.article.dao;

import com.xblog.domain.article.entity.Article;

import java.util.List;
import java.util.Map;


/**
 *
 *
 * @author WangYue
 * @created 2018-02-25 10:07
 * @modified 2018-02-25 10:07
 * @version 0.0.1
 */
public interface ArticleMapper {
    /**
     * @param article
     *
     * @return
     */
    public int insert(Article article);

    /**
     * @param articleId
     *
     * @return
     */
    public Article getArticleByID(int articleId);

    /**
     * @param articleNo
     *
     * @return
     */
    public Article getArticleByNo(String articleNo);

    /**
     * @param article
     *
     * @return
     */
    public int update(Article article);

    /**
     * @param map
     *
     * @return
     */
    public List<Article> listByPage(Map<String, Object> map);
}
