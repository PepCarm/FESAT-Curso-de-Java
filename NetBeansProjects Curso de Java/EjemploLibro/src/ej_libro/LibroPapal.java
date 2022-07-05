
package ej_libro;

public class LibroPapal {
   
    public static void main(String[] args) {
        
        Libro novela = new Libro(57861023, "Ficciones", "Jorge Luis Borges", 173); //apretar CRTL + espacio
        Libro actualidad =new Libro (45107806, "Pandenomics", "Javier Milei",357);
        
        System.out.println(novela.datosLibro());
        System.out.println(actualidad.datosLibro());
        
        if (novela.getNumPaginas()<actualidad.getNumPaginas()) {
            System.out.println("El Libro " + actualidad.getTituloLibro()+ " tiene más páginas");
        }
        else{
            System.out.println("El libro " + novela.getTituloLibro()+ " tiene más páginas");
        }
    }
}
