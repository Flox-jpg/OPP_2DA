package eva2_8_override;

/**
 *
 * @author alexi
 */
public class EVA2_8_OVERRIDE {

     public static void main(String[] args) {
        // TODO code application logic here
        Libro lib = new Libro("joaquin", "El libro de troll", 2555, "el peor año del mundo");
        System.out.println(lib);
        System.out.println("----------Grabacion----------");
        Grabacion grab = new Grabacion("Fantasma", "carlos trejo", 2004, "Sujei");
        System.out.println(grab);
                
    }
    
}
