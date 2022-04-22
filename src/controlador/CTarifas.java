
package controlador;

import java.sql.PreparedStatement;
import java.sql.Connection;
import javaMYSQL.Conectar;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import modelo.Tarifas;

public class CTarifas {
    private Conectar conectar;
    private Tarifas modelo;
    private Connection con;
    
    public CTarifas(){
        conectar = new Conectar();
        modelo = new Tarifas();
        
    }
    
    public void insertar(String tipovehiculo,String tipotarifa){
        PreparedStatement ps;
        String sql;
        modelo.setTipovehiculo(tipovehiculo);
        modelo.setTipotarifa(tipotarifa);

        try{
            con = conectar.getConexion();
            sql = "INSERT INTO tarifas(tipovehiculo, tipotarifa) values(?,?)";
            ps = con.prepareStatement(sql);
            ps.setString(1, modelo.getTipovehiculo());
            ps.setString(2, modelo.getTipotarifa());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "La tarifa a pagar es: "+ tipotarifa );
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error de conexión:" + e.getMessage());
        }    
    }
    
    public void retirar(String tipotarifa){
        PreparedStatement ps;
        String sql;
       

        try{
            con = conectar.getConexion();
            sql = "SELECT tipotarifa FROM tarifas";
            ps = con.prepareStatement(sql);
            ps.executeQuery();
            //JOptionPane.showMessageDialog(null, "La tarifa a pagar es: "+ tipotarifa );
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error de conexión:" + e.getMessage());
        }    
    }
}