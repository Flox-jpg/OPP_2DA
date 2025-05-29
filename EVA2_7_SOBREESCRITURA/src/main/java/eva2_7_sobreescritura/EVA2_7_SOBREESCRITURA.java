package eva2_7_sobreescritura;

/**
 *
 * @author alexi
 */
public class EVA2_7_SOBREESCRITURA {

    public static void main(String[] args) {
        EmpleadoBase empBase = new EmpleadoBase("Juan", "Perez", 10, 15,1000);
        System.out.println(empBase);
        EmpleadoTemporal empTemp = new EmpleadoTemporal("Juan", "Perez", 10, 30, 1000);
        System.out.println(empTemp);
        
    }
}
