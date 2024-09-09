
import java.sql.ResultSet;
import java.sql.SQLException;

public class Estacionamiento {
    private int No_Lugar;
    private int Estado;

    public int getNo_Lugar() {
        return No_Lugar;
    }

    public int getEstado() {
        return Estado;
    }

    public void setNo_Lugar(int No_Lugar) {
        this.No_Lugar = No_Lugar;
    }

    public void setEstado(int Estado) {
        this.Estado = Estado;
    }
    
    
    public void setDatos(ResultSet r){
        try {
            
            No_Lugar=r.getInt("No_Lugar");
            Estado=r.getInt("Estado");
            
            
        } catch (SQLException ex) {
            
        }
    }
    
    
    public String insertar(){
        String sql;
        
        sql="insert into estacionamiento values(";
        sql=sql+"'"+No_Lugar+"',";
        sql=sql+this.Estado+")";
        
        return sql;
    }
    
    public String consultaTotal(){
      String sql;
      sql="select * from estacionamiento ";
      return sql;
    }
    
}
