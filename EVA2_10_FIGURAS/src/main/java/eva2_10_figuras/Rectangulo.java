
package eva2_10_figuras;

/**
 *
 * @author alexi
 */
public class Rectangulo extends Figura {
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
        return base * 2 + altura * 2;
    
    }
}
