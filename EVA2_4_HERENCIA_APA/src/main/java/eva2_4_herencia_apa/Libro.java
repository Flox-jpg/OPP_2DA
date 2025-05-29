
package eva2_4_herencia_apa;

/**
 *
 * @author alexi
 */
public class Libro extends FichaApa{
    private String editorial;
    
    public Libro(){
        super();
        this.editorial = "Sin editorial";
    }
    public Libro(String autor, String titulo, int year, String editorial){
        super(autor, titulo, year);
        this.editorial = editorial;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }
    
    
}
