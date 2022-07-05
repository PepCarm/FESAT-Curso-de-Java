
package bicicleteria;

public class PruebaDeEscritorio {
    
    public static void main(String[] args) {
        
        Bicicleta bici1 = new Bicicleta("ruta1", "Bicicleta de Ruta", 2019);
        Bicicleta bici2 = new Bicicleta("bm1", "Bicicleta de Montaña", 2018);
        Bicicleta bici3 = new Bicicleta("bm2", "Bicicleta de Montaña", 2019);
        Bicicleta bici4 = new Bicicleta("playera1", "Bicicleta Playera", 2020);
        Bicicleta bici5 = new Bicicleta("urbana1", "Bicicleta Urbana", 2021);
        
        Bicicleteria negocio = new Bicicleteria();
        
        //Agrego bicicletas a la Lista
        
        negocio.addBicicleta(bici1);
        negocio.addBicicleta(bici2);
        negocio.addBicicleta(bici3);
        negocio.addBicicleta(bici4);
        negocio.addBicicleta(bici5);
        
        //Busco dentro del Array
        
        negocio.buscarBicicleta("playera1");
       
        //Vender Bicicleta
        negocio.venderBicicleta(bici2);
        negocio.mostarBicicletas();
        
    }
}
