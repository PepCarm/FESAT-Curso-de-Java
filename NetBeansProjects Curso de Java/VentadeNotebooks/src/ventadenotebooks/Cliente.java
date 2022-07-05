package ventadenotebooks;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    
    private String nombre;
    private int dni;
    private List<Orden>ordenes;

    public Cliente(String nombre, int dni) {
        this.nombre = nombre;
        this.dni = dni;
        this.ordenes =new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public int getDni() {
        return dni;
    }
   
    public void addOrden (Orden o){
        this.ordenes.add(o);
    }


   //Ejercicio 3
    
   public void ordenarNrodeItems(){
        int n = ordenes.size();
        int k;
        for (int m = n; m >= 0; m--) {
            for (int i = 0; i < n-1; i++) {
                k=i+1;
                if (ordenes.get(i).getNroItems()> ordenes.get(k).getNroItems()) {
                    Orden decreciente = ordenes.set(i, ordenes.get(k));
                    ordenes.set(k,decreciente);
                }
            }
        }
    }
}
