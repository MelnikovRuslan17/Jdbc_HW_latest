create schema if not exists netology;
create table netology.CUSTOMERS(
 id int auto_increment primary key ,
 name varchar(255) not null ,
 surname varchar(255) not null ,
 age int CHECK ( age>0 AND age<200 ),
 phone_number varchar(255)
);


insert into netology.CUSTOMERS(name, surname, age, phone_number)
values ('ALEXEY', 'Popov', 35, '12345');

insert into netology.CUSTOMERS(name, surname, age, phone_number)
values ('Alexey', 'Ivanov', 23, '2345');

insert into netology.CUSTOMERS(name, surname, age, phone_number)
values ('Egor', 'Sidorov', 36,'4567');

insert into netology.CUSTOMERS(name, surname, age, phone_number)
values ('AleXey','Kan',45,'34567');

insert into netology.CUSTOMERS(name, surname, age, phone_number)
values ('Ruslan', 'Zen', 65, '53345');

insert into netology.CUSTOMERS(name, surname, age, phone_number)
values ('Anton', 'Chip', 54,'533556');

create table netology.ORDERS(
 id int auto_increment primary key,
 date varchar(255),
 customer_id int,
 product_name varchar(255),
 amount int,
 FOREIGN KEY (customer_id) REFERENCES netology.CUSTOMERS(id)
);

insert into netology.ORDERS(date, customer_id, product_name, amount)
values ('02/23', 1, 'coffee', 12);

insert into netology.ORDERS(date, customer_id, product_name, amount)
values ('03/23', 2, 'tea', 10);

insert into netology.ORDERS(date, customer_id, product_name, amount)
values ('04/23', 3, 'cappuccino',20);

insert into netology.ORDERS(date, customer_id, product_name, amount)
values ('05/23', 4, 'latte', 13);

insert into netology.ORDERS(date, customer_id, product_name, amount)
values ('06/23', 5, 'green_tea', 3);

insert into netology.ORDERS(date, customer_id, product_name, amount)
values ('07/23', 6, 'milk', 2);