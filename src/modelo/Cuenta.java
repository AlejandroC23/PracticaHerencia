/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Alejandro
 */
public class Cuenta {
    private int nroConsignaciones;
    private int nroRetiros;
    private double saldo;
    private float tasaAnual;
    private float comisionMensual;

    public Cuenta() {
    }

    public Cuenta(int nroConsignaciones, int nroRetiros, double saldo, float tasaAnual, float comisionMensual) {
        this.nroConsignaciones = nroConsignaciones;
        this.nroRetiros = nroRetiros;
        this.saldo = saldo;
        this.tasaAnual = tasaAnual;
        this.comisionMensual = comisionMensual;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getNroConsignaciones() {
        return nroConsignaciones;
    }

    public void setNroConsignaciones(int nroConsignaciones) {
        this.nroConsignaciones = nroConsignaciones;
    }

    public int getNroRetiros() {
        return nroRetiros;
    }

    public void setNroRetiros(int nroRetiros) {
        this.nroRetiros = nroRetiros;
    }

    public float getTasaAnual() {
        return tasaAnual;
    }

    public void setTasaAnual(float tasaAnual) {
        this.tasaAnual = tasaAnual;
    }

    public float getComisionMensual() {
        return comisionMensual;
    }

    public void setComisionMensual(float comisionMensual) {
        this.comisionMensual = comisionMensual;
    }
    
    //METODOS DE REGLA DE NEGOCIO
    public void imprimir(){
        System.out.println("------ DATOS CUENTA BANCARIA ------" + "\n" +
                "Nro. Consignaciones: " + getNroConsignaciones() + "\n" +
                "Nro. Retiros: " + getNroRetiros() + "\n" +
                "Tasa Anual: " + getTasaAnual()+ "\n" +
                "Comision Anual: " + getComisionMensual()+ "\n");
    }
    
    public void deposito(double valorDeposito){
        setSaldo(getSaldo() + valorDeposito);
        setNroConsignaciones(getNroConsignaciones() + 1);
    }
    
    public void retiro(double valorRetiro){
        if (valorRetiro>getSaldo()) {
            System.out.println("No cuenta con los fondos suficientes para " +
                    "realizar el retiro.");
        }else{
            setSaldo(getSaldo() - valorRetiro);
            setNroRetiros(getNroRetiros() + 1);
        }
    }
    
    public void interesMensual(){
        double interesMensual = (getSaldo() * getTasaAnual()) / 12;
        setSaldo(getSaldo() + interesMensual);
    }
    
    public void extractoMensual(){
        setSaldo(getSaldo() - getComisionMensual());
        interesMensual();
    }
}
