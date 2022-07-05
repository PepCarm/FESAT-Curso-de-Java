/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zapateria;

/**
 *
 * @author José Carmona
 */
public class Actividad {
    
    /**
     * @param args the command line arguments
     */  
    public static void main(String[] args) {
            
    Zapateria deposito = new Zapateria();
    
    Zapato calzado1 = new Zapato();
    calzado1.setModelo("balerinas");
    calzado1.setColor("rojo");
    calzado1.setPrecio(550);
    calzado1.setSaldoFinal(15);
    deposito.agrgearZapatos(calzado1);
    
    Zapato calzado2 =new Zapato();
    calzado2.setModelo("sandalias");
    calzado2.setColor("beige");
    calzado2.setPrecio(780);
    calzado2.setSaldoFinal(12);
    deposito.agrgearZapatos(calzado2);
    
    Zapato calzado3 = new Zapato();
    calzado3.setModelo("Zapatillas");
    calzado3.setColor("azul");
    calzado3.setPrecio(3150.50);
    calzado3.setSaldoFinal(8);
    deposito.agrgearZapatos(calzado3);
    
    Zapato calzado4 = new Zapato();
    calzado4.setModelo("micasines");
    calzado4.setColor("marron");
    calzado4.setPrecio(2760.7);
    calzado4.setSaldoFinal(7);
    deposito.agrgearZapatos(calzado4);
    
    Zapato calzado5 =new Zapato();
    calzado5.setModelo("ojotas");
    calzado5.setColor("blanco");
    calzado5.setPrecio(350);
    calzado5.setSaldoFinal(6);
    deposito.agrgearZapatos(calzado5);
    
    //Imprimir el contenido del deposito
    deposito.mostrarStock();
    
    //eliminar un producto
    deposito.quitarZapatos(calzado5);
    deposito.mostrarStock();
    
    //Disminuir stock
    calzado1.enajenar(5);
    System.out.println(calzado1.getSaldoFinal());
    
    //Aumentar stock
    calzado2.adquirir(6);
    System.out.println(calzado2.getSaldoFinal());
    
    //Vender más de lo permitido
    
    calzado5.enajenar(7);
    System.out.println(calzado5.getSaldoFinal());
    
    }
}
