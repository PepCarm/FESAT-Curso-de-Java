package bicicleteria;

import java.util.ArrayList;
import java.util.List;

public class Bicicleteria {
    
    private static List <Bicicleta> bicicleta = new ArrayList();
    private float ganancias;
    private Integer cantidadDeVentas;

    public Bicicleteria() {
    }

    public Bicicleteria(float ganancias, Integer cantidadDeVentas) {
        this.ganancias = ganancias;
        this.cantidadDeVentas = cantidadDeVentas;
    }

    public static List<Bicicleta> getBicicleta() {
        return bicicleta;
    }

    public static void setBicicleta(List<Bicicleta> bicicleta) {
        Bicicleteria.bicicleta = bicicleta;
    }

    public float getGanancias() {
        return ganancias;
    }

    public void setGanancias(float ganancias) {
        this.ganancias = ganancias;
    }

    public int getCantidadDeVentas() {
        return cantidadDeVentas;
    }

    public void setCantidadDeVentas(Integer cantidadDeVentas) {
        this.cantidadDeVentas = cantidadDeVentas;
    }
    
    public void agregarBicicleta (Bicicleta nuevaBici){
        this.bicicleta.add(nuevaBici);
    }
    public void venderBicicleta (Bicicleta bicicleta){
        this.bicicleta.remove(bicicleta);
        this.cantidadDeVentas ++;
        this.ganancias = (this.ganancias + bicicleta.getPrecio());
    }
    public String buscarBicicleta (String nroDeSerie){
       String bicicletaEncontrada = null;
        for (int i = 0; i <bicicleta.size(); i++) {
            if (bicicleta.get(i).getNroDeSerie().equals(nroDeSerie)) {
                bicicletaEncontrada = "El nombre de la bicicleta"+this.bicicleta.get(i).toString();
            }  
        } return null;
    }
}
        
    
    

