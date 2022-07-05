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
public abstract class ProductoCongelado extends Producto{
    
   //Atributos 
    private Calendar fechadeEnvasado;
    private String paisdeOrigen;
    private double tempSugerida;
   
    //Metodo Constructor

    public ProductoCongelado(Calendar fechadeEnvasado, String paisdeOrigen, double tempSugerida, Calendar fechadeCaducidad, int numLote) {
        super(fechadeCaducidad, numLote);
        this.fechadeEnvasado = fechadeEnvasado;
        this.paisdeOrigen = paisdeOrigen;
        this.tempSugerida = tempSugerida;
    }
  
    /**
     * @return la fecha de Envasado
     */
    public Calendar getFechadeEnvasado() {
        return fechadeEnvasado;
    }
  
    /**
     * @return el pias de origen
     */
    public String getPaisdeOrigen() {
        return paisdeOrigen;
    }
  
    /**
     * @return la temperatura de frio
     */
    public double getTempSugerida() {
        return tempSugerida;
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

    /**
     * @param tempSugerida a determinar
     */ 
    public void setTempSugerida(double tempSugerida) {
        this.tempSugerida = tempSugerida;
    }

    public String mostrarProdCongelado() {
        return "ProductoCongelado{" + "fechadeEnvasado=" + fechadeEnvasado + ", paisdeOrigen=" + paisdeOrigen + ", tempSugerida=" + tempSugerida + '}';
    }
    
    
}
