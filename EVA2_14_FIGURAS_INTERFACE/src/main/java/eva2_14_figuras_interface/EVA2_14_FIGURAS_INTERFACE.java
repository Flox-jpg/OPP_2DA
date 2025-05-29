package eva2_14_figuras_interface;

/**
 *
 * @author alexi
 */
public class EVA2_14_FIGURAS_INTERFACE {

    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("---Circulo---");
        Circulo circ = new Circulo(4);
        circ.mostrarDatos();
        System.out.println("---Rectangulo---");
        Rectangulo rect = new Rectangulo(4, 5);
        rect.mostrarDatos();
    }
    
}
