create database petri_ltda;

use petri_ltda;

create table petriLTDA(
	idEmpresa int primary key not null auto_increment,
    nome varchar(200),
    cnpj numeric(14)
);

create table clientes(
	idCliente int primary key not null auto_increment,
    idEmpresa int,
    rg numeric(10),
    cpf numeric(12),
    nome varchar(200),
    dataNascimento date,
    saldo numeric,
    telefone numeric(15),
    
    foreign key (idEmpresa) references petriLTDA(idEmpresa)
);

create table endereco(
	idEndereco int primary key not null auto_increment,
    idCliente int,
    pais varchar(100),
    estado varchar(100),
    cidade varchar(100),
    bairro varchar(100),
    rua varchar(100),
    complemento varchar(100),
    cep numeric(10),
    
    foreign key
);