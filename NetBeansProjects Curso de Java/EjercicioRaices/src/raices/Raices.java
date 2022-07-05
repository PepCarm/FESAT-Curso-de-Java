
package raices;

public class Raices {
   
    private double a, b, c;

    public Raices(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
    
    public void calculo(){
        boolean hayRaices = true;
        
        
        if (hayRaices) {
            resultadoRaices();
        }else{
            boolean hayRaiz = true;
            if (hayRaiz){
                resultadoRaiz();
            }
            System.out.println("No hay solución");
        }
        
    }
   private void resultadoRaices(){
       double x1 = (-b+Math.sqrt(getDiscriminante()))/(2*a);
       double x2 = (-b-Math.sqrt(getDiscriminante()))/(2*a);
       System.out.println("x1= " +x1);
       System.out.println("x2= " +x2);
   }
   private double getDiscriminante(){
       return Math.pow(b, 2)+(-4*a*c);
   }
    
    private boolean hayRaices (){
        return getDiscriminante()>0;
    }
    private boolean hayRaiz(){
        return getDiscriminante()==0;
    }
    private void resultadoRaiz(){
        double x = (-b)/(2*a);
        System.out.println("x= " +x);
    }
}

