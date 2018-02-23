CREATE TABLE tag
(
    id INTEGER DEFAULT nextval('tag_id_seq'::regclass) PRIMARY KEY NOT NULL,
    tag_no VARCHAR(12) NOT NULL,
    tag VARCHAR(16) NOT NULL,
    create_time VARCHAR(20) NOT NULL
);
COMMENT ON COLUMN tag.id IS '标签ID';
COMMENT ON COLUMN tag.tag IS '标签名';
CREATE UNIQUE INDEX tag_tag_no_key ON tag (tag_no);
CREATE UNIQUE INDEX tag_tag_key ON tag (tag);