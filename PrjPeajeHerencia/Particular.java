
/**
 * 
 * @author Demian Wing
 * @version 1.0
 */
public class Particular extends Vehiculo
{
    public final int COBRO = 100;
    
    public Particular(String pPlaca, String pMarca, String pModelo, int pAnnio){
        super(pPlaca, pMarca, pModelo, pAnnio);
        tipo = "Particular";
    }
    
    public double calcularMontoPeaje(){
        return COBRO;
    }
}