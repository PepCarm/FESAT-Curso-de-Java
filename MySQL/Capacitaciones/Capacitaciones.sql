Create database Capacitaciones;

use Capacitaciones;

create table Alumno (
  pseudonimo varchar(45) ,
  nombre varchar(45),
  PRIMARY KEY (pseudonimo)
  );
  
  insert into alumno values 
  ('Mari19','Maria'),
  ('Nastya','Anastasia'),
  ('Tati','Tatiana');
  
  
  CREATE TABLE capacitacion (
  nombre varchar(45),
  PRIMARY KEY (`nombre`)
);

INSERT INTO capacitacion VALUES 
('Bases de Datos'),
('Programacion 1'),
('Testing');
  
  
  create table nivel (
  idnivel int NOT NULL AUTO_INCREMENT,
  nombre varchar(45),
  ejercicios_necesarios int,
  capacitacion_nombre varchar(45),
  PRIMARY KEY (idnivel),
  FOREIGN KEY (capacitacion_nombre) REFERENCES capacitacion (nombre)
  );
  
  insert into nivel VALUES 
  (1,'Intro',10,'Bases de Datos'),
  (2,'Clase 1',20,'Bases de Datos'),
  (3,'Clase 2',35,'Bases de Datos'),
  (4,'L1',5,'Programacion 1'),
  (5,'L2',10,'Programacion 1'),
  (6,'Intro',20,'Testing'),
  (7,'Clase 1',30,'Testing'),
  (8,'Clase 2',40,'Testing'),
  (9,'Clase 3',50,'Testing');
  
  Create table registro_capacitacion (
  alumno_pseudonimo varchar(45),
  capacitacion_nombre varchar(45),
  PRIMARY KEY (alumno_pseudonimo,capacitacion_nombre),
  FOREIGN KEY (alumno_pseudonimo) REFERENCES alumno (pseudonimo),
  FOREIGN KEY (capacitacion_nombre) REFERENCES capacitacion (nombre)
  );
  
insert into registro_capacitacion values 
('Mari19','Bases de Datos'),
('Tati','Bases de Datos'),
('Nastya','Programacion 1'),
('Tati','Programacion 1'),
('Mari19','Testing');