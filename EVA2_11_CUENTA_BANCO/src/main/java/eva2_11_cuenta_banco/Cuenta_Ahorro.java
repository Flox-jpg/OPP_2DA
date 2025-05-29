package eva2_11_cuenta_banco;

/**
 *
 * @author alexi
 */
public class Cuenta_Ahorro extends Cuenta_General{
    private double ahorro;

    public Cuenta_Ahorro(double ahorro, double saldo) {
        super(saldo);
        this.ahorro = ahorro;
    }

    public double getAhorro() {
        return ahorro;
    }

    public void setAhorro(double ahorro) {
        this.ahorro = ahorro;
    }
    
    
    @Override
    public void agregarSaldo(double cantidad) {
        double saldoActual = getSaldo();
        setSaldo(saldoActual + cantidad);
    }
    
    @Override
    public void mostrarSaldo(){
        System.out.println("Saldo de cuenta: " + getSaldo());
    }

    @Override
    public double quitarSaldo(double cantidad) {
        double saldoActual = getSaldo();
        if (cantidad <= saldoActual) {
            setSaldo(saldoActual - cantidad);
        } else {
            System.out.println("Saldo insuficiente");
        }
        return getSaldo();
    }  
    
}
