package libro;

/**
 *
 * @author José Carmona
 */
public class Libreria {
 
    /**
     * @param args the command line arguments
     */    
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca("Miguel Cervantes");
         
        Libro l1 = new Libro();
        l1.setTituloLibro("Martin Fierro");
        l1.setAutorLibro("Jose Hernandez");
        l1.setNumPaginas(679);
        l1.setIsbn(45201315);
        l1.setCalificacion(7);
        System.out.println(l1.datosLibro());
        biblioteca.agregarLibro(l1);
        
        Libro l2 = new Libro();
        l2.setTituloLibro("Ficciones");
        l2.setAutorLibro("Jorge Luis Borges");
        l2.setIsbn(10738511);
        l2.setNumPaginas(378);
        l2.setCalificacion(6);
        System.out.println(l2.datosLibro());
        biblioteca.agregarLibro(l2);
        
        Libro l3 = new Libro();
        l3.setTituloLibro("El verano del potro");
        l3.setAutorLibro("Rodolfo Otero");
        l3.setIsbn(42768429);
        l3.setNumPaginas(85);
        l3.setCalificacion(4);
        System.out.println(l3.datosLibro());
        biblioteca.agregarLibro(l3);

        Libro l4 =new Libro();
        l4.setTituloLibro("Robison Crusoe");
        l4.setAutorLibro("Daniel Defoe");
        l4.setIsbn(10576520);
        l4.setNumPaginas(756);
        l4.setCalificacion(9);
        System.out.println(l4.datosLibro());
        biblioteca.agregarLibro(l4);
        
        Libro l5 =new Libro();
        l5.setTituloLibro("Bodas de Sangre");
        l5.setAutorLibro("Federico Garcia Lorca");
        l5.setNumPaginas(124);
        l5.setIsbn(24179830);
        l5.setCalificacion(6);
        System.out.println(l5.datosLibro());
        biblioteca.agregarLibro(l5);
     
        //Imprime el contenido de la biblioteca
        biblioteca.mostrarLibros();
        
     //Eliminar libro x nombre
        biblioteca.eliminarxAutor("daniel defoe");
        
    //Eliminar libro x titulo
        biblioteca.eliminarxTitulo("bodas de sangre");
      
    //Mostrar libro de mayor calificacion 
        biblioteca.maximaCalificacion(10);
        
     //Mostrar libro e menor calificacion
        biblioteca.minimaCalificacion(0);
    }
}
