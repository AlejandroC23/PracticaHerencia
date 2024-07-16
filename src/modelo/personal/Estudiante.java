/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.personal;

/**
 *
 * @author Alejandro
 */
public class Estudiante extends PersonaH {

    private int idEstudiante;
    private String numMatricula;
    private String jornada;
    private int idPersona;

    public Estudiante() {
    }

    public Estudiante(int idEstudiante, String numMatricula, String jornada, int idPersona, String nombres, String apellidos, String cedula, String usuario, String clave, int telefono, String direccion, String correoElectronico, String sexo, String fechaNacimiento) {
        super(idPersona, nombres, apellidos, cedula, usuario, clave, telefono, direccion, correoElectronico, sexo, fechaNacimiento);
        this.idEstudiante = idEstudiante;
        this.numMatricula = numMatricula;
        this.jornada = jornada;
        this.idPersona = idPersona;
    }

    public int getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(int idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    public String getNumMatricula() {
        return numMatricula;
    }

    public void setNumMatricula(String numMatricula) {
        this.numMatricula = numMatricula;
    }

    public String getJornada() {
        return jornada;
    }

    public void setJornada(String jornada) {
        this.jornada = jornada;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
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
                + "------ DATOS ESTUDIANTE ------\n"
                + "Id Estudiante: " + getIdEstudiante() + "\n"
                + "Número de Matricula: " + getNumMatricula() + "\n"
                + "Jornada: " + getJornada());
    }
}
