
package paquete2;

import java.util.ArrayList;
import paquete1.Paciente;

public class ListaPaciente {
    
    private static ArrayList<Paciente> listaPacientes = new ArrayList<Paciente>();
    
    public static void agregarPaciente(Paciente nuevoPaciente){
        listaPacientes.add(nuevoPaciente);
    }
    
    public static ArrayList monstrarPaciente(){
        return listaPacientes;
    }
}
