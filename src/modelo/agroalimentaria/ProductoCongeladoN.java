/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.agroalimentaria;

/**
 *
 * @author Alejandro
 */
public class ProductoCongeladoN extends ProductoCongelado {
    private String metodoEmpleado;
    private double tExposicionNitrogeno;

    public ProductoCongeladoN() {
    }

    public ProductoCongeladoN(String metodoEmpleado, double tExposicionNitrogeno, String fechaEnvasado, String paisOrigen, int tempRecomendada, String fechaCaducidad, String nroLote) {
        super(fechaEnvasado, paisOrigen, tempRecomendada, fechaCaducidad, nroLote);
        this.metodoEmpleado = metodoEmpleado;
        this.tExposicionNitrogeno = tExposicionNitrogeno;
    }

    public String getMetodoEmpleado() {
        return metodoEmpleado;
    }

    public void setMetodoEmpleado(String metodoEmpleado) {
        this.metodoEmpleado = metodoEmpleado;
    }

    public double gettExposicionNitrogeno() {
        return tExposicionNitrogeno;
    }

    public void settExposicionNitrogeno(double tExposicionNitrogeno) {
        this.tExposicionNitrogeno = tExposicionNitrogeno;
    }
    
    @Override
    public void imprimir(){
        System.out.println("----- DATOS PRODUCTO CONGELADO POR NITROGENO ----\n" +
                "Fecha Caducidad: " + getFechaCaducidad() + "\n" +
                "Nro. Lote: " + getNroLote() + "\n" +
                "País Origen: " + getPaisOrigen()+ "\n" +
                "Fecha de Envasado: " + getFechaEnvasado() + "\n" +
                "Temperatura de Matentimiento Recomendada: " + getTempRecomendada() + " C°" + "\n" +
                "Método Empleado: " + getMetodoEmpleado() + "\n" +
                "Tiempo Exposición Nitrogeno: " + gettExposicionNitrogeno());
    }
}
