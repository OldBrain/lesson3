DROP TABLE users IF EXISTS;
CREATE TABLE IF NOT EXISTS users (id bigserial, name VARCHAR(255), PRIMARY KEY (id));
INSERT INTO users (name) VALUES ('Bob');

DROP TABLE product IF EXISTS;
CREATE TABLE IF NOT EXISTS product (id bigserial, title VARCHAR(255), price INTEGER, PRIMARY KEY (id));
-- INSERT INTO items (title,price) VALUES ('box',150);