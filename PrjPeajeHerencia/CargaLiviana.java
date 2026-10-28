
/**
 * 
 * @author Demian Wing
 * @version 1.0
 */
public class CargaLiviana extends Vehiculo
{
    public final int COBRO = 200;
    
    public CargaLiviana(String pPlaca, String pMarca, String pModelo, int pAnnio){
        super(pPlaca, pMarca, pModelo, pAnnio);
        tipo = "CargaLiviana";
        
        
    }
    
    public double calcularMontoPeaje(){
        return COBRO;
    }
}