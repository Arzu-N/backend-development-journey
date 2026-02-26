select *from productss;
select *from categoriess;
insert into categoriess(name)values('Kitabxana'),('Seyahet');
select * from categoriess inner join productss on productss.category_id=categoriess.id;
select * from categoriess cross join productss ;
select * from categoriess full outer join productss on productss.category_id=categoriess.id;
select * from categoriess full outer join productss on productss.category_id=categoriess.id where categoriess.id is null or productss.category_id is null;



