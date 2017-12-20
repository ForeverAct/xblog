package com.xblog.domain.article.entity;

/**
 *  文章内容
 *
 * @author Administrator
 * @date 2017/5/7 0007
 */
public class ArticleContent {
    private long id;
    /**
     * 文章编号
     */
    private String articleNo;
    /**
     * 文章内容
     */
    private byte[] content;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getArticleNo() {
        return articleNo;
    }

    public void setArticleNo(String articleNo) {
        this.articleNo = articleNo;
    }

    public byte[] getContent() {
        return content;
    }

    public void setContent(byte[] content) {
        this.content = content;
    }
}
