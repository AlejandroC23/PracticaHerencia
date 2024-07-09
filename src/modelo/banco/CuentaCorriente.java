/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.banco;

/**
 *
 * @author Alejandro
 */
public class CuentaCorriente extends Cuenta {
    private double sobregiro;

    public CuentaCorriente(double sobregiro, int nroConsignaciones, int nroRetiros, double saldo, double tasaAnual, double comisionMensual) {
        super(nroConsignaciones, nroRetiros, saldo, tasaAnual, comisionMensual);
        this.sobregiro = sobregiro;
    }

    public double getSobregiro() {
        return sobregiro;
    }

    public void setSobregiro(double sobregiro) {
        this.sobregiro = sobregiro;
    }
    
    public void retiroCorriente(double valorRetiro){
        if (valorRetiro>getSaldo()) {
            setSobregiro(valorRetiro - getSaldo());
            setSaldo(0);
            System.out.println("Su saldo actual es: $0\n" +
                    "Su valor de deuda al banco es: $" + getSobregiro());
        }else{
            setSaldo(getSaldo() - valorRetiro);
        }
        setNroRetiros(getNroRetiros() + 1);
    }
    
    public void depositar(double valorDeposito){
        if(getSobregiro() > 0){
            if (valorDeposito < getSobregiro()) {
                setSobregiro(getSobregiro() - valorDeposito);
                System.out.println("Su deuda supera su deposito, su sobregiro es de: $" + getSobregiro());
            }else{
                this.deposito(valorDeposito - getSobregiro());
                System.out.println("Deuda cancelada, el valor de deposito será de: $" + (valorDeposito - getSobregiro()));
                setSobregiro(0);
            }
        }else{
            this.deposito(valorDeposito);
        }
    }
    
    @Override
    public void imprimir(){
        System.out.println("------ CUENTA CORRIENTE ------" + "\n" +
                "Saldo de la Cuenta: " + getSaldo() + "\n" +
                "Sobregiro: " + getSobregiro()+ "\n" +
                "Nro Transacciones: " + (getNroConsignaciones()+getNroRetiros()) + "\n" +
                "Nro. Consignaciones: " + getNroConsignaciones() + "\n" +
                "Nro. Retiros: " + getNroRetiros() + "\n" +
                "Tasa Anual: " + getTasaAnual() + "\n" +
                "Comision Mensual: " + getComisionMensual());
    }
}
