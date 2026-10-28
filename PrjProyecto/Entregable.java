
/**
 * 
 * @author Demian Wing
 * @version 1.0
 */
public class Entregable {
    private String nombre;
    private String status;

    public Entregable(String nombre, String status) {
        this.nombre = nombre;
        this.status = status;

    }

    public String toString() {
        return "Nombre del entregable: " + nombre +
               " Estado: " + status + "\n";

    }

}