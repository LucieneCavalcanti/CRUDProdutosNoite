create database bdLPIINoite
use bdLPIINoite
create table tbProdutos(
id int not null primary key identity,
descricao varchar(50) not null,
preco decimal(10,2) not null
)
select * from tbProdutos
where preco>10 and preco<15

select * from tbProdutos
where descricao like 'Sab�o%'

insert into tbProdutos 
(descricao, preco)
values
('Sab�o Ip�',15.90)
insert into tbProdutos 
(descricao, preco)
values
('Sab�o Omo',19.90),('Sab�o Ulal�',14.6),
('Macarr�o Renata',4.66),('Miojo',1.99)