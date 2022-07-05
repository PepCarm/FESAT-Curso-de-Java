package ejerciciovehiculos;

import java.util.Scanner;

public class VehiculoPpal {
    
    public static void main(String[] args) {
     
        Scanner autos = new Scanner (System.in);
        
 //Aca podemos, o bien crear objetos y le damos valores x teclado o trabajar con arrays( trabajar con ciclo FOR)
       
        System.out.println("Ingrese la cantidad de vehiculos para realizar la comparación");
        
        int nVehiculos;
        nVehiculos = autos.nextInt();
        
        //Como hacer un arrglo de Objeto "Vehiculos"
        Vehiculos Automovil[] = new Vehiculos[nVehiculos];
        
        String marca, modelo;
        float precio;
        
        for (int i = 0; i < nVehiculos; i++) {
            autos.nextInt();
            System.out.println("Ingrese las características del vehiculo " + (i+1));
            System.out.println("Ingrese la marca ");
            marca = autos.nextLine();
            System.out.println("Ingrese el modelo ");
            modelo = autos.nextLine();
            System.out.println("Ingrese el precio ");
            precio = autos.nextFloat();
            
           Automovil[i] = new Vehiculos (marca,modelo,precio);
           
           //Vehiculo es el metodo Constructor, de esta manera pasa lo ingresado x consola al array
        }
        int menorPrecio = precioMenor(Automovil);
        System.out.println("El vehiculo de menor precio es: ");
        System.out.println(Automovil[menorPrecio].mostrarDatos());
    }
    //aca hacemos como cuando comparabamos y oredenabamos las cartas de menor a mayor
    public static int precioMenor(Vehiculos Automovil[]){
    
    int posicion =0;
    
    float precio= Automovil[0].getPrecio();
    
        for (int i = 1; i < Automovil.length; i++) {
            Vehiculos vehiculos = Automovil[i];
           //comienza en 1, xq el 0 ya lo conozco, hasta que i<(n-1).
         
            if (Automovil[i].getPrecio()< precio) {
                precio = Automovil[i].getPrecio(); //Aca me almacena el nuevo valor
                posicion=i;
            }
        }
        return posicion;
}
    
    
}
