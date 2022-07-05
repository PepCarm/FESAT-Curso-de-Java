package paquete1;

import java.util.ArrayList;
import paquete2.ListaPaciente;

public class Paciente {

    private String nombrePaciente;
    private int edadPaciente;
    private String sexoPaciente;
    private String tratamientoPaciente;
    private String tipoPaciente;
    private float costoConsulta;

    public Paciente(String nombrePaciente, int edadPaciente, String sexoPaciente, String tratamientoPaciente, String tipoPaciente, float costoConsulta) {
        this.nombrePaciente = nombrePaciente;
        this.edadPaciente = edadPaciente;
        this.sexoPaciente = sexoPaciente;
        this.tratamientoPaciente = tratamientoPaciente;
        this.tipoPaciente = tipoPaciente;
        this.costoConsulta = costoConsulta;
    }

    public float getCostoConsulta() {
        return costoConsulta;
    }

    public void setCostoConsulta(float costoConsulta) {
        this.costoConsulta = costoConsulta;
    }

    public String getNombrePaciente() {
        return nombrePaciente;
    }

    public void setNombrePaciente(String nombrePaciente) {
        this.nombrePaciente = nombrePaciente;
    }

    public int getEdadPaciente() {
        return edadPaciente;
    }

    public void setEdadPaciente(int edadPaciente) {
        this.edadPaciente = edadPaciente;
    }

    public String getSexoPaciente() {
        return sexoPaciente;
    }

    public void setSexoPaciente(String sexoPaciente) {
        this.sexoPaciente = sexoPaciente;
    }

    public String getTratamientoPaciente() {
        return tratamientoPaciente;
    }

    public void setTratamientoPaciente(String tratamientoPaciente) {
        this.tratamientoPaciente = tratamientoPaciente;
    }

    public String getTipoPaciente() {
        return tipoPaciente;
    }

    public void setTipoPaciente(String tipoPaciente) {
        this.tipoPaciente = tipoPaciente;
    }

    public static ArrayList listadoPaciente(String tipoTratamiento) {
        ArrayList listaPacientes = ListaPaciente.mostrarPaciente();
        ArrayList listaFiltrada = new ArrayList();
        for (int i = 0; i < listaPacientes.size(); i++) {
            Paciente objetoPaciente = (Paciente) listaPacientes.get(i);
            if (objetoPaciente.getTratamientoPaciente().equalsIgnoreCase(tipoTratamiento)) {
                listaFiltrada.add(objetoPaciente);
            }

        }
        return listaFiltrada;
    }

}
