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

    public CuentaAhorros(boolean cuentaActiva, int nroConsignaciones, int nroRetiros, double saldo, float tasaAnual, float comisionMensual) {
        super(nroConsignaciones, nroRetiros, saldo, tasaAnual, comisionMensual);
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
        }else{
            System.out.println("La cuenta esta inactiva.");
        }
    }
    
    @Override
    public void extractoMensual(){
        if(getNroRetiros() > 4){
            setComisionMensual(getComisionMensual() + 1000);
        }
        super.extractoMensual();
        determinarCuenta();
    }
}
