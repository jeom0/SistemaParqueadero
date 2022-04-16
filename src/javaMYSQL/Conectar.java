package javaMYSQL;
 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
 
public class Conectar {
  
    public static final String URL = "jdbc:mysql://localhost:3306/parqueadero";
    public static final String USER = "root";
    public static final String CLAVE = "12345";
      
    public Connection getConexion(){
       
        Connection con = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(URL, USER, CLAVE);
        }catch(ClassNotFoundException | SQLException e){
            System.out.println("Error: " + e.getMessage());
        }
        return con;
    }
}