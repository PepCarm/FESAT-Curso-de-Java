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
public class ProductoFresco extends Producto {

    //Atributos
   private Calendar fechadeEnvasado;
   private String paisdeOrigen;
    
//Metodo Constructor

    public ProductoFresco(Calendar fechadeEnvasado, String paisdeOrigen, Calendar fechadeCaducidad, int numLote) {
        super(fechadeCaducidad, numLote);
        this.fechadeEnvasado = fechadeEnvasado;
        this.paisdeOrigen = paisdeOrigen;
    }
  
    /**
     * @return la fecha de envasado
     */
    public Calendar getFechadeEnvasado() {
        return fechadeEnvasado;
    }
  
    /**
     * @return el país de origen
     */
    public String getPaisdeOrigen() {
        return paisdeOrigen;
    }

    /**
     * @param fechadeEnvasado a determinar
     */ 
    public void setFechadeEnvasado(Calendar fechadeEnvasado) {
        this.fechadeEnvasado = fechadeEnvasado;
    }

    /**
     * @param paisdeOrigen a determinar
     */ 
    public void setPaisdeOrigen(String paisdeOrigen) {
        this.paisdeOrigen = paisdeOrigen;
    }

    public String mostrarProdFresco() {
        return "ProductoFresco{" + "fechadeEnvasado=" + fechadeEnvasado + ", paisdeOrigen=" + paisdeOrigen + '}';
    }

    
    
    
    
}
