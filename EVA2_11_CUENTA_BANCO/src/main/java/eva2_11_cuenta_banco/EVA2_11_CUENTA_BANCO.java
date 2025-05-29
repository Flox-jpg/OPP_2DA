package eva2_11_cuenta_banco;

/**
 *
 * @author alexi
 */
public class EVA2_11_CUENTA_BANCO {

    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("------Cuenta de ahorro--------");
        Cuenta_Ahorro C_Ahorro = new Cuenta_Ahorro(4500 ,4500);
        C_Ahorro.agregarSaldo(45);
        C_Ahorro.mostrarSaldo();

        System.out.println("------Cuenta normal--------");
        Cuenta_Corriente C_Cor = new Cuenta_Corriente(4500,4500);
        C_Cor.agregarSaldo(45);
        C_Cor.quitarSaldo(10);
        C_Cor.mostrarSaldo();
    }
    
}



