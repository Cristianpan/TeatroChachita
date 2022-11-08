/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import javax.swing.JPasswordField;


/**
 *
 * @author diana
 */
public class Register extends javax.swing.JFrame {

    /**
     * Creates new form VentanaCrearUsuarios
     */
    

    public Register() {
        initComponents();
    }
    
    public javax.swing.JComboBox<String> getBoxTipoUsuario() {
        return boxTipoUsuario;
    }

    public void setBoxTipoUsuario(javax.swing.JComboBox<String> boxTipoUsuario) {
        this.boxTipoUsuario = boxTipoUsuario;
    }

    public javax.swing.JButton getBtnCancelar() {
        return btnCancelar;
    }

    public void setBtnCancelar(javax.swing.JButton btnCancelar) {
        this.btnCancelar = btnCancelar;
    }

    public javax.swing.JButton getBtnRegistrar() {
        return btnRegistrar;
    }

    public void setBtnRegistrar(javax.swing.JButton btnRegistrar) {
        this.btnRegistrar = btnRegistrar;
    }

    public javax.swing.JTextField getTxtApellido() {
        return txtApellido;
    }

    public void setTxtApellido(javax.swing.JTextField txtApellido) {
        this.txtApellido = txtApellido;
    }

    public JPasswordField getTxtContrasena() {
        return txtContrasena;
    }

    public void setTxtContrasena(JPasswordField txtContrasena) {
        this.txtContrasena = txtContrasena;
    }

    public javax.swing.JTextField getTxtCurp() {
        return txtCurp;
    }

    public void setTxtCurp(javax.swing.JTextField txtCurp) {
        this.txtCurp = txtCurp;
    }

    public javax.swing.JTextField getTxtNombre() {
        return txtNombre;
    }

    public void setTxtNombre(javax.swing.JTextField txtNombre) {
        this.txtNombre = txtNombre;
    }

    public javax.swing.JTextField getTxtUsuario() {
        return txtUsuario;
    }

    public void setTxtUsuario(javax.swing.JTextField txtUsuario) {
        this.txtUsuario = txtUsuario;
    }

    public javax.swing.JTextField getTxtWarning() {
        return txtWarning;
    }

    public void setTxtWarning(javax.swing.JTextField txtWarning) {
        this.txtWarning = txtWarning;
    }

    public void habilitarBoton(){
        if(!txtNombre.getText().isEmpty() && !txtApellido.getText().isEmpty() && !txtCurp.getText().isEmpty()
                && !txtUsuario.getText().isEmpty() && !txtContrasena.getText().isEmpty()){
            btnRegistrar.setEnabled(true);
        }
        else{
            btnRegistrar.setEnabled(false);
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

        panel1 = new java.awt.Panel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtCurp = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();
        boxTipoUsuario = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        txtWarning = new javax.swing.JTextField();
        btnRegresarMenu = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txtContrasena = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registro");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel1.setBackground(new java.awt.Color(255, 255, 254));
        panel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Img/imagen2.png"))); // NOI18N
        panel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 70, 138, 192));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Img/imagen3.png"))); // NOI18N
        panel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 260, 138, 170));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 102, 0));
        jLabel3.setText("Tipo Usuario");
        panel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 120, -1));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 102, 0));
        jLabel4.setText("Registro");
        panel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 162, 63));

        txtNombre.setBackground(new java.awt.Color(255, 255, 255));
        txtNombre.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNombreKeyReleased(evt);
            }
        });
        panel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 216, 32));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 102, 0));
        jLabel5.setText("Apellido");
        panel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 200, 79, -1));

        txtApellido.setBackground(new java.awt.Color(255, 255, 255));
        txtApellido.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtApellidoKeyReleased(evt);
            }
        });
        panel1.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 220, 216, 32));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 102, 0));
        jLabel6.setText("CURP");
        panel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 79, -1));

        txtCurp.setBackground(new java.awt.Color(255, 255, 255));
        txtCurp.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtCurp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCurpKeyReleased(evt);
            }
        });
        panel1.add(txtCurp, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 216, 32));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 102, 0));
        jLabel7.setText("Nombre de Usuario");
        panel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 270, 150, -1));

        txtUsuario.setBackground(new java.awt.Color(255, 255, 255));
        txtUsuario.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtUsuarioKeyReleased(evt);
            }
        });
        panel1.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 290, 216, 32));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 102, 0));
        jLabel8.setText("Contraseña");
        panel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, 79, -1));

        btnCancelar.setBackground(new java.awt.Color(25, 43, 55));
        btnCancelar.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        panel1.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 430, 100, 33));

        btnRegistrar.setBackground(new java.awt.Color(255, 102, 0));
        btnRegistrar.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrar.setText("Registrar");
        btnRegistrar.setEnabled(false);
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        panel1.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 430, 100, 33));

        boxTipoUsuario.setBackground(new java.awt.Color(255, 255, 255));
        boxTipoUsuario.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        boxTipoUsuario.setForeground(new java.awt.Color(0, 0, 0));
        boxTipoUsuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecionar", "Operador", "Administrador" }));
        panel1.add(boxTipoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 210, 30));

        jLabel10.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 102, 0));
        jLabel10.setText("Nombre");
        panel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 79, -1));

        txtWarning.setEditable(false);
        txtWarning.setBackground(new java.awt.Color(255, 255, 255));
        txtWarning.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        txtWarning.setForeground(new java.awt.Color(255, 51, 0));
        txtWarning.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtWarning.setBorder(null);
        txtWarning.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtWarningActionPerformed(evt);
            }
        });
        panel1.add(txtWarning, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 330, 200, 60));

        btnRegresarMenu.setBackground(new java.awt.Color(255, 255, 255));
        btnRegresarMenu.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnRegresarMenu.setForeground(new java.awt.Color(255, 255, 255));
        btnRegresarMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Img/regreso.png"))); // NOI18N
        btnRegresarMenu.setToolTipText("Regresar");
        btnRegresarMenu.setBorder(null);
        panel1.add(btnRegresarMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 30));

        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Menú");
        panel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        txtContrasena.setBackground(new java.awt.Color(255, 255, 255));
        txtContrasena.setForeground(new java.awt.Color(0, 0, 0));
        panel1.add(txtContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, 210, 30));

        getContentPane().add(panel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 490));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyReleased
        habilitarBoton();
    }//GEN-LAST:event_txtNombreKeyReleased

    private void txtApellidoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoKeyReleased
        habilitarBoton();
    }//GEN-LAST:event_txtApellidoKeyReleased

    private void txtCurpKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCurpKeyReleased
        habilitarBoton();
    }//GEN-LAST:event_txtCurpKeyReleased

    private void txtUsuarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsuarioKeyReleased
        habilitarBoton();
    }//GEN-LAST:event_txtUsuarioKeyReleased

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        /* if(evt.getSource() == btnCancelar){
            Login a= new Login();
            a.setVisible(true);
            this.setVisible(false);
        } */
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        /* if(evt.getSource() == btnRegistrar){
           Login a= new Login();
            a.setVisible(true);
            this.setVisible(false);
        } */
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void txtWarningActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtWarningActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtWarningActionPerformed

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
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxTipoUsuario;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnRegresarMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private java.awt.Panel panel1;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JPasswordField txtContrasena;
    private javax.swing.JTextField txtCurp;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtUsuario;
    private javax.swing.JTextField txtWarning;
    // End of variables declaration//GEN-END:variables
}
