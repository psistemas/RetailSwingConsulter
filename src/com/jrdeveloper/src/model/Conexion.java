package com.jrdeveloper.src.model;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Rental Servicios
 */
public class Conexion {

    private String nombreBD = "tienda";
    private String usuario = "root";
    private String password = "";
    private String url = "jdbc:mysql://localhost/" + nombreBD;

    Connection conn = null;

    public Conexion() {
        try {
            //Constructor de la clase
            Class.forName("com.mysql.jdbc.Driver"); //Driver necesario para la conexion
            conn = (Connection) DriverManager.getConnection(url, usuario, password);

            if (conn != null) {
                System.out.println("Se ha conectado la base de datos");//Conexion Exitosa
            }
        } catch (ClassNotFoundException ex) {
            System.out.println("Exception de tipo ClassNotFoundException: " + ex.getMessage());
        } catch (SQLException ex) {
            System.out.println("Exception de tipo SQLException: " + ex.getMessage());
        }
    }

    public Connection getConnection(){//Devuelve la conexion de la base de datos
        return conn;
    }
    
    public void desconectar(){
        conn = null;
        System.out.println("Se ha desconectado la base de Datos");
    }
    
}
