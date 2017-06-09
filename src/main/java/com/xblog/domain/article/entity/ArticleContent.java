package com.xblog.domain.article.entity;

import java.sql.Blob;

/**
 * Created by Administrator on 2017/5/7 0007.
 */
public class ArticleContent {
    private long id;
    private String articleNo;
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
