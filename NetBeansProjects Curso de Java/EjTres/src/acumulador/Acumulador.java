/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acumulador;

/**
 *
 * @author José Carmona
 */
public class Acumulador {
   
    //Atributos
    
    int valor =0;

    public Acumulador() {
    }

    /**
     * Get the value of valor
     *
     * @return the value of valor
     */
    public int getValor() {
        return valor;
    }

    /**
     *
     * @param valor new value of valor
     */
    public void setValor(int valor) {
        this.valor = valor;
    }
    
    public void suma (int unidad) {
         this.valor = unidad + this.valor;
    }
   
    public void resta (int unidad) {
        this.valor = this.valor - unidad;
    }


}
