package ejerciciocuadrilatero;

import javax.swing.JOptionPane;

public class CuadrilateroMain {
    
    public static void main(String[] args) {
      
      Cuadrilatero CuadrilateroUno;
       
     float lado1;
     float lado2;
     
    lado1 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el valor del 1er lado"));  
    
    lado2 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el valor del 2er lado")); 
    
    //Cdo se hace un parseo se recibe un string
    
        if (lado1 == lado2) {
            
            CuadrilateroUno = new Cuadrilatero(lado1); //Dividimos en 2 la creación del objeto
        }else{
            CuadrilateroUno = new Cuadrilatero(lado1, lado2);
        }
    /* Es lo mismo, la diferencia es que al 2do le paso los 2 atributos (sobrecarga de metodos)
          Constuido el objeto , ahora hay q llamar al metodo. Podemos invocar el metodo y asignarselo a una variable, o mostrarlo por consola 
        a través del metodo print.
        */
        
    
    System.out.println("El calculo del perimetro me dio " + CuadrilateroUno.getPerimetro());
    System.out.println("El área es: " + CuadrilateroUno.getArea());
    }
    
}
 