/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.agroalimentaria;

/**
 *
 * @author Alejandro
 */
public class ProductoCongelado extends Producto {
    private String fechaEnvasado;
    private String paisOrigen;
    private int tempRecomendada;

    public ProductoCongelado() {
    }

    public ProductoCongelado(String fechaEnvasado, String paisOrigen, int tempRecomendada, String fechaCaducidad, String nroLote) {
        super(fechaCaducidad, nroLote);
        this.fechaEnvasado = fechaEnvasado;
        this.paisOrigen = paisOrigen;
        this.tempRecomendada = tempRecomendada;
    }

    public String getFechaEnvasado() {
        return fechaEnvasado;
    }

    public void setFechaEnvasado(String fechaEnvasado) {
        this.fechaEnvasado = fechaEnvasado;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    public int getTempRecomendada() {
        return tempRecomendada;
    }

    public void setTempRecomendada(int tempRecomendada) {
        this.tempRecomendada = tempRecomendada;
    }
    
    @Override
    public void imprimir(){
        System.out.println("----- DATOS PRODUCTO CONGELADO ----\n" +
                "Fecha Caducidad: " + getFechaCaducidad() + "\n" +
                "Nro. Lote: " + getNroLote() + "\n" +
                "País Origen: " + getPaisOrigen()+ "\n" +
                "Fecha de Envasado: " + getFechaEnvasado() + "\n" +
                "Temperatura de Matentimiento Recomendada: " + getTempRecomendada() + " C°");
    }
}
