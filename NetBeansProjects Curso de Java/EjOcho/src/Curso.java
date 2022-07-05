
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author José Carmona
 */
public class Curso {
    
    private String nombre;

    private int maximoAlumno;

    private static List<Alumno> alumnos = new ArrayList();
    private static List<Float> notas = new ArrayList();

    public Curso(String nombre, int maximoAlumno) {
        this.nombre = nombre;
        this.maximoAlumno = maximoAlumno;
    }
  
    /**
     * @return el nombre del curso
     */  
    public String getNombre() {
        return nombre;
    }
  
    /**
     * @return el máximo de alumnos
     */  
    public int getMaximoAlumno() {
        return maximoAlumno;
    }
  
    /**
     * @return la lista de alumnos
     */  
    public static List<Alumno> getAlumnos() {
        return alumnos;
    }
  
    /**
     * @return la lista de las notas
     */  
    public static List<Float> getNotas() {
        return notas;
    }

    /**
     * @param nombre del curso
     */ 
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @param maximoAlumno por currso
     */ 
    public void setMaximoAlumno(int maximoAlumno) {
        this.maximoAlumno = maximoAlumno;
    }

    /**
     * @param alumnos 
     */ 
    public static void setAlumnos(List<Alumno> alumnos) {
        Curso.alumnos = alumnos;
    }

    /**
     * @param notas de los alumnos
     */ 
    public static void setNotas(List<Float> notas) {
        Curso.notas = notas;
    }

    public boolean agregarAlumno (Alumno nuevoAlumno){
        boolean as = false;
        if (this.alumnos.size()< maximoAlumno) {
            this.alumnos.add(nuevoAlumno);
            as = true;
        } return as; 
    }

}
