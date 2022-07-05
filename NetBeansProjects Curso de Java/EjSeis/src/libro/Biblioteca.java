
package libro;

import java.util.ArrayList;

/**
 *
 * @author José Carmona
 */
public class Biblioteca {
    
    //Atributos
    private String nombre;
    private ArrayList<Libro> libros;//
    
    //Metodo Constructor
    public Biblioteca(String nombre){
        this.nombre = nombre;
        this.libros = new ArrayList<Libro>();
    }

    /**
     * @return la lista de libros
     */    
    public ArrayList<Libro> getLibros(){
        return libros;
    }  

    /**
     * @return el nombre del título
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param libros
     */    
    public void setLibros(ArrayList<Libro> libros){
        this.libros = libros;
    }

    /**
     * @param nuevoLibro
     */    
    public void agregarLibro(Libro nuevoLibro){
        this.libros.add(nuevoLibro);
    }
    
    /**
     * @param quitarLibro
     */
    public void eliminarxTitulo(String quitarLibro){
        for (int i = 0; i <libros.size(); i++) {
            if (libros.get(i).getTituloLibro().equalsIgnoreCase(nombre)) {
                this.libros.remove(i);
            }
        }System.out.println("El Libro ha sido elimanado");
    }
    
    /**
     * @param borrarLibro
     */
    public void eliminarxAutor (String borrarLibro) {
        for (int i = 0; i < libros.size(); i++) {
            if (libros.get(i).getAutorLibro().equalsIgnoreCase(nombre)) {
                this.libros.remove(i);
            }
        }System.out.println("El libro ha sido eliminado");
    }
    
    /**
     * @param valorAlto
     */
    public void maximaCalificacion (int valorAlto){
        for (int i = 0; i <libros.size(); i++) {
            if (libros.get(i).getCalificacion() == 10) { 
                System.out.println(libros.get(i).getTituloLibro());
            }
        }
    }
    
    /**
     * @param valorBajo
     */
    public void minimaCalificacion (int valorBajo){
        for (int i = 0; i <libros.size(); i++) {
            if (libros.get(i).getCalificacion()==0) {
                System.out.println(libros.get(i).getTituloLibro());
            }
        }
    }

    public void mostrarLibros() {
        for (int i = 0; i < libros.size(); i++) {
            System.out.println(libros.get(i).datosLibro());
        }
    }
}
