/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_1__exa_pract;

/**
 *
 * @author alexi
 */
public class TESTCOVID {
    private boolean E_Cronica;
    private int edad;
    private double peso;
    private double altura;

    public TESTCOVID() {
        E_Cronica = false;
        edad = 0;
        peso = 0.0;
        altura = 0.0;
    }

    public TESTCOVID(boolean E_Cronica, int edad, double peso, double altura) {
        this.E_Cronica = E_Cronica;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
    }

    public boolean getE_Cronica() {
        return this.E_Cronica;
    }

    public void setE_Cronica(boolean E_Cronica) {
        this.E_Cronica = E_Cronica;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return this.peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return this.altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    private double calcularIMC() {
        return peso / (altura * altura);
    }

    public void calcularPersonaRiesgo() {
        if (edad >= 65 || E_Cronica || calcularIMC() >= 30) {
            System.out.println("PERSONA DE RIESGO");
        } else {
            System.out.println("PERSONA SIN RIESGO");
            
        }      
    }
    
    public void ImprimirDATOS(){
        System.out.println("Datos del paciente ");
        System.out.println("ENFERMEDAD CRONICA: " + E_Cronica);
        System.out.println("Edad: " + edad);
        System.out.println("Peso: " + peso);
        System.out.println("Altura: " + altura);
        System.out.printf("IMC: ", calcularIMC());
        calcularPersonaRiesgo();
       
    }
}
    
    

