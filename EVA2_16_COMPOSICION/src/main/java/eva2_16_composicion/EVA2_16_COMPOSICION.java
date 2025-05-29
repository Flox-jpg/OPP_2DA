package eva2_16_composicion;

/**
 *
 * @author alexi
 */
public class EVA2_16_COMPOSICION {

    public static void main(String[] args) {
        Cliente cliente = new Cliente("juan", "perez", 23, "chihuahua", "chihuahua", "mirador", "gema", 13442);    
        System.out.println(cliente);
        Direccion direccion = new Direccion("lupe", "chavez", "mirador", "gema", 32145);
        cliente.setDireccion(direccion);
                }
}
