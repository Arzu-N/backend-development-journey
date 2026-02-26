
create table Visa_bank_hesabi(hesap_id serial primary key,hesap_sahibi varchar(100)not null,bakiye decimal(15,2) not null default 0.00,para_birimi char(3) not null default 'USD',olusturma_tarihi timestamp default current_timestamp);
create table Master_bank_hesabi(hesap_id serial primary key,hesap_sahibi varchar(100)not null,bakiye decimal(15,2)not null default 0.00,para_birimi char(3)not null default 'USD',olusturma_tarihi timestamp default current_timestamp);
insert into Visa_bank_hesabi(hesap_sahibi,bakiye,para_birimi)values('Ali Yilmaz',1500.50,'USD'),('Ahmet Kaya',2300.75,'EUR'),('Fatma Demir',5000.00,'USD'),('Ayse Yildirim',750.25,'GBP'),('Mehmet Sahin',1200.00,'USD'),('Zeynep Oz',9800.50,'EUR'),('Huseyin Kurt',3000.00,'USD'),('Elif Polat',4100.75,'TRY'),('Burak Tan',2500.30,'USD'),('Cem Aksoy',1800.00,'EUR');
insert into Master_bank_hesabi(hesap_sahibi,bakiye,para_birimi)values('Emre Kilic',200);
show server_encoding;