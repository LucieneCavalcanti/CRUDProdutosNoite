create database bdLPIINoite
use bdLPIINoite
create table tbProdutos(
id int not null primary key identity,
descricao varchar(50) not null,
preco decimal(10,2) not null
)
select * from tbProdutos