
/**
 * Write a description of class Permanente here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Permanente extends Proyecto {

    private double costoAnualFijo;
    private double porcentajeInflacion;

    public Permanente(String nombre, double costoInicial, double costoAnualFijo, double inflacion)
    {

        super(nombre, costoInicial);

        this.costoAnualFijo = costoAnualFijo;

        this.porcentajeInflacion = inflacion;

    }

    public double calcularCostoActual() {

        return costoInicial + costoAnualFijo + (costoAnualFijo * porcentajeInflacion);

    }

    public String toString() {

        String s = super.toString();

        s = s + "Tipo de proyecto: Permanente\n" +
            "Costo anual fijo: " + costoAnualFijo + "\n" +
            "Porcentaje de inflación: " + porcentajeInflacion + "\n";

        return s;

    }

}