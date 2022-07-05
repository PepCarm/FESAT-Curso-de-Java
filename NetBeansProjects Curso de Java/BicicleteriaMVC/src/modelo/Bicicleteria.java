package modelo;

import java.util.ArrayList;
import java.util.List;

public class Bicicleteria {
    
    private List<Bicicleta>bicicletas;
    private float ganancias;
    private Integer cantidadDeVentas;

    public Bicicleteria() {
        bicicletas = new ArrayList<>();
        cantidadDeVentas = 0;
        ganancias =0;
    }

    public void addBicicleta(Bicicleta nuevaBici){
        this.bicicletas.add(nuevaBici);
    }   
    
    public void venderBicicleta (Bicicleta bicicleta){
        this.bicicletas.remove(bicicleta);
        cantidadDeVentas ++;
        ganancias = ganancias + bicicleta.getPrecio();       
    }
    public String buscarBicicleta (String nroDeSerie){
        for (int i = 0; i < bicicletas.size(); i++) {
            if (bicicletas.get(i).getNroDeSerie().equalsIgnoreCase(nroDeSerie)) {
                return bicicletas.get(i).getNroDeSerie();
            }
        }
        return null;  
    }
    
    public float precioTotal(){
        float acumulado =0;
        for (int i = 0; i < bicicletas.size(); i++) {
            acumulado = acumulado + bicicletas.get(i).getPrecio();
        }
     return acumulado;   
    }
// Opcion B.
}

