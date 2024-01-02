/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lógica;

import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author ele_r
 */
public class conexion {
    public String db = "reserva_entradas";
    public String url = "jdbc:mysql://127.0.0.1/" + db;
    public String user = "root";
    public String pass = "";

    public conexion() {
    }
    
    public Connection conectar() throws SQLException{
        Connection link = null;
        
        try {
            Class.forName("com.mysql.jdbc.Driver.class");
            link = DriverManager.getConnection(this.url, this.user, this.pass);
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showConfirmDialog(null, e);
        }
        
        return link;
    }
}
