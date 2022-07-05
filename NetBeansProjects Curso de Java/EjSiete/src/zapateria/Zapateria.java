/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zapateria;

import java.util.ArrayList;

/**
 *
 * @author José Carmona
 */
public class Zapateria {
    
    public static ArrayList<Zapato> mercaderia = new ArrayList<Zapato>();

//Los get and setter
    
    public static ArrayList<Zapato> getMercaderia() {
        return mercaderia;
    }

    public static void setMercaderia(ArrayList<Zapato> Mercaderia) {
        Zapateria.mercaderia = Mercaderia;
    }
    
    public void agrgearZapatos (Zapato nuevoZapato){
        this.mercaderia.add(nuevoZapato);
    }
    public void quitarZapatos (Zapato quitarZapato){
        this.mercaderia.remove(quitarZapato);
    }
    public void mostrarStock(){
        for (int i = 0; i < mercaderia.size(); i++) {
            System.out.println(mercaderia.get(i).mostarDatos());
        }
    }
    
}
