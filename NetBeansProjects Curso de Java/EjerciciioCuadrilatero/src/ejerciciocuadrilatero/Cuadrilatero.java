
package ejerciciocuadrilatero;

public class Cuadrilatero {
  
    //Atributos
    
    private float lado1;
    private float lado2;

    //Tiene 2 constructores xq estan dentro de la clase metodos(Sobrecarga)
    
    public Cuadrilatero(float lado1, float lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public Cuadrilatero(float lado1) {
        this.lado1 = lado1;
    }
    /* Otras forma de expresar el constructor teniendo en cuenta los 2 lados
    this.lado2 = lado1; ó
    this.lado1 = this.lado2 = lado1;
    */
    
    public float getPerimetro(){
    float perimetro = (lado1+lado2)*2;
    return perimetro;
}    
    public float getArea(){
        float area = (lado1*lado2);
        return area;
    }
} 
