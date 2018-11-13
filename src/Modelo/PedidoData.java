package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class PedidoData {
    private Connection connection = null;
    private Conexion conexion;

    public PedidoData(Conexion conexion) {
        try {
            this.conexion=conexion;
            connection = conexion.getConexion();
        } catch (SQLException ex) {
            System.out.println("Error al abrir al obtener la conexion");
        }
    }
    
    public void guardarPedido(Pedido pedido){
        
        try {
            
            String sql = "INSERT INTO pedido (idMesero,idMesa, fecha, hora,cancelado,pagado) VALUES ( ?, ?, ?, ?, ?, ?);";

            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            
            
            statement.setInt(1, pedido.getMesero().getIdMesero());
            statement.setInt(2, pedido.getMesa().getIdMesa());
            statement.setDate(3, pedido.getFecha());
            
            statement.setString(4, pedido.getHora());
           
            statement.setBoolean(5, pedido.getCancelado());
            
            statement.setBoolean(6, pedido.getPagado());
            
            statement.executeUpdate();
            
            ResultSet rs = statement.getGeneratedKeys();
            
            if (rs.next()) {
                pedido.setIdPedido(rs.getInt(1));
            } else {
                System.out.println("No se pudo obtener el id luego de insertar un Producto");
            }
            statement.close();
    
        } catch (SQLException ex) {
            System.out.println("Error al insertar un Pedido: " + ex.getMessage());
        }
    }
    
    public Pedido buscarPedido(int id){
        Pedido pedido=null;
    try {
            
            String sql = "SELECT * FROM pedido WHERE idPedido =?;";

            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setInt(1, id);
           
            ResultSet resultSet=statement.executeQuery();
            
            while(resultSet.next()){
                pedido = new Pedido();
                pedido.setIdPedido(resultSet.getInt("idPedido"));
                
                pedido.setFecha(resultSet.getDate("fecha"));
                pedido.setHora(resultSet.getString("hora"));
                pedido.setCancelado(resultSet.getBoolean("cancelado"));
                pedido.setPagado(resultSet.getBoolean("pagado"));
                
                Mesero msr=buscarMesero(resultSet.getInt("idMesero"));
                pedido.setMesero(msr);
                
                Mesa ms=buscarMesa(resultSet.getInt("idMesa"));
                pedido.setMesa(ms);
            }      
            statement.close();
        } catch (SQLException ex) {
            System.out.println("Error al buscar un pedido: " + ex.getMessage());
        }
        
        return pedido;
    }
    
    public Pedido buscarPedidoMesa(int id){
        
        Pedido pedido=null;
    try {
                        

            String sql = "SELECT * FROM pedido WHERE idMesa =?;";

            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setInt(1, id);
           
            ResultSet resultSet=statement.executeQuery();
            
            while(resultSet.next()){
                pedido = new Pedido();
                pedido.setIdPedido(resultSet.getInt("idPedido"));
                
                pedido.setFecha(resultSet.getDate("fecha"));
                pedido.setHora(resultSet.getString("hora"));
                pedido.setCancelado(resultSet.getBoolean("cancelado"));
                pedido.setPagado(resultSet.getBoolean("pagado"));
                
                Mesero msr=buscarMesero(resultSet.getInt("idMesero"));
                pedido.setMesero(msr);
                
                Mesa ms=buscarMesa(resultSet.getInt("idMesa"));
                pedido.setMesa(ms);
            }      
            statement.close();
        } catch (SQLException ex) {
            System.out.println("Error al buscar un pedido por mesa: " + ex.getMessage());
        }
        
        return pedido;
    }
    
     public Mesero buscarMesero(int id){
    
        MeseroData md=new MeseroData(conexion);
        
        return md.buscarMesero(id);
        
    }
     
     public Mesa buscarMesa(int id){
    
        MesaData md=new MesaData(conexion);
        
        return md.buscarMesa(id);
        
    }
     
     //-------------------------------ACTUALIZAR
    public void actualizarPedido(Pedido pedido){
    
        try {
            
            String sql = "UPDATE pedido SET idMesero = ?, idMesa = ?, fecha = ? , hora = ?, pagado = ?, cancelado = ?  WHERE idPedido = ?;";

            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setInt(1, pedido.getMesero().getIdMesero());
            statement.setInt(2, pedido.getMesa().getIdMesa());
            statement.setDate(3, pedido.getFecha());
            statement.setString(4, pedido.getHora());
            statement.setBoolean(5, pedido.getPagado());
            statement.setBoolean(6, pedido.getCancelado());
            statement.setInt(7, pedido.getIdPedido());
            statement.executeUpdate();
            
            statement.close();
    
        } catch (SQLException ex) {
            System.out.println("Error al Modidicar una Pedido: " + ex.getMessage());
        }
    
    }
    
    public List<Pedido> obtenerPedido(String tipo,String  dato, String dato2){
        List<Pedido> pedidos = new ArrayList<Pedido>();
        String sql;    
        PreparedStatement statement;
        try {
            if("Cobrados".equals(tipo)){
                sql = "SELECT * FROM pedido WHERE idMesero = ? and pagado = 1 and fecha = CURDATE();";
                statement = connection.prepareStatement(sql);
                
                statement.setString(1,dato);
            }
            else if("Cancelados del Dia".equals(tipo))
            {
                sql = "SELECT * FROM pedido WHERE idMesero = ? and cancelados = 1 and fecha = CURDATE();";
                statement = connection.prepareStatement(sql);
                statement.setString(1,dato);
            }
            else{
                sql = "SELECT * FROM pedido WHERE idMesero = ? and pagado = 1 and fecha BETWEEN ? AND ?;";
                statement = connection.prepareStatement(sql);
                statement.setString(1,dato);
                statement.setString(2,tipo);
                statement.setString(3,dato2);
            }
            
         
            ResultSet resultSet = statement.executeQuery();
            Pedido pedido;
            while(resultSet.next()){
               pedido = new Pedido();
               pedido.setIdPedido(resultSet.getInt("idPedido"));
               pedido.setFecha(resultSet.getDate("fecha"));
               pedido.setHora(resultSet.getString("hora"));
               pedido.setPagado(resultSet.getBoolean("Pagado"));
               pedido.setCancelado(resultSet.getBoolean("Cancelado"));
               
               
               Mesero meseros = buscarMesero(resultSet.getInt("idMesero"));
               pedido.setMesero(meseros);
               
               Mesa mesas = buscarMesa(resultSet.getInt("idMesa"));
               pedido.setMesa(mesas);
                
               pedidos.add(pedido);
            }      
            statement.close();
        } catch (SQLException ex) {
            System.out.println("Error al obtener los Pedidos: " + ex.getMessage());
        }
        
        
        return pedidos;
    }
    
    
    public List<Pedido> obtenerPedidoDeUnaMesaPorFechaEntreHoras(int idMesa,String fecha,String horaDesde,String horaHasta)
    {
        List<Pedido> pedidos = new ArrayList<Pedido>();
        
        try {
            
            String sql = "SELECT * FROM mesa m, pedido p WHERE m.idMesa = p.idMesa AND p.idMesa = ? AND p.fecha = ? AND p.hora BETWEEN ? AND ?;";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, idMesa);
            statement.setString(2, fecha);
            statement.setString(3, horaDesde);
            statement.setString(4, horaHasta);
            
            ResultSet resultSet = statement.executeQuery();
            Pedido pedido;
            
            while(resultSet.next()){
               pedido = new Pedido();
               pedido.setIdPedido(resultSet.getInt("idPedido"));
               pedido.setFecha(resultSet.getDate("fecha"));
               pedido.setHora(resultSet.getString("hora"));
               pedido.setPagado(resultSet.getBoolean("Pagado"));
               pedido.setCancelado(resultSet.getBoolean("Cancelado"));
               
               
               Mesero meseros = buscarMesero(resultSet.getInt("idMesero"));
               pedido.setMesero(meseros);
               
               Mesa mesas = buscarMesa(resultSet.getInt("idMesa"));
               pedido.setMesa(mesas);
                
               pedidos.add(pedido);
            }      
            statement.close();
        } catch (SQLException ex) {
            System.out.println("Error al obtener los Pedidos: " + ex.getMessage());
        }
        return pedidos;
    }
    
    
    public List<Pedido> obtenerLosIngresosTotalesPorFecha(String fecha)
    {
        List<Pedido> pedidos = new ArrayList<Pedido>();
        
        try {
            
            String sql = "select * "
                       + "FROM pedido ped,(SELECT pe.idPedido,SUM(d.total)as sumaTotal "
                                        + "FROM detalle d, (SELECT idPedido "
                                                         + "FROM pedido "
                                                         + "WHERE fecha = ?) AS pe "
                                        + "WHERE d.idPedido = pe.idPedido GROUP BY pe.idPedido) AS pedi "
                       + "WHERE ped.idPedido = pedi.idPedido ";
            
            PreparedStatement statement = connection.prepareStatement(sql);
            
            statement.setString(1, fecha);
           
            
            ResultSet resultSet = statement.executeQuery();
            Pedido pedido;
            
            while(resultSet.next()){
               pedido = new Pedido();
               pedido.setIdPedido(resultSet.getInt("idPedido"));
               pedido.setFecha(resultSet.getDate("fecha"));
               pedido.setHora(resultSet.getString("hora"));
               pedido.setPagado(resultSet.getBoolean("pagado"));
               pedido.setCancelado(resultSet.getBoolean("cancelado"));
               pedido.setSumaTotal(resultSet.getDouble("sumaTotal"));
               
               Mesero meseros = buscarMesero(resultSet.getInt("idMesero"));
               pedido.setMesero(meseros);
               
               Mesa mesas = buscarMesa(resultSet.getInt("idMesa"));
               pedido.setMesa(mesas);
                
               pedidos.add(pedido);
            }      
            statement.close();
        } catch (SQLException ex) {
            System.out.println("Error al obtener los Pedidos: " + ex.getMessage());
        }
        return pedidos;
    }
    
    public List<Pedido> obtenerPedidoDeUnMeseroDelDia(int idMesero)
    {
        List<Pedido> pedidos = new ArrayList<Pedido>();
        
        try {
            
            String sql = "SELECT * FROM pedido  WHERE idMesero = ?;";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, idMesero);
            
            ResultSet resultSet = statement.executeQuery();
            Pedido pedido;
            
            while(resultSet.next()){
               pedido = new Pedido();
               pedido.setIdPedido(resultSet.getInt("idPedido"));
               pedido.setFecha(resultSet.getDate("fecha"));
               pedido.setHora(resultSet.getString("hora"));
               pedido.setPagado(resultSet.getBoolean("Pagado"));
               pedido.setCancelado(resultSet.getBoolean("Cancelado"));
               
               
               Mesero meseros = buscarMesero(resultSet.getInt("idMesero"));
               pedido.setMesero(meseros);
               
               Mesa mesas = buscarMesa(resultSet.getInt("idMesa"));
               pedido.setMesa(mesas);
                
               pedidos.add(pedido);
            }      
            statement.close();
        } catch (SQLException ex) {
            System.out.println("Error al obtener los Pedidos: " + ex.getMessage());
        }
        return pedidos;
    }
}