package modelo;

public class NivelesEspecial extends Nivel {
    
    private int minutosDeVideoNecesarios;

    public NivelesEspecial(int minutosDeVideoNecesarios, String nombre, int ejerciciosNecesarios) {
        super(nombre, ejerciciosNecesarios);
        this.minutosDeVideoNecesarios = minutosDeVideoNecesarios;
    }

    public int getMinutosDeVideoNecesarios() {
        return minutosDeVideoNecesarios;
    }

    public void setMinutosDeVideoNecesarios(int minutosDeVideoNecesarios) {
        this.minutosDeVideoNecesarios = minutosDeVideoNecesarios;
    }
    

     }
        
        
        
        
    

