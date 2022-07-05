Create database Canchas5;

use Canchas5;

CREATE TABLE cancha (
  idCancha int NOT NULL AUTO_INCREMENT,
  ciudad varchar(45),
  PRIMARY KEY (idCancha)
  );
  
  INSERT INTO cancha VALUES 
  (1,'sr'),
  (2,'ga'),
  (3,'m'),
  (4,'sc');
  
  CREATE TABLE reserva (
  idReserva int NOT NULL AUTO_INCREMENT,
  fecha date,
  idCancha int,
  PRIMARY KEY (idReserva),
  FOREIGN KEY (idCancha) REFERENCES cancha (idCancha)
  );
  
  INSERT INTO reserva VALUES 
  (1,'0000-00-00',1),
  (2,'0000-00-00',1),
  (3,'0000-00-00',2),
  (4,'0000-00-00',3),
  (5,'0000-00-00',2),
  (6,'0000-00-00',2);
  