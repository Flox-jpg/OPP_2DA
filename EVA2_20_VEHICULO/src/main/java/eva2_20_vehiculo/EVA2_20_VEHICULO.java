
package eva2_20_vehiculo;

/**
 *
 * @author alexi
 */
public class EVA2_20_VEHICULO {

    public static void main(String[] args) {
        // TODO code application logic here
        Vehiculo veh = new Vehiculo();
        veh.setMarca("Ford");
        veh.setModelo("Lincon Navigator");
        veh.setYear("2005");
        //tipo de motor 
        MotorElectrico miMotor = new MotorElectrico();
        MotorDiesel Diesel = new MotorDiesel();
        MotorGasolina Gas = new MotorGasolina();
        veh.setMotor(Gas);
        System.out.println(veh);
    }
    
}
