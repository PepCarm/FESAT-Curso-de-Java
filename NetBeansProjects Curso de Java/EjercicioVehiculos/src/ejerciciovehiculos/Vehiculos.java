package ejerciciovehiculos;

public class Vehiculos {
    
    private String marca, modelo;
    private float precio;

    public Vehiculos(String marca, String modelo, float precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    public float getPrecio() {
        return precio;
    }
    
    public String mostrarDatos(){
        return  ("Marca: " + marca + "\nModelo: " + modelo + "\nPrecio: " + precio +"\n");
    }
   /* Caracteres de escape en Java
    \n Nueva línea
    \t Tabulador 
    \\ Contrabarra
    \" Comillas dobles 
    \' Comillas simples
    \r Retorno (Enter) */

}
