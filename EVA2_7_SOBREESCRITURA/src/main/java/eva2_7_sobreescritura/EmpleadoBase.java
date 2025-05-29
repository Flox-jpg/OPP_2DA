package eva2_7_sobreescritura;

/**
 *
 * @author alexi
 */
public class EmpleadoBase extends Empleado {
    //ATRIBUTOS EXTRA
    private int clave;
    private double bono;
    
    //SET Y GET
    public int getClave() {
        return clave;
    }
    
    public void setClave(int clave) {
       this.clave = clave;

    }
    
    public double getBono() {
        return bono;
    }
    
    public void setBono(int bono) {
       this.bono = bono;

    }
    
   public EmpleadoBase() {
       super();
   } 
   
   //CONSTRUCTORES
   
   public EmpleadoBase(String nombre, String apellido, int salario, double bono, int clave){
       super(nombre, apellido, salario);
       this.clave = clave;   
       this.bono = bono;
   }
   //IMPRIMIR DATOS
    
   //public void imprimirDatos(){
     // System.out.println("Clave: " + clave);
      //System.out.println("Bono: " + bono);
      //super.imprimirDatos();
   //}
   //METODO CALCULAR SALARIO
    public double calcularSlario(){
        return super.calcularSalario() * (1 + bono);
    }
    
    @Override
    public String toString(){
        String cade = super.toString();
        cade = cade + "numero de empleado: " + clave + "\n" +
                "bono: " + bono + "\n" +
                "salario total: " + calcularSalario();
        return cade;
    }
}
