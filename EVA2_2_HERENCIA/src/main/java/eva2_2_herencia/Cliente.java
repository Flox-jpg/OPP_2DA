package eva2_2_herencia;

/**
 *
 * @author alexi
 */
public class Cliente {
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private int edad;
    private String rfc;

    public Cliente(String nombre, String apellidoPaterno, String apellidoMaterno, int edad, String rfc) {
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.edad = edad;
        this.rfc = rfc;
    }
    
    public Cliente() {
        this.nombre = "";
        this.apellidoPaterno = "";
        this.apellidoMaterno = "";
        this.edad = 0;
        this.rfc = "";
    }
    
    
    
   
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

