
import java.sql.ResultSet;
import java.sql.SQLException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CBTis 198
 */
public class Estado {
    private String esta;

    public String getEsta() {
        return esta;
    }

    public void setEsta(String esta) {
        this.esta = esta;
    }
    
     public String consultaEstado(){
      String sql;
      sql="select esta from estado ";
      return sql;
    }
     
     
     public void setDatos(ResultSet r){
        try {
            
            esta=r.getString("esta");
            
            
        } catch (SQLException ex) {
            
        }
    }
    
    
    
}
