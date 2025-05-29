package eva2_7_sobreescritura;

/**
 *
 * @author alexi
 */
public class EmpleadoTemporal extends Empleado {
    private double contrato;
    private int horas;
    
    //CONSTRUCTORES CON Y SIN ARGUMENTOS
public EmpleadoTemporal(String nombre, String apellido, int salario, double contrato, int horas){
    super(nombre, apellido, salario);
    this.contrato = contrato;
    this.horas = horas; 
   }

    //SET Y GET
    public double getContrato() {
        return contrato;
    }
    
    public void setContrato(double contrato) {
       this.contrato = contrato;

    }
    
    public int getHoras() {
        return horas;
    }
    
    public void setContrato(int horas) {
       this.horas = horas;

    }
    //IMPRIMIR DATOS
    @Override
   public void imprimirDatos(){
      System.out.println("contrato: " + contrato);
      System.out.println("Horas: " + horas);
      
      super.imprimirDatos();
   }    
    //METODO CALCULAR SALARIO 
    @Override
   public String toString(){
       String cade = super.toString() + "\n";
       cade = cade + "contrato: " + contrato + "\n" +
               "horas: " + horas + "\n" + 
               "salario real: " + calcularSalario();
       return cade;
   }
}
