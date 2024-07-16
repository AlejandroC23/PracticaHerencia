/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador.personal;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import controlador.ConexionBDD;
import modelo.personal.Estudiante;
import java.sql.ResultSet;
/**
 *
 * @author Alejandro
 */
public class EstudianteControlador {
    
    private Estudiante estudiante;
    ConexionBDD conexion=new ConexionBDD();
    Connection connection=(Connection) conexion.conectar();
    PreparedStatement ejecutar;
    ResultSet resultado;
    
    public void crearEstudiante(Estudiante est){
        try {
            String consulta = "INSERT INTO personas(numMatricula, "
                    + "jornada, "
                    + "idPersona) " +
            "VALUES ('" + est.getNumMatricula() + "','" 
                    + est.getJornada() + "', " 
                    + est.getIdPersona() + ");";
            
            ejecutar =(PreparedStatement) connection.prepareCall(consulta);
            
            int res = ejecutar.executeUpdate(); //Cuando inserto
            
            if(res > 0){
                System.out.println("¡USUARIO HA SIDO CREADA CON EXITO!");
                ejecutar.close();
            }else{
                System.out.println("¡ERROR! INGRESE CORRECTAMENTE LOS DATOS SOLICITADOS");
                ejecutar.close();
            }
            
        } catch(Exception e){
            System.out.println("¡ERROR EN EL SISTEMA! COMUNIQUESE CON EL ADMINISTRADOR\n"
                     + "PARA SOLUCIONAR SU PROBLEMA: " + e);
        }
    }
}
