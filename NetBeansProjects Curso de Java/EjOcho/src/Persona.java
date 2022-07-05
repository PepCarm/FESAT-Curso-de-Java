/**
 *
 * @author José Carmona
 */
public class Persona {
    
    //atributos
    private String nombre;
    private String apellido;
    private int dni;

    //Metodo Constructor
    public Persona(String nombre, String apellido, int dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }

    public Persona() {
    }

    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre a determinar
     */ 
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
   
    /**
     * @return el apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido a determinar
     */ 
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
   
    /**
     * @return el dni
     */
    public int getDni() {
        return dni;
    }

    /**
     * @param dni a determinar
     */ 
    public void setDni(int dni) {
        this.dni = dni;
    }

    public String mostrarDatos() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + '}';
    }
    
}
