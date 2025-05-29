package eva2_7_sobreescritura;

/**
 *
 * @author alexi
 */
public class Empleado {
    private String nombre;
    private String apellido;
    private double salario;
    
    //contructores
    //DEAFULT
    public Empleado(){
        this.nombre = "_____";
        this.apellido = "_____"; 
        this.salario = 0;
    }
    
    //CON ARGUMENTOS
    public Empleado(String nombre, String apellido, double salario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.salario = salario;
        
    }
    
    //GET Y SET
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
       this.nombre = nombre;

    }
    
    
    public String getApellido()
    { return apellido;
    }
    public void setApellido(String apellido){
        this.apellido = apellido;
    }
    
    
    public double getSalario()
    { return salario;
    }
    public void setSalario(double salario){
        this.salario = salario;
    }
    
    
    //IMPRIMIR DATOS
      public void imprimirDatos(){
      System.out.println("Nombre: " + nombre);
      System.out.println("Apellido: " + apellido);
      System.out.println("Salario: " + salario);
   }    
    
      
    //METODO CALCULAR SALARIO
   public double calcularSalario(){
       return salario;
   } 
   
   @Override
   public String toString(){
       String cade = "nombre: " + nombre + "\n" +
               "apellido: " + apellido   + "\n" +
               "salario(sin calculo): " + salario;
     //System.out.println("nombre: " + nombre);
     //System.out.println("apellido: " + apellido);
     //System.out.println("salario(sin calculo): " + salario);
     return cade;
   }
    
    
}
