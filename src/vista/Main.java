/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import modelo.Docente;

/**
 *
 * @author Alejandro
 */
public class Main {
    public static void main(String[] args) {
        Docente d = new Docente();
        d.setNombres("Alejandro");
        d.setIdPersona(1);
        d.setApellidos("Cevallos");
        d.setTitulo("Tecnólogo en Desarrollo de Software");
        d.setEspecialidad("N/A");
        d.setRegistroSenecyt("001-006-2025RX");
        
        System.out.println("");
        d.imprimir();
    }
}
