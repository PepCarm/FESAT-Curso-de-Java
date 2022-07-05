package bicicleteria;

public class Bicicleta {
    
    private String nroDeSerie;
    private String modelo;
    private int anio;
    private float precio;

    public Bicicleta() {
    }

    public Bicicleta(String nroDeSerie, String modelo, int anio, float precio) {
        this.nroDeSerie = nroDeSerie;
        this.modelo = modelo;
        this.anio = anio;
        this.precio = precio;
    }

    public String getNroDeSerie() {
        return nroDeSerie;
    }

    public void setNroDeSerie(String nroDeSerie) {
        this.nroDeSerie = nroDeSerie;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
    
    
}
