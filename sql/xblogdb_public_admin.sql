CREATE TABLE admin
(
    id INTEGER DEFAULT nextval('admin_id_seq'::regclass) PRIMARY KEY NOT NULL,
    user_no VARCHAR(16) NOT NULL,
    user_name VARCHAR(16) NOT NULL,
    password VARCHAR(16) NOT NULL,
    last_login VARCHAR(20),
    create_time VARCHAR(20) NOT NULL
);
CREATE UNIQUE INDEX admin_user_no_key ON admin (user_no);
CREATE UNIQUE INDEX admin_user_name_key ON admin (user_name);