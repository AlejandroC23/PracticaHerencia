/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Alejandro
 */
public class CuentaCorriente extends Cuenta {
    private double sobregiro;

    public CuentaCorriente() {
    }

    public CuentaCorriente(double sobregiro, int nroConsignaciones, int nroRetiros, double saldo, float tasaAnual, float comisionMensual, double interesMensual) {
        super(nroConsignaciones, nroRetiros, saldo, tasaAnual, comisionMensual, interesMensual);
        this.sobregiro = sobregiro;
    }

    public double getSobregiro() {
        return sobregiro;
    }

    public void setSobregiro(double sobregiro) {
        this.sobregiro = sobregiro;
    }
    
    @Override
    public void retiro(double valorRetiro){
        if (valorRetiro>getSaldo()) {
            setSobregiro(valorRetiro - getSaldo());
            setSaldo(0);
            setNroRetiros(getNroRetiros() + 1);
        }else{
            setSaldo(getSaldo() - valorRetiro);
            setNroRetiros(getNroRetiros() + 1);
        }
    }
    
    @Override
    public void deposito(double valorDeposito){
        if(getSobregiro() >= 0){
            super.deposito(valorDeposito - getSobregiro());
        }else{
            super.deposito(valorDeposito);
        }
    }
    
    @Override
    public void extractoMensual(){
        super.extractoMensual();
        System.out.println("------ EXTRACTO MENSUAL -----" + "\n" +
                "Saldo: " + getSaldo() + "\n" +
                "Interés Mensual: " + getInteresMensual() + "\n" +
                "Comisión Mensual: " + getComisionMensual());
    }
    
    @Override
    public void imprimir(){
        System.out.println("------ CUENTA CORRIENTE ------" + "\n" +
                "Saldo de la Cuenta: " + getSaldo() + "\n" +
                "Comision Anual: " + getComisionMensual()+ "\n" +
                "Nro Transacciones: " + (getNroConsignaciones()+getNroRetiros()) + "\n" +
                "Valor Sobregiro: " + getSobregiro());
    }
}
