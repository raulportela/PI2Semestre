CREATE DATABASE Floricultura;
USE Floricultura;

CREATE TABLE Cliente(
Id INT (6) NOT NULL AUTO_INCREMENT,
StatusCliente BOOLEAN NOT NULL,
Nome VARCHAR (30) NOT NULL,
Sobrenome VARCHAR (30) NOT NULL,
RG VARCHAR (20) UNIQUE,
CPF CHAR (15) UNIQUE NOT NULL,
DataNascimento DATE NOT NULL,
Sexo ENUM ('Masculino', 'Feminino') NOT NULL,
UfNascimento CHAR (2),
EstadoNascimento VARCHAR (19),
EstadoCivil ENUM ('Casado','Solteiro','Divorciado','Viúvo'),
Rua VARCHAR (30) NOT NULL,
Numero VARCHAR (5) NOT NULL ,
Bairro VARCHAR (30) NOT NULL,
Cep VARCHAR (8) NOT NULL,
Complemento VARCHAR (50),
Uf CHAR (2) NOT NULL,
Estado VARCHAR (20) NOT NULL,
Telefone VARCHAR (10),
Celular VARCHAR (11),
OutroContato VARCHAR (20),
Email VARCHAR (40),
PRIMARY KEY (Id)
);

CREATE TABLE Produto (
Id INT (6) NOT NULL AUTO_INCREMENT,
-- Código
StatusProduto BOOLEAN NOT NULL,
Produto VARCHAR (30) NOT NULL,
Categoria ENUM ('Flores','Buquês','Plantas','Embalagens','Vazos','Comes/Bebes'),
Descricao TEXT NOT NULL,
Cor VARCHAR (8),
ValorUnitário FLOAT (6,2) NOT NULL,
Quantidade INT (4) NOT NULL,
PRIMARY KEY (Id)
);

CREATE TABLE Venda (
-- Iserir: Quantidade no entidade X relacionamento e no modelo lógico
NotaFiscal CHAR (10) NOT NULL,
DataVenda DATE,
ValorTotal FLOAT (8,2),
IdCliente INT (6),
IdItemVenda INT (6),
PRIMARY KEY (NotaFiscal),
FOREIGN KEY (IdCliente) REFERENCES Cliente (Id),
FOREIGN KEY (IdItemVenda) REFERENCES ItemVenda (Id)
);


CREATE TABLE ItemVenda(
Id INT,
QuantidadeProduto INT,
IdProduto INT(6),
IdVenda INT(6),
FOREIGN KEY (IdProduto) REFERENCES Produto(Id),
FOREIGN KEY (IdVenda)   REFERENCES Venda (Id)

);


-- CRIAR TABELA DE ITENS DE VENDA. VIDE MODELO RELACIONAL
-- SHOW TABLES;
-- DESCRIBE venda;
-- DROP DATABASE Floricultura;