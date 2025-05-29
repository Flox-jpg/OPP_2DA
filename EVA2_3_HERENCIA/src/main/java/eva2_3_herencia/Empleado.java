package eva2_3_herencia;

/**
 *
 * @author alexi
 */
public class Empleado extends Persona{
    private int numeroEmpleado;
    
    public int getNumeroEmpleado()
    { return numeroEmpleado;
    }
    public void setNumeroEmpleado(int claveEmpleado){
        this.numeroEmpleado = claveEmpleado;
    }
    
}
