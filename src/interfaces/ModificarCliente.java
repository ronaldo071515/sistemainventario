
package interfaces;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ModificarCliente extends javax.swing.JInternalFrame {
    
    DefaultTableModel tabla = new DefaultTableModel();
     Validar validarletras=new Validar ();

    public ModificarCliente() {
        initComponents();
        tabla.addColumn("Cedula");
        tabla.addColumn("Nombre");
        tabla.addColumn("Apellido");
        tabla.addColumn("Direccion");
        tabla.addColumn("Telefono");
        
        tabladatos.setModel(tabla);
        
    }

    public void buscar() {
        conexion.Conectar com = new conexion.Conectar();
        
        String sql = "select * from cliente where cedula=('" + Integer.parseInt(tex_cedula.getText()) + "');";
        String areglo[] = new String[5];
        ResultSet rs = com.consulSet(sql);
        
        try {
            while (rs.next()) {
                areglo[0] = rs.getString(String.valueOf("cedula"));
                areglo[1] = rs.getString(String.valueOf("nombre"));
                areglo[2] = rs.getString(String.valueOf("apellido"));
                areglo[3] = rs.getString(String.valueOf("direccion"));
                areglo[4] = rs.getString(String.valueOf("telefono"));
                
                tabla.addRow(areglo);
            }
        } catch (SQLException ex) {
            Logger.getLogger(EliminarCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        com.consulSet(sql);
        com.close();
        
    }

    public void modificar() {
        String sql = "update cliente set nombre='" + tex_nombre.getText() + "',apellido='" + tex_apellido.getText() + "',direccion='" + tex_direccion.getText()
                + "',telefono='" + tex_telefono.getText() + "' where cedula='" + Integer.parseInt(tex_cedula.getText()) + "';";
        
        int msm = JOptionPane.showConfirmDialog(null, "Estas Seguro", "Alerta", JOptionPane.YES_NO_OPTION);
        JOptionPane.showMessageDialog(null, "Cliente Actualizado");
        
        if (msm == 0) {
            conexion.Conectar cn = new conexion.Conectar();
            cn.update(sql);
            cn.close();
        }
    }

    public void limpiarTabla() {
        DefaultTableModel tb = (DefaultTableModel) tabladatos.getModel();
        int a = tabladatos.getRowCount() - 1;
        for (int i = a; i >= 0; i--) {
            tb.removeRow(tb.getRowCount() - 1);
            
        }
    }

    public void limpiarTex() {
        tex_cedula.setText("");
        tex_nombre.setText("");
        tex_apellido.setText("");
        tex_direccion.setText("");
        tex_telefono.setText("");
        
    }
    
   
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        apellidos = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tex_nombre = new javax.swing.JTextField();
        tex_apellido = new javax.swing.JTextField();
        tex_direccion = new javax.swing.JTextField();
        tex_telefono = new javax.swing.JTextField();
        actualizar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        tex_cedula = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabladatos = new javax.swing.JTable();
        modificar = new javax.swing.JButton();
        buscar = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        jLabel4.setText("jLabel4");

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Modificar Cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(204, 0, 0))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("Nombre :");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 161, -1, -1));

        apellidos.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        apellidos.setText("Apellidos :");
        jPanel1.add(apellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 202, -1, 28));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Dirección :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 254, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("Teléfono :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 296, -1, -1));

        tex_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tex_nombreActionPerformed(evt);
            }
        });
        tex_nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tex_nombreKeyTyped(evt);
            }
        });
        jPanel1.add(tex_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 189, 34));

        tex_apellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tex_apellidoActionPerformed(evt);
            }
        });
        tex_apellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tex_apellidoKeyTyped(evt);
            }
        });
        jPanel1.add(tex_apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 189, 32));

        tex_direccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tex_direccionActionPerformed(evt);
            }
        });
        jPanel1.add(tex_direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 248, 189, 30));

        tex_telefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tex_telefonoActionPerformed(evt);
            }
        });
        tex_telefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tex_telefonoKeyTyped(evt);
            }
        });
        jPanel1.add(tex_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 296, 189, 29));

        actualizar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        actualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/recargar.png"))); // NOI18N
        actualizar.setText("Actualizar");
        actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarActionPerformed(evt);
            }
        });
        jPanel1.add(actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(365, 477, -1, 30));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setText("Cédula : ");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 110, -1, -1));

        tex_cedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tex_cedulaActionPerformed(evt);
            }
        });
        tex_cedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tex_cedulaKeyTyped(evt);
            }
        });
        jPanel1.add(tex_cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 104, 189, 31));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/zuly4.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 32, -1, -1));

        tabladatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tabladatos);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 342, 462, 117));

        modificar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        modificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/anadir-punto-de-anclaje.png"))); // NOI18N
        modificar.setText("Modificar");
        modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarActionPerformed(evt);
            }
        });
        jPanel1.add(modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(367, 146, -1, 30));

        buscar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/lupa.png"))); // NOI18N
        buscar.setText("Buscar");
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });
        jPanel1.add(buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(367, 103, 127, 30));

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-eliminar-32.png"))); // NOI18N
        jButton3.setBorderPainted(false);
        jButton3.setFocusPainted(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 536, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        buscar();
        

    }//GEN-LAST:event_buscarActionPerformed

    private void modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarActionPerformed
        tex_cedula.setEnabled(false);
        int fila = tabladatos.getSelectedRow();
        if (fila >= 0) {
            tex_cedula.setText(tabladatos.getValueAt(fila, 0).toString());
            tex_apellido.setText(tabladatos.getValueAt(fila, 2).toString());
            tex_nombre.setText(tabladatos.getValueAt(fila, 1).toString());
            tex_direccion.setText(tabladatos.getValueAt(fila, 3).toString());
            tex_telefono.setText(tabladatos.getValueAt(fila, 4).toString());
        } else {
            JOptionPane.showMessageDialog(null, "fila no seleccionada");
            tex_cedula.setEditable(false);
        }
        
    }//GEN-LAST:event_modificarActionPerformed
 
    
    

    
    private void actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarActionPerformed
        tex_cedula.setEnabled(true);
        modificar();
        limpiarTabla();
        limpiarTex();
        
    }//GEN-LAST:event_actualizarActionPerformed

    
    
    private void tex_cedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tex_cedulaActionPerformed
        
    }//GEN-LAST:event_tex_cedulaActionPerformed

    private void tex_cedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tex_cedulaKeyTyped
        char c = evt.getKeyChar();
        
        if (c < '0' || c > '9') {
            evt.consume();
        }
         int numerocaracter=10;
      if(tex_cedula.getText().length()>=numerocaracter){
          evt.consume();
          JOptionPane.showMessageDialog(rootPane, "Solo 10 caracteres");
      }
    }//GEN-LAST:event_tex_cedulaKeyTyped

    private void tex_telefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tex_telefonoKeyTyped
        char c = evt.getKeyChar();
        
        if (c < '0' || c > '9') {
           evt.consume();
        }
         int numerocaracter=10;
      if(tex_telefono.getText().length()>=numerocaracter){
          evt.consume();
          JOptionPane.showMessageDialog(rootPane, "Solo 10 caracteres");
      }
    }//GEN-LAST:event_tex_telefonoKeyTyped

    private void tex_apellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tex_apellidoKeyTyped
        validarletras.soloLetras(evt);
        
    }//GEN-LAST:event_tex_apellidoKeyTyped

    private void tex_nombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tex_nombreKeyTyped
        validarletras.soloLetras(evt);
    }//GEN-LAST:event_tex_nombreKeyTyped

    private void tex_apellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tex_apellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tex_apellidoActionPerformed

    private void tex_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tex_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tex_nombreActionPerformed

    private void tex_direccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tex_direccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tex_direccionActionPerformed

    private void tex_telefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tex_telefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tex_telefonoActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton actualizar;
    private javax.swing.JLabel apellidos;
    private javax.swing.JButton buscar;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton modificar;
    private javax.swing.JTable tabladatos;
    private javax.swing.JTextField tex_apellido;
    private javax.swing.JTextField tex_cedula;
    private javax.swing.JTextField tex_direccion;
    private javax.swing.JTextField tex_nombre;
    private javax.swing.JTextField tex_telefono;
    // End of variables declaration//GEN-END:variables
}
