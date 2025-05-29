
package eva2_6_sobreescritura;

/**
 *
 * @author alexi
 */
public class Persona {
    private String nombre;
    private String apellidos;
    private int edad;
    
    
    //CONSTRUCTORES DEFAULT Y CON ARGUMENTOS
    
    //DEAFULT
    public Persona(){
        this.nombre = "_____";
        this.apellidos = "_____"; 
        this.edad = 0;
    }
    
    //CON ARGUMENTOS
    public Persona(String nombre, String apellidos, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        
    }
    //METODOS GET Y SET
    
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
       this.nombre = nombre;

    }
    
    
    public String getApellidos()
    { return apellidos;
    }
    public void setApellidos(String apellidos){
        this.apellidos = apellidos;
    }
    
    
    public int getEdad()
    { return edad;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    
    //Imprimir Datos
      public void imprimirDatos(){
      System.out.println("Nombre: " + nombre);
      System.out.println("Apellidos: " + apellidos);
      System.out.println("Edad: " + edad);
   
   }
    
}
