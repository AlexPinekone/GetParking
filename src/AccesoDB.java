import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AccesoDB {
    private Connection cn;
    private Statement st;
    private ResultSet rs;
    
    public boolean abrir(){
        try{
            String driver= "com.mysql.jdbc.Driver";
            String bd= "jdbc:mysql://localhost/estacionamiento";
            String usu= "root";
            String pwd= "";
            
            Class.forName(driver).newInstance();
            cn=DriverManager.getConnection(bd,usu,pwd);
            return true;
            
        }catch (Exception e){
            return false;
        }
    }
    public void cerrar(){
            try {
                cn.close();
            } catch (SQLException ex) {
                Logger.getLogger(AccesoDB.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    public boolean operacionBD(String sql){
        try{
            st=cn.createStatement();
            st.execute(sql);
            return true;
        }catch (SQLException e){
            return false;
        }
            
            
    }
    public ResultSet consulta(String sql){
        try{
            st=cn.createStatement();
            rs=st.executeQuery(sql);
            return rs;
        }catch(SQLException e){
            return null;
        }
    }
}
