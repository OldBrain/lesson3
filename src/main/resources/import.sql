-- DROP TABLE users IF EXISTS;
-- CREATE TABLE IF NOT EXISTS users (id bigserial, name VARCHAR(255), PRIMARY KEY (id));
-- INSERT INTO users (name) VALUES ('Bob');

DROP TABLE order_list IF EXISTS;
DROP TABLE customer IF EXISTS;
DROP TABLE product IF EXISTS;

CREATE TABLE IF NOT EXISTS product (id bigserial, title VARCHAR(255), price INTEGER, PRIMARY KEY (id));
INSERT INTO product (title,price) VALUES ('Cкобы для S1216 , 12,9*10 мм , 5000 шт. ',150);
INSERT INTO product (title,price) VALUES ('Автомат для зачистки изоляции Профи усиленный',250);
INSERT INTO product (title,price) VALUES ('Адаптер для бит с защёлкой USP-3321',180);
INSERT INTO product (title,price) VALUES ('Бокорезы 115 мм, мини, синие ручки',112);
INSERT INTO product (title,price) VALUES ('Болторез Профи USP-2608 600мм',130);
INSERT INTO product (title,price) VALUES ('Вороток 1/2 (трещотка), Профи',650);
INSERT INTO product (title,price) VALUES ('Гвозди для F50 , 1,05*1.25 , 40 мм , 5000шт.',220);

CREATE TABLE IF NOT EXISTS customer(id bigserial, customer_name VARCHAR(255),PRIMARY KEY (id));
INSERT INTO customer (customer_name) VALUES ('Peter')
INSERT INTO customer (customer_name) VALUES ('Bob')
INSERT INTO customer (customer_name) VALUES ('Dany')



CREATE TABLE IF NOT EXISTS order_list (id bigserial, order_date VARCHAR(10), customer_id bigint references customer(id), product_id bigint references product(id), product_price INTEGER, product_quantity INTEGER, PRIMARY KEY (id));
INSERT INTO order_list(order_date, customer_id, product_id, product_price, product_quantity) VALUES ('10/03/2021',1,2,100,5);
INSERT INTO order_list(order_date, customer_id, product_id, product_price, product_quantity) VALUES ('10/03/2021',1,1,100,5);
INSERT INTO order_list(order_date, customer_id, product_id, product_price, product_quantity) VALUES ('10/03/2021',1,3,100,5);
INSERT INTO order_list(order_date, customer_id, product_id, product_price, product_quantity) VALUES ('10/03/2021',2,1,100,5);
