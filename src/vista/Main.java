/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import modelo.Administrativo;
import modelo.Docente;
import modelo.Estudiante;

/**
 *
 * @author Alejandro
 */
public class Main {

    public static void main(String[] args) {
        Docente d = new Docente();
        
        Estudiante e = new Estudiante();
        
        //INSTANCIA DE DOCENTE
        d.setNombres("Alejandro");
        d.setIdPersona(1);
        d.setApellidos("Cevallos");
        d.setTitulo("Tecnólogo en Desarrollo de Software");
        d.setEspecialidad("N/A");
        d.setRegistroSenecyt("001-006-2025RX");

        d.imprimir();

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
        a.imprimir();
    }
}
