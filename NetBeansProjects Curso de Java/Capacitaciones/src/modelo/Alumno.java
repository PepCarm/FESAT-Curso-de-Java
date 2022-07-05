package modelo;

import java.util.ArrayList;
import java.util.List;

public class Alumno {
    
    private String nombre;
    private String pseudonimo;
    private List<Capacitacion>capacitacionesRealizadas;

    public Alumno(String nombre, String pseudonimo) {
        this.nombre = nombre;
        this.pseudonimo = pseudonimo;
        this.capacitacionesRealizadas =new ArrayList<>();
        
    }

    public String getNombre() {
        return nombre;
    }

    public String getPseudonimo() {
        return pseudonimo;
    }
    
    public void agregarCapacitacion (Capacitacion capacitacion){
        this.capacitacionesRealizadas.add(capacitacion);
    }
}
    