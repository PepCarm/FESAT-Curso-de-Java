
package paquete1;

public class Paciente {
    
    private String nombrePaciente;
    private int edadPaciente;
    private String sexoPaciente;
    private String tratamientoPaciente;
    private String tipoPaciente;
    private float costoConsulta;

    public Paciente() {
    }

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
    
    
    
    
}
