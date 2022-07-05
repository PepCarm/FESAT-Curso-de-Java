use pelicula;

select peliculas.titulo,
peliculas.cantidad_espectadores as 'Nº de espectadores'
from peliculas inner join directores on peliculas.id_director = directores.id_director
where peliculas.cantidad_espectadores >50000 and directores.nombre = 'Andy Muschietti'
order by 'Nº de espectadores';
