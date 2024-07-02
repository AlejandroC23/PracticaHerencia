/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.agroalimentaria;

/**
 *
 * @author Alejandro
 */
public class ProductoFresco extends Producto {
    private String fechaEnvasado;
    private String paisOrigen;

    public ProductoFresco() {
    }

    public ProductoFresco(String fechaEnvasado, String paisOrigen, String fechaCaducidad, String nroLote) {
        super(fechaCaducidad, nroLote);
        this.fechaEnvasado = fechaEnvasado;
        this.paisOrigen = paisOrigen;
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
    
    @Override
    public void imprimir(){
        System.out.println("----- DATOS PRODUCTO FRESCO ----\n" +
                "Fecha Caducidad: " + getFechaCaducidad() + "\n" +
                "Nro. Lote: " + getNroLote() + "\n" +
                "Fecha de Envasado: " + getFechaEnvasado() + "\n" +
                "País de Origen: " + getPaisOrigen());
    }
}
