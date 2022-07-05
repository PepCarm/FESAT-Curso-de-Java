package biblioteca;

public abstract class Divulgacion extends Libro{
    
    String tematica;

    public Divulgacion(String tematica, String titulo, String autor, int cantidadDeReservas) {
        super(titulo, autor, cantidadDeReservas);
        this.tematica = tematica;
    }

    public String getTematica() {
        return tematica;
    }

    public void setTematica(String tematica) {
        this.tematica = tematica;
    }
    

}
