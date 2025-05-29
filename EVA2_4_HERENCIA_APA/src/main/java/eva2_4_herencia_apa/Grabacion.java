
package eva2_4_herencia_apa;

/**
 *
 * @author alexi
 */
public class Grabacion extends FichaApa{
    private String interprete;

    public Grabacion(){
        super();//Llamando al constructor de la superclase
        this.interprete = "Sin interprete";
    }
    public Grabacion(String autor, String titulo, int year, String interprete){
        super(autor, titulo, year);
        this.interprete = interprete;
    }
    
    public String getInterprete() {
        return interprete;
    }

    public void setInterprete(String interprete) {
        this.interprete = interprete;
    }

    
}