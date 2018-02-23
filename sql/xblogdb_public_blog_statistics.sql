CREATE TABLE blog_statistics
(
    id SERIAL4 PRIMARY KEY NOT NULL,
    article_total INTEGER,
    read_total INTEGER,
    comment_total INTEGER,
    user_total INTEGER,
    category_total INTEGER,
    tag_total INTEGER,
    last_time VARCHAR(20)
);
COMMENT ON COLUMN blog_statistics.last_time IS '最新更新时间';