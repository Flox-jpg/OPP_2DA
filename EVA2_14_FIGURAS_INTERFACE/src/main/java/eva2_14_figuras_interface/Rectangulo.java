package eva2_14_figuras_interface;

/**
 *
 * @author alexi
 */
public class Rectangulo implements Figura {
    
        //atributos
    private double base;
    private double altura;
    
    //CONSTRUCTORES DEFAULT Y CON ARGUMENTOS
    
    //DEAFULT
    public Rectangulo(){ 
        this.base = 0; 
        this.altura = 0;
    }
    
    //CON ARGUMENTOS
    public Rectangulo(double base, double altura) {
        this.base = base;   
        this.altura = altura;   
    }
    
    //metodos get y set
    public double getBase() {
        return base;
    }
    public void setBase(double base) {
       this.base = base;
    }
    
        public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
       this.altura = altura;
    }

    @Override
    public double calcularArea(){
        return base * altura;
    }
    
    @Override
    public double calcularPerimetro(){
        return (2 * (base + altura));
    }

    public void mostrarDatos() {
        System.out.println("Rectangulo:");
        System.out.println("Base: " + base);
        System.out.println("Altura:" + altura);
        System.out.println("Area: " + calcularArea());
        System.out.println("Perimetro: " + calcularPerimetro());
    }
    

}