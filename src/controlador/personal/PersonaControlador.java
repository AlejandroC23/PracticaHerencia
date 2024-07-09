/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador.personal;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import controlador.ConexionBDD;
import modelo.personal.PersonaH;
import java.sql.ResultSet;

/**
 *
 * @author Alejandro
 */
public class PersonaControlador {
    //ATRIBUTOS
    //Métodos
    private PersonaH personas;
    //Conexión
    ConexionBDD conexion=new ConexionBDD();
    Connection connection=(Connection) conexion.conectar();
    PreparedStatement ejecutar;
    ResultSet resultado;
    
    public void crearPersona(PersonaH p){
        try {//Excepción que lanza la consulta
            //STRING ESTÁTICO CON COMPONENTES DINÁMICOS
            String consulta = "INSERT INTO personas(nombres, "
                    + "apellidos, "
                    + "cedula, "
                    + "usuario, "
                    + "clave, "
                    + "direccion, "
                    + "correoElectronico, "
                    + "sexo, "
                    + "fechaNacimiento, "
                    + "telefono) " +
            "VALUES ('" + p.getNombres() + "','" 
                    + p.getApellidos() + "','" 
                    + p.getCedula() + "','" 
                    + p.getUsuario() + "','" 
                    + p.getClave() + "','" 
                    + p.getDireccion() + "','" 
                    + p.getCorreoElectronico() + "','" 
                    + p.getSexo() + "','" 
                    + p.getFechaNacimiento() + "'," 
                    + p.getTelefono() +");";
            
            ejecutar =(PreparedStatement) connection.prepareCall(consulta);
            
            //Ejecutar la consulta
            int res = ejecutar.executeUpdate();
            
            if(res > 0){
                System.out.println("¡LA PERSONA HA SIDO CREADA CON EXITO!");
                ejecutar.close();
            }else{
                System.out.println("¡ERROR! INGRESE CORRECTAMENTE LOS DATOS SOLICITADOS");
                ejecutar.close();
            }
            
        } catch(Exception e){
            //Captura el error en memoria y continúa la ejecución
            //ERROR - DEBUG
            System.out.println("ERROR: " + e);
        }
    }
}
