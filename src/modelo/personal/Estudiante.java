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
    private int numMatricula;
    private String horario;
    private String jornada;

    public Estudiante() {
    }

    public Estudiante(int idEstudiante, int numMatricula, String horario, String jornada) {
        this.idEstudiante = idEstudiante;
        this.numMatricula = numMatricula;
        this.horario = horario;
        this.jornada = jornada;
    }
    
    public int getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(int idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    public int getNumMatricula() {
        return numMatricula;
    }

    public void setNumMatricula(int numMatricula) {
        this.numMatricula = numMatricula;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getJornada() {
        return jornada;
    }

    public void setJornada(String jornada) {
        this.jornada = jornada;
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
                + "Horario: " + getHorario() + "\n"
                + "Jornada: " + getJornada());
    }
}
