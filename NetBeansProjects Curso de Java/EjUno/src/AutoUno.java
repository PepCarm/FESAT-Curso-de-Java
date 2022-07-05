
import java.util.Scanner;
/**
 *
 * @author Jóse Carmona
 */
public class AutoUno {
    
    /**
     * @param args the command line arguments
     */    
    public static void main(String[] args) {
        Scanner leerEntrada = new Scanner(System.in);
        Auto auto = new Auto();
       
        System.out.println("Ingrese el color del auto");
        String color = leerEntrada.next();
        auto.setColor(color);
        
        System.out.println("Ingrese la marca del auto");
        String marca = leerEntrada.next();
        auto.setMarca(marca);
        
        System.out.println("Ingrese el modelo de auto");
        String modelo = leerEntrada.next();
        auto.setModelo(modelo);
        
        System.out.println("Ingrese patente del auto");
        String patente =leerEntrada.next();
        auto.setPatente(patente);
        
        System.out.println("Ingrese número de puertas");
        int puertas = leerEntrada.nextInt();
        auto.setPuertas(0);
        
        System.out.println("El vehiculo es de marca "+ auto.getMarca()+" modelo "+auto.getModelo()+" color "+auto.getColor()+" patente número "+ auto.getPatente()+" número de puertas "+auto.getPatente());
    
    }
}
    
