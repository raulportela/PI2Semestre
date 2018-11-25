CREATE DATABASE CrudPOO;

USE CrudPOO;

CREATE TABLE Pessoa(
id INT AUTO_INCREMENT,
nome VARCHAR (20) NOT NULL,
sobrenome VARCHAR (60) NOT NULL,
cpf VARCHAR(11) NOT NULL UNIQUE,
dataNascimento DATE NOT NULL,
PRIMARY KEY (id)); 	

CREATE TABLE Cliente (
id INT AUTO_INCREMENT,
idPessoa INT,
disponivel boolean,
PRIMARY KEY (id),
FOREIGN KEY (idPessoa) REFERENCES Pessoa (id));

CREATE TABLE Funcionario (
id INT AUTO_INCREMENT,
idPessoa INT,
disponivel boolean,
nomeUsuario VARCHAR (20),
senha VARCHAR (500),
cargo VARCHAR (40),
rg VARCHAR (18),
PRIMARY KEY (id),
FOREIGN KEY (idPessoa) REFERENCES Pessoa (id));