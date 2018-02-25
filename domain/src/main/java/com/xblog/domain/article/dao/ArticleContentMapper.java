package com.xblog.domain.article.dao;

import com.xblog.domain.article.entity.ArticleContent;

/**
 *
 * @author WangYue
 * @created 2018-02-25 10:07
 * @modified 2018-02-25 10:07
 * @version 0.0.1
 */
public interface ArticleContentMapper {
    /**
     * @param content
     *
     * @return
     */
    public int insert(ArticleContent content);

    /**
     * @param articleNo
     *
     * @return
     */
    public ArticleContent getArticleContentByNo(String articleNo);

    /**
     * @param article
     *
     * @return
     */
    public int update(ArticleContent article);

}
