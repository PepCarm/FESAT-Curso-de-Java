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
public class CongeladoxAgua extends ProductoCongelado{
    
    //Atributos
    private double salinidadagua;
    
    //Metodo Constructor

    public CongeladoxAgua(double salinidadagua, Calendar fechadeEnvasado, String paisdeOrigen, double tempSugerida, Calendar fechadeCaducidad, int numLote) {
        super(fechadeEnvasado, paisdeOrigen, tempSugerida, fechadeCaducidad, numLote);
        this.salinidadagua = salinidadagua;
    }

   /**
     * @return salinidad del agua
     */
    public double getSalinidadagua() {
        return salinidadagua;
    }

    /**
     * @param salinidadagua a determinar
     */ 
    public void setSalinidadagua(double salinidadagua) {
        this.salinidadagua = salinidadagua;
    }

    public String mostrarxAgua() {
        return "CongeladoxAgua{" + "salinidadagua=" + salinidadagua + '}';
    }
    
    
    
}
