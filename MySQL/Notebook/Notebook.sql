CREATE DATABASE Notebook;

USE notebook;

CREATE TABLE notebook (
  idNotebook int NOT NULL AUTO_INCREMENT,
  marca varchar(45),
  modelo varchar(45),
  procesador varchar(45),
  disco decimal(3,2),
  PRIMARY KEY (idNotebook)
  );
  
  INSERT INTO notebook 
  VALUES (1,'hp','15-CW1025LA','Procesador AMD RYZEN',1.75),
  (2,'Lenovo','Yoga Slim','Intel Core',1.52),
  (3,'AcerAspire','5920','Intel Core Duo',1.59);
  
 CREATE TABLE cliente (
  dni int NOT NULL AUTO_INCREMENT,
  nombre varchar(45),
  apellido varchar(45),
  direccion varchar(45),
  PRIMARY KEY (dni)
  );
  
  INSERT INTO cliente VALUES 
  (1,12036987,'Juan','Perez','Figueeroa Alcorta 456'),
  (2,27456321,'Martin','Juarez','Paso de Los Andes 1723');
  
  CREATE TABLE orden (
  idOrden int NOT NULL AUTO_INCREMENT,
  creacion datetime,
  envio datetime,
  estado varchar(45),
  dni int,
  PRIMARY KEY (idOrden),
  FOREIGN KEY (dni) REFERENCES cliente (dni)
  );
  
  INSERT INTO orden VALUES 
  (1,'2021-03-14 10:21:56','2021-03-24 12:31:41','recibido',12036987),
  (2,'2021-03-11 12:41:09','2021-03-16 14:14:26','recibido',27456321);
  
  CREATE TABLE detalleorden (
  idDetalleOrden int NOT NULL AUTO_INCREMENT,
  precioUnitario decimal(7,2),
  cantidad int,
  idNotebook int,
  idOrden int,
  PRIMARY KEY (idDetalleOrden),
  FOREIGN KEY (idNotebook) REFERENCES notebook (idNotebook)
  );
  
  INSERT INTO detalleorden VALUES 
  (1,23000.45,2,1,1),
  (2,24000.54,1,1,2),
  (3,26000.74,2,2,2),
  (4,15000.89,1,3,1);