package interfaces;

import javax.swing.JOptionPane;

public class RegistroProducto extends javax.swing.JInternalFrame {

    public RegistroProducto() {
        initComponents();
    }

    public void ingresar() {
        conexion.Conectar com = new conexion.Conectar();

        int selec = JOptionPane.showConfirmDialog(null, "Estas Seguro De Esta Accion", "Alert", JOptionPane.YES_NO_OPTION);

        if (selec == 0) {

            String sql = "insert into producto values ('" + Integer.parseInt(tex_numero.getText()) + "','"
                    + tex_producto.getText() + "','" + tex_marca.getText()
                    + "','" + Integer.parseInt(tex_precio.getText()) + "','" + Integer.parseInt(tex_venta.getText()) + "');";
            com.update(sql);
            com.close();
        }
        JOptionPane.showMessageDialog(null, "Producto registrado");
    }

    public void registrar() {
        conexion.Conectar com = new conexion.Conectar();

        int selec = JOptionPane.showConfirmDialog(null, "Estas Seguro De Esta Accion", "Alert", JOptionPane.YES_NO_OPTION);

        if (selec == 0) {
            String sql1 = "insert into inventario values ('" + Integer.parseInt(tex_numero.getText()) + "','"
                    + tex_producto.getText() + "','" + Integer.parseInt(tex_cantidad.getText()) + "');";

            com.update(sql1);
            com.close();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tex_numero = new javax.swing.JTextField();
        tex_producto = new javax.swing.JTextField();
        tex_marca = new javax.swing.JTextField();
        tex_precio = new javax.swing.JTextField();
        tex_cantidad = new javax.swing.JTextField();
        registrar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        tex_venta = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();

        jLabel7.setText("jLabel7");

        jTextField1.setText("jTextField1");

        jTextField2.setText("jTextField2");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Ingresar Producto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(204, 0, 0))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/zuly4.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Código :");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("Producto :");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("Marca :");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setText("Precio Costo :");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setText("Cantidad :");

        tex_numero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tex_numeroKeyTyped(evt);
            }
        });

        tex_producto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tex_productoKeyTyped(evt);
            }
        });

        tex_marca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tex_marcaKeyTyped(evt);
            }
        });

        tex_precio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tex_precioKeyTyped(evt);
            }
        });

        tex_cantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tex_cantidadKeyTyped(evt);
            }
        });

        registrar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        registrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/signo-mas-para-agregar.png"))); // NOI18N
        registrar.setText("Registrar");
        registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setText("Precio Venta :");

        tex_venta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tex_ventaKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tex_numero, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(tex_marca)
                            .addComponent(jLabel8)
                            .addComponent(tex_venta))
                        .addGap(101, 101, 101)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3)
                            .addComponent(tex_producto, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(registrar)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(tex_cantidad, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tex_precio, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE))))
                        .addContainerGap(39, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tex_producto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tex_numero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tex_marca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tex_precio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tex_cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tex_venta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-eliminar-32.png"))); // NOI18N
        jButton4.setBorderPainted(false);
        jButton4.setFocusPainted(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarActionPerformed
        ingresar();
        registrar();
    }//GEN-LAST:event_registrarActionPerformed

    private void tex_numeroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tex_numeroKeyTyped

       char c = evt.getKeyChar();
        
        if (c < '0' || c > '9') {
            evt.consume();
        }
         int numerocaracter=10;
      if(tex_numero.getText().length()>=numerocaracter){
          evt.consume();
          JOptionPane.showMessageDialog(rootPane, "Solo 10 caracteres");
      }
    }//GEN-LAST:event_tex_numeroKeyTyped

    private void tex_precioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tex_precioKeyTyped

        char c = evt.getKeyChar();
        
        if (c < '0' || c > '9') {
            evt.consume();
        }
         int numerocaracter=10;
      if(tex_precio.getText().length()>=numerocaracter){
          evt.consume();
          JOptionPane.showMessageDialog(rootPane, "Solo 10 caracteres");
      }
    }//GEN-LAST:event_tex_precioKeyTyped

    private void tex_ventaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tex_ventaKeyTyped

        char c = evt.getKeyChar();
        
        if (c < '0' || c > '9') {
            evt.consume();
        }
         int numerocaracter=10;
      if(tex_venta.getText().length()>=numerocaracter){
          evt.consume();
          JOptionPane.showMessageDialog(rootPane, "Solo 10 caracteres");
      }
    }//GEN-LAST:event_tex_ventaKeyTyped

    private void tex_cantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tex_cantidadKeyTyped

      char c = evt.getKeyChar();
        
        if (c < '0' || c > '9') {
            evt.consume();
        }
         int numerocaracter=10;
      if(tex_cantidad.getText().length()>=numerocaracter){
          evt.consume();
          JOptionPane.showMessageDialog(rootPane, "Solo 10 caracteres");
      }
    }//GEN-LAST:event_tex_cantidadKeyTyped

    private void tex_productoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tex_productoKeyTyped

        char c = evt.getKeyChar();

        if (c < 'A' || c > 'z') {
            evt.consume();
        }
    }//GEN-LAST:event_tex_productoKeyTyped

    private void tex_marcaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tex_marcaKeyTyped

        char c = evt.getKeyChar();

        if (c < 'A' || c > 'z') {
            evt.consume();
        }
    }//GEN-LAST:event_tex_marcaKeyTyped

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JButton registrar;
    private javax.swing.JTextField tex_cantidad;
    private javax.swing.JTextField tex_marca;
    private javax.swing.JTextField tex_numero;
    private javax.swing.JTextField tex_precio;
    private javax.swing.JTextField tex_producto;
    private javax.swing.JTextField tex_venta;
    // End of variables declaration//GEN-END:variables
}
