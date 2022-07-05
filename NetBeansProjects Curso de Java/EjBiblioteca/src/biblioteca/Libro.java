package biblioteca;

public abstract class Libro {
    
    private String titulo;
    private String autor;
    private int cantidadDeReservas;

    public Libro(String titulo, String autor, int cantidadDeReservas) {
        this.titulo = titulo;
        this.autor = autor;
        this.cantidadDeReservas = cantidadDeReservas;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getCantidadDeReservas() {
        return cantidadDeReservas;
    }

    public void setCantidadDeReservas(int cantidadDeReservas) {
        this.cantidadDeReservas = cantidadDeReservas;
    }

    public void registarReserva(int reserva){
    this.cantidadDeReservas += reserva;
    }
    
    public abstract int esDififcilDeLeer();
    
    
    
}
