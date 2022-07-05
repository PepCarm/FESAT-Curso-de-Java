
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author José Carmona
 */
public class Alumno extends Persona{
    
    private int aniodeIngreso;
    
    private static List<Curso> cursadas = new ArrayList();

    public Alumno(int aniodeIngreso, String nombre, String apellido, int dni) {
        super(nombre, apellido, dni);
        this.aniodeIngreso = aniodeIngreso;
    }

    public Alumno(int aniodeIngreso) {
        this.aniodeIngreso = aniodeIngreso;
    }
    
    /**
     * @return el año de ingreso
     */  
    public int getAniodeIngreso() {
        return aniodeIngreso;
    }
   
    /**
     * @return las materias cursadas
     */  
    public static List<Curso> getCursadas() {
        return cursadas;
    }

    /**
     * @param aniodeingreso a determinar
     */ 
    public Alumno() {
    }

    public void setAniodeIngreso(int aniodeIngreso) {
        this.aniodeIngreso = aniodeIngreso;
    }

    /**
     * @param cursadas a determinar
     */ 
    public static void setCursadas(List<Curso> cursadas) {
        Alumno.cursadas = cursadas;
    }
    public void agregarMateria (Curso curso){
        this.cursadas.add(curso);
    }





}
