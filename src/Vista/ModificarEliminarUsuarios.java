/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

/**
 *
 * @author diana
 */
public class ModificarEliminarUsuarios extends javax.swing.JFrame {

    /**
     * Creates new form VentanaModificarEliminarUsuarios
     */
    public ModificarEliminarUsuarios() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new java.awt.Panel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        textfieldNombre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        textfieldApellido = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        textfieldCURP = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        textfieldNombreU = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        textfieldContra = new javax.swing.JTextField();
        cancelar = new javax.swing.JButton();
        registrarse = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        textfieldNombre1 = new javax.swing.JTextField();
        cancelar2 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel1.setBackground(new java.awt.Color(255, 255, 254));
        panel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Img/imagen2.png"))); // NOI18N
        panel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 30, 138, 192));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Img/imagen3.png"))); // NOI18N
        panel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 250, 138, 170));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Elegir Usuario");
        panel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 110, 120, -1));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 102, 0));
        jLabel4.setText("Modificar Usuario");
        panel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 340, 63));

        textfieldNombre.setBackground(new java.awt.Color(255, 255, 255));
        textfieldNombre.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        textfieldNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textfieldNombreKeyReleased(evt);
            }
        });
        panel1.add(textfieldNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 216, 32));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 102, 0));
        jLabel5.setText("Apellido");
        panel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 180, 79, -1));

        textfieldApellido.setBackground(new java.awt.Color(255, 255, 255));
        textfieldApellido.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        textfieldApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textfieldApellidoKeyReleased(evt);
            }
        });
        panel1.add(textfieldApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 200, 216, 32));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 102, 0));
        jLabel6.setText("CURP");
        panel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 79, -1));

        textfieldCURP.setBackground(new java.awt.Color(255, 255, 255));
        textfieldCURP.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        textfieldCURP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textfieldCURPKeyReleased(evt);
            }
        });
        panel1.add(textfieldCURP, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 216, 32));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 102, 0));
        jLabel7.setText("Nombre de Usuario");
        panel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 250, 150, -1));

        textfieldNombreU.setBackground(new java.awt.Color(255, 255, 255));
        textfieldNombreU.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        textfieldNombreU.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textfieldNombreUKeyReleased(evt);
            }
        });
        panel1.add(textfieldNombreU, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 270, 216, 32));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 102, 0));
        jLabel8.setText("Contraseña");
        panel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 79, -1));

        textfieldContra.setBackground(new java.awt.Color(255, 255, 255));
        textfieldContra.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        textfieldContra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textfieldContraKeyReleased(evt);
            }
        });
        panel1.add(textfieldContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, 216, 32));

        cancelar.setBackground(new java.awt.Color(25, 43, 55));
        cancelar.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        cancelar.setForeground(new java.awt.Color(255, 255, 255));
        cancelar.setText("Cancelar");
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });
        panel1.add(cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 410, 100, 33));

        registrarse.setBackground(new java.awt.Color(255, 102, 0));
        registrarse.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        registrarse.setForeground(new java.awt.Color(255, 255, 255));
        registrarse.setText("Modificar");
        registrarse.setEnabled(false);
        registrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarseActionPerformed(evt);
            }
        });
        panel1.add(registrarse, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, 100, 33));

        jLabel10.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 102, 0));
        jLabel10.setText("Nombre");
        panel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 79, -1));

        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 102, 0));
        jLabel9.setText("Tipo Usuario");
        panel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 320, 120, -1));

        jComboBox3.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox3.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jComboBox3.setForeground(new java.awt.Color(0, 0, 0));
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Operador", "Administrador", " ", " " }));
        panel1.add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 130, 220, 30));

        textfieldNombre1.setBackground(new java.awt.Color(255, 255, 255));
        textfieldNombre1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        textfieldNombre1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textfieldNombre1KeyReleased(evt);
            }
        });
        panel1.add(textfieldNombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 216, 32));

        cancelar2.setBackground(new java.awt.Color(102, 102, 102));
        cancelar2.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        cancelar2.setForeground(new java.awt.Color(255, 255, 255));
        cancelar2.setText("Eliminar");
        cancelar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelar2ActionPerformed(evt);
            }
        });
        panel1.add(cancelar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 410, 100, 33));

        jLabel11.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 102, 102));
        jLabel11.setText("Buscar Usuario");
        panel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 120, -1));

        jComboBox4.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox4.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jComboBox4.setForeground(new java.awt.Color(0, 0, 0));
        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Operador", "Administrador", " ", " " }));
        panel1.add(jComboBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 340, 220, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void textfieldNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textfieldNombreKeyReleased
//        habilitarBoton();
    }//GEN-LAST:event_textfieldNombreKeyReleased

    private void textfieldApellidoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textfieldApellidoKeyReleased
//        habilitarBoton();
    }//GEN-LAST:event_textfieldApellidoKeyReleased

    private void textfieldCURPKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textfieldCURPKeyReleased
//        habilitarBoton();
    }//GEN-LAST:event_textfieldCURPKeyReleased

    private void textfieldNombreUKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textfieldNombreUKeyReleased
//        habilitarBoton();
    }//GEN-LAST:event_textfieldNombreUKeyReleased

    private void textfieldContraKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textfieldContraKeyReleased
//        habilitarBoton();
    }//GEN-LAST:event_textfieldContraKeyReleased

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        if(evt.getSource() == cancelar){
            Login a= new Login();
            a.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_cancelarActionPerformed

    private void registrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarseActionPerformed
        if(evt.getSource() == registrarse){
            Login a= new Login();
            a.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_registrarseActionPerformed

    private void textfieldNombre1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textfieldNombre1KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_textfieldNombre1KeyReleased

    private void cancelar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelar2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cancelar2ActionPerformed

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
            java.util.logging.Logger.getLogger(ModificarEliminarUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModificarEliminarUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModificarEliminarUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModificarEliminarUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModificarEliminarUsuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelar;
    private javax.swing.JButton cancelar2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private java.awt.Panel panel1;
    private javax.swing.JButton registrarse;
    private javax.swing.JTextField textfieldApellido;
    private javax.swing.JTextField textfieldCURP;
    private javax.swing.JTextField textfieldContra;
    private javax.swing.JTextField textfieldNombre;
    private javax.swing.JTextField textfieldNombre1;
    private javax.swing.JTextField textfieldNombreU;
    // End of variables declaration//GEN-END:variables
}
