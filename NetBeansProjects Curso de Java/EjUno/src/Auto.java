
public class Auto {
    
    private String color, marca, modelo, patente;
    private int puertas;

    public Auto() {
        this("", "", "", "",0); 
    }
    
    //Metodo Constructor
    public Auto(String color, String marca, String modelo, String patente, int puertas) {
        this.color = color;
        this.marca = marca;
        this.modelo = modelo;
        this.patente = patente;
        this.puertas = puertas;
    }
    /**
     * @return el color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color a determinar
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return la marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca a determinar
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return el modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo a determinar
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return la patente
     */
    public String getPatente() {
        return patente;
    }

    /**
     * @param patente a determinar
     */
    public void setPatente(String patente) {
        this.patente = patente;
    }

    /**
     * @return el número de puertas
     */
    public int getPuertas() {
        return puertas;
    }

    /**
     *numero@param puertas a determinar
     * @param puertas
     */
    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public String datosAutos() {
        return "Auto{" + "color=" + color + ", marca=" + marca + ", modelo=" + modelo + ", patente=" + patente + ", puertas=" + puertas + '}';
    }

    
    
    
}
