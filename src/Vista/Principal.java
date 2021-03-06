
package Vista;

//import Modelo.ImagenFondo;
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
//        Escritorio.setBorder(new ImagenFondo());
        this.setExtendedState(MAXIMIZED_BOTH);
//        jMenuBar1.setVisible(false);
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnMesero = new javax.swing.JButton();
        btnCliente = new javax.swing.JButton();
        btnProducto = new javax.swing.JButton();
        btnMesa = new javax.swing.JButton();
        btnPedido = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnReserva = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        Escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        mArchivo = new javax.swing.JMenu();
        miListarIngresos = new javax.swing.JMenuItem();
        miListaPedidoMesa = new javax.swing.JMenuItem();
        miListaPedidoCobro = new javax.swing.JMenuItem();

        setAutoRequestFocus(false);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.black, java.awt.Color.black));

        btnMesero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Menu/Mesero.png"))); // NOI18N
        btnMesero.setBorderPainted(false);
        btnMesero.setContentAreaFilled(false);
        btnMesero.setFocusPainted(false);
        btnMesero.setFocusable(false);
        btnMesero.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Menu/Mesero_B.png"))); // NOI18N
        btnMesero.setRequestFocusEnabled(false);
        btnMesero.setRolloverEnabled(false);
        btnMesero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMeseroActionPerformed(evt);
            }
        });

        btnCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Menu/Cliente.png"))); // NOI18N
        btnCliente.setBorderPainted(false);
        btnCliente.setContentAreaFilled(false);
        btnCliente.setFocusPainted(false);
        btnCliente.setFocusable(false);
        btnCliente.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Menu/Cliente_B.png"))); // NOI18N
        btnCliente.setRequestFocusEnabled(false);
        btnCliente.setRolloverEnabled(false);
        btnCliente.setVerifyInputWhenFocusTarget(false);
        btnCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClienteActionPerformed(evt);
            }
        });

        btnProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Menu/Producto.png"))); // NOI18N
        btnProducto.setBorderPainted(false);
        btnProducto.setContentAreaFilled(false);
        btnProducto.setFocusPainted(false);
        btnProducto.setFocusable(false);
        btnProducto.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Menu/Producto_B.png"))); // NOI18N
        btnProducto.setRequestFocusEnabled(false);
        btnProducto.setRolloverEnabled(false);
        btnProducto.setVerifyInputWhenFocusTarget(false);
        btnProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductoActionPerformed(evt);
            }
        });

        btnMesa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Menu/Mesa.png"))); // NOI18N
        btnMesa.setBorderPainted(false);
        btnMesa.setContentAreaFilled(false);
        btnMesa.setFocusPainted(false);
        btnMesa.setFocusable(false);
        btnMesa.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Menu/Mesa_B.png"))); // NOI18N
        btnMesa.setRequestFocusEnabled(false);
        btnMesa.setRolloverEnabled(false);
        btnMesa.setVerifyInputWhenFocusTarget(false);
        btnMesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMesaActionPerformed(evt);
            }
        });

        btnPedido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Menu/Pedido.png"))); // NOI18N
        btnPedido.setBorderPainted(false);
        btnPedido.setContentAreaFilled(false);
        btnPedido.setFocusPainted(false);
        btnPedido.setFocusable(false);
        btnPedido.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Menu/Pedido_B.png"))); // NOI18N
        btnPedido.setRequestFocusEnabled(false);
        btnPedido.setRolloverEnabled(false);
        btnPedido.setVerifyInputWhenFocusTarget(false);
        btnPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPedidoActionPerformed(evt);
            }
        });

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Menu/Salir.png"))); // NOI18N
        btnSalir.setBorderPainted(false);
        btnSalir.setContentAreaFilled(false);
        btnSalir.setFocusPainted(false);
        btnSalir.setFocusable(false);
        btnSalir.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Menu/Salir_B.png"))); // NOI18N
        btnSalir.setRequestFocusEnabled(false);
        btnSalir.setRolloverEnabled(false);
        btnSalir.setVerifyInputWhenFocusTarget(false);
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnReserva.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Menu/Reserva.png"))); // NOI18N
        btnReserva.setBorderPainted(false);
        btnReserva.setContentAreaFilled(false);
        btnReserva.setFocusPainted(false);
        btnReserva.setFocusable(false);
        btnReserva.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Menu/Reserva_B.png"))); // NOI18N
        btnReserva.setRequestFocusEnabled(false);
        btnReserva.setRolloverEnabled(false);
        btnReserva.setVerifyInputWhenFocusTarget(false);
        btnReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReservaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnMesero, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.PREFERRED_SIZE, 90, Short.MAX_VALUE)
                    .addComponent(btnProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(btnMesa, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(btnPedido, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, Short.MAX_VALUE)
                    .addComponent(btnCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(btnReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnMesero, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnMesa, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout EscritorioLayout = new javax.swing.GroupLayout(Escritorio);
        Escritorio.setLayout(EscritorioLayout);
        EscritorioLayout.setHorizontalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 922, Short.MAX_VALUE)
        );
        EscritorioLayout.setVerticalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Escritorio)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(Escritorio))
        );

        Escritorio.getAccessibleContext().setAccessibleParent(this);

        mArchivo.setText("Informes");

        miListarIngresos.setText("Listar Ingresos de una fecha");
        miListarIngresos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miListarIngresosActionPerformed(evt);
            }
        });
        mArchivo.add(miListarIngresos);

        miListaPedidoMesa.setText("Listar  pedidos de una mesa en una fecha entre horas");
        miListaPedidoMesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miListaPedidoMesaActionPerformed(evt);
            }
        });
        mArchivo.add(miListaPedidoMesa);

        miListaPedidoCobro.setText("Listar pedidos que cobro un mesero en particular en el día");
        miListaPedidoCobro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miListaPedidoCobroActionPerformed(evt);
            }
        });
        mArchivo.add(miListaPedidoCobro);

        jMenuBar1.add(mArchivo);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMeseroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMeseroActionPerformed
        Escritorio.removeAll();
        Escritorio.repaint();
          VistaMesero vr=new VistaMesero();
          vr.setVisible(true);
        Escritorio.add(vr);
        Escritorio.moveToFront(vr);
    }//GEN-LAST:event_btnMeseroActionPerformed

    private void btnClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClienteActionPerformed
        Escritorio.removeAll();
        Escritorio.repaint();
          VistaCliente vr=new VistaCliente();
          vr.setVisible(true);
        Escritorio.add(vr);
        Escritorio.moveToFront(vr);
    }//GEN-LAST:event_btnClienteActionPerformed

    private void btnProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductoActionPerformed
        Escritorio.removeAll();
        Escritorio.repaint();
          VistaProducto vr=new VistaProducto();
          vr.setVisible(true);
        Escritorio.add(vr);
        Escritorio.moveToFront(vr);
    }//GEN-LAST:event_btnProductoActionPerformed

    private void btnMesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMesaActionPerformed
        Escritorio.removeAll();
        Escritorio.repaint();
          VistaMesa vr=new VistaMesa();
          vr.setVisible(true);
        Escritorio.add(vr);
        Escritorio.moveToFront(vr);
    }//GEN-LAST:event_btnMesaActionPerformed

    private void btnPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPedidoActionPerformed
        Escritorio.removeAll();
        Escritorio.repaint();
          VistaPedido vr=new VistaPedido();
          vr.setVisible(true);
        Escritorio.add(vr);
        Escritorio.moveToFront(vr);
    }//GEN-LAST:event_btnPedidoActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReservaActionPerformed
        Escritorio.removeAll();
        Escritorio.repaint();
          VistaReserva vr=new VistaReserva();
          vr.setVisible(true);
        Escritorio.add(vr);
        Escritorio.moveToFront(vr);
    }//GEN-LAST:event_btnReservaActionPerformed

    private void miListarIngresosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miListarIngresosActionPerformed
        Escritorio.removeAll();
        Escritorio.repaint();
        VistaInforme_02 vi2=new VistaInforme_02();
        vi2.setVisible(true);
        Escritorio.add(vi2);
        Escritorio.moveToFront(vi2);
    }//GEN-LAST:event_miListarIngresosActionPerformed

    private void miListaPedidoMesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miListaPedidoMesaActionPerformed
       Escritorio.removeAll();
        Escritorio.repaint();
        VistaInforme_01 vi1=new VistaInforme_01();
        vi1.setVisible(true);
        Escritorio.add(vi1);
        Escritorio.moveToFront(vi1);
    }//GEN-LAST:event_miListaPedidoMesaActionPerformed

    private void miListaPedidoCobroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miListaPedidoCobroActionPerformed
        Escritorio.removeAll();
        Escritorio.repaint();
        VistaInforme_03 vi3=new VistaInforme_03();
        vi3.setVisible(true);
        Escritorio.add(vi3);
        Escritorio.moveToFront(vi3);
    }//GEN-LAST:event_miListaPedidoCobroActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JDesktopPane Escritorio;
    private javax.swing.JButton btnCliente;
    private javax.swing.JButton btnMesa;
    private javax.swing.JButton btnMesero;
    private javax.swing.JButton btnPedido;
    private javax.swing.JButton btnProducto;
    private javax.swing.JButton btnReserva;
    private javax.swing.JButton btnSalir;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JMenu mArchivo;
    private javax.swing.JMenuItem miListaPedidoCobro;
    private javax.swing.JMenuItem miListaPedidoMesa;
    private javax.swing.JMenuItem miListarIngresos;
    // End of variables declaration//GEN-END:variables
}
