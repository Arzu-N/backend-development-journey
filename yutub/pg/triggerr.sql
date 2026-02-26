create table category2(id serial primary key,name varchar(255)not null );
create table products2(id serial primary key,name varchar(255)not null,category_id int not null,foreign key(category_id)references category2(id)on delete cascade);
insert into category2 (name) values('Electronics'),('Books'),('Clothing'),('Home Appliances'),('Toys');
insert into products2(name,category_id)values('Laptop',1),('Smartphone',1),('Tablet',1),('Headphone',1),('Smartwatch',1);
insert into products2(name,category_id)values('Novel',2),('Science Fiction',2),('Biography',2),('History Book',2),('Children''s Book',2);
insert into products2(name,category_id)values('T-Shirt',3),('Jeans',3),('Jacket',3),('Dress',3),('Shoes',3);
insert into products2(name,category_id)values('Refrigerator',4),('Washing Mashine',4),('Microwave',4),('Dishwasher',4),('Air Conditioner',4);
insert into products2(name,category_id)values('Lego',5),('Doll',5),('Puzzle',5),('Remote Control Car',5),('Board Game',5);
--function
create or replace function delete_products_with_category() returns trigger as $$ begin
delete from products2 where category_id=old.id;
return old;
end;
$$ language plpgsql;
--trigger
create trigger trigger_delete_products after delete on category2 for each row execute  delete_products_with_category();
delete from category2 where id=1;


select *from products2;
select *from  category2;
