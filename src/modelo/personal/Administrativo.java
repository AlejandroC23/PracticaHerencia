/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.personal;

/**
 *
 * @author Alejandro
 */
public class Administrativo extends PersonaH {

    private int idAdministrativo;
    private String cargo;
    private String area;

    public Administrativo() {
    }

    public Administrativo(int idAdministrativo, String cargo, String area, int idPersona, String nombres, String apellidos, String cedula, String usuario, String clave, int telefono, String direccion, String correoElectronico, String sexo, String fechaNacimiento) {
        super(idPersona, nombres, apellidos, cedula, usuario, clave, telefono, direccion, correoElectronico, sexo, fechaNacimiento);
        this.idAdministrativo = idAdministrativo;
        this.cargo = cargo;
        this.area = area;
    }
    
    public int getIdAdministrativo() {
        return idAdministrativo;
    }

    public void setIdAdministrativo(int idAdministrativo) {
        this.idAdministrativo = idAdministrativo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public void imprimir() {
        System.out.println("------ DATOS PERSONALES ------\n"
                + "Cedula: " + getCedula() + "\n"
                + "Nombres: " + getNombres() + "\n"
                + "Apellidos: " + getApellidos() + "\n"
                + "Teléfono: " + getTelefono() + "\n"
                + "Dirección: " + getDireccion() + "\n"
                + "Sexo: " + getSexo() + "\n"
                + "Fecha de nacimiento: " + getFechaNacimiento() + "\n"
                + "------ DATOS ADMINISTRATIVOS ------\n"
                + "Id Administrativo: " + getIdAdministrativo() + "\n"
                + "Cargo: " + getCargo() + "\n"
                + "Área: " + getArea());
    }
}
