
package bicicleteria;

import java.util.ArrayList;
import java.util.List;

public class Bicicleteria {
    
    private List<Bicicleta>bicicletas;
    private float ganancias;
    private Integer cantidadDeVentas;

    public Bicicleteria() {
        bicicletas = new ArrayList<Bicicleta>();
        cantidadDeVentas = 0;
        ganancias = 0;       
    }
    
    public void addBicicleta (Bicicleta nuevaBici){
        this.bicicletas.add(nuevaBici);
    }
    
    public void venderBicicleta (Bicicleta bicicleta){
        bicicletas.remove(bicicleta);
        cantidadDeVentas ++;
        ganancias = ganancias + bicicleta.getPrecio();
    }
    
    public String buscarBicicleta (String nroDeSerie){
        for (int i = 0; i < bicicletas.size(); i++) {
            if (bicicletas.get(i).getNroDeSerie().equalsIgnoreCase(nroDeSerie)) {
                System.out.println("La Bicicleta es : " + bicicletas.get(i).getModelo() + " con nro de serie " + bicicletas.get(i).getNroDeSerie());
            }
        }
        return null;
    }
    
    /*Opción B. Este metodo calcula el precio total de las bicicletas de la bicicleteria
    El "ret" va acumulando el precio, a medida que va avanzando en el Array.*/ 
    
    public float precioTotal(){
        float ret = 0;
        for (int i = 0; i < bicicletas.size(); i++) {
            ret = ret + bicicletas.get(i).getPrecio();
        }
        return ret;
    }
    
    public void mostarBicicletas(){
        for (int i = 0; i < bicicletas.size(); i++) {
            System.out.println(bicicletas.get(i).mostarBicicleta());
        }
    }
}
