create table if not exists Categories(id serial primary key,name varchar(50) not null,description text default 'categoriya ucun aciqlama qeyd edimeyib',status boolean default true,create_at timestamp default current_timestamp,update_at timestamp);
select *from Categories;
insert into Categories(name,description,status)values('Paltar','Bu paltar kateqoriyasidir',false);
select * from Categories;
delete from Categories where id=12 ; 
select *from Categories;
insert into Categories(name,description)values('Terevez','Bu terevez kateqoriyasidir'),('Elektronika','Bu paltar kateqoriyasidir'),('Metbex','Bu metbex kateqoriyasidir');
select * from Categories;
insert into Categories(name)values('ofis');
--create table(id serial,name varchar(50) not null,description text default 'kateqoriya ucun aciqlama qeyd edilmeyib',status boolean default true,price double,)
select setval('Categories_id_seq',34);
insert into Categories (name)values('universitet');
select *from Categories;