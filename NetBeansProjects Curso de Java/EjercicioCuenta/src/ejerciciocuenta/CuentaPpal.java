
package ejerciciocuenta;

public class CuentaPpal {
    
    public static void main(String[] args) {
        
        Cuenta titularUno = new Cuenta("Pity Martinez", 1527.5);
        
        //Se usa como clase la misma que se uso en la pagina anterior, si no da error
    
        Cuenta titularDos = new  Cuenta("Oso Pratto");
               
        titularUno.ingresoDinero(250.35);
        System.out.println(titularUno.getCantidad());
        
        titularUno.retirarDinero(2500);
        System.out.println(titularUno.getCantidad());
        
        titularDos.ingresoDinero(890);
        System.out.println(titularDos.getCantidad());
        
        titularDos.setCantidad(2100);
        System.out.println(titularDos.getCantidad());
        //piso el valor, no agrego valor 
        
        
    }
    
}
