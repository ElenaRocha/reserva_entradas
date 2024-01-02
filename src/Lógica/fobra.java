/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lógica;

import Datos.vobra;
import java.sql.Connection;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author ele_r
 */
public class fobra {
    private conexion mysql = new conexion();
    private Connection cn = mysql.conectar();
    private String sSQL = "";
    private Integer totalregistros;
    
    public DefaultTableModel mostrar(String buscar){
        DefaultTableModel modelo;
        
        String [] titulos = {"ID", "Título", "Autor", "Sinopsis", "Duración"};
    
        String [] registro = new String [5];
        
        totalregistros = 0;
        modelo = new DefaultTableModel(null, titulos);
        
        sSQL = "select * from obra where titulo like '%" + buscar + "%' order by idobra";
        
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
            
            while(rs.next()){
                registro [0] = rs.getString("idobra");
                registro [1] = rs.getString("titulo");
                registro [2] = rs.getString("autor");
                registro [3] = rs.getString("sinopsis");
                registro [4] = rs.getString("duracion_min");
                
                totalregistros += 1;
                modelo.addRow(registro);
            }
            return modelo;
            
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }
    }
    
    public boolean insertar (vobra dts) {
        sSQL = "insert into obra (titulo, autor, sinopsis, duracion_min)" + "values (?, ?, ?, ?)";
        try {
            PrepareStatement pst = cn.prepareStatement(sSQL);
            pst.setString(1, dts.getTitulo());
            pst.setString(2, dts.getAutor());
            pst.setString(3, dts.getSinopsis());
            pst.setString(4, dts.getDuracion_min());
            
            int n = pst.executeUpdate();
            
            if (n!=0){
                return true;
            }else{
                return false;
            }
                    
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
    }
    
    public boolean editar (vobra dts) {
        try {
            
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
        }
    }
    
    public boolean eliminar (vobra dts) {
        try {
            
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
        }
    }
}
