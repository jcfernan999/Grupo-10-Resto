/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Modelo.Conexion;
import Modelo.Detalle;
import Modelo.DetalleData;
import Modelo.Mesa;
import Modelo.MesaData;
import Modelo.Pedido;
import Modelo.PedidoData;
import Modelo.Producto;
import Modelo.ProductoData;
import Modelo.Reserva;
import Modelo.ReservaData;
import Modelo.TheModel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;


public class VistaInforme_01 extends javax.swing.JInternalFrame {

    private MesaData mesaData;
    private ArrayList<Mesa> listaMesas;
    
    private List<JButton> botonesMesa;
    
    private Connection connection = null;
    private Conexion conexion;
    
    private ReservaData reservaData;
    private ArrayList<Reserva> listaReservas;
    
    private PedidoData pedidoData;
    private ArrayList<Pedido> listaPedidos;
    
    private ProductoData productoData;
    private ArrayList<Producto> listaProductos;
    
    private DetalleData detalleData;
    private ArrayList<Detalle> listaDetalles;
    
    public VistaInforme_01() {
        initComponents();
        
         botonesMesa = new ArrayList<>();
        try {
            conexion = new Conexion("jdbc:mysql://localhost/resto", "root", "");
            
            productoData = new ProductoData(conexion);
           
            reservaData = new ReservaData(conexion);
            
            pedidoData = new PedidoData(conexion);
            
            detalleData = new DetalleData(conexion);
            
            mesaData = new MesaData(conexion);
            listaMesas=(ArrayList)mesaData.listaDeCapacidad();
            

            cargaCapacidadMesas();
            
        } 
        catch (ClassNotFoundException ex) {
            Logger.getLogger(VistaCategoria.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        pnlMesas = new javax.swing.JPanel();
        cbCapacidad = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        dcFecha = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tbId = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        ftbHasta = new javax.swing.JFormattedTextField();
        ftbDesde = new javax.swing.JFormattedTextField();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tPedido = new javax.swing.JTable();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tProducto = new javax.swing.JTable();

        jLabel1.setBackground(new java.awt.Color(0, 204, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Listar  pedidos de una mesa en una fecha entre horas");
        jLabel1.setOpaque(true);

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "Mesas"));

        pnlMesas.setLayout(new java.awt.GridLayout(2, 0, 1, 0));
        jScrollPane4.setViewportView(pnlMesas);

        cbCapacidad.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cbCapacidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCapacidadActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Capacidad");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cbCapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane4)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbCapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE))
        );

        jPanel8.setBackground(new java.awt.Color(153, 153, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "Buscar"));

        jLabel3.setText("Fecha");

        jLabel4.setText("Desde");

        jLabel5.setText("Hasta");

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Buscar46.png"))); // NOI18N
        btnBuscar.setBorderPainted(false);
        btnBuscar.setContentAreaFilled(false);
        btnBuscar.setFocusPainted(false);
        btnBuscar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Buscar46_2.png"))); // NOI18N
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        try {
            ftbHasta.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            ftbDesde.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(dcFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ftbHasta, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ftbDesde, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(tbId, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dcFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(19, 19, 19))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tbId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(ftbDesde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ftbHasta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel9.setBackground(new java.awt.Color(0, 153, 255));
        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "Lista Pedidos"));
        jPanel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel9MousePressed(evt);
            }
        });

