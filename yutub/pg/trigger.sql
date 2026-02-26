drop table product;
drop table category;

create table category(category_id serial primary key,category_name varchar(100)not null,description text);
create table product(product_id serial primary key,product_name varchar(100)not null,price decimal(10,2)not null,category_id int,foreign key(category_id)references category(category_id));
insert into category(category_name,description)values('Elektronik','Elektronik cihazlar ve aksesuarlar'),('Mobilya','Ev ve ofis mobilyalari'),('Giyim','Erkek,kadin ve cocuk giyim urunleri'),('Kitap','Kitaplar ve yayinlar'),('Spor','Spor ekipmanlari ve giysileri');
select *from category;
insert into product(product_name,price,category_id)values('Laptop',1500.00,1),('Akilli telefon',800.00,1),('Tablet',400.00,1),('Televizyon',1200.00,1),('Kulaklik',50.00,1);
insert into product(product_name,price,category_id)values('Yemek masasi',350.00,2),('Ofis sandalyesi',150.00,2),('Kitaplik',200.00,2),('Koltuk takimi',1200.00,2),('Gardirop',800.00,2);
insert into product(product_name,price,category_id)values('Erkek Tshirt',20.00,3),('Kadin pantolon',40.00,3),('Cocuk mont',60.00,3),('Spor ceket',70.00,3),('Kot pantolon',50.00,3);
insert into product(product_name,price,category_id)values('Roman',15.00,4),('Ansiklopedi',120.00,4),('Cizgi roman',25.00,2),('Bilik kitabi',35.00,4),('Tarih kitabi',30.00,4);
insert into product(product_name,price,category_id)values('Futbol topu',25.00,5),('Basketbol topu',30.00,5),('Kosu ayakkabisi',120.00,5),('Yoga mati',20.00,5),('Agirlik seti',200.00,5);
select* from category;
select *from product;
delete from product where product_id=1;
delete from category where category_id=1;