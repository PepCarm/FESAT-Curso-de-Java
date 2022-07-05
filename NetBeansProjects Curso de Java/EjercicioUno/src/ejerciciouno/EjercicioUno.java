package ejerciciouno;

import java.util.ArrayList;
import java.util.Scanner;

public class EjercicioUno {

    public static void main(String[] args) {
    
    ArrayList<String>identificadorAula  = new ArrayList<String>();
   
   identificadorAula.add("Azul");
   identificadorAula.add("Verde");
   identificadorAula.add("Amarillo");
   
   ArrayList<Integer> bancosAula  = new ArrayList();
   bancosAula.add(40);
   bancosAula.add(35);
   bancosAula.add(30);
            
     System.out.println("Ingrese la cantidad de Alumnos inscriptos para cursar");
     
     Scanner leerDato = new Scanner (System.in);
     
      byte alumnos = leerDato.nextByte();
        
        while (alumnos>40) {
              System.out.println("No dispone de un aula para esa cantidad de inscriptos.");
              alumnos = leerDato.nextByte();
        }
        if (alumnos <=30 && alumnos>=1 ) {
            System.out.println("El aula asignada es el Aula Amarillo");
        }else{
            if (alumnos >30 && alumnos<=35) {
                System.out.println("El aula asignada es el Aula Verde");
            }else{
                if (alumnos >35 && alumnos<=40) {
                    System.out.println("El aula asignada es el Aula Azul");     
                }
            }
        }
    }
    
}
