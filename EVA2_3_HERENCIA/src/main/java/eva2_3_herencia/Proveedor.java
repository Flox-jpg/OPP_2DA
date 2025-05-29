
package eva2_3_herencia;

/**
 *
 * @author alexi
 */
public class Proveedor extends Persona{
    public boolean credito;
    
    public boolean isCredito(){
        return credito;
    }
    public void setCredito(boolean credito) {
        this.credito = credito;
    }
}
