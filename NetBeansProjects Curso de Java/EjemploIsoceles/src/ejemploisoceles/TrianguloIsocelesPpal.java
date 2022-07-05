package ejemploisoceles;

import java.util.Scanner;

public class TrianguloIsocelesPpal {
    
    public static void main(String[] args) {
        
        
        Ventana ventanaPpal = new Ventana();
        ventanaPpal.setVisible(true);
        
        Scanner triangulo = new Scanner (System.in);
        
        System.out.println("Ingrese la cntidad de triaungulos con la que va a trabajar");
        int cantidad = triangulo.nextInt(); //asigno x teclado.
        Isoceles arraysIsoceles[] = new Isoceles [cantidad]; //Ojo no poner indice en arraysIsoceles.
       
        /* Para inicializar y declarar las variables hacerlo fuera del ciclo.*/
        
        double baseIng =0;
        double ladoIng= 0;
        
        for (int i = 0; i < arraysIsoceles.length; i++) {
            
            System.out.println("Ingrese base");
            baseIng = triangulo.nextDouble();
            
            System.out.println("Ingrese el lado");
            ladoIng = triangulo.nextDouble();

    //Acá almacena los datos q ingresa por teclado 
           arraysIsoceles[i] = new Isoceles (ladoIng, baseIng);
            System.out.println("El perimetro es: " + arraysIsoceles[i].obtenerPerimetro()); //obtenerPerimetro es un objeto     
            System.out.println("El área es: " + arraysIsoceles[i].obtenerArea());  
        }
        System.out.println(" El triangulo de mayor área es: "+ areaMayor(arraysIsoceles)); 
    }
    //Me salgo del main
    public static double areaMayor(Isoceles arraysIsoceles[]){
      //Si quiesieramos retornar la posicion en vez de el area
        double areaMayor =0; //intPosicionArea=0;
       areaMayor =arraysIsoceles[0].obtenerArea();
       
        for (int i = 0; i < arraysIsoceles.length; i++) {
            if (arraysIsoceles[i].obtenerArea()>areaMayor) {
                areaMayor = arraysIsoceles[i].obtenerArea();
                //posicionArea = i, para guardar esa posicion 
            } 
        }
        return areaMayor;//posicionArea
} 
}
    
