create database america;

use america;

create table paises(
id_pais integer(11) not null auto_increment,
nombre_pais text,
primary key (id_pais));

insert into paises(nombre_pais)
values ('Argentina'),('Chile'),('Uruguay'),('Brasil');
 
CREATE TABLE provincias (
  id_provincia integer(11) NOT NULL AUTO_INCREMENT,
  nombre_provincia text,
  cantidad_habitantes int(11) DEFAULT NULL,
  id_pais integer(11) NOT NULL,
  PRIMARY KEY (id_provincia),
  FOREIGN KEY (id_pais) REFERENCES paises (id_pais));
  
  INSERT INTO provincias 
  VALUES (15,'CABA',3075646,1),
  (16,'Buenos Aires',17541141,1),
  (17,'Chaco',1204541,1),
  (18,'Córdoba',3760450,1),
  (19,'Corrientes',1120801,1),
  (20,'Entre Ríos',1385961,1),
  (21,'Jujuy',770881,1),
  (22,'Mendoza',1990338,1),
  (23,'Misiones',1261294,1),
  (24,'Neuquén',664057,1),
  (25,'Salta',1424397,1),
  (26,'San Juan',781217,1),
  (27,'Santa Fe',3536418,1),
  (28,'Tucumán',1694656,1);
  
  