/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.banco;

/**
 *
 * @author Alejandro
 */
public final class CuentaAhorros extends Cuenta {
    private boolean cuentaActiva;
    
    public CuentaAhorros(boolean cuentaActiva, int nroConsignaciones, int nroRetiros, double saldo, double tasaAnual, double comisionMensual) {
        super(nroConsignaciones, nroRetiros, saldo, tasaAnual, comisionMensual);
        this.cuentaActiva = cuentaActiva;
        this.determinarCuenta();
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
    
    public void depositar(double valorDeposito){
        if(isCuentaActiva() == true){
            this.deposito(valorDeposito);
            this.determinarCuenta();
        }else{
            System.out.println("La cuenta esta inactiva, no se puede realizar el depósito.");
        }
    }
    
    public void retirar(double valorRetiro){
        if(isCuentaActiva()){
            this.retiro(valorRetiro);
            if(getNroRetiros() > 4){
                setComisionMensual((getNroRetiros() - 4) * 1000);  
            }
            this.determinarCuenta();
        }else{
            System.out.println("La cuenta esta inactiva, no se puede retirar dinero.");
        }
    }
    
    @Override
    public void imprimir(){
        String msj;
        if(isCuentaActiva()){
            msj = "Activa";
        }else{
            msj = "Inactiva";
        }
        System.out.println("------ CUENTA DE AHORROS ------" + "\n" +
                "Cuenta activa: " + msj + "\n" +
                "Saldo de la Cuenta: " + getSaldo() + "\n" +
                "Nro Transacciones: " + (getNroConsignaciones()+getNroRetiros()) + "\n" +
                "Nro. Consignaciones: " + getNroConsignaciones() + "\n" +
                "Nro. Retiros: " + getNroRetiros() + "\n" +
                "Tasa Anual: " + getTasaAnual() + "\n" +
                "Comision Mensual: " + getComisionMensual());
    }
}
