
package eva2_13_interfaces;

/**
 *
 * @author alexi
 */
public class Empleado extends Persona implements MostrarDatos {
    private String clave;

    public Empleado(String clave, String nombre, String apellido) {
        this.clave = clave;
    }
    public Empleado(){
        super();
        this.clave = "_____";
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
    
    @Override
    public void imprimirDatos(){
       System.out.println();
    }
    
    
    
}
