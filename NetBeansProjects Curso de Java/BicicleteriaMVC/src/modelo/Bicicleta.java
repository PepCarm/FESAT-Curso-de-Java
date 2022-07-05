package modelo;

public class Bicicleta {
    
    private String nroDeSerie;
    private String modelo;
    private int anio;
    private float precio;

    public Bicicleta(String nroDeSerie, String modelo, int anio) {
        this.nroDeSerie = nroDeSerie;
        this.modelo = modelo;
        this.anio = anio;
    }

    public Bicicleta(String bm1, String zenith, int i, double d) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getNroDeSerie() {
        return nroDeSerie;
    }

    public float getPrecio() {
        return precio;
    }
    
    
}
