package controlador;

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
    
    public void buscar(String placa, String horasalida, JTable jTable) {
        DefaultTableModel ModeloTabla;
        
        String [] columnas={"ID","Placa","Tipo Vehiculo","Fecha Ingreso","Hora Entrada","Hora Salida"};
        String [] registro=new String[6];
        ModeloTabla=new DefaultTableModel(null,columnas);      
        String SQL;
        
        
        
         
    try {

        con = conectar.getConexion();
        SQL= "SELECT * FROM vehiculo";
        PreparedStatement st = con.prepareStatement(SQL);
        ResultSet rs = st.executeQuery();

        while (rs.next()){
          
            registro[0]=rs.getString("id");
            registro[1]=rs.getString("placa");
            registro[2]=rs.getString("tipovehiculo");
            registro[3]=rs.getString("fechaingreso");
            registro[4]=rs.getString("horaentrada");
            registro[5]=rs.getString("horasalida");
           
          
            ModeloTabla.addRow(registro);
           
        }
        
        jTable.setModel(ModeloTabla);

    } catch (SQLException e) {


        JOptionPane.showMessageDialog(null, e, "Error durante el procedimiento", JOptionPane.ERROR_MESSAGE);
    
    
    }finally{

        if(con!=null){
        
            try {

                con.close();

            } catch (SQLException ex) {

                JOptionPane.showMessageDialog(null, ex, "Error de desconexión", JOptionPane.ERROR_MESSAGE);

            }
        
        }
        
    }

}
}
