package cuenta;

/**
 *
 * @author José Carmona
 */
public class CuentaAplicación {
    
    /**
     * @param args the command line arguments
     */   
    public static void main(String[] args) {
        
        Cuenta cta1 = new Cuenta("00017830",0);
        Cuenta cta2 = new Cuenta ("00049272",500);
       
        Persona pfisica = new Persona ("35207110");
        
        pfisica.agregarCta(cta1);
        pfisica.agregarCta(cta2);
  
        System.out.println(cta1.mostarCuenta());
        System.out.println(cta2.mostarCuenta());
        
        pfisica.getCbu().get(0).deposito(1100);
        pfisica.getCbu().get(1).retiros(575);
        System.out.println(cta2.getCantidad());
        
        if (cta2.getCantidad()<0) {
            System.out.println("Usted se encuentra en mora");
        }else{
            System.out.println("Usted es solvente");
        }
      
        cta1.retiros(250);
        cta2.deposito(250);
        System.out.println("Transfiere de la cuenta 00017830 a la cuenta 00049272, un importe de $250");
        if (cta1.getCantidad()>0) {
            System.out.println("Usted es solvente. Saldo "+cta1.getCantidad());
        }else{
                System.out.println("Usted se encuntra en mora. Saldo "+cta1.getCantidad());
        }
        if (cta2.getCantidad()>0){
            System.out.println("Usted es solvente. Saldo "+cta2.getCantidad());
        }else{
            System.out.println("Usted se encuentra en mora. Saldo "+cta2.getCantidad());
        }
    }
}
