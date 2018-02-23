CREATE TABLE category
(
    id INTEGER DEFAULT nextval('category_id_seq'::regclass) PRIMARY KEY NOT NULL,
    category_no VARCHAR(8) NOT NULL,
    category_name VARCHAR(16) NOT NULL,
    parent_no INTEGER DEFAULT 0 NOT NULL,
    sort_no SMALLINT DEFAULT 0 NOT NULL,
    create_time VARCHAR(20) NOT NULL
);
CREATE UNIQUE INDEX category_category_no_key ON category (category_no);
CREATE UNIQUE INDEX category_category_name_key ON category (category_name);