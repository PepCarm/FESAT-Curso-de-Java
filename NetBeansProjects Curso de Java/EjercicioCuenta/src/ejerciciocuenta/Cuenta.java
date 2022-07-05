
package ejerciciocuenta;

public class Cuenta {
    //Atributos
    private String titularCuenta;
    private double Cantidad;

    public Cuenta(String titularCuenta, double Cantidad) {
        this.titularCuenta = titularCuenta;
        this.Cantidad = Cantidad;
        
    }

    public Cuenta(String titularCuenta) {
        this.titularCuenta = titularCuenta;
        this.Cantidad =0;
        
        /* Otra formade hacer lo anterior
        this(titular, 0); eso reemplaza lo hecho en el 2do constructor
        */
    }

    public String getTitularCuenta() {
        return titularCuenta;
    }

    public void setTitularCuenta(String titularCuenta) {
        this.titularCuenta = titularCuenta;
    }

    public double getCantidad() {
        return Cantidad;
    }

    public void setCantidad(double Cantidad) {
        this.Cantidad = Cantidad;
    }

   
    public String mostrarDatos() {
        return "Cuenta{" + "titularCuenta=" + titularCuenta + ", Cantidad=" + Cantidad + '}';
    }
    //borro el override y cambio el "toString" y desaparece el error.
    
    public void ingresoDinero (double cantidad){//Esta cantidad es parámetro
        
        if (cantidad>0) {
            this.Cantidad = cantidad + this.Cantidad; 
            //lo que es lo mismo q this.Cantidad += cantidad
        }      
    }
    
    public void retirarDinero (double cantidad){
        if (this.Cantidad-cantidad <0) {
            this.Cantidad = 0;            
        }
        else{
            this.Cantidad -= cantidad;
        }
        
    }
}
    
    

