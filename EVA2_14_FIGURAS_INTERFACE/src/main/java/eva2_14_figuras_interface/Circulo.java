package eva2_14_figuras_interface;

/**
 *
 * @author alexi
 */
public class Circulo implements Figura, MostrarDatos{
    private double radio;
    //CONSTRUCTORES
    //GET Y SET
    
    public Circulo(){
        this.radio = 0.0;
    }
    
    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    
    @Override
    public double calcularArea(){
        return Math.PI * Math.pow(radio, radio);
    }
    
    
    @Override
    public double calcularPerimetro(){
        return Math.PI * radio * 2;
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Circulo:");
        System.out.println("Radio: " + radio);
        System.out.println("Area:" + calcularArea());
        System.out.println("Perimetro: " + calcularPerimetro());
    }
  } 