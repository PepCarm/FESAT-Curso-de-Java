package modelo;

import java.util.List;

public class Nivel {
    
   private String nombre;
   private int ejerciciosNecesarios;

    public Nivel(String nombre, int ejerciciosNecesarios) {
        this.nombre = nombre;
        this.ejerciciosNecesarios = ejerciciosNecesarios;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEjerciciosNecesarios() {
        return ejerciciosNecesarios;
    }
    public boolean terminaNivel (List<Integer> estadoAlumno){
    return estadoAlumno.get(ejerciciosNecesarios)<= estadoAlumno.size();
    
   }
}
      
   
   

