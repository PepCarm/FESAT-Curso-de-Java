/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reloj;

/**
 *
 * @author José Carmona
 */
public class Hora {
  
    /**
     * @param args the command line arguments
     */  
    public static void main(String[] args) {
        Reloj a = new Reloj(12,47,00);
        
        a.incrementarReloj(2, 27, 45);
        System.out.println(a.mostrarHora());
        
        a.disminuirReloj(4, 39, 56);
        System.out.println(a.mostrarHora());

    }
}
