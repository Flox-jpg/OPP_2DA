package eva2_9_clases_abstractas;
/**
 *
 * @author alexi
 */
public class EVA2_9_CLASES_ABSTRACTAS {

    public static void main(String[] args) {
        // TODO code application logic here
        Cliente cli = new Cliente("lucas", "Perez", 65, "Social");
        cli.imprimirDatos();
        Empleado emp = new Empleado("samantha", "Perez", 15, 500);
        emp.imprimirDatos();
    }
    
}

