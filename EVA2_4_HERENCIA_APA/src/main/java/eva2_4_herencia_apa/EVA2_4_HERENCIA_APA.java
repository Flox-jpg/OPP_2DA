package eva2_4_herencia_apa;

/**
 *
 * @author alexi
 */
public class EVA2_4_HERENCIA_APA {

    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("----------------------");
        FichaApa prov = new FichaApa();
        Libro lib = new Libro();
        System.out.println("----/Libro/-------");
        prov.setTitulo("Luna de pluton");
        prov.setYear(2005);
        lib.setEditorial("le vernie");
        System.out.println("Autor: "+ prov.getAutor());
        System.out.println("Titulo  : "+ prov.getTitulo());
        System.out.println("Lanzamiento: "+ prov.getYear());
        System.out.println("Editorial: "+ lib.getEditorial());
        
        Grabacion grabe = new Grabacion();
        System.out.println("------/Grabacion/---------");
        prov.setTitulo("dia de invierno");
        prov.setYear(2020);
        grabe.setInterprete("mariovel");
        System.out.println("Autor: "+ prov.getAutor());
        System.out.println("Titulo  : "+ prov.getTitulo());
        System.out.println("Lanzamiento: "+ prov.getYear());
        System.out.println("Interprete  : "+ grabe.getInterprete());
        
        System.out.println("--------/Enciclopedia/----------");
        Enciclopedia enci = new Enciclopedia();
        enci.setAutor("sujei");
        System.out.println("Autor: "+enci.getAutor());
        System.out.println("Titulo: "+enci.getTitulo());
        System.out.println("Lanzamiento: "+enci.getYear());
        System.out.println("Editorial: "+enci.getEditorial());
    }
    
}
