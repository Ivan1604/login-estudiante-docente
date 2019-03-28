/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.controlador;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.sun.corba.se.spi.orbutil.fsm.Guard;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author PC-IVAN
 */
public class Conexion {
    Connection conex;
    static String url = "jdbc:mysql://localhost:3306/encuesta";
    static String user = "root";
    static String password = "root";
    
    public Connection conexion(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conex=(Connection) DriverManager.getConnection(url,user,password);
            JOptionPane.showMessageDialog(null,"conexion exitosa");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return conex;
    }
    
    public void consultarUsuarios() throws SQLException{
        conexion();
        PreparedStatement ps;
        ResultSet res;
        
        ps=(PreparedStatement) conex.prepareStatement("SELECT * FROM usuario");
         res=ps.executeQuery();
         if (res.next()){
             JOptionPane.showInternalMessageDialog(null,res.getInt("idUser") +
                     res.getString("user")+ res.getString("passw"));
             
             conex.close();
             
         }
                
    }
}
