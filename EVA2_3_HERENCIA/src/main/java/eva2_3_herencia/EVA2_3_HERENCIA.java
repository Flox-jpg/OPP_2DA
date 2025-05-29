package eva2_3_herencia;

/**
 *
 * @author alexi
 */
public class EVA2_3_HERENCIA {

    public static void main(String[] args) {
        //EMPLEADO
        Empleado empleado = new Empleado();
        empleado.setNombre("Juan");
        System.out.println("Nombre:" + empleado.getNombre());
        empleado.setNumeroEmpleado(100);
        //PROVEEDOR
        Proveedor prov = new Proveedor();
        prov.setNombre("Walmart");
        prov.setCredito(false);
        System.out.println("Nombre" + prov.getNombre());
        System.out.println("Credito:" + prov.isCredito());
        //CLIENTE
        Cliente cliente = new Cliente();
        cliente.setNombre("Felipe");
        System.out.println("Razon social:" + cliente.getRazonSocial());
    }
    }

