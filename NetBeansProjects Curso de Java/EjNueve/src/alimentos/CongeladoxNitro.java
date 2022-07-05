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
public class CongeladoxNitro extends ProductoCongelado {
    
    //Atributos
    private String metododeCongelacion;
    private int tiempoexposicion;
    
    //Metodo Constructor

    public CongeladoxNitro(String metododeCongelacion, int tiempoexposicion, Calendar fechadeEnvasado, String paisdeOrigen, double tempSugerida, Calendar fechadeCaducidad, int numLote) {
        super(fechadeEnvasado, paisdeOrigen, tempSugerida, fechadeCaducidad, numLote);
        this.metododeCongelacion = metododeCongelacion;
        this.tiempoexposicion = tiempoexposicion;
    }

   /**
     * @return metodo de congelacion
     */
    public String getMetododeCongelacion() {
        return metododeCongelacion;
    }
   /**
     * @return mtiempo de exposicion
     */
    public int getTiempoexposicion() {
        return tiempoexposicion;
    }

    /**
     * @param metododeCongelacion a determinar
     */ 
    public void setMetododeCongelacion(String metododeCongelacion) {
        this.metododeCongelacion = metododeCongelacion;
    }

    /**
     * @param tiempoexposicion a determinar
     */ 
    public void setTiempoexposicion(int tiempoexposicion) {
        this.tiempoexposicion = tiempoexposicion;
    }

    public String mostrarxNitro() {
        return "CongeladoxNitro{" + "metododeCongelacion=" + metododeCongelacion + ", tiempoexposicion=" + tiempoexposicion + '}';
    }
    
    
   
    
}
