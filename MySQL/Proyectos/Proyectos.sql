CREATE DATABASE Proyectores;

USE Proyectores;

CREATE TABLE gestordepaquetesdeproyectores (
  idGestorDePaquetes int NOT NULL AUTO_INCREMENT,
  nombreEmpresa varchar(45),
  PRIMARY KEY (idGestorDePaquetes) 
  );
  
  INSERT INTO gestordepaquetesdeproyectores VALUES 
  (1,'Tac'),
  (2,'La Union'),
  (3,'Andreani');
  
  CREATE TABLE paqueteproyectores (
  codPaquete int NOT NULL AUTO_INCREMENT,
  destino varchar(45),
  costoEnvio float,
  destinatario varchar(45),
  idGestorDePaquetes int,
  PRIMARY KEY (codPaquete),
  FOREIGN KEY (idGestorDePaquetes) REFERENCES gestordepaquetesdeproyectores (idGestorDePaquetes)
  );
  
  INSERT INTO paqueteproyectores VALUES 
  (1,'Mendoza',250.58,'Flia.Lopez',1),
  (2,'Tucuman',350.86,'Flia Mendez',3),
  (3,'San Juan',470.36,'flia Maunas',3),
  (4,'Tucuman',570.69,'Flia Mendoza',2),
  (5,'Tucuman',208.32,'Flia Serrano',2),
  (6,'Mendoza',475.38,'Flia Flores',1);