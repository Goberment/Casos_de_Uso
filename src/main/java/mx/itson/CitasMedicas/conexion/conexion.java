/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.CitasMedicas.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Diego M
 */
public class conexion {
    Connection conectar = null;
    String usuario="root";
    String password="dmc011505";
    String bd="citasmedicas";
    String ip="localhost";
    String puerto="3307";
    
    String cadena = "jdbc:mysql://"+ip+":"+puerto+"/"+bd;
    
    public Connection estableceConexion(){
    try{
    Class.forName("com.mysql.jdbc:Driver");
    conectar = DriverManager.getConnection(cadena, usuario,password);
    JOptionPane.showMessageDialog(null, "Se ha conectado a la base de datos");
    
    }catch (Exception e){
        JOptionPane.showMessageDialog(null, "No logro conectar a la base de datos error"+e.toString());
    }
    
    return conectar;
    }
}
