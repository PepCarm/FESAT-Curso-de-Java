package controlador;

import vista.VistaPrincipal;

public class PrincipalControlador {
    
public static VistaPrincipal vP = new VistaPrincipal();
    
    public static void mostrar(){
        vP.setVisible(true);
    }
    
    public static void ocultar(){
        vP.setVisible(false);
    }

    public static void botonBicicleteria(){
        ocultar();
        BicicleteriaControlador.mostrar();
    }
    
    public static void botonBicicleta(){
        ocultar();
        BicicletaControlador.mostrar();
    }
}
