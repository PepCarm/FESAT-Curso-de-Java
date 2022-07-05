package biblioteca;

public abstract class Novela extends Libro {


    public Novela(String novelas, String titulo, String autor, int cantidadDeReservas) {
        super(titulo, autor, cantidadDeReservas);
        this.novelas = novelas;
    }

    String novelas;
    
    int cantidaDePag;

    public int getCantidaDePag() {
        return cantidaDePag;
    }

    public void setCantidaDePag(int cantidaDePag) {
        this.cantidaDePag = cantidaDePag;
    }
    
    public int esDificilDeLeer (){
        
        int ndePag = 0;
        
        if(ndePag >= 500) {
          this.getCantidaDePag();
        }
           return ndePag;
    }
       
}
    
    
   
   
