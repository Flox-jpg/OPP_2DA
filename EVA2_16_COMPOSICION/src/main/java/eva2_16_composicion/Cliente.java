
package eva2_16_composicion;

/**
 *
 * @author alexi
 */
public class Cliente {
    //atributos
    private String nombre;
    private String apellidos;
    private int edad;
    private Direccion direccion;
    
    //constructores default y con argumentos
    
    
    //deafult
    public Cliente() {
        this.nombre = "";
        this.apellidos = "";
        this.edad = 0;
        this.direccion = new Direccion();
    }
    
    //con argumentos
    public Cliente(String nombre, String apellidos, int edad, String estado, String ciudad, String colonia, String calle, int NumeroCasa) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.direccion = new Direccion(estado, ciudad, colonia, calle, NumeroCasa);
    }
    
     
    //get y set
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
    // el cliente tiene direccion asi que la agregamos
    @Override
    public String toString(){
        return "Datos del cliente:" + "\n" +
                "nombre: " + nombre + "\n" + 
                "apellidos: " + apellidos + "\n" +
                "edad: " + edad + "\n" + 
                "estado: " + direccion.getEstado() + "\n" +
                "ciudad: " + direccion.getCiudad() + "\n" +
                "colonia: " + direccion.getColonia() + "\n" +
                "calle: " + direccion.getCalle() + "\n" +
                "Numero casa: " + direccion.getNumeroCasa() + "\n" ;
                
                        
    }
    


    
}
