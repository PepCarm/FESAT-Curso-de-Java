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
public class CongeladoxAire extends ProductoCongelado {
    
    //Atributos
    private double nitrogeno, oxigeno, dioxidocarbono, vapordeagua;

    //MetodoConstructor
 
    public CongeladoxAire(double nitrogeno, double oxigeno, double dioxidocarbono, double vapordeagua, Calendar fechadeEnvasado, String paisdeOrigen, double tempSugerida, Calendar fechadeCaducidad, int numLote) {
        super(fechadeEnvasado, paisdeOrigen, tempSugerida, fechadeCaducidad, numLote);
        this.nitrogeno = nitrogeno;
        this.oxigeno = oxigeno;
        this.dioxidocarbono = dioxidocarbono;
        this.vapordeagua = vapordeagua;
    }

    /**
     * @return % de nitrogeno
     */
    public double getNitrogeno() {
        return nitrogeno;
    }
  
    /**
     * @return % de oxigeno
     */
    public double getOxigeno() {
        return oxigeno;
    }
  
    /**
     * @return % dioxido de carbono
     */
    public double getDioxidocarbono() {
        return dioxidocarbono;
    }
  
    /**
     * @return %vapor de agua
     */
    public double getVapordeagua() {
        return vapordeagua;
    }

    /**
     * @param nitrogeno a determinar
     */ 
    public void setNitrogeno(double nitrogeno) {
        this.nitrogeno = nitrogeno;
    }

    /**
     * @param oxigeno a determinar
     */ 
    public void setOxigeno(double oxigeno) {
        this.oxigeno = oxigeno;
    }

    /**
     * @param dioxidocarbono a determinar
     */ 
    public void setDioxidocarbon(double dioxidocarbono) {
        this.dioxidocarbono = dioxidocarbono;
    }

    /**
     * @param vapordeagua a determinar
     */ 
    public void setVapordeagua(double vapordeagua) {
        this.vapordeagua = vapordeagua;
    }

    public String mostrarXAire() {
        return "CongeladoxAire{" + "nitrogeno=" + nitrogeno + ", oxigeno=" + oxigeno + ", dioxidocarbono=" + dioxidocarbono + ", vapordeagua=" + vapordeagua + '}';
    }
    
    
    
}
