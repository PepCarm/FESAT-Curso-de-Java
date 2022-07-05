/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rectangulo;

/**
 *
 * @author José Carmona
 */
public class Rectangulo {
 
    //Atributos
    
    private double base;
    private double altura;

    //Metodo Constructor
    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    /**
     * @return la base
     */
    public double getBase() {
        return base;
    }

    /**
     * @return la altura
     */    
    public double getAltura() {
        return altura;
    }

    /**
     * @param base a determinar
     */   
    public void setBase(double base) {
        this.base = base;
    }

    /**
     * @param altura a determinar
     */       
    public void setAltura(double altura) {
        this.altura = altura;
    }

    /**
     * @return perimetro
     */
    public double perimetro(){
        return altura * 2 + base * 2;
    }
    /**
     * @return area
     */   
    public double area(){
        return base * altura;
    }
    
    public String mostrarDatos() {
        return "El rectangulo con base "+base+" y con altura "+altura;
    }
    
    
   
    
}
