/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.logging.Logger;

/**
 *
 * @author Alejandro
 */
public class Docente extends PersonaH {

    //1. ATRIBUTOS PROPIOS
    private int idDocente;
    private String especialidad;
    private String titulo;
    private String registroSenecyt;
    private String escalaSalarial;

    //2. CONSTRUCTORES
    //1
    public Docente() {
    }

    //2
    public Docente(int idDocente, String especialidad, String titulo, String registroSenecyt, String escalaSalarial) {
        this.idDocente = idDocente;
        this.especialidad = especialidad;
        this.titulo = titulo;
        this.registroSenecyt = registroSenecyt;
        this.escalaSalarial = escalaSalarial;
    }

    //3: CONSTRUCTOR SUPERCLASE
    public Docente(int idDocente, String especialidad, String titulo, String registroSenecyt, String escalaSalarial, int idPersona, String nombres, String apellidos, String cedula, int telefono, String direccion, String correoElectronico, String sexo, String fechaNacimiento) {
        super(idPersona, nombres, apellidos, cedula, telefono, direccion, correoElectronico, sexo, fechaNacimiento);
        this.idDocente = idDocente;
        this.especialidad = especialidad;
        this.titulo = titulo;
        this.registroSenecyt = registroSenecyt;
        this.escalaSalarial = escalaSalarial;
    }

    public int getIdDocente() {
        return idDocente;
    }

    public void setIdDocente(int idDocente) {
        this.idDocente = idDocente;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getRegistroSenecyt() {
        return registroSenecyt;
    }

    public void setRegistroSenecyt(String registroSenecyt) {
        this.registroSenecyt = registroSenecyt;
    }

    public String getEscalaSalarial() {
        return escalaSalarial;
    }

    public void setEscalaSalarial(String escalaSalarial) {
        this.escalaSalarial = escalaSalarial;
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
                + "------ DATOS DOCENTE ------\n"
                + "Id Docente: " + getIdDocente() + "\n"
                + "Especialidad: " + getEspecialidad() + "\n"
                + "Titulo de docente: " + getTitulo() + "\n"
                + "Registro Senecyt: " + getRegistroSenecyt() + "\n"
                + "Escala Salarial: " + getEscalaSalarial());
    }

}
