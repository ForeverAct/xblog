CREATE TABLE article_content
(
    id INTEGER DEFAULT nextval('article_content_id_seq'::regclass) PRIMARY KEY NOT NULL,
    article_no VARCHAR(12),
    content BYTEA,
    modify_time VARCHAR(20),
    CONSTRAINT article_content_article_no_fkey FOREIGN KEY (article_no) REFERENCES article (article_no)
);