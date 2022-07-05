package libro;

/**
 *
 * @author José Carmona
 */
public class Libro {
    
    private long isbn;
    private String tituloLibro, autorLibro;
    private int numPaginas, calificacion;

    public Libro(long isbn, String tituloLibro, String autorLibro, int numPaginas, int calificacion) {
        this.isbn = isbn;
        this.tituloLibro = tituloLibro;
        this.autorLibro = autorLibro;
        this.numPaginas = numPaginas;
        this.calificacion = calificacion;
    }

    //Metodo Constructor
    public Libro() {
        this(0, "", "", 0, 0);
    }

    /**
     * @return el ISBN
     */
    public long getIsbn() {
        return isbn;
    }

    /**
     * @return el título del libro
     */
    public String getTituloLibro() {
        return tituloLibro;
    }

    /**
     * @return el autor
     */
    public String getAutorLibro() {
        return autorLibro;
    }

    /**
     * @return el nº de páginas
     */
    public int getNumPaginas() {
        return numPaginas;
    }

    /**
     * @return la calificación
     */
    public int getCalificacion() {
        return calificacion;
    }

    /**
     * @param isbn 
     */
    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }

    /**
     * @param tituloLibro 
     */
    public void setTituloLibro(String tituloLibro) {
        this.tituloLibro = tituloLibro;
    }

    /**
     * @param autorLibro 
     */
    public void setAutorLibro(String autorLibro) {
        this.autorLibro = autorLibro;
    }

    /**
     * @param numPaginas 
     */
    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    /**
     * @param calificacion 
     */
    public void setCalificacion(int calificacion) { 
        if (calificacion>=0 && calificacion<=10){
            this.calificacion = calificacion;
        }else{
           this.calificacion = 0;
        }
    }
    
    public String datosLibro() {
        return "El Libro "+tituloLibro+" con ISBN "+isbn+" del autor "+autorLibro+" contiene "+numPaginas+" páginas. Calificación "+calificacion+ '}';
    }
   
    
}
