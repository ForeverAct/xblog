package com.xblog.domain.article.entity;

/**
 *
 * @author Administrator
 * @date 2017/5/20 0020
 */
public class ArticleExt {
    private long id;
    /**
     * 文章编号
     */
    private String articleNo;
    /**
     * 频道编号
     */
    private String channelNo;
    /**
     * 分类编号
     */
    private String categoryNo;
    /**
     * 是否置顶
     */
    private int isTop;
    /**
     * 阅览数
     */
    private long readNum;
    /**
     * 评论数
     */
    private long commentNum;

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

    public String getChannelNo() {
        return channelNo;
    }

    public void setChannelNo(String channelNo) {
        this.channelNo = channelNo;
    }

    public String getCategoryNo() {
        return categoryNo;
    }

    public void setCategoryNo(String categoryNo) {
        this.categoryNo = categoryNo;
    }

    public long getReadNum() {
        return readNum;
    }

    public void setReadNum(long readNum) {
        this.readNum = readNum;
    }

    public long getCommentNum() {
        return commentNum;
    }

    public void setCommentNum(long commentNum) {
        this.commentNum = commentNum;
    }

    public int getIsTop() {
        return isTop;
    }

    public void setIsTop(int isTop) {
        this.isTop = isTop;
    }
}
