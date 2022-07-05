
package seguimos;

public class Aula {
    
    private String identificadorAula;
    private int bancosAula;
    private int alumnos;

    public Aula(int bancosAula, int alumnos) { //Aca no esta identificador aula xq yo comparo bancos con alumnos.
        this.bancosAula = bancosAula;
        this.alumnos = alumnos;
    }

    public Aula() { //Se genero un metodo Constructor sin seleccionar ningun atributo.
    }

    public String getIdentificadorAula() {
        return identificadorAula;
    }

    public void setIdentificadorAula(String identificadorAula) {
        this.identificadorAula = identificadorAula;
    }

    public int getBancosAula() {
        return bancosAula;
    }

    public void setBancosAula(int bancosAula) {
        this.bancosAula = bancosAula;
    }

    public int getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(int alumnos) {
        this.alumnos = alumnos;
    }

    public String datosAulas() {
        return "Aula{" + "identificadorAula=" + identificadorAula + ", bancosAula=" + bancosAula + ", alumnos=" + alumnos + '}';
    }
    
  
            
    
}
