use notebook;

select 
orden.idOrden as 'Nro Orden', cliente.apellido
from Orden inner join Cliente 
on Orden.dni = Cliente.dni
where cliente.apellido = 'Rodriguez';