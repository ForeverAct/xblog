CREATE TABLE article_statistics
(
    id INTEGER DEFAULT nextval('article_statistics_id_seq'::regclass) PRIMARY KEY NOT NULL,
    article_no VARCHAR(12) NOT NULL,
    read_num INTEGER DEFAULT 1 NOT NULL,
    thumbsup_num INTEGER DEFAULT 1 NOT NULL,
    user_num INTEGER DEFAULT 1 NOT NULL,
    CONSTRAINT article_statistics_article_no_fkey FOREIGN KEY (article_no) REFERENCES article (article_no)
);
COMMENT ON COLUMN article_statistics.read_num IS '浏览数';
COMMENT ON COLUMN article_statistics.thumbsup_num IS '点赞数';
COMMENT ON COLUMN article_statistics.user_num IS '用户数';


