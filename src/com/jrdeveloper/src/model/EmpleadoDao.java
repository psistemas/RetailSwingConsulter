package com.jrdeveloper.src.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Rental Servicios
 */
public class EmpleadoDao {

    /**
     * *****************************************************************************
     *                                                                                                              *
     * REGISTRAR EMPLEADO EN LA BD * *
     * ****************************************************************************
     */
    public String registrarEmpleado(EmpleadoVo empleado) {
        String resultado = "";
        Connection conn = null;
        Conexion conexion = new Conexion();
        PreparedStatement preStatement = null;
        conn = conexion.getConnection();
        String consulta = "INSERT INTO empleados (id, nombre, apellido, edad, cedula)"
                + "VALUES(?,?,?,?,?)";

        try {
            preStatement = conn.prepareStatement(consulta);
            preStatement.setInt(1, empleado.getId());
            preStatement.setString(2, empleado.getNombre());
            preStatement.setString(3, empleado.getApellido());
            preStatement.setInt(4, empleado.getEdad());
            preStatement.setInt(5, empleado.getCedula());
            preStatement.execute();
            resultado = "ok";

            preStatement.close();
            conexion.desconectar();
        } catch (SQLException ex) {
            System.out.println("Exception de tipo SQLException DAO: " + ex.getMessage());
            resultado = "error";
        }
        return resultado;
    }

    /**
     * *****************************************************************************
     *                                                                                                              *
     * CONSULTAR UN EMPLEADO EN LA BD * *
     * ****************************************************************************
     */
    public EmpleadoVo consultarEmpleado(String doc) {
        Connection conn = null;
        Conexion conexion = new Conexion();
        PreparedStatement preStatement = null;
        ResultSet result = null;
        EmpleadoVo empleado = null;

        conn = conexion.getConnection();
        String consulta = "SELECT * FROM empleados WHERE cedula = ?";
        try {
            preStatement = conn.prepareStatement(consulta);
            preStatement.setString(1, doc);
            result = preStatement.executeQuery();
            while (result.next()) {
                empleado = new EmpleadoVo();
                empleado.setId(result.getInt("id"));
                empleado.setNombre(result.getString("nombre"));
                empleado.setApellido(result.getString("apellido"));
                empleado.setEdad(result.getInt("edad"));
                empleado.setCedula(result.getInt("cedula"));
            }
            result.close();
            preStatement.close();
            conexion.desconectar();
        } catch (SQLException ex) {
            System.out.println("Exception de tipo SQLException DAO: " + ex.getMessage());
        }
        return empleado;
    }

    /**
     * *****************************************************************************
     *                                                                                                              *
     * CONSULTAR LISTA DE EMPLEADOS EN LA BD * *
     * ****************************************************************************
     */
    //Consultar la lista de usuarios que estan en la BD
    public ArrayList<EmpleadoVo> buscarUsuariosConMatriz() {
        Conexion conex = new Conexion();
        ArrayList<EmpleadoVo> miLista = new ArrayList();
        EmpleadoVo empleado;
        try {
            Statement statment = conex.getConnection().createStatement();
            ResultSet rs = statment.executeQuery("SELECT * FROM empleados ");

            while (rs.next()) {
                empleado = new EmpleadoVo();
                empleado.setId(Integer.parseInt(rs.getString("id")));
                empleado.setNombre(rs.getString("nombre"));
                empleado.setApellido(rs.getString("apellido"));
                empleado.setEdad(rs.getInt("edad"));
                empleado.setCedula(rs.getInt("cedula"));
                miLista.add(empleado);
            }
            rs.close();
            statment.close();
            conex.desconectar();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "Error al consultar", "Error", JOptionPane.ERROR_MESSAGE);
        }
        return miLista;
    }

    /**
     * *****************************************************************************
     *                                                                                                              *
     * ACTUALIZAR EMPLEADO EN LA BD * *
     * ****************************************************************************
     */
    public String actualizarEmpleado(EmpleadoVo empleado) {
        String resultado = "";
        Connection conn = null;
        Conexion conexion = new Conexion();
        PreparedStatement preStatement = null;
        conn = conexion.getConnection();
        String consulta = "UPDATE empleados SET nombre = ?, apellido = ?, edad = ?, cedula = ? WHERE id = ?";
        try {
            preStatement = conn.prepareStatement(consulta);
            preStatement.setString(1, empleado.getNombre());// primer ? nombre
            preStatement.setString(2, empleado.getApellido());//segundo ? apellido
            preStatement.setInt(3, empleado.getEdad());//tercer ? edad
            preStatement.setInt(4, empleado.getCedula());//cuarto ? cedula

            preStatement.setInt(5, empleado.getId());//WHERE ID

            preStatement.executeUpdate();
            resultado = "ok";
            preStatement.close();
            conexion.desconectar();
        } catch (SQLException ex) {
            System.out.println("Exception de tipo SQLException DAO: " + ex.getMessage());
            resultado = "error";
        }
        return resultado;
    }

    /**
     * *****************************************************************************
     *                                                                                                              *
     * ELIMINAR EMPLEADO EN LA BD * *
     * ****************************************************************************
     */
    public String eliminarEmpleado(int doc) {
        String resultado = "";
        Connection conn = null;
        Conexion conexion = new Conexion();
        conn = conexion.getConnection();
        String consulta = "DELETE FROM empleados WHERE id = ?";

        try {
            PreparedStatement preStatement = conn.prepareStatement(consulta);//Busco al usuario con id
            preStatement.setInt(1, doc);
            preStatement.executeUpdate();
            resultado = "ok";
            conexion.desconectar();
            reordernarIncrementos();
        } catch (SQLException ex) {
            System.out.println("Exception de tipo SQLException DAO: " + ex.getMessage());
            resultado = "error";
        }

        return resultado;
    }

    public void reordernarIncrementos() {
        Connection conn = null;
        Conexion conexion = new Conexion();
        conn = conexion.getConnection();
        String [] consulta = new String[3];
        consulta[0] = "ALTER TABLE empleados DROP id; ";
        consulta[1] = "ALTER TABLE empleados AUTO_INCREMENT = 1;";
        consulta[2] = "ALTER TABLE empleados ADD id bigint UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY FIRST;";
        try {
            Statement statement = conn.createStatement();
            for (String aux:consulta) {
                statement.executeUpdate(aux);
            }
            conexion.desconectar();
            statement.close();
        } catch (SQLException ex) {
            System.out.println("Exception de tipo SQLException DAO: " + ex.getMessage());
        }
    }
    
}
