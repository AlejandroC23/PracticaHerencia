/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.agroalimentaria;

/**
 *
 * @author Alejandro
 */
public class ProductoCongeladoAgua extends ProductoCongelado {
    private double gramosSal;

    public ProductoCongeladoAgua() {
    }

    public ProductoCongeladoAgua(double gramosSal, String fechaEnvasado, String paisOrigen, int tempRecomendada, String fechaCaducidad, String nroLote) {
        super(fechaEnvasado, paisOrigen, tempRecomendada, fechaCaducidad, nroLote);
        this.gramosSal = gramosSal;
    }

    public double getGramosSal() {
        return gramosSal;
    }

    public void setGramosSal(double gramosSal) {
        this.gramosSal = gramosSal;
    }
    
    @Override
    public void imprimir(){
        System.out.println("----- DATOS PRODUCTO CONGELADO POR AGUA ----\n" +
                "Fecha Caducidad: " + getFechaCaducidad() + "\n" +
                "Nro. Lote: " + getNroLote() + "\n" +
                "País Origen: " + getPaisOrigen()+ "\n" +
                "Fecha de Envasado: " + getFechaEnvasado() + "\n" +
                "Temperatura de Matentimiento Recomendada: " + getTempRecomendada() + " C°" + "\n" +
                "Gamos Sal: " + getGramosSal() + "x lt. agua");
    }
}
