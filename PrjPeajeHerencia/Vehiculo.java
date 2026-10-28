
/**
 * 
 * @author Demian Wing
 * @version 1.0
 */

public abstract class Vehiculo {

    private String placa;
    private String marca;
    private String modelo;
    protected String tipo;
    private int annio;

    public Vehiculo(String pPlaca, String pMarca, String pModelo, int pAnnio) {
        placa = pPlaca;
        marca = pMarca;
        modelo = pModelo;
        annio = pAnnio;
    }
    
    public abstract double calcularMontoPeaje();

    public String getTipo() {
        return tipo;
    }

    public String toString() {
        return "Placa= " + placa + "\n" +
               "Tipo= " + tipo + "\n" +
               "Marca= " + marca + "\n" +
               "Modelo= " + modelo + "\n" +
               "Año= " + annio;
    }
}
