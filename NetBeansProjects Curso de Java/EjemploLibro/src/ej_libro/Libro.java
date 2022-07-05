
package ej_libro;

public class Libro {
    
    private long isbn;
    private String tituloLibro, autorLibro;
    private int numPaginas;

    public Libro(long isbn, String tituloLibro, String autorLibro, int numPaginas) {
        this.isbn = isbn;
        this.tituloLibro = tituloLibro;
        this.autorLibro = autorLibro;
        this.numPaginas = numPaginas;
    }

    public long getIsbn() {
        return isbn;
    }

    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }

    public String getTituloLibro() {
        return tituloLibro;
    }

    public void setTituloLibro(String tituloLibro) {
        this.tituloLibro = tituloLibro;
    }

    public String getAutorLibro() {
        return autorLibro;
    }

    public void setAutorLibro(String autorLibro) {
        this.autorLibro = autorLibro;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    public String datosLibro() {
        return "El libro "+tituloLibro+" con ISBN "+isbn+" del autor "+autorLibro+" contiene "+numPaginas+" páginas";

    }

    
    
    
}