        tPedido.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tPedido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tPedidoMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tPedido);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel10.setBackground(new java.awt.Color(0, 153, 255));
        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "Lista"));

        tProducto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tProductoMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(tProducto);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbCapacidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCapacidadActionPerformed
        int seleccionado = Integer.parseInt(cbCapacidad.getSelectedItem().toString());

        pnlMesas.removeAll();
        botonesMesas(seleccionado);
    }//GEN-LAST:event_cbCapacidadActionPerformed

    private void tPedidoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tPedidoMousePressed
         int filaSeleccionadaPedido = this.tPedido.getSelectedRow();
        cargarTablaDetalle(Integer.parseInt(tPedido.getValueAt(filaSeleccionadaPedido, 5).toString()));
    }//GEN-LAST:event_tPedidoMousePressed

    private void jPanel9MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel9MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel9MousePressed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        //        String seleccionado = (String)cbBuscar.getSelectedItem();
        //        cargarTablaProducto();
        if(tbId.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Seleccione una Mesa ");
        }
        else if(dcFecha.getCalendar()==null)
        {
            JOptionPane.showMessageDialog(null, "Ingrese una Fecha ");
        }
        else  if(" : ".equals(ftbDesde.getText()))
        {
            JOptionPane.showMessageDialog(null, "Ingrese una Hora ");
        }
         else  if(" : ".equals(ftbHasta.getText()))
        {
            JOptionPane.showMessageDialog(null, "Ingrese una Hora ");
        }
        else{
            
            int idMesa = Integer.parseInt(tbId.getText());
            
            java.util.Date fecha1=dcFecha.getDate();
            long d =fecha1.getTime();
            java.sql.Date fecha =new java.sql.Date(d);
            
            String desde = ftbDesde.getText();          
            String hasta = ftbHasta.getText();
            
            cargarTablaPedido(idMesa,fecha+"",desde,hasta);
           
           
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void tProductoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tProductoMousePressed
       
    }//GEN-LAST:event_tProductoMousePressed

    int btnMesaSeleccionada=0;
    private void botonesMesas(int capacidad)
    {
//        botonesMesa.clear();
         MesaData mq = new MesaData(conexion);
        listaMesas =(ArrayList)mq.obtenerMesaDetalleBotones(capacidad);
        
        for(Mesa item:listaMesas)
        {
            JButton boton = new JButton(item.getNombre());
            boton.setName(item.getIdMesa()+"");
            boton.setLayout(null);
            boton.setBorder(BorderFactory.createEmptyBorder());
            boton.setFont(new Font("", Font.BOLD, 10));
            boton.setSize(new Dimension(100, 105));
            boton.setPreferredSize(new Dimension(100, 105));
            boton.setMaximumSize(new Dimension(100, 105));
            boton.setMinimumSize(new Dimension(100, 105));
//            boton.setBorderPainted(false);
            
//            boton.setContentAreaFilled(false);
            pnlMesas.add(boton);
            botonesMesa.add(boton);
            
            pnlMesas.updateUI();
            
             boton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    tbId.setText(boton.getName());
                    
                   
                   
                }
            });
            if(item.getEstado()==0)
            {
                boton.setBackground(Color.red);
                boton.setIcon(new ImageIcon(getClass().getResource("/imagenes/Mesa/Ocupada_A.png")));
            }
            if(item.getEstado()==1)
            {
                boton.setBackground(Color.green);
                boton.setIcon(new ImageIcon(getClass().getResource("/imagenes/Mesa/Libre_A.png")));
            }
            if(item.getEstado()==2)
            {   
                Reserva reserva = reservaData.buscarReservaPorMesa(item.getIdMesa());
                if(reserva == null)
                {
                    boton.setBackground(Color.green);
                    boton.setIcon(new ImageIcon(getClass().getResource("/imagenes/Mesa/Libre_A.png")));
                }
                else{
                    boton.setBackground(Color.yellow);
                    boton.setIcon(new ImageIcon(getClass().getResource("/imagenes/Mesa/Reservado_A.png")));
                }
            }
           boton.setHorizontalTextPosition(SwingConstants.CENTER);
            boton.setVerticalTextPosition(SwingConstants.TOP);
        }
    }
    public void cargaCapacidadMesas()
    {
        MesaData mq = new MesaData(conexion);
        listaMesas =(ArrayList)mq.listaDeCapacidad();
        for(Mesa item:listaMesas)
        {
            cbCapacidad.addItem(item.getCapacidad());
        }
    }
    
    
    public void cargarTablaPedido(int idMesa,String fecha,String desde,String hasta){
        
        
        listaPedidos =(ArrayList)pedidoData.obtenerPedidoDeUnaMesaPorFechaEntreHoras(idMesa,fecha,desde,hasta);
        String[] columnName = {"Mesa","Fecha","Hora","Pagado","Cancelado","ID"};
        Object[][] rows = new Object[listaPedidos.size()][6];
        for(int i = 0; i < listaPedidos.size(); i++)
        {
            rows[i][0] = listaPedidos.get(i).getMesa().getNombre();
            rows[i][1] = listaPedidos.get(i).getFecha();
            rows[i][2] = listaPedidos.get(i).getHora();
            rows[i][3] = listaPedidos.get(i).getPagado();
            rows[i][4] = listaPedidos.get(i).getCancelado();
            rows[i][5] = listaPedidos.get(i).getIdPedido();
        }
        
        TheModel model = new TheModel(rows, columnName);
        tPedido.setModel(model);
        tPedido.setRowHeight(20);
        tPedido.getColumnModel().getColumn(0).setPreferredWidth(20);
        tPedido.getColumnModel().getColumn(1).setPreferredWidth(150);
        
    }
    DefaultTableModel temp;
    void LimpiarTabla(){
        try{
            temp = (DefaultTableModel) tPedido.getModel();
            int a =temp.getRowCount()-1;
            for(int i=0; i<a; i++)
                temp.removeRow(0); 
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
     //Creamos la tabbla y llenamos
    public void cargarTablaProducto(String seleccionado, String buscar){
        
        
        listaProductos =(ArrayList)productoData.obtenerProductoCategoria(seleccionado,buscar);
        String[] columnName = {"Id","Nombre","Cantidad","Precio","Imagen"};
        Object[][] rows = new Object[listaProductos.size()][5];
        for(int i = 0; i < listaProductos.size(); i++)
        {
            rows[i][0] = listaProductos.get(i).getIdProducto();
            rows[i][1] = listaProductos.get(i).getNombre();
            rows[i][2] = listaProductos.get(i).getCantidad();
            rows[i][3] = listaProductos.get(i).getPrecio();
            
            if(listaProductos.get(i).getImagen()!= null)
            {   
                ImageIcon image = new ImageIcon(new ImageIcon(listaProductos.get(i).getImagen()).getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH) );   
                rows[i][4] = image;
            }
            else{
                rows[i][4] = null;
            }
            
            
        }
        
        TheModel model = new TheModel(rows, columnName);
        tProducto.setModel(model);
        tProducto.setRowHeight(50);
        tProducto.getColumnModel().getColumn(0).setPreferredWidth(20);
        tProducto.getColumnModel().getColumn(1).setPreferredWidth(150);
        
    }
    
    //Creamos la tabbla y llenamos
    public void cargarTablaDetalle(int p){
        
        DetalleData detalle = new DetalleData(conexion);
        
        listaDetalles =(ArrayList)detalle.obtenerDetalle(p);
        String[] columnName = {"CANT.", "DESCRIPCION", "P.UNIT", "IMPORTE","ID"};
        Object[][] rows = new Object[listaDetalles.size()][5];
        for(int i = 0; i < listaDetalles.size(); i++)
        {
            
            rows[i][0] = listaDetalles.get(i).getCantidad();
            rows[i][1] = listaDetalles.get(i).getProducto().getNombre();
            rows[i][2] = listaDetalles.get(i).getProducto().getPrecio();
            rows[i][3] = listaDetalles.get(i).getTotal();
            rows[i][4] = listaDetalles.get(i).getIdDetalle();
            
           
        }
        
        TheModel model = new TheModel(rows, columnName);
        tProducto.setModel(model);
        tProducto.setRowHeight(20);
        
        
        tProducto.getColumnModel().getColumn(0).setPreferredWidth(10);
        tProducto.getColumnModel().getColumn(1).setPreferredWidth(190);
        tProducto.getColumnModel().getColumn(4).setMaxWidth(0);
        tProducto.getColumnModel().getColumn(4).setMinWidth(0);
        tProducto.getColumnModel().getColumn(4).setPreferredWidth(0);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JComboBox<Integer> cbCapacidad;
    private com.toedter.calendar.JDateChooser dcFecha;
    private javax.swing.JFormattedTextField ftbDesde;
    private javax.swing.JFormattedTextField ftbHasta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JPanel pnlMesas;
    private javax.swing.JTable tPedido;
    private javax.swing.JTable tProducto;
    private javax.swing.JTextField tbId;
    // End of variables declaration//GEN-END:variables
}
