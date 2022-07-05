package cuenta;

import java.util.ArrayList;

/**
 *
 * @author José Carmona
 */
public class Persona {
    
    private String dni;
    
    ArrayList<Cuenta>cbu = new ArrayList<Cuenta>();
    
    private final int CUENTAS_MAX = 4;
    
//Metodo Constructor
    public Persona(String dni) {
        this.dni = dni;
    }
    
    /**
     * @return el n de DNI
     */
    public String getDni() {
        return dni;
    }

    /**
     * @param dni a determinar
     */    
    public void setDni(String dni) {
        this.dni = dni;
    }

    public String mostrarPersona() {
        return "Persona{" + "dni=" + dni + ", cbu=" + cbu + ", CUENTAS_MAX=" + CUENTAS_MAX + '}';
    }
    
    /**
     * @return el cbu
     */
    public ArrayList<Cuenta> getCbu() {
        return cbu;
    }

    /**
     * @param cbu a determinar
     */ 
    public void setCbu(ArrayList<Cuenta> cbu) {
        this.cbu = cbu;
    }
    
    /**
     * @return la cantidad de Cuentas Maximas
     */
    public int getCUENTAS_MAX() {
        return CUENTAS_MAX;
    }
    
    public void agregarCta (Cuenta nuevaCuenta){
        if (cbu.size()<=CUENTAS_MAX) {
            this.cbu.add(nuevaCuenta);
            System.out.println("Cuenta Agregada");
        }else{
            System.out.println("No es posible agregar más cuentas");
        }
    }
}
