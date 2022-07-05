use Cancha5;

select
cancha.ciudad 
Count (reserva.idCanchas) as 'Cantidad de Reservas'
from cancha inner join reserva
on cancha.idCancha = reserva.idCancha
group by cancha.ciudad
order by count (reserva.idCancha) desc;