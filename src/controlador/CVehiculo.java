package controlador;

import modelo.Vehiculo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javaMYSQL.Conectar;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;


 
public class CVehiculo {
    private final Conectar conectar;
    private final Vehiculo modelo;
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
            JOptionPane.showMessageDialog(null, "Se ha retirado el vehiculo ");
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error de conexión:" + e.getMessage());
        }
    }
    
    public DefaultTableModel buscar(String placa, String fechaingreso) {
        
        String [] columnas={"id","placa","tipovehiculo","fechaingreso","horaentrada","horasalida"};
        String [] registro=new String[6];
        DefaultTableModel ModeloTabla =new DefaultTableModel(null,columnas);
        String SQL;
        
    try {

        con = conectar.getConexion();
        SQL= "SELECT * FROM vehiculo WHERE placa = '"+placa+"' OR fechaingreso = '"+fechaingreso+"'";
        PreparedStatement st = con.prepareStatement(SQL);
        ResultSet rs = st.executeQuery(SQL);
        while (rs.next()){
            
            registro[0]=rs.getString("idvehiculo");
            registro[1]=rs.getString("placa");
            registro[2]=rs.getString("tipovehiculo");
            registro[3]=rs.getString("fechaingreso");
            registro[4]=rs.getString("horaentrada");
            registro[5]=rs.getString("horasalida");
           
            
            ModeloTabla.addRow(registro);
        }
       

    } catch (SQLException e) {


        JOptionPane.showMessageDialog(null, e, "Error durante el procedimiento", JOptionPane.ERROR_MESSAGE);
    
    
    }finally{

        if(con!=null){
        
            try {

                con.close();

            } catch (SQLException ex) {

                JOptionPane.showMessageDialog(null, ex, "Error de de conexión", JOptionPane.ERROR_MESSAGE);

            }
        
        }
        
    }
        
        return ModeloTabla;

    }
}