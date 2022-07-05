package modelo;

import java.util.ArrayList;
import java.util.List;

public class Capacitacion {
    
   private String nombre;
   private List<Nivel>niveles;

    public Capacitacion(String nombre) {
        this.nombre = nombre;
        this.niveles = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }
   
   public void agregarNivel (Nivel nuevoNivel){
      this.niveles.add(nuevoNivel);
   }
   
}
