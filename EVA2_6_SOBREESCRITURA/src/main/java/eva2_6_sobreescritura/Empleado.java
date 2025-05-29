package eva2_6_sobreescritura;

/**
 *
 * @author alexi
 */
public class Empleado extends Persona {
    //ATRIBUTOS EXTRA
    private int clave;
    
   //CONSTRUCTORES DEFAULT Y CON ARGUMENTOS
   
   //DEFAULT 
   
   public Empleado(){
       super();
       this.clave = 0;
   }
   
   //CON ARGUMENTOS
   
   public Empleado(String nombre, String apellidos, int edad){
       super(nombre, apellidos, edad);
       this.clave = clave;   
   }
    
    //SET Y GET
    public int getClave() {
        return clave;
    }
    
    public void setClave(int clave) {
       this.clave = clave;

    }
    

   //IMPRIMIR DATOS
//   @Override
// public void imprimirDatos(){
//   System.out.println("Clave: " + clave);
//   System.out.println("Nombre: " + getNombre());
//   System.out.println("Apellidos: " + getApellidos());
//   System.out.println("Edad: " + getEdad());
//}
    @Override
   public void imprimirDatos(){
      System.out.println("Clave: " + clave);
      super.imprimirDatos();
   }

   
   
}
