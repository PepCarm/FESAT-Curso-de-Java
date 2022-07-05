package ventadenotebooks;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Orden {
    
    private List<DetalleOrden> items;
    private int id;
    private Date creacion, envio;

    public Orden(int id, Date creacion, Date envio) {
        this.id = id;
        this.creacion = creacion;
        this.items = new ArrayList<>();
        this.envio = envio;
    }
    
    public void agregarItem (DetalleOrden detalle){
        this.items.add(detalle); // puedo usar esta linea si too, me pide un V o F
    }

    public void setEnvio(Date envio) {
        this.envio = envio;
    }

    public int getNroItems() {
        return items.size();
    }
 //Ejercicio 2   
    public float calculartotalOrden (){
        
        float precio = 0;
        float precioTotal = 0;
        
        for (int i = 0; i < this.items.size(); i++) {
            precio = (this.items.get(i).getCantidad()* this.items.get(i).getPrecioUnitario());
            precioTotal += precio;
        } return precioTotal;  
}
}
