CREATE DATABASE biblioteca;

use biblioteca;

CREATE TABLE bibliotecas (
  id_biblioteca int NOT NULL AUTO_INCREMENT,
  localidad text,
  PRIMARY KEY (id_biblioteca)
  );
  
  INSERT INTO bibliotecas VALUES 
  (1,'San Luis'),(2,'Mendoza'),
  (3,'San Juan'),(4,'Mendoza'),
  (5,'Mendoza');
  
  CREATE TABLE libros (
  id_libros int NOT NULL AUTO_INCREMENT,
  titulo text,
  autor text,
  cantidad_reservas int,
  id_biblioteca int NOT NULL,
  PRIMARY KEY (id_libros),
  FOREIGN KEY (id_biblioteca) REFERENCES bibliotecas (id_biblioteca)
  );
  
  INSERT INTO libros VALUES 
  (1,'Libro1','Autor1',100,1),
  (2,'Libro2','Autor2',200,1),
  (3,'Libro3','Autor3',150,4),
  (4,'Libro4','Autor4',100,3),
  (5,'Libro5','Autor5',200,5),
  (6,'Libro6','Autor6',300,2);