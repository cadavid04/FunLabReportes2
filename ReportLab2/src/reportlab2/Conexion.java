/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reportlab2;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author itmanager
 */
public class Conexion {
    
    public Connection getconnection() throws ClassNotFoundException {
        Connection cn=null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            cn=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/mitienda","root","root");
            JOptionPane.showMessageDialog(null, "Se conecto exitosamente");
        } catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        return cn;
   }
    
}
