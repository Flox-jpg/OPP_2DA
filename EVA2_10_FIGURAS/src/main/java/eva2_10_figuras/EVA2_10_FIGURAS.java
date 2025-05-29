package eva2_10_figuras;

/**
 *
 * @author alexi
 */
public class EVA2_10_FIGURAS {

    public static void main(String[] args) {
        Circulo circulo = new Circulo(100);
        System.out.println("Circulo");
        System.out.println("área: " + circulo.calcularArea());
        System.out.println("perimetro: " + circulo.calcularPerimetro());
        Rectangulo rectangulo = new Rectangulo(100, 200);
        System.out.println("rectangulo:");
        System.out.println("Área: " + rectangulo.calcularArea());
        System.out.println("Perímetro: " + rectangulo.calcularPerimetro());
    }
}
