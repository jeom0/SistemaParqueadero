package controlador;

import java.sql.Statement;
import modelo.Vehiculo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javaMYSQL.Conectar;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;


 
public class CVehiculo {
    private Conectar conectar;
    private Vehiculo modelo;
    private Connection con;
     
    public CVehiculo(){
        conectar = new Conectar();
        modelo = new Vehiculo();
    }
     
    public void insertar(String placa, String tipovehiculo,String fechaingreso, String horaentrada){
        PreparedStatement ps;
        String sql;
        modelo.setPlaca(placa);
        modelo.setTipovehiculo(tipovehiculo);
        modelo.setFechaingreso(fechaingreso);
        modelo.setHoraentrada(horaentrada);

        try{
            con = conectar.getConexion();
            sql = "INSERT INTO vehiculo(placa, tipovehiculo, fechaingreso, horaentrada) values(?,?,?,?)";
            ps = con.prepareStatement(sql);
            ps.setString(1, modelo.getPlaca());
            ps.setString(2, modelo.getTipovehiculo());
            ps.setString(3, modelo.getFechaingreso());
            ps.setString(4, modelo.getHoraentrada());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Se ha ingresado el vehiculo");
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error de conexión:" + e.getMessage());
        }
       
    }
    
  
    public void retirar(String placa, String horasalida) {
        PreparedStatement ps;
        String sql;
        modelo.setPlaca(placa);
        modelo.setHorasalida(horasalida);
        
        try{
            con = conectar.getConexion();
            sql = "UPDATE vehiculo SET horasalida ='"+horasalida+"' WHERE placa= '"+placa+"'";
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Se ha retirado el vehiculo");
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error de conexión:" + e.getMessage());
        }
    }
    
    public void buscar(String placa, String horasalida) {
        PreparedStatement ps;
        ResultSet rs;
        String sql;
        modelo.setPlaca(placa);
        modelo.setHorasalida(horasalida);
        
        /*
        model.addColumn("id");
        model.addColumn("placa");
        model.addColumn("tipovehiculo");
        model.addColumn("fechaingreso");
        model.addColumn("horaentrada");
        model.addColumn("horasalida");
        
        Object [] fila = new Object[2];
        fila[0] = "id";
        fila[1] = "placa";
        fila[2] = "tipovehiculo";
        fila[3] = "fechaingreso";
        fila[4] = "horaentrada";
        fila[5] = "horasalida";
        
        model.addRow ( fila );
        model.setValueAt("nuevo valor", 0, 1);
        model.removeRow (0); */
        
        try{
            con = conectar.getConexion();
            sql = "SELECT * FROM vehiculo";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery(sql);
            DefaultTableModel model = new DefaultTableModel();
            JTable jTable = new JTable(model);
            
            while(rs.next()){
               
               
                String id = String.valueOf(rs.getInt("id"));
                placa = rs.getString("placa");
                String tipovehiculo = rs.getString("tipovehiculo");
                String fechaingreso = rs.getString("fechaingreso");
                String horaentrada = rs.getString("horaentrada");
                horasalida = rs.getString("horasalida");
                
                
                
                String tbData[] = {id, placa, tipovehiculo, fechaingreso, horaentrada, horasalida};
                model.addRow(tbData);
                
            }
            jTable.setModel(model);
            
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error de conexión:" + e.getMessage());
        }
    }
}
