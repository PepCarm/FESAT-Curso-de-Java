use inmuebles;

select propiedades.direccion, propiedades.precio
from propiedades inner join inmobiliarias 
on propiedades.id_inmobiliaria= inmobiliarias.id_inmobiliaria 
where inmobiliarias.localidad = 'Mendoza' and propiedades.precio > 350000
order by propiedades.precio desc;

