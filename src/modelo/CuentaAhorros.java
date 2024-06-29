/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Alejandro
 */
public class CuentaAhorros extends Cuenta {
    private boolean cuentaActiva;

    public CuentaAhorros() {
    }

    public CuentaAhorros(boolean cuentaActiva, int nroConsignaciones, int nroRetiros, double saldo, float tasaAnual, float comisionMensual, double interesMensual) {
        super(nroConsignaciones, nroRetiros, saldo, tasaAnual, comisionMensual, interesMensual);
        this.cuentaActiva = cuentaActiva;
    }

    public boolean isCuentaActiva() {
        return cuentaActiva;
    }

    public void setCuentaActiva(boolean cuentaActiva) {
        this.cuentaActiva = cuentaActiva;
    }
    
    public void determinarCuenta(){
        if(getSaldo() < 10000){
            setCuentaActiva(false);
        }else{
            setCuentaActiva(true);
        }
    }
    
    @Override
    public void deposito(double valorDeposito){
        if(isCuentaActiva() == true){
            super.deposito(valorDeposito);
        }else{
            System.out.println("La cuenta esta inactiva.");
        }
    }
    
    @Override
    public void retiro(double valorRetiro){
        if(isCuentaActiva() == true){
            super.retiro(valorRetiro);
            if(getNroRetiros() > 4){
                setComisionMensual(getComisionMensual() + 1000);
            }
        }else{
            System.out.println("La cuenta esta inactiva.");
        }
        determinarCuenta();
    }
    
    @Override
    public void extractoMensual(){
        super.extractoMensual();
        determinarCuenta();
        System.out.println("------ EXTRACTO MENSUAL -----" + "\n" +
                "Cuenta activa: " + isCuentaActiva() + "\n" +
                "Saldo: " + getSaldo() + "\n" +
                "Interés Mensual: " + getInteresMensual() + "\n" +
                "Comisión Mensual: " + getComisionMensual());
    }
    
    @Override
    public void imprimir(){
        System.out.println("------ CUENTA DE AHORROS ------" + "\n" +
                "Cuenta activa: " + isCuentaActiva() + "\n" +
                "Saldo de la Cuenta: " + getSaldo() + "\n" +
                "Comision Anual: " + getComisionMensual()+ "\n" +
                "Nro Transacciones: " + (getNroConsignaciones()+getNroRetiros()));
    }
}
