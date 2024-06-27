/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import modelo.Administrativo;
import modelo.Docente;
import modelo.Estudiante;
import modelo.PersonaH;

/**
 *
 * @author Alejandro
 */
public class Main {

    public static void main(String[] args) {
        Docente d = new Docente();
        
        //INSTANCIA DE DOCENTE
        d.setNombres("Alejandro");
        d.setIdPersona(1);
        d.setApellidos("Cevallos");
        d.setTitulo("Tecnólogo en Desarrollo de Software");
        d.setEspecialidad("N/A");
        d.setRegistroSenecyt("001-006-2025RX");

        //d.imprimir();

        //INSTANCIA DE ADMINISTRATIVO
        Administrativo a = new Administrativo(1, 
                "Supervisor", 
                "Vinculación", 
                2, 
                "Ricardo", 
                "Villanueva", 
                "1004587919", 
                995196339, 
                "Ibarra", 
                "ricardovillan@gmail.com", 
                "Femenino", 
                "1996/03/24");
        //a.imprimir();
        
        //UPCASTING: CREAR OBJETOS DE LA CLASE PADRE
        //A TRAVÉS DE CONSTRUCTORES DE LAS CLASES HIJAS
        PersonaH p = new Estudiante();
        p.setIdPersona(3);
        p.setNombres("Alejandro");
        p.setApellidos("Cevallos");
        p.setCedula("1004587919");
        p.setTelefono(995196339);
        p.setDireccion("Ibarra");
        p.setCorreoElectronico("alejandrocev2005@gmail.com");
        p.setSexo("No Binario");
        p.setFechaNacimiento("2005/06/10");
        
        //p.imprimir();
        
        //DOWNCASTING: HEREDAR LOS DATOS DEL OBJETO PADRE A UN OBJETO HIJO
        Estudiante e = (Estudiante)p;
        
        e.setIdEstudiante(1);
        e.setNumMatricula(10001);
        e.setHorario("08:00-12:00");
        e.setJornada("Matutina");
        
        //e.imprimir();
    }
}
