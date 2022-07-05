/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reloj;

/**
 *
 * @author José Carmona
 */
public class Reloj {
    
    private int hora;
    private int minutos;
    private int segundos;

    public Reloj() {
    }

    public Reloj(int hora, int minutos, int segundos) {
        this.hora = hora;
        this.minutos = minutos;
        this.segundos = segundos;
    }

    /**
     * Get the value of hora
     *
     * @return the value of hora
     */
    public int getHora() {
        return hora;
    }

    /**
     * Get the value of minutos
     *
     * @return the value of minutos
     */
    public int getMinutos() {
        return minutos;
    }

    /**
     * Get the value of segundos
     *
     * @return the value of segundos
     */
    public int getSegundos() {
        return segundos;
    }

    /**
     * Set the value of hora
     *
     * @param hora new value of hora
     */
    public void setHora(int hora) {
        this.hora = hora;
    }

    /**
     * Set the value of hora
     *
     * @param minutos new value of hora
     */
    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    /**
     * Set the value of hora
     *
     * @param segundos new value of hora
     */
    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }
    
   public void incrementarReloj( int horaInc, int minutosInc, int segundosInc){
       if ((this.segundos + segundosInc)>60) {
           this.minutos++;          
       }
        this.segundos = (this.segundos + segundosInc)%60;
        
        if ((this.minutos + minutosInc)>60) {
            this.hora++;
       }
        this.minutos = (this.minutos + minutosInc)%60;
        
        if ((this.hora + horaInc)>24) {
            this.hora = (this.hora + horaInc)%24;
        }else{
            this.hora = (this.hora + horaInc);
        }
   }
      public void disminuirReloj( int horaDis, int minutosDis, int segundosDis){
       if ((this.segundos - segundosDis)<0) {
           this.minutos--;          
       }
        this.segundos = (this.segundos - segundosDis)+60;
        
        if ((this.minutos - minutosDis)<0) {
            this.hora--;
       }
        this.minutos = (this.minutos - minutosDis)+60;
        
        if ((this.hora - horaDis)<0) {
            this.hora = (this.hora - horaDis)+24;
        }else{
            this.hora = (this.hora - horaDis);
        }
   }
    public String mostrarHora(){
                StringBuilder sb = new StringBuilder();
        
        sb.append("Horario:");
        sb.append(hora);
        sb.append(":");
        sb.append(minutos);
        sb.append(":");
        sb.append(segundos);
        return sb.toString();
    }
    
}
