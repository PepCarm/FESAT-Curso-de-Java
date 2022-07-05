package ejemplofecha;

import java.util.Calendar;

public class EjemploFecha {

    private static Calendar fechaHoraTurno; //Calendar es la clase y "fechaHoraTurno" es objeto

    public static void main(String[] args) {

         
        fechaHoraTurno.set(2020, 11, 11, 15, 30, 0);//el orden es año, mes, dia, hora, minutos, segundos.
        System.out.println(fechaHoraTurno.getTime());//esta es la forma de ver la hora
        
        // fechaHoraTurno.set(Calendar.YEAR, 2021)
        //System.out.println(fechaHoraTurno.getTime()); me muestra el dia 11 de dic pero de 2021.

        
        fechaHoraTurno.set(Calendar.YEAR, 2020);
        fechaHoraTurno.set(Calendar.MONTH, 11);//el mes arranca en 0, o sea ene es 0, feb, 1, y asi...
        fechaHoraTurno.set(Calendar.DATE, 11);
        fechaHoraTurno.set(Calendar.HOUR_OF_DAY, 15);
        fechaHoraTurno.set(Calendar.MINUTE, 30);
        fechaHoraTurno.set(Calendar.SECOND, 0);
        System.out.println(fechaHoraTurno.getTime());
        
        EjemploFecha.setTurno(2021, 1, 1, 16, 0, 0);
        System.out.println(fechaHoraTurno.getTime());
    }
          
    public static void setTurno(int anio, int  mes, int dia, int hora, int minuto, int segundo){
            
        fechaHoraTurno.set(Calendar.YEAR, anio);
        fechaHoraTurno.set(Calendar.MONTH, mes);
        fechaHoraTurno.set(Calendar.DATE, dia);
        fechaHoraTurno.set(Calendar.HOUR_OF_DAY, hora);
        fechaHoraTurno.set(Calendar.MINUTE, minuto);
        fechaHoraTurno.set(Calendar.SECOND, segundo);
}
    
    
    
}