
package bicicleteria;

public class Bicicleta {
    
    private String nroDeSerie;
    private String modelo;
    private int año;
    private float precio;

    public Bicicleta(String nroDeSerie, String modelo, int año) {
        this.nroDeSerie = nroDeSerie;
        this.modelo = modelo;
        this.año = año;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public float getPrecio() {
        return precio;
    }

    public String getNroDeSerie() {
        return nroDeSerie;
    }

    public String getModelo() {
        return modelo;
    }
    
    public String mostarBicicleta() {
        return "Bicicleta{" + "nroDeSerie=" + nroDeSerie + ", modelo=" + modelo + ", a\u00f1o=" + año + '}';
    }
    
    
    
}
