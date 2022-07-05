/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuenta;

/**
 *
 * @author José Carmona
 */
public class Cuenta {
    
    private String nºdeCta;
    private double cantidad;

    public Cuenta(String nºdeCta, double cantidad) {
        this.nºdeCta = nºdeCta;
        this.cantidad = cantidad;
    }

    /**
     * @return el nº de Cuenta
     */
    public String getNºdeCta() {
        return nºdeCta;
    }

    /**
     * @return la Cantidad
     */
    public double getCantidad() {
        return cantidad;
    }

    /**
     * @param nºdeCta a determinar
     */
    public void setNºdeCta(String nºdeCta) {
        this.nºdeCta = nºdeCta;
    }

    /**
     * @param cantidad a determinar
     */
    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }
    
    /**
     * @param cantidad a determinar
     */
    public void deposito (double cantidad){
        this.cantidad = cantidad + this.cantidad;
    }
    
    /**
     * @param cantidad a determinar
     */
    public void retiros (double cantidad){
        this.cantidad = this.cantidad - cantidad;
    }

    public String mostarCuenta() {
        return "Cuenta{" + "n\u00badeCta=" + nºdeCta + ", cantidad=" + cantidad + '}';
    }

}
    


