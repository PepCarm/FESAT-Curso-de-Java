create database pelicula;

use pelicula;

create table directores (
  id_director integer not null auto_increment,
  nombre text,
  primary key (id_director)
  );
  
  insert into directores 
  values (1,'Martin Scorsese'),
  (2,'Steven Spielberg'),
  (3,'Francis Ford Coppola'),
  (4,'Andy Muschietti');
  
  create table peliculas (
  id_peliculas integer not null auto_increment,
  titulo text,
  cantidad_espectadores integer,
  id_director integer,
  primary key (id_peliculas),
  foreign key (id_director) references directores (id_director)
  );
  
  insert into peliculas 
  values (1,'Buenos Muchachos',1205674,1),
  (2,'Tiburon',750000,2),
  (3,'Taxi Driver',475000,1),
  (4,'It',575000,4),
  (5,'Mama',75000,4),
  (6,'El padrino',1250000,3),
  (7,'Jurasiic Park',890000,2);