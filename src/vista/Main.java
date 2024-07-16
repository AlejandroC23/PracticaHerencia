/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import controlador.ConexionBDD;
import controlador.personal.AdministrativoControlador;
import controlador.personal.DocenteControlador;
import controlador.personal.EstudianteControlador;
import controlador.personal.PersonaControlador;
import java.util.ArrayList;
import java.util.Scanner;
import modelo.personal.Administrativo;
import modelo.banco.CuentaAhorros;
import modelo.banco.CuentaCorriente;
import modelo.personal.Docente;
import modelo.personal.Estudiante;
import modelo.personal.PersonaH;

/**
 *
 * @author Alejandro
 */
public class Main {
    public static void main(String[] args) {
        Docente d = new Docente();
        
        //INSTANCIA DE DOCENTE
//        d.setNombres("Alejandro");
//        d.setIdPersona(1);
//        d.setApellidos("Cevallos");
//        d.setTitulo("Tecnólogo en Desarrollo de Software");
//        d.setEspecialidad("N/A");
//        d.setRegistroSenecyt("001-006-2025RX");

        //d.imprimir();

        //INSTANCIA DE ADMINISTRATIVO
//        Administrativo a = new Administrativo(1, 
//                "Supervisor", 
//                "Vinculación", 
//                2, 
//                "Ricardo", 
//                "Villanueva", 
//                "1004587919", 
//                995196339, 
//                "Ibarra", 
//                "ricardovillan@gmail.com", 
//                "Femenino", 
//                "1996/03/24");
        //a.imprimir();
        
        //UPCASTING: CREAR OBJETOS DE LA CLASE PADRE
        //A TRAVÉS DE CONSTRUCTORES DE LAS CLASES HIJAS
//        PersonaH p = new Estudiante();
//        p.setIdPersona(3);
//        p.setNombres("Alejandro");
//        p.setApellidos("Cevallos");
//        p.setCedula("1004587919");
//        p.setTelefono(995196339);
//        p.setDireccion("Ibarra");
//        p.setCorreoElectronico("alejandrocev2005@gmail.com");
//        p.setSexo("No Binario");
//        p.setFechaNacimiento("2005/06/10");
        
        //p.imprimir();
        
        //DOWNCASTING: HEREDAR LOS DATOS DEL OBJETO PADRE A UN OBJETO HIJO
//        Estudiante e = (Estudiante)p;
//        
//        e.setIdEstudiante(1);
//        e.setNumMatricula(10001);
//        e.setHorario("08:00-12:00");
//        e.setJornada("Matutina");
        
        //e.imprimir();
        
        //INTANCIAR OBJETO DE CUENTA DE AHORROS Y CORRIENTE
//        double saldo = 18000;
//        double tasa = 12.00;
//        CuentaAhorros a1 = new CuentaAhorros(false, 
//                0, 
//                0, 
//                saldo, 
//                tasa, 
//                0);
//        for (int i = 0; i < 6; i++) {
//            a1.retirar(5000);
//        }
//        a1.extractoMensual();
//        a1.imprimir();
        
//        double saldo2 = 12000;
//        double tasa2 = 12.00;
//        CuentaCorriente a2 = new CuentaCorriente(0, 
//                0, 
//                0, 
//                saldo2, 
//                tasa2, 
//                0);
//        
//        a2.imprimir();
//        
//        for (int i = 0; i < 4; i++) {
//            System.out.println("RETIRANDO...");
//            a2.retiroCorriente(5000);
//        }
//        
//        a2.extractoMensual();
//        a2.imprimir();
//        
//        System.out.println("DEPOSITANDO...");
//        a2.depositar(10000);
//        
//        a2.imprimir();

        //EJERCICIO POLIMORFISMO - 01/07/24
        ArrayList<CuentaAhorros> listCA = new ArrayList<>();
        ArrayList<CuentaCorriente> listCC = new ArrayList<>();
        
        Scanner s = new Scanner(System.in);
        int opcMain;
        
        do{
            System.out.println("       --------- BANCO JUANITO PEREZ ---------");
            System.out.println("                      Desde 1998");
        
            System.out.print("""
                         ¿Qué desea realizar?
                         1. Crear Cuenta
                         2. Consultar Saldo
                         3. Imprimir Estado de Cuenta
                         4. Depósito
                         5. Retiros
                         6. Gestión de Usuarios
                         7. Salir
                         """);
            System.out.print("Opción: ");
            opcMain = s.nextInt();
            
            switch (opcMain) {
                case 1 -> {
                    System.out.print("""
                                         ¿Qué tipo de cuenta desea?
                                         1. Ahorros
                                         2. Corriente
                                         """);
                    System.out.print("Opción: ");
                    int opcSubM1 = s.nextInt();
                    if(opcSubM1 == 1){
                        System.out.println("----- Formulario de Creación de Cuenta de Ahorros----");
                        System.out.print("Monto de la cuenta creada: ");
                        int saldo = s.nextInt();
                        CuentaAhorros ca = new CuentaAhorros(false,
                                1,
                                0,
                                saldo,
                                12, 
                                1.35);
                        ca.imprimir();
                        listCA.add(ca);
                        listCA.clear();
                        listCA.subList(1, 4);
                    }else{
                        System.out.println("----- Formulario de Creación de Cuenta Corriente----");
                        System.out.print("Monto de la cuenta creada: ");
                        int saldo = s.nextInt();
                        CuentaCorriente cc = new CuentaCorriente(0,
                                1,
                                0,
                                saldo,
                                12, 
                                1.35);
                        cc.imprimir();
                        listCC.add(cc);
                    }
                }
                case 2 -> {
                }
                case 3 -> {
                }
                case 4 -> {
                }
                case 5 -> {
                }
                case 6 -> {
                    System.out.println("""
                                       \n------ Gestión de Usuario ------
                                       1. Crear usuario estudiante.
                                       2. Crear usuario administrativo.
                                       3. Crear usuario docente.""");
                    System.out.print("Opción: ");
                    int opcSubM2 = s.nextInt();
                    if(opcSubM2 == 1){
                        System.out.println("""
                                                \n------ Registro de Usuario Estudiante -----
                                            //Ingrese los siguientes datos informativos""");
                        
                        //MODELO DE LA SUPERCLASE
                        PersonaH p = new PersonaH();
                        System.out.print("Ingrese su nombre: ");
                        p.setNombres(s.next());
                        System.out.print("Ingrese su apellido: ");
                        p.setApellidos(s.next());
                        System.out.print("Ingrese su número de cédula: ");
                        p.setCedula(s.next());
                        System.out.print("Ingrese su usuario: ");
                        p.setUsuario(s.next());
                        System.out.print("Ingrese su clave: ");
                        p.setClave(s.next());
                        System.out.print("Ingrese su teléfono: ");
                        p.setTelefono(s.nextInt());
                        System.out.println("Ingrese su dirección: ");
                        p.setDireccion(s.nextLine());
                        System.out.print("Ingrese su correo electrónico: ");
                        p.setCorreoElectronico(s.next());
                        System.out.print("Ingrese su sexo: ");
                        p.setSexo(s.next());
                        System.out.print("Ingrese su fecha de nacimiento: ");
                        p.setFechaNacimiento(s.next());
                        
                        //CONTROLADOR SUPERCLASE
                        PersonaControlador pc = new PersonaControlador();
                        pc.crearPersona(p);
                        
                        //OBTENER ID DE LA SUPERCLASE (PERSONAS)
                        int idPersona = pc.buscarIdPersona(p.getCedula());
                        
                        //MODELO DE LA SUBCLASE
                        Estudiante est = new Estudiante();
                        System.out.print("Ingrese su número de matrícula: ");
                        est.setNumMatricula(s.next());
                        System.out.print("Ingrese su jornada: ");
                        est.setJornada(s.next());
                        est.setIdPersona(idPersona);
                        
                        //CONTROLADOR SUBCLASE
                        EstudianteControlador ec = new EstudianteControlador();
                        ec.crearEstudiante(est);
                    }else if(opcSubM2 == 2){
                        System.out.println("""
                                                \n------ Registro de Usuario Administrativo -----
                                            //Ingrese los siguientes datos informativos""");
                        
                        //MODELO DE LA SUPERCLASE
                        PersonaH p = new PersonaH();
                        System.out.print("Ingrese su nombre: ");
                        p.setNombres(s.next());
                        System.out.print("Ingrese su apellido: ");
                        p.setApellidos(s.next());
                        System.out.print("Ingrese su número de cédula: ");
                        p.setCedula(s.next());
                        System.out.print("Ingrese su usuario: ");
                        p.setUsuario(s.next());
                        System.out.print("Ingrese su clave: ");
                        p.setClave(s.next());
                        System.out.print("Ingrese su teléfono: ");
                        p.setTelefono(s.nextInt());
                        System.out.println("Ingrese su dirección: ");
                        p.setDireccion(s.nextLine());
                        System.out.print("Ingrese su correo electrónico: ");
                        p.setCorreoElectronico(s.next());
                        System.out.print("Ingrese su sexo: ");
                        p.setSexo(s.next());
                        System.out.print("Ingrese su fecha de nacimiento: ");
                        p.setFechaNacimiento(s.next());
                        
                        //CONTROLADOR SUPERCLASE
                        PersonaControlador pc = new PersonaControlador();
                        pc.crearPersona(p);
                        
                        //OBTENER ID DE LA SUPERCLASE (PERSONAS)
                        int idPersona = pc.buscarIdPersona(p.getCedula());
                        
                        //MODELO DE LA SUBCLASE
                        Administrativo a = new Administrativo();
                        System.out.print("Ingrese el cargo: ");
                        a.setCargo(s.next());
                        System.out.print("Ingrese el area: ");
                        a.setArea(s.next());
                        
                        //CONTROLADOR SUBCLASE
                        AdministrativoControlador ac = new AdministrativoControlador();
                        ac.crearAdministrativo(a, idPersona);
                    }else if(opcSubM2 == 2){
                        System.out.println("""
                                                   \n------ Registro de Usuario Docente -----
                                            //Ingrese los siguientes datos informativos""");
                        
                        //MODELO DE LA SUPERCLASE
                        PersonaH p = new PersonaH();
                        System.out.print("Ingrese su nombre: ");
                        p.setNombres(s.next());
                        System.out.print("Ingrese su apellido: ");
                        p.setApellidos(s.next());
                        System.out.print("Ingrese su número de cédula: ");
                        p.setCedula(s.next());
                        System.out.print("Ingrese su usuario: ");
                        p.setUsuario(s.next());
                        System.out.print("Ingrese su clave: ");
                        p.setClave(s.next());
                        System.out.print("Ingrese su teléfono: ");
                        p.setTelefono(s.nextInt());
                        System.out.println("Ingrese su dirección: ");
                        p.setDireccion(s.nextLine());
                        System.out.print("Ingrese su correo electrónico: ");
                        p.setCorreoElectronico(s.next());
                        System.out.print("Ingrese su sexo: ");
                        p.setSexo(s.next());
                        System.out.print("Ingrese su fecha de nacimiento: ");
                        p.setFechaNacimiento(s.next());
                        
                        //CONTROLADOR SUPERCLASE
                        PersonaControlador pc = new PersonaControlador();
                        pc.crearPersona(p);
                        
                        //OBTENER ID DE LA SUPERCLASE (PERSONAS)
                        int idPersona = pc.buscarIdPersona(p.getCedula());
                        
                        //MODELO DE LA SUBCLASE
                        Docente doc = new Docente();
                        System.out.print("Ingrese la especialidad: ");
                        doc.setEspecialidad(s.next());
                        System.out.print("Ingrese el titulo: ");
                        doc.setTitulo(s.next());
                        System.out.print("Ingrese el registro Senecyt: ");
                        doc.setRegistroSenecyt(s.next());
                        System.out.print("Ingrese el escala salarial: ");
                        doc.setEscalaSalarial(s.next());
                        
                        //CONTROLADOR SUBCLASE
                        DocenteControlador dc = new DocenteControlador();
                        dc.crearDocente(doc, idPersona);
                    }
                }
                case 7 -> {
                    System.out.println("Saliendo del programa...");
                }
                default -> {
                    System.out.println("Ingrese una opción correcta...");
                }
            }
        }while(opcMain != 6);
    
        
    
    }
}
