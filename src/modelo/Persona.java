/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Alejandro
 */
public class Persona {
    //1. DECLARACIÓN DE ATRIBUTOS
    private int idPersona;
    private String nombre;
    private String apellido;
    private String cedula;
    private String direccion;
    private String email;
    
    //2. MÉTODOS CONSTRUCTORES

    public Persona() {
    }

    public Persona(int idPersona, String nombre, String apellido, String cedula, String direccion, String email) {
        this.idPersona = idPersona;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.direccion = direccion;
        this.email = email;
    }
    
    //3. MÉTODOS DE ENCAPSULAMIENTO

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    //MÉTODOS DE REGLA DE NEGOCIO
        //Imprimir
    public String imprimir(){
        return "*** DATOS PERSONA ***\n" +
                "ID: " + getIdPersona() + "\n" +
                "Nombres: " + getNombre() + "\n" +
                "Apellidos: " + getApellido() + "\n" +
                "Cédula: " + getCedula() + "\n" +
                "Dirección: " + getDireccion() + "\n" +
                "Correo: " + getEmail() + "\n";
    }
        //Validación Cédula
    public void validarCedula(){
        int[] listaDigitos = new int[9];
        String cedula = getCedula();
        
        if(cedula.length()>10){
            System.out.println("¡Ingrese una cédula válida!");
            
        }else if(cedula.length()==10){
            for(int i = 0; i < cedula.length(); i++){
                listaDigitos[i] = (int) cedula.charAt(i);
            }
            for (int p : listaDigitos) {
                System.out.println(p);
            }
            System.out.println("");
            
        }else{
            System.out.println("¡Ingrese una cédula válida!");
        }
        
    }
}
