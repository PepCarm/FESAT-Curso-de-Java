package codigo;

import java.util.ArrayList;
import java.util.List;

public class GestorDePaquetesDeProyectores {
    
    private List<PaqueteProyectores>paquetes;
    private String nombreEmpresa;

    public GestorDePaquetesDeProyectores(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
        this.paquetes =new ArrayList<>();
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombre) {
        this.nombreEmpresa = nombre;
    }
    
    public void agregarPaquete (PaqueteProyectores paqueteNuevo){
        this.paquetes.add(paqueteNuevo);
    }
   public PaqueteProyectores buscarPaqueteDeProyectores (int codPaquete){
       for (int i = 0; i < this.paquetes.size(); i++) {
           if (this.paquetes.get(i).getCodPaquete()== codPaquete) {
               return this.paquetes.get(i);
           }
       }
       return null;
    }
   
    public int xxx(){
        int cant = 0;
        for (int i = 0; i < this.paquetes.size(); i++) {
            if (this.paquetes.get(i).getEnTransito()) {
                cant = cant + 1;
            }
        } return cant;
    }
}
