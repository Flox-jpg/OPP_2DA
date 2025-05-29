package eva2_12_final;

/**
 *
 * @author alexi
 */
public class EVA2_12_FINAL {
    final static int VALOR = 100;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Valor: " + VALOR);
        //VALOR = 200; NO SE PUEDE MODIFICAR
        Docente docente = new Docente();
        
    }
    
}

class Persona{}
class Empleado extends Persona{}
final class Docente extends Empleado{} // hasta aqui llega la herencia
//class DocenteKinder extends Doncente{}

