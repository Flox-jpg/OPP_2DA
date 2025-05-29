/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package eva2_19_polimorfismo;

/**
 *
 * @author alexi
 */
public class EVA2_19_POLIMORFISMO {

    public static void main(String[] args) {
        // TODO code application logic here
        Empleado[] emps = new Empleado[5];
        emps[0] = new Empleado("sussie", "lopez", 69, 2);
        emps[1] = new Empleado("luis", "XXXX", 69, 3);
        emps[2] = new Empleado("lupe", "XXXX", 69, 1);
        emps[3] = new Empleado("Emily", "XXXX", 69, 4);
        emps[4] = new Empleado("ismael", "XXXX", 69, 0);
        
        Cliente[] cli = new Cliente[5];
        cli[0] = new Cliente("manuel", "XXXX", 69, "dfdfss");
        cli[1] = new Cliente("pancrasia", "XXXX", 69, "dfdfss");
        cli[2] = new Cliente("luly", "XXXX", 69, "dfdfss");
        cli[3] = new Cliente("Pedro", "XXXX", 69, "dfdfss");
        cli[4] = new Cliente("lizzy", "XXXX", 69, "dfdfss");
        
        System.out.println("REPORTE DE EMPLEADOS-------------------");
        generarReportes(emps);
        //for (int i = 0; i<5; i++){
            //emps[i].imprimirDatos();
        //}
        System.out.println("REPORTE DE CLIENTES-------------------");
        generarReportes(cli);
        //for (int i = 0; i<5; i++){
            //cli[i].imprimirDatos();
        //}
    }
    
    public static void generarReportes(Persona[] personas){
        for (int i = 0; i<5; i++){
            personas[i].imprimirDatos();
        }
    }
    
}
