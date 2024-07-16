/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador.personal;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import controlador.ConexionBDD;
import java.sql.ResultSet;
import modelo.personal.Docente;

/**
 *
 * @author Alejandro
 */
public class DocenteControlador {
    private Docente docente;
    ConexionBDD conexion=new ConexionBDD();
    Connection connection=(Connection) conexion.conectar();
    PreparedStatement ejecutar;
    ResultSet resultado;
    
    public void crearDocente(Docente d, int idPersona){
        try {
            String consulta = "INSERT INTO docentes(especialidad, "
                    + "titulo, "
                    + "registroSenecyt, "
                    + "escalaSalarial"
                    + "idpersona) " +
            "VALUES ('" + d.getEspecialidad() + "', '" 
                    + d.getTitulo() + "', '" 
                    + d.getRegistroSenecyt() + "', '"
                    + d.getEscalaSalarial() + "', " 
                    + idPersona + ");";
            
            ejecutar =(PreparedStatement) connection.prepareCall(consulta);
            
            int res = ejecutar.executeUpdate();
            
            if(res > 0){
                System.out.println("¡DOCENTE HA SIDO CREADO CON EXITO!");
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
