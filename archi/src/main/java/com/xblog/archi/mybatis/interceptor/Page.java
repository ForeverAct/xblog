package com.xblog.archi.mybatis.interceptor;

/**
 * 分页参数
 *
 * @author WangYue
 * @version 0.0.1
 * @created 2018-02-25 16:47
 * @modified 2018-02-25 16:47
 */
public class Page {
    private int limit = 10;
    private int offset = 0;

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }
}
