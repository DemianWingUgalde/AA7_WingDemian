
/**
 * 
 * @author Demian Wing
 * @version 1.0
 */
public class Carga extends Vehiculo
{
    public final int COBRO = 500;
    
    public Carga(String pPlaca, String pMarca, String pModelo, int pAnnio){
        super(pPlaca, pMarca, pModelo, pAnnio);
        tipo = "Vehiculo";
    }
        
    public double calcularMontoPeaje(){
        return COBRO;
    }
}