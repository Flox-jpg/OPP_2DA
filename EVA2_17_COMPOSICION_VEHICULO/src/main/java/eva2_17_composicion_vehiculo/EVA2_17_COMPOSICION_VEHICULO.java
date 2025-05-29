/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package eva2_17_composicion_vehiculo;

/**
 *
 * @author alexi
 */
public class EVA2_17_COMPOSICION_VEHICULO {

    public static void main(String[] args) {
        // TODO code application logic here
        Vehiculo veh = new Vehiculo();
        System.out.println(veh);
        veh.setMarca("Chevrolet");
        veh.setModelo("Mustang");
        veh.setYear(2006);
        Motor motor = new Motor(0, 500);
        veh.setMotor(motor);
        System.out.println(veh);
    }
    
}
