/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.agroalimentaria;

/**
 *
 * @author Alejandro
 */
public class Producto {
    private String fechaCaducidad;
    private String nroLote;

    public Producto() {
    }

    public Producto(String fechaCaducidad, String nroLote) {
        this.fechaCaducidad = fechaCaducidad;
        this.nroLote = nroLote;
    }

    public String getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(String fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    public String getNroLote() {
        return nroLote;
    }

    public void setNroLote(String nroLote) {
        this.nroLote = nroLote;
    }
    
    public void imprimir(){
        System.out.println("----- DATOS PRODUCTO ----\n" +
                "Fecha Caducidad: " + getFechaCaducidad() + "\n" +
                "Nro. Lote: " + getNroLote());
    }
}
