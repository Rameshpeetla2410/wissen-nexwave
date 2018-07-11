create database products_db;
use products_db;

create table products_db.PRODUCTS(
	id int primary key auto_increment,
	name varchar(255),
	price double,
	make_date date,
	image varchar(255),
	description longtext
);

create table products_db.REVIEWS(
	id int primary key auto_increment,
	stars int,
	author varchar(255),
	body longtext,
	product_id int references products_db.PRODUCTS(id)
);