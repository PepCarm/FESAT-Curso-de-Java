create database inmuebles;

use inmuebles;

create table inmobiliarias (
  id_inmobiliaria integer not null auto_increment,
  localidad text,
  PRIMARY KEY (id_inmobiliaria)
  );
  
 insert into inmobiliarias 
 values (1,'Mendoza'),
 (2,'San Luis'),
 (3,'Mendoza'),
 (4,'San Juan'),
 (5,'San Juan'),
 (6,'Mendoza'),
 (7,'San Luis');
 
create table propiedades (
  id_propiedad integer not null auto_increment,
  direccion text,
  precio int,
  id_inmobiliaria int,
  primary key (id_propiedad),
 foreign key  (id_inmobiliaria) references inmobiliarias (id_inmobiliaria)
 );
 
insert into propiedades 
value (1,'Casnatti 1472',120000,1),
(2,'Av. San Martin 1719',450000,6),
(3,'Crel Day 147',1470004,2),
(4,'Av. H. Yrygoyen 451',470000,3),
(5,'Juan de Garay 1230',320000,7),
(6,'Losardo 365',360000,1),
(7,'Sarmiento 7852',270000,6);
