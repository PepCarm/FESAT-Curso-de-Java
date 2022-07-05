use bicicleterias;
select bicicleteria_idBicicleteria as 'ID',
bicicleteria.cantVentas as 'Cant de Vtas',
count (bicicleta.nroDeSerie) as 'Nro de serie'
from bicicleteria inner join bicicleta
on bicicleteria_idBicicleteria = bicicleta.bicicleteria_idBicicleteria
where bicicleteria.idBicicleteria=1
order by bicicleteria.cantVentas desc;