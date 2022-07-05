use esc_mendoza;

select 
alumnos.nombre, alumnos.documento, alumnos.promedio
from alumnos inner join escuelas on alumnos.id_escuela = escuelas.id_escuela
where alumnos.promedio > 6 and escuelas.localidad ='Mendoza'
order by alumnos.promedio desc;