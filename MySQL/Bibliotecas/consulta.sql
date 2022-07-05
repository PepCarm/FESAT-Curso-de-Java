use biblioteca;

select 
libros.autor, libros.cantidad_reservas
from libros inner join bibliotecas 
on libros.id_biblioteca= bibliotecas.id_biblioteca
where cantidad_reservas > 100 and bibliotecas.localidad ='Mendoza'
order by libros.cantidad_reservas desc;