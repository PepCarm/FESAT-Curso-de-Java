/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zapateria;

/**
 *
 * @author José Carmona
 */
public class Zapato {
    
    private int saldoFinal;
    private double precio;
    private String modelo, color;

//Metodo constructor
    public Zapato() {
    }

    public Zapato(int saldoFinal, double precio, String modelo, String color) {
        this.saldoFinal = saldoFinal;
        this.precio = precio;
        this.modelo = modelo;
        this.color = color;
    }
    
    /**
     * @return la cantidad
     */
    public int getSaldoFinal() {
        return saldoFinal;
    }
    
    /**
     * @return el precio
     */
    public double getPrecio() {
        return precio;
    }
    
    /**
     * @return el modelo
     */
    public String getModelo() {
        return modelo;
    }
    
    /**
     * @return el color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param saldoFinal a determinar
     */  
    public void setSaldoFinal(int saldoFinal) {
        this.saldoFinal = saldoFinal;
    }

    /**
     * @param precio a determinar
     */  
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * @param modelo a determinar
     */  
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @param color a determinar
     */  
    public void setColor(String color) {
        this.color = color;
    }

    public void enajenar (int ventas){
        if ((saldoFinal - ventas)<0) {
           this.saldoFinal = 0; 
        }else{
            this.saldoFinal = saldoFinal - ventas;
        }
   }
   public void adquirir (int compras) {
       this.saldoFinal = saldoFinal + compras;
   }

    public String mostarDatos() {
        return "Zapatos{" + "saldoFinal=" + saldoFinal + ", precio=" + precio + ", modelo=" + modelo + ", color=" + color + '}';
    }
    
}
