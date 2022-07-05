use proyectores;

select 
paqueteproyectores.costoEnvio as 'Costo de envio',
gestordepaquetesdeproyectores.nombreEmpresa as 'Empresa'
from paqueteproyectores inner join gestordepaquetesdeproyectores 
on paqueteproyectores.idGestorDePaquetes = gestordepaquetesdeproyectores.idGestorDePaquetes
where paqueteproyectores.costoEnvio >300 and paqueteproyectores.destino ='Tucuman';
