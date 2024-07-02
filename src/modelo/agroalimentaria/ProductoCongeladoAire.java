/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.agroalimentaria;

/**
 *
 * @author Alejandro
 */
public class ProductoCongeladoAire extends ProductoCongelado {
    private double composicionAire;

    public ProductoCongeladoAire() {
    }

    public ProductoCongeladoAire(int composicionAire, String fechaEnvasado, String paisOrigen, int tempRecomendada, String fechaCaducidad, String nroLote) {
        super(fechaEnvasado, paisOrigen, tempRecomendada, fechaCaducidad, nroLote);
        this.composicionAire = composicionAire;
    }

    public double getComposicionAire() {
        return composicionAire;
    }

    public void setComposicionAire(double composicionAire) {
        this.composicionAire = composicionAire;
    }
    
    public void componentesAire(float nitrogeno, 
            float oxigeno, 
            float dioxidoCarbono, 
            float vaporAgua){
        setComposicionAire(nitrogeno 
                + oxigeno 
                + dioxidoCarbono 
                + vaporAgua);
    }
    
    @Override
    public void imprimir(){
        System.out.println("----- DATOS PRODUCTO CONGELADO POR AIRE ----\n" +
                "Fecha Caducidad: " + getFechaCaducidad() + "\n" +
                "Nro. Lote: " + getNroLote() + "\n" +
                "País Origen: " + getPaisOrigen()+ "\n" +
                "Fecha de Envasado: " + getFechaEnvasado() + "\n" +
                "Temperatura de Matentimiento Recomendada: " + getTempRecomendada() + " C°" + "\n" +
                "Composición del Aire: " + getComposicionAire());
    }
}
