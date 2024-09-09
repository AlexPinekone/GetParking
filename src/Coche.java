
import java.sql.ResultSet;
import java.sql.SQLException;


public class Coche {
    private String Placa;
    private String Color;
    private String Marca;
    private String Modelo;
    private String Fechae;
    private String Horae;
    private String Horas;
    private int NoLugar;
    private int Id;
    private String Tiempo;

    public String getPlaca() {
        return Placa;
    }

    public String getColor() {
        return Color;
    }

    public String getMarca() {
        return Marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setPlaca(String Placa) {
        this.Placa = Placa;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public String getFechae() {
        return Fechae;
    }

    public void setFechae(String Fechae) {
        this.Fechae = Fechae;
    }

    public String getHorae() {
        return Horae;
    }

    public void setHorae(String Horae) {
        this.Horae = Horae;
    }

    public String getHoras() {
        return Horas;
    }

    public void setHoras(String Horas) {
        this.Horas = Horas;
    }

    public int getNoLugar() {
        return NoLugar;
    }

    public void setNoLugar(int NoLugar) {
        this.NoLugar = NoLugar;
    }

    public String getTiempo() {
        return Tiempo;
    }

    public void setTiempo(String Tiempo) {
        this.Tiempo = Tiempo;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    
    
    
    
    

    
    
    
    public String consultaPlaca(){
      String sql;
      sql="select * from coche where coche.Placa='"+Placa+"'";
      return sql;
    }
    
    public void setDatos(ResultSet r){
        try {
            
            Placa=r.getString("Placa");
            Color=r.getString("Color");
            Marca=r.getString("Marca");
            Modelo=r.getString("Modelo");
            Fechae=r.getString("Fecha_entrada");
            Horae=r.getString("hora_entrada");
            Horas=r.getString("hora_salida");
            NoLugar=r.getInt("no_lugar");
            Id=r.getInt("Id");
            Tiempo=r.getString("Tiempo");
            
        } catch (SQLException ex) {
            
        }
    }
    
    public String consultaColor(){
      String sql;
      sql="select coche.Color from coche where coche.Placa='"+Placa+"'";
      
      return sql;
    }
    
    public String consultaModelo(){
      String sql;
      sql="select coche.Modelo from coche where coche.Placa='"+Placa+"'";
      return sql;
    }
    
    public String consultaMarca(){
      String sql;
      sql="select coche.Marca from coche where coche.Placa='"+Placa+"'";
      return sql;
    }
    public String insertar(){
        String sql;
        
        sql="insert into coche values(";
        sql=sql+"'"+Placa+"',";
        sql=sql+"'"+Color+"',";
        sql=sql+"'"+Marca+"',";
        sql=sql+"'"+Modelo+"',";
        sql=sql+"'"+this.Fechae+"',";
        sql=sql+"'"+this.Horae+"',";
        sql=sql+"'"+this.Horas+"',";
        sql=sql+this.NoLugar+",null,'00:00:00')";
        
        return sql;
    }
    
    
    
    
    
    
    
    
    
    
    
}
