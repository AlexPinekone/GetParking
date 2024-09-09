
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alejandro
 */
public class Calcular {
    
    private String Hora_Entrada;
    private String Hora_Salida;
    private Time Total;

    public String getHora_Entrada() {
        return Hora_Entrada;
    }

    public void setHora_Entrada(String Hora_Entrada) {
        this.Hora_Entrada = Hora_Entrada;
    }

    public String getHora_Salida() {
        return Hora_Salida;
    }

    public void setHora_Salida(String Hora_Salida) {
        this.Hora_Salida = Hora_Salida;
    }

    public Time getTotal() {
        return Total;
    }

    public void setTotal(Time Total) {
        this.Total = Total;
    }
    
    public int resta(){
        int res;
        String p1,p2;
        
        p1=Hora_Salida.substring(0,1)+"."+Hora_Salida.substring(3,4);
        p2=Hora_Entrada.substring(0,1)+"."+Hora_Entrada.substring(3,4);
        res = Integer.parseInt(p1)-Integer.parseInt(p2);
        
        
        return res;
    }
    
     public void setDatos(ResultSet r){
        try {
            
            Hora_Entrada=r.getString("hora_entrada");
            Hora_Salida=r.getString("hora_salida");
            
            
        } catch (SQLException ex) {
            
        }
    }
     
     public void Gastos(){
         
         resta();
         
         
     }
    
    
    
    
}
