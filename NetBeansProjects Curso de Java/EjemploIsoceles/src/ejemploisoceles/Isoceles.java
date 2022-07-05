package ejemploisoceles;

public class Isoceles {
    
    private double base, lado;

    public Isoceles(double base, double lado) {
        this.base = base;
        this.lado = lado;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public String trianguloIsoceles() {
        return "Isoceles{" + "base=" + base + ", lado=" + lado + '}';
    }
    
    public double obtenerPerimetro(){
        double calculoPerimetro;
        calculoPerimetro = (lado*2+base);
        return calculoPerimetro;
    }
    public double obtenerArea(){
        double calculoArea;
        calculoArea = base*Math.sqrt((Math.pow(lado, 2)-(Math.pow(base, 2)/4)))/2; 
        return calculoArea;
    }   
}
