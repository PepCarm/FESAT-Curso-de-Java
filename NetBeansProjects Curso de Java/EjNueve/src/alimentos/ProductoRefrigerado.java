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
public class ProductoRefrigerado extends Producto{
    
    //Atributos
    private String codigoOrganismo;
    private Calendar fechadeEnvasado;
    private double tempSugerida;
    private String paisdeOrigen;
    
   //Metodo Constructor

    public ProductoRefrigerado(String codigoOrganismo, Calendar fechadeEnvasado, double tempSugerida, String paisdeOrigen, Calendar fechadeCaducidad, int numLote) {
        super(fechadeCaducidad, numLote);
        this.codigoOrganismo = codigoOrganismo;
        this.fechadeEnvasado = fechadeEnvasado;
        this.tempSugerida = tempSugerida;
        this.paisdeOrigen = paisdeOrigen;
    }
  
    /**
     * @return el codigo del Organismo
     */
    public String getCodigoOrganismo() {
        return codigoOrganismo;
    }
  
    /**
     * @return la fecha de envasado
     */
    public Calendar getFechadeEnvasado() {
        return fechadeEnvasado;
    }
  
    /**
     * @return la temperatura de frio
     */
    public double getTempSugerida() {
        return tempSugerida;
    }
  
    /**
     * @return el país de origen
     */
    public String getPaisdeOrigen() {
        return paisdeOrigen;
    }

    /**
     * @param codigoOrganismo a determinar
     */ 
    public void setCodigoOrganismo(String codigoOrganismo) {
        this.codigoOrganismo = codigoOrganismo;
    }

    /**
     * @param fechadeEnvasado a determinar
     */ 
    public void setFechadeEnvasado(Calendar fechadeEnvasado) {
        this.fechadeEnvasado = fechadeEnvasado;
    }

    /**
     * @param tempSugerida a determinar
     */ 
    public void setTempSugerida(double tempSugerida) {
        this.tempSugerida = tempSugerida;
    }

    /**
     * @param paisdeOrigen a determinar
     */ 
    public void setPaisdeOrigen(String paisdeOrigen) {
        this.paisdeOrigen = paisdeOrigen;
    }

    public String mostrarProdRefrigerado() {
        return "ProductoRefrigerado{" + "codigoOrganismo=" + codigoOrganismo + ", fechadeEnvasado=" + fechadeEnvasado + ", tempSugerida=" + tempSugerida + ", paisdeOrigen=" + paisdeOrigen + '}';
    }
    
    
}
