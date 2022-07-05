/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alimentos;

import java.util.Calendar;

/**
 *
 * @author José Carmona
 */
public abstract class Producto {
    
   //Atributos 
    private Calendar fechadeCaducidad;
    private int numLote;
    
    //Metodo Constructor

    public Producto(Calendar fechadeCaducidad, int numLote) {
        this.fechadeCaducidad = fechadeCaducidad;
        this.numLote = numLote;
    }
  
    /**
     * @return la fecha de Caducidad
     */
    public Calendar getFechadeCaducidad() {
        return fechadeCaducidad;
    }
  
    /**
     * @return el nº de lote
     */
    public int getNumLote() {
        return numLote;
    }

    /**
     * @param fechadeCaducidad a determinar
     */ 
    public void setFechadeCaducidad(Calendar fechadeCaducidad) {
        this.fechadeCaducidad = fechadeCaducidad;
    }

    /**
     * @param numLote a determinar
     */ 
    public void setNumLote(int numLote) {
        this.numLote = numLote;
    }

    public String mostarProducto() {
        return "Producto{" + "fechadeCaducidad=" + fechadeCaducidad + ", numLote=" + numLote + '}';
    }
    
    
}
