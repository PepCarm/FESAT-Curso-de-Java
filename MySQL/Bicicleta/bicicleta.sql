create database bicicleterias;

use bicicleterias;

create table bicicleteria(
idBicicleteria int,
ganancias decimal(8,2),
cantVentas int,
primary key idBicicleteria
);

insert into bicicleteria
values (1,'78641.89',156),
(2,'54412.23',187),
(3,'0',0);

create table bicicleta (
  nroDeSerie varchar(12),
  modelo varchar(45),
  año year,
  precio decimal(6,2),
  bicicleteria_idBicicleteria int,
  PRIMARY KEY (nroDeSerie),
  FOREIGN KEY (bicicleteria_idBicicleteria) REFERENCES bicicleteria (idBicicleteria)
);

INSERT INTO bicicleta 
VALUES ('mtb1','Bicicleta de Montaña 1',2020,'8900.90',1),
('mtb2','Bicicleta de Montaña 2',2021,'5999.00',1),
('mtb3','Bicicleta de Montaña 2',2021,'5999.00',2),
('playera1','Bicicleta Playera',2021,'3861.24',2),
('plegables1','Bicicletas Plegables',2021,'2574.67',1),
('ruta1','Bicicleta de Ruta 1',2019,'4700.12',2),
('ruta2','Bicicleta de Ruta 1',2019,'4700.12',1);