
package eva2_3_herencia;

/**
 *
 * @author alexi
 */
public class Persona {
    
    //ATRIBUTOS
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private int edad;
    private String rfc;
    
    //CONSTRUCTORES
    public Persona(){
        this.nombre = "_____";
        this.apellidoPaterno = "_____";
        this.apellidoMaterno = "_____";
        this.edad = 0;
        this.rfc = "_____";
    }
    
   //METODOS GET Y SET
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
       this.nombre = nombre;

    }
    
    
    public String getApellidoPaterno()
    { return apellidoPaterno;
    }
    public void setApellidoPaterno(String apellidoPaterno){
        this.apellidoPaterno = apellidoPaterno;
    }
    
    
    public String getApellidoMaterno()
    { return apellidoMaterno;
    }
    public void setApellidoMaterno(String apellidoMaterno){
        this.apellidoMaterno = apellidoMaterno;
    }
    
    
    public int getEdad()
    { return edad;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    
    
    public String getRfc()
    { return rfc;
    }
    public void setRfc(String rfc){
        this.rfc = rfc;
    }
    
}
