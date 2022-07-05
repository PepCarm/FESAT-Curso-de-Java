/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acumulador;
import java.util.Scanner;

/**
 *
 * @author José Carmona
 */
public class AcumuladorUno {
    
/**
 * @param args the command line arguments
 */
    public static void main(String[] args) {
        Scanner leerEntrada = new Scanner (System.in);
        Acumulador dato = new Acumulador();
        
        System.out.println("Ingrese un valor entero");
        dato.setValor(leerEntrada.nextInt());
        dato.suma(7);

        System.out.println("El incremento es "+(dato.getValor()));
       
        dato.resta(4);
        
        System.out.println("La disminucion es "+dato.getValor());
        
    }
}
