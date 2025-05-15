DROP DATABASE `aula-12`;
CREATE DATABASE `aula-12`;
USE `aula-12`;

CREATE TABLE pes_pessoa (
	id SERIAL PRIMARY KEY,
    pes_nome VARCHAR(200),
    pes_endereco VARCHAR(200),
    pes_telefone VARCHAR(20)
) ENGINE = InnoDB;

select * from pes_pessoa;