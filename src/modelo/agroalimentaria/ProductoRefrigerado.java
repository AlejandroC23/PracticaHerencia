/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.agroalimentaria;

/**
 *
 * @author Alejandro
 */
public class ProductoRefrigerado extends Producto {
    private String codexAlimentarius;
    private String fechaEnvasado;

    public ProductoRefrigerado() {
    }

    public ProductoRefrigerado(String codexAlimentarius, String fechaEnvasado, String fechaCaducidad, String nroLote) {
        super(fechaCaducidad, nroLote);
        this.codexAlimentarius = codexAlimentarius;
        this.fechaEnvasado = fechaEnvasado;
    }

    public String getCodexAlimentarius() {
        return codexAlimentarius;
    }

    public void setCodexAlimentarius(String codexAlimentarius) {
        this.codexAlimentarius = codexAlimentarius;
    }

    public String getFechaEnvasado() {
        return fechaEnvasado;
    }

    public void setFechaEnvasado(String fechaEnvasado) {
        this.fechaEnvasado = fechaEnvasado;
    }
    
    @Override
    public void imprimir(){
        System.out.println("----- DATOS PRODUCTO REFRIGERADO ----\n" +
                "Fecha Caducidad: " + getFechaCaducidad() + "\n" +
                "Nro. Lote: " + getNroLote() + "\n" +
                "Codex Alimentarius: " + getCodexAlimentarius() + "\n" +
                "Fecha de Envasado: " + getFechaEnvasado());
    }
}
