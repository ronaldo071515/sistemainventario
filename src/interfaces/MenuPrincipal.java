package interfaces;

import java.awt.Dimension;
import java.sql.ResultSet;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;

public class MenuPrincipal extends javax.swing.JFrame {

    public MenuPrincipal() {
        initComponents();
        this.setExtendedState(MenuPrincipal.MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        registrar = new javax.swing.JMenuItem();
        modificar = new javax.swing.JMenuItem();
        consultar = new javax.swing.JMenuItem();
        eliminarcliente = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        generarventa = new javax.swing.JMenuItem();
        generarreporte = new javax.swing.JMenuItem();
        eliminarventa = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        registrarproducto = new javax.swing.JMenuItem();
        consultarproducto = new javax.swing.JMenuItem();
        modificarproducto = new javax.swing.JMenuItem();
        stockproducto = new javax.swing.JMenuItem();
        eliminarproducto = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        registrarproveedor = new javax.swing.JMenuItem();
        registropedido = new javax.swing.JMenuItem();
        miscuentas = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 900, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 415, Short.MAX_VALUE)
        );

        jMenuBar1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N

        jMenu1.setBorder(null);
        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cliente (1)def.png"))); // NOI18N
        jMenu1.setText("Clientes");
        jMenu1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jMenu1.setMaximumSize(new java.awt.Dimension(150, 32767));
        jMenu1.setPreferredSize(new java.awt.Dimension(139, 50));
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        registrar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        registrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/agregar-usuario.png"))); // NOI18N
        registrar.setText("Registrar");
        registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarActionPerformed(evt);
            }
        });
        jMenu1.add(registrar);

        modificar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        modificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/anadir-punto-de-anclaje.png"))); // NOI18N
        modificar.setText("Modificar");
        modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarActionPerformed(evt);
            }
        });
        jMenu1.add(modificar);

        consultar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        consultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icon.png"))); // NOI18N
        consultar.setText("Consultar");
        consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarActionPerformed(evt);
            }
        });
        jMenu1.add(consultar);

        eliminarcliente.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        eliminarcliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton-x.png"))); // NOI18N
        eliminarcliente.setText("Eliminar");
        eliminarcliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarclienteActionPerformed(evt);
            }
        });
        jMenu1.add(eliminarcliente);

        jMenuBar1.add(jMenu1);
        jMenu1.getAccessibleContext().setAccessibleDescription("");

        jMenu3.setBorder(null);
        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ventas.png"))); // NOI18N
        jMenu3.setText("Ventas");
        jMenu3.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jMenu3.setMaximumSize(new java.awt.Dimension(150, 32767));

        generarventa.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        generarventa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/divisa.png"))); // NOI18N
        generarventa.setText("Generar Venta");
        generarventa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generarventaActionPerformed(evt);
            }
        });
        jMenu3.add(generarventa);

        generarreporte.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        generarreporte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/diagrama.png"))); // NOI18N
        generarreporte.setText("Generar Reporte");
        generarreporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generarreporteActionPerformed(evt);
            }
        });
        jMenu3.add(generarreporte);

        eliminarventa.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        eliminarventa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton-x.png"))); // NOI18N
        eliminarventa.setText("Eliminar");
        eliminarventa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarventaActionPerformed(evt);
            }
        });
        jMenu3.add(eliminarventa);

        jMenuBar1.add(jMenu3);

        jMenu2.setBorder(null);
        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/inventario.png"))); // NOI18N
        jMenu2.setText("Producto");
        jMenu2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N

        registrarproducto.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        registrarproducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/signo-mas-para-agregar.png"))); // NOI18N
        registrarproducto.setText("Registrar");
        registrarproducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarproductoActionPerformed(evt);
            }
        });
        jMenu2.add(registrarproducto);

        consultarproducto.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        consultarproducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icon.png"))); // NOI18N
        consultarproducto.setText("Consultar");
        consultarproducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarproductoActionPerformed(evt);
            }
        });
        jMenu2.add(consultarproducto);

        modificarproducto.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        modificarproducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/anadir-punto-de-anclaje.png"))); // NOI18N
        modificarproducto.setText("Modificar");
        modificarproducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarproductoActionPerformed(evt);
            }
        });
        jMenu2.add(modificarproducto);

        stockproducto.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        stockproducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/almacen.png"))); // NOI18N
        stockproducto.setText("Stock");
        stockproducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stockproductoActionPerformed(evt);
            }
        });
        jMenu2.add(stockproducto);

        eliminarproducto.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        eliminarproducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton-x.png"))); // NOI18N
        eliminarproducto.setText("Eliminar");
        eliminarproducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarproductoActionPerformed(evt);
            }
        });
        jMenu2.add(eliminarproducto);

        jMenuBar1.add(jMenu2);

        jMenu4.setBorder(null);
        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/proveedores.png"))); // NOI18N
        jMenu4.setText("Proveedores");
        jMenu4.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N

        registrarproveedor.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        registrarproveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/archivo-agregar-con-boton-lleno.png"))); // NOI18N
        registrarproveedor.setText("Registrar Proveedor");
        registrarproveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarproveedorActionPerformed(evt);
            }
        });
        jMenu4.add(registrarproveedor);

        registropedido.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        registropedido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pedido-online.png"))); // NOI18N
        registropedido.setText("Registrar Pedido");
        registropedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registropedidoActionPerformed(evt);
            }
        });
        jMenu4.add(registropedido);

        miscuentas.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        miscuentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cuentas.png"))); // NOI18N
        miscuentas.setText("Mis Cuentas!");
        miscuentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miscuentasActionPerformed(evt);
            }
        });
        jMenu4.add(miscuentas);

        jMenuBar1.add(jMenu4);

        jMenu5.setBackground(new java.awt.Color(0, 0, 0));
        jMenu5.setBorder(null);
        jMenu5.setText("AgroInsumos Viyes");
        jMenu5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jMenu5.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registrarproductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarproductoActionPerformed
        RegistroProducto m = new RegistroProducto();
        escritorio.add(m);
        Dimension desktopSize = escritorio.getSize();
        Dimension FrameSize = m.getSize();
        m.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
        m.show();
    }//GEN-LAST:event_registrarproductoActionPerformed

    private void consultarproductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarproductoActionPerformed
        ConsultarProducto m = new ConsultarProducto();
        escritorio.add(m);
        Dimension desktopSize = escritorio.getSize();
        Dimension FrameSize = m.getSize();
        m.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
        m.show();
    }//GEN-LAST:event_consultarproductoActionPerformed

    private void registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarActionPerformed
        RegistrarCliente m = new RegistrarCliente();
        escritorio.add(m);
        Dimension desktopSize = escritorio.getSize();
        Dimension FrameSize = m.getSize();
        m.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
        m.show();
    }//GEN-LAST:event_registrarActionPerformed

    private void modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarActionPerformed
        ModificarCliente m = new ModificarCliente();
        escritorio.add(m);
        Dimension desktopSize = escritorio.getSize();
        Dimension FrameSize = m.getSize();
        m.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
        m.show();
    }//GEN-LAST:event_modificarActionPerformed

    private void consultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarActionPerformed
        ConsultarCliente m = new ConsultarCliente();
        escritorio.add(m);
        Dimension desktopSize = escritorio.getSize();
        Dimension FrameSize = m.getSize();
        m.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
        m.show();
    }//GEN-LAST:event_consultarActionPerformed

    private void eliminarclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarclienteActionPerformed
        EliminarCliente m = new EliminarCliente();
        escritorio.add(m);
        Dimension desktopSize = escritorio.getSize();
        Dimension FrameSize = m.getSize();
        m.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
        m.show();
    }//GEN-LAST:event_eliminarclienteActionPerformed

    private void generarventaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generarventaActionPerformed
        GenerarVenta siguiente = new GenerarVenta();
        conexion.Conectar con = new conexion.Conectar();
        String venta = JOptionPane.showInputDialog(this, "Numero De Cedula", JOptionPane.OK_OPTION);
        String sql = "select * from cliente where cedula='" + Integer.parseInt(venta) + "';";
        ResultSet rs = con.consulSet(sql);
        try {
            if (rs.next()) {
                siguiente.txtNomCliente.setText(rs.getString("nombre"));
                siguiente.txtApeCliente.setText(rs.getString("apellido"));
                siguiente.txtCedula.setText(rs.getString("cedula"));
                //GenerarVenta generarventa = new GenerarVenta();
                escritorio.add(siguiente);
                Dimension desktopSize = escritorio.getSize();
                Dimension FrameSize = siguiente.getSize();
                siguiente.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
                siguiente.show();

            } else {
                JOptionPane.showMessageDialog(null, "Error, Cliente No Encontrado.", "Mensaje", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception ex) {
        }
        con.consulSet(sql);
        con.close();
    }//GEN-LAST:event_generarventaActionPerformed

    private void generarreporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generarreporteActionPerformed
        GenerarReporte m = new GenerarReporte();
        escritorio.add(m);
        Dimension desktopSize = escritorio.getSize();
        Dimension FrameSize = m.getSize();
        m.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
        m.show();
    }//GEN-LAST:event_generarreporteActionPerformed

    private void modificarproductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarproductoActionPerformed
        ModificarProducto m = new ModificarProducto();
        escritorio.add(m);
        Dimension desktopSize = escritorio.getSize();
        Dimension FrameSize = m.getSize();
        m.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
        m.show();
    }//GEN-LAST:event_modificarproductoActionPerformed

    private void stockproductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stockproductoActionPerformed
        StockProducto m = new StockProducto();
        escritorio.add(m);
        Dimension desktopSize = escritorio.getSize();
        Dimension FrameSize = m.getSize();
        m.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
        m.show();
    }//GEN-LAST:event_stockproductoActionPerformed

    private void eliminarproductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarproductoActionPerformed
        EliminarProducto m = new EliminarProducto();
        escritorio.add(m);
        Dimension desktopSize = escritorio.getSize();
        Dimension FrameSize = m.getSize();
        m.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
        m.show();
    }//GEN-LAST:event_eliminarproductoActionPerformed

    private void registrarproveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarproveedorActionPerformed
        RegistrarProveedor m = new RegistrarProveedor();
        escritorio.add(m);
        Dimension desktopSize = escritorio.getSize();
        Dimension FrameSize = m.getSize();
        m.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
        m.show();
    }//GEN-LAST:event_registrarproveedorActionPerformed

    private void registropedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registropedidoActionPerformed
        RegistrarPedido m = new RegistrarPedido();
        escritorio.add(m);
        Dimension desktopSize = escritorio.getSize();
        Dimension FrameSize = m.getSize();
        m.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
        m.show();
    }//GEN-LAST:event_registropedidoActionPerformed

    private void miscuentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miscuentasActionPerformed
        PorPagar m = new PorPagar();
        escritorio.add(m);
        Dimension desktopSize = escritorio.getSize();
        Dimension FrameSize = m.getSize();
        m.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
        m.show();
    }//GEN-LAST:event_miscuentasActionPerformed

    private void eliminarventaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarventaActionPerformed
        /*eliminarventa siguente=new eliminarventa();
         this.setVisible(false);
         siguente.setVisible(true);*/
    }//GEN-LAST:event_eliminarventaActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed

    }//GEN-LAST:event_jMenu1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem consultar;
    private javax.swing.JMenuItem consultarproducto;
    private javax.swing.JMenuItem eliminarcliente;
    private javax.swing.JMenuItem eliminarproducto;
    private javax.swing.JMenuItem eliminarventa;
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenuItem generarreporte;
    private javax.swing.JMenuItem generarventa;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem miscuentas;
    private javax.swing.JMenuItem modificar;
    private javax.swing.JMenuItem modificarproducto;
    private javax.swing.JMenuItem registrar;
    private javax.swing.JMenuItem registrarproducto;
    private javax.swing.JMenuItem registrarproveedor;
    private javax.swing.JMenuItem registropedido;
    private javax.swing.JMenuItem stockproducto;
    // End of variables declaration//GEN-END:variables
}
