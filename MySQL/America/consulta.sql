select 
nombre_provincia as 'Provincia',
cantidad_habitantes as 'Nº de Habitantes'
from provincias 
where cantidad_habitantes >150000
order by provincias.cantidad_habitantes desc;
