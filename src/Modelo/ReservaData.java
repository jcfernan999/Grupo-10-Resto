package Modelo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ReservaData {
    private Connection connection = null;
    private Conexion conexion;
    public ReservaData(Conexion conexion) 
    {
        try {
            this.conexion=conexion;
            connection = conexion.getConexion();
        } catch (SQLException ex) {
            System.out.println("Error al abrir al obtener la conexion");
        }
    }
    public void guardarReserva(Reserva reserva){
        
        try{
          
            String sql = "INSERT INTO reserva (idCliente,idMesa, fecha, hora,activo) VALUES ( ?, ?, ?, ?, ?);";
           
            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
           
            statement.setInt(1, reserva.getCliente().getIdCliente());
           
            statement.setInt(2, reserva.getMesa().getIdMesa());
      
            statement.setDate(3, reserva.getFecha());
            
            statement.setString(4, reserva.getHora());
           
            statement.setBoolean(5, reserva.getActivo());
           
            
            statement.executeUpdate();
            
            ResultSet rs = statement.getGeneratedKeys();
            
            if (rs.next()) {
                reserva.setIdReserva(rs.getInt(1));
            } else {
                System.out.println("No se pudo obtener el id luego de insertar una Reserva");
            }
            statement.close();
    
        }catch (SQLException ex) {
            System.out.println("Error al insertar un Reserva: " + ex.getMessage());
        }
    }
     //Actializar,Modificar
    public void actualizarReserva(Reserva reserva){
    
        try {
            
            String sql = "UPDATE reserva SET idCliente = ?, idMesa = ? , fecha =?, hora = ?, activo = ? WHERE idProducto = ?;";

            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setInt(1, reserva.getCliente().getIdCliente());
            statement.setInt(2, reserva.getMesa().getIdMesa());
            statement.setDate(3, reserva.getFecha());
            statement.setString(4, reserva.getHora());
            statement.setBoolean(5, reserva.getActivo());
            statement.setInt(6, reserva.getIdReserva());
            
            statement.executeUpdate();
            
          
            statement.close();
    
        } catch (SQLException ex) {
            System.out.println("Error al Modificar una Reserva: " + ex.getMessage());
        }
    
    }
      //-------------------------------Borrar-desactivar
    public void borrarReserva(int id){
        try {    
            String sql = "UPDATE reserva SET activo = 0 WHERE idReserva = ?; ";
            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setInt(1, id);
            statement.executeUpdate();
            statement.close();
        } catch (SQLException ex) {
            System.out.println("Error al Eliminar un Reserva: " + ex.getMessage());
        }
    }
    
    
    public List<Reserva> obtenerReserva(String tipo,String dato){
        List<Reserva> reservas = new ArrayList<Reserva>();
        String sql;    
        PreparedStatement statement;
        try {
            if("idCliente".equals(tipo))
            {
                sql = "SELECT * FROM reserva WHERE idCliente = ? AND activo = 1 ;";
                statement = connection.prepareStatement(sql);
                statement.setString(1,dato);
            }
            else if("Activos".equals(tipo))
            {
                sql = "SELECT * FROM reserva WHERE activo = 1 ;";
                 statement = connection.prepareStatement(sql);
              
            }
            else if("Desactivado".equals(tipo))
            {
                sql = "SELECT * FROM reserva WHERE activo = 0 ;";
                 statement = connection.prepareStatement(sql);
                
            }
            else if("Dia".equals(tipo)){
                sql = "SELECT * FROM reserva WHERE activo = 1 and fecha = CURDATE();";
                statement = connection.prepareStatement(sql);
                
            }
            else if("Fecha".equals(tipo)){
                
                sql = "SELECT * FROM reserva WHERE activo = 1 AND fecha = ? ;";
                 statement = connection.prepareStatement(sql);
                 statement.setString(1,dato);
            }
            else{
                sql = "SELECT * FROM reserva WHERE activo = 1;";
                 statement = connection.prepareStatement(sql);
            }
            
         
            ResultSet resultSet = statement.executeQuery();
            Reserva  reserva;
            while(resultSet.next()){
               reserva = new Reserva();
               reserva.setIdReserva(resultSet.getInt("idReserva"));
               
               reserva.setFecha(resultSet.getDate("fecha"));
               reserva.setHora(resultSet.getString("hora"));
               reserva.setActivo(resultSet.getBoolean("activo"));
               
               Cliente c=buscarCliente(resultSet.getInt("idCliente"));
               reserva.setCliente(c);
               
               Mesa m=buscarMesa(resultSet.getInt("idMesa"));
               reserva.setMesa(m);
                
               reservas.add(reserva);
            }      
            statement.close();
        } catch (SQLException ex) {
            System.out.println("Error al obtener la Reserva: " + ex.getMessage());
        }
        return reservas;
    }
    
    public Reserva buscarReserva(int id){
        Reserva reserva=null;
    try {
            
            String sql = "SELECT * FROM reserva WHERE idReserva =?;";

            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setInt(1, id);
           
            ResultSet resultSet=statement.executeQuery();
            
            while(resultSet.next()){
               reserva = new Reserva();
               reserva.setIdReserva(resultSet.getInt("idReserva"));
               
               reserva.setFecha(resultSet.getDate("fecha"));
               reserva.setHora(resultSet.getString("hora"));
               reserva.setActivo(resultSet.getBoolean("activo"));
               
               Cliente c=buscarCliente(resultSet.getInt("idCliente"));
               reserva.setCliente(c);
               
               Mesa m=buscarMesa(resultSet.getInt("idMesa"));
               reserva.setMesa(m);
            }      
            statement.close();
        } catch (SQLException ex) {
            System.out.println("error: " + ex.getMessage());
        }
        
        return reserva;
    }
    
    public Cliente buscarCliente(int id){
    
        ClienteData ad=new ClienteData(conexion);
        
        return ad.buscarCliente(id);
        
    }
    
    public Mesa buscarMesa(int id){
    
        MesaData ad=new MesaData(conexion);
        
        return ad.buscarMesa(id);
        
    }
}
