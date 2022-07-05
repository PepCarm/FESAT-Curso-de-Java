package biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    
   private List<Libro>libros;
   private String localidad;

    public Biblioteca(List<Libro> libros, String localidad) {
        this.libros = libros;
        this.localidad = localidad;
        this.libros =new ArrayList<>();
    }

    public List<Libro> getLibros() {
        return libros;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLibros(List<Libro> libros) {
        this.libros = libros;
    }
   
   public void limpiarReserva (){
       for (int i = 0; i <= libros.size(); i++) {
           this.libros.remove(i);
       }
   }
               
           
       }
