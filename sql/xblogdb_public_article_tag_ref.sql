CREATE TABLE article_tag_ref
(
    id INTEGER DEFAULT nextval('article_tag_ref_id_seq'::regclass) PRIMARY KEY NOT NULL,
    article_no VARCHAR(12) NOT NULL,
    tag_no VARCHAR(12) NOT NULL,
    CONSTRAINT article_tag_ref_article_no_fkey FOREIGN KEY (article_no) REFERENCES article (article_no),
    CONSTRAINT article_tag_ref_tag_no_fkey FOREIGN KEY (tag_no) REFERENCES tag (tag_no)
);
CREATE UNIQUE INDEX article_tag_ref_article_no_tag_no_key ON article_tag_ref (article_no, tag_no);