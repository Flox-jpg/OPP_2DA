package eva2_5_protected;

/**
 *
 * @author alexi
 */
public class Empleado extends Persona {
   
    private int clave;
    
    public int getClave() {
        return clave;
    }
    
    public void setClave(int clave) {
       this.clave = clave;

    }
    
   public Empleado() {
       super();
   } 
   
   public Empleado(String nombre, String apellidos, int edad){
       super(nombre, apellidos, edad);
       this.clave = clave;   
   }
   public void imprimirDatos(){
      System.out.println("Datos del empleado: ");
      System.out.println("Clave: " + clave);
      System.out.println("Nombre: " + super.nombre);
      System.out.println("Apellidos: " + apellidos);
      System.out.println("Edad: " + edad);
      
   
   }
   
   
}
