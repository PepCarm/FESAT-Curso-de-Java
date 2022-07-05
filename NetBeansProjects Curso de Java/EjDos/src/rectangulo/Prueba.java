/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rectangulo;

/**
 *
 * @author José Carmona
 */
public class Prueba {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    Rectangulo r1 = new Rectangulo(2.7,4.6);
       
        System.out.println(r1.area());
        System.out.println(r1.perimetro());
        System.out.println(r1.mostrarDatos()+" tiene un perimimetro "+r1.perimetro()+" y un área de "+r1.area());
       
    Rectangulo r2 = new Rectangulo (0,0);
      
        r2.setAltura(8.3);
        r2.setBase(5.9);
        System.out.println(r2.area());
        System.out.println(r2.perimetro());  
        System.out.println(r2.mostrarDatos()+" tiene un perimetro "+r2.perimetro()+" y un área de "+r2.area());
              
     Rectangulo r3 = new Rectangulo (0,0);
     r3.setAltura (6.7);
     r3.setBase(9.5);
        System.out.println(r3.area());
        System.out.println(r3.perimetro());  
        System.out.println(r3.mostrarDatos()+" tiene un perimetro "+r3.perimetro()+" y un área de "+r3.area());
    }
}
