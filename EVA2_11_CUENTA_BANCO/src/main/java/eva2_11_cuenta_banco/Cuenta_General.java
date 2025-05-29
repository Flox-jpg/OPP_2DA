package eva2_11_cuenta_banco;

/**
 *
 * @author alexi
 */
public abstract class Cuenta_General {
    private double saldo;

    public Cuenta_General(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public void agregarSaldo(double cantidad) {
        saldo += cantidad;
    }

    public abstract double quitarSaldo(double cantidad);
    
    public void mostrarSaldo(){
        System.out.println("Saldo de cuenta: " + saldo);
    }

}