/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_8_override;

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
    
    @Override
    public String toString(){
        String cade = super.toString();
        cade = cade + "\nInterprete: " + interprete;
        return cade; 
    }
    
}