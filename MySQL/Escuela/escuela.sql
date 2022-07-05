create database esc_Mendoza;

use esc_Mendoza;

create table escuelas (
id_escuela int not null auto_increment,
nombre text,
localidad text,
primary key (id_escuela)
);

insert into escuelas
values (1,'Escuela nº 10','Mendoza'),
(2,'Escuela nº 45','Mendoza'),
(3,'Escuela  nº 18','Mendoza'),
(4,'Escuela nº 15, ',' San Luis');

CREATE TABLE alumnos (
  id_alumnos int(11) NOT NULL AUTO_INCREMENT,
  id_escuela int(11) DEFAULT NULL,
  nombre text,
  documento int(11) DEFAULT NULL,
  promedio int(11) DEFAULT NULL,
  PRIMARY KEY (id_alumnos),
  KEY id_escuela (id_escuela),
  FOREIGN KEY (id_escuela) REFERENCES escuelas (id_escuela));
  
  insert into alumnos 
  values (1,2,'Paula Serrano',357860711,6),
  (2,1,'Juan Allievi',391208251,9),
  (3,3,'Ariadna Videla',356636987,8),
  (4,1,'Agostina Miranda',37012396,4),
  (5,2,'Macarena Hernandez',34010097,5),
  (6,4,'Nicolas Jimenez',32194969,3),
  (7,2,'Sergio Prieto',3378965032,7),
  (8,1,'Facundo Quiroga',326974100,9),
  (9,3,'Melisa Aguirre',312036854,7),
  (10,4,'Romina Fernandez',340453777,4);