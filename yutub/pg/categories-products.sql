drop table if exists productss;
drop table if exists categoriess;
drop table if exists stores;
create table categoriess(id serial primary key,name varchar(50) not null);

create table productss(id serial primary key,name varchar(50) not null,price numeric(10,2) not null,category_id int ,Foreign key (category_id)  references categoriess(id),store_id int references stores(id));
insert into stores(name)values('28Mall'),('Park Bulvar'),('Deniz Mall'),('Genclik Mall');
insert into categoriess(name)values('Electronics'),('Clothing'),('Books'),('Home&Kitchen'),('Toys'),('Health&Beauty'),('Sports'),('Automotive'),('Jewellery'),('Gardan&Outdoor');
insert into productss(name,price,category_id,store_id)values('Smartphone',799.99,1,1),('Laptop',1200.50,1,2),('T-shirt',25.00,2,2),('Jeans',45.99,2,3),('Novel',15.99,3,1),('Cookware Set',89.99,4,4),('Lego Set',50.00,5,1),('Shampoo',8.50,6,3),('Soccer Ball',20.00,7,null),('Car Battery',150.00,8,null);

select *from productss;
select *from categoriess;
select *from stores;
drop table categoriess;

--select productss.*,categoriess.name as category_name from productss left join categoriess on productss.category_id=categoriess.id;
select productss.name as product_name,productss.price,categoriess.name as category_name,stores.name as store_name from productss left join categoriess on productss.category_id=categoriess.id left join stores on productss.store_id=stores.id;