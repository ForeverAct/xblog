CREATE TABLE article
(
    id SERIAL4 PRIMARY KEY NOT NULL,
    article_no VARCHAR(12) NOT NULL,
    title VARCHAR(36) NOT NULL,
    summary VARCHAR(100) NOT NULL,
    category_no VARCHAR(8),
    author VARCHAR(16),
    publish_state SMALLINT DEFAULT 0 NOT NULL,
    publish_time VARCHAR(20),
    recommend_state SMALLINT DEFAULT 0,
    create_time VARCHAR(20),
    modify_time VARCHAR(20),
    status SMALLINT DEFAULT 1 NOT NULL,
    CONSTRAINT article_category_no_fkey FOREIGN KEY (category_no) REFERENCES category (category_no)
);
COMMENT ON COLUMN article.article_no IS '文章编号';
COMMENT ON COLUMN article.title IS '标题';
COMMENT ON COLUMN article.summary IS '文章摘要';
COMMENT ON COLUMN article.category_no IS '分类编号';
COMMENT ON COLUMN article.author IS '作者';
COMMENT ON COLUMN article.publish_state IS '发布状态';
COMMENT ON COLUMN article.publish_time IS '发布时间';
COMMENT ON COLUMN article.recommend_state IS '是否推荐 0：否；1：是';
COMMENT ON COLUMN article.create_time IS '创建时间';
COMMENT ON COLUMN article.modify_time IS '修改时间';
COMMENT ON COLUMN article.status IS '数据状态 0: 删除；1: 正常；';
CREATE UNIQUE INDEX article_article_no_key ON article (article_no);
CREATE UNIQUE INDEX article_title_key ON article (title);