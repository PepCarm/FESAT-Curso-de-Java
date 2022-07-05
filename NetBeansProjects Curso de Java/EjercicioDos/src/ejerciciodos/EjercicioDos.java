package ejerciciodos;

import java.util.Scanner;

public class EjercicioDos {

    public static void main(String[] args) {
       
        String nombreCliente[] = new String [5];
        nombreCliente [0] = "Mariana";
        nombreCliente [1] = "Gonzalo";
        nombreCliente [2] = "Erica";
        nombreCliente [3] = "Fernando";
        nombreCliente [4] = "Mario";
        
      Scanner leerEntrada = new Scanner(System.in);
        
      System.out.println("Nombre del Cliente que desea enconntar");
      
      String clienteBuscado = leerEntrada.nextLine();
      
      int clientePosicion =-1; 
      
        for (int i = 0; i < nombreCliente.length; i++) {
            if (nombreCliente[i].equalsIgnoreCase(clienteBuscado)){
                clientePosicion = i;
              System.out.println("El cliente buscado se encuentra en la posicion: "+clientePosicion);  
            }
            }
        if (clientePosicion ==-1) {
           System.out.println("El cliente solicitado "+clienteBuscado+" no se encuentra dentro del arreglo");
        } 
        }
        }

 
        
            
            
            
        
        
        
        
        
    
    

