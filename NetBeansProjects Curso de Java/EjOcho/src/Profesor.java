import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author José Carmona
 */
public class Profesor extends Persona {

    //atributos
    private int cantidaddeHoras;
    private float sueldo;
    
    private static List<Curso> cursosDictados = new ArrayList();
    
  
    //Metodo Constructor
    public Profesor(int cantidaddeHoras, float sueldo, String nombre, String apellido, int dni) {
        super(nombre, apellido, dni);
        this.cantidaddeHoras = cantidaddeHoras;
        this.sueldo = sueldo;
    }
   
    /**
     * @return la cantidad de horas
     */    
    public int getCantidaddeHoras() {
        return cantidaddeHoras;
    }

    /**
     * @param cantidaddeHoras a determinar
     */ 
    public void setCantidaddeHoras(int cantidaddeHoras) {
        this.cantidaddeHoras = cantidaddeHoras;
    }
   
    /**
     * @return el sueldo
     */    
    public float getSueldo() {
        return sueldo;
    }

    /**
     * @param sueldo a determinar
     */ 
    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }
   
    /**
     * @return los cursos realizados
     */    
    public static List<Curso> getCursosDictados() {
        return cursosDictados;
    }

    /**
     * @param cursosDictados a determinar
     */ 

    public static void setCursosDictados (List<Curso> cursosDictados){
        Profesor.cursosDictados = cursosDictados;
    }

    public void agregarCurso(Curso nuevoCurso) {
        this.cursosDictados.add(nuevoCurso);
    }

    public String mostrarDatos() {
        return "Profesor{" + "cantidaddeHoras=" + cantidaddeHoras + ", sueldo=" + sueldo + '}';
    }



    
}

