package codigo;

public class PaqueteProyectores {
    private int codPaqueteDeProyectores;
    private String destinatario, destino;
    private float costoEnvio;
    private boolean enTransito;

    public PaqueteProyectores(int codPaquete, String destinatario, String destino, float costoEnvio) {
        this.codPaqueteDeProyectores = codPaquete;
        this.destinatario = destinatario;
        this.destino = destino;
        this.costoEnvio = costoEnvio;
    }

    public int getCodPaquete() {
        return codPaqueteDeProyectores;
    }

    public void setCodPaquete(int cod) {
        this.codPaqueteDeProyectores = cod;
    }

    public boolean getEnTransito() {
        return enTransito;
    }

    public void setEnTransito(boolean enTransito) {
        this.enTransito = enTransito;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }
    

}
