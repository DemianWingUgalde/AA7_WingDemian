
/**
 * 
 * @author Demian Wing
 * @version 1.0
 */
public class Moto extends Vehiculo
{
    public final int COBRO = 75;
    
    public Moto(String pPlaca, String pMarca, String pModelo, int pAnnio){
        super(pPlaca, pMarca, pModelo, pAnnio);
        tipo = "Vehiculo";
    }
    
    public double calcularMontoPeaje(){
        return COBRO;
    }
}