/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.awt.Color;
import java.awt.TextArea;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.plaf.basic.BasicMenuBarUI;

/**
 *
 * 
 */
public class CambiosObra extends javax.swing.JFrame {

    /**
     * Creates new form VentanaModificarObra
     */
    public CambiosObra() {
        initComponents();
    }

    public JButton getBtnCancelar() {
        return btnCancelar;
    }

    public void setBtnCancelar(JButton btnCancelar) {
        this.btnCancelar = btnCancelar;
    }

    public JButton getBtnEliminar() {
        return btnEliminar;
    }

    public void setBtnEliminar(JButton btnEliminar) {
        this.btnEliminar = btnEliminar;
    }

    public JButton getBtnRegresarMenu() {
        return btnRegresarMenu;
    }

    public void setBtnRegresarMenu(JButton btnRegresarMenu) {
        this.btnRegresarMenu = btnRegresarMenu;
    }

    public JComboBox<String> getComboBoxObra() {
        return comboBoxObra;
    }

    public void setComboBoxObra(JComboBox<String> comboBoxObra) {
        this.comboBoxObra = comboBoxObra;
    }

    public JTextField getTxtDuracion() {
        return txtDuracion;
    }

    public void setTxtDuracion(JTextField txtDuracion) {
        this.txtDuracion = txtDuracion;
    }

    public JTextField getTxtGenero() {
        return txtGenero;
    }

    public void setTxtGenero(JTextField txtGenero) {
        this.txtGenero = txtGenero;
    }

    public JTextField getTxtNombre() {
        return txtNombre;
    }

    public void setTxtNombre(JTextField txtNombre) {
        this.txtNombre = txtNombre;
    }

    public JTextField getTxtPrecio() {
        return txtPrecio;
    }

    public void setTxtPrecio(JTextField txtPrecio) {
        this.txtPrecio = txtPrecio;
    }

    public JTextField getTxtPrimerActor() {
        return txtPrimerActor;
    }

    public void setTxtPrimerActor(JTextField txtPrimerActor) {
        this.txtPrimerActor = txtPrimerActor;
    }

    public TextArea getTxtResumenTematico() {
        return txtResumenTematico;
    }

    public void setTxtResumenTematico(TextArea txtResumenTematico) {
        this.txtResumenTematico = txtResumenTematico;
    }

    public JTextField getTxtSegundoActor() {
        return txtSegundoActor;
    }

    public void setTxtSegundoActor(JTextField txtSegundoActor) {
        this.txtSegundoActor = txtSegundoActor;
    }

    public JButton getBtnBuscar() {
        return btnBuscar;
    }

    public void setBtnBuscar(JButton btnBuscar) {
        this.btnBuscar = btnBuscar;
    }

    public JButton getBtnModificar() {
        return btnModificar;
    }

    public void setBtnModificar(JButton btnModificar) {
        this.btnModificar = btnModificar;
    }

    
    
    
    
    
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ticketBoletos = new java.awt.Panel();
        panel17 = new java.awt.Panel();
        panel16 = new java.awt.Panel();
        jLabel20 = new javax.swing.JLabel();
        comboBoxObra = new javax.swing.JComboBox<>();
        btnBuscar = new javax.swing.JButton();
        txtResumenTematico = new java.awt.TextArea();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtGenero = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtPrimerActor = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtSegundoActor = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtDuracion = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        panel18 = new java.awt.Panel();
        btnRegresarMenu = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Modificar obras");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ticketBoletos.setBackground(new java.awt.Color(0, 0, 0));
        ticketBoletos.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N

        javax.swing.GroupLayout ticketBoletosLayout = new javax.swing.GroupLayout(ticketBoletos);
        ticketBoletos.setLayout(ticketBoletosLayout);
        ticketBoletosLayout.setHorizontalGroup(
            ticketBoletosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 680, Short.MAX_VALUE)
        );
        ticketBoletosLayout.setVerticalGroup(
            ticketBoletosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        getContentPane().add(ticketBoletos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 680, 30));

        panel17.setBackground(new java.awt.Color(255, 255, 254));
        panel17.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel16.setBackground(new java.awt.Color(25, 43, 55));

        jLabel20.setBackground(new java.awt.Color(25, 43, 55));
        jLabel20.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Modificar/Eliminar Obras");

        comboBoxObra.setBackground(new java.awt.Color(255, 255, 255));
        comboBoxObra.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        comboBoxObra.setToolTipText("");
        comboBoxObra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxObraActionPerformed(evt);
            }
        });

        btnBuscar.setBackground(new java.awt.Color(255, 102, 0));
        btnBuscar.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel16Layout = new javax.swing.GroupLayout(panel16);
        panel16.setLayout(panel16Layout);
        panel16Layout.setHorizontalGroup(
            panel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel16Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(comboBoxObra, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBuscar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panel16Layout.setVerticalGroup(
            panel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(comboBoxObra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addContainerGap())
        );

        panel17.add(panel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 50));

        txtResumenTematico.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        panel17.add(txtResumenTematico, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 100, 310, 170));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(25, 43, 55));
        jLabel5.setText("Nombre");
        panel17.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(25, 43, 55));
        jLabel6.setText("Resumen temático");
        panel17.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 80, 160, -1));

        txtNombre.setBackground(new java.awt.Color(255, 255, 255));
        txtNombre.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        panel17.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 240, -1));

        txtGenero.setBackground(new java.awt.Color(255, 255, 255));
        txtGenero.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        panel17.add(txtGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 240, -1));

        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(25, 43, 55));
        jLabel9.setText("Género");
        panel17.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        txtPrimerActor.setBackground(new java.awt.Color(255, 255, 255));
        txtPrimerActor.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        panel17.add(txtPrimerActor, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 240, -1));

        jLabel10.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(25, 43, 55));
        jLabel10.setText("Primer actor principal");
        panel17.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        txtSegundoActor.setBackground(new java.awt.Color(255, 255, 255));
        txtSegundoActor.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        panel17.add(txtSegundoActor, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 240, -1));

        jLabel13.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(25, 43, 55));
        jLabel13.setText("Segundo actor principal");
        jLabel13.setToolTipText("");
        panel17.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, -1));

        txtPrecio.setBackground(new java.awt.Color(255, 255, 255));
        txtPrecio.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        panel17.add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 300, 110, -1));

        jLabel14.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(25, 43, 55));
        jLabel14.setText("Precio");
        panel17.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 280, -1, -1));

        txtDuracion.setBackground(new java.awt.Color(255, 255, 255));
        txtDuracion.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        panel17.add(txtDuracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 110, -1));

        jLabel15.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(25, 43, 55));
        jLabel15.setText("Duración");
        panel17.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, -1, -1));

        btnEliminar.setBackground(new java.awt.Color(25, 43, 55));
        btnEliminar.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setText("Eliminar");
        btnEliminar.setToolTipText("Eliminar");
        panel17.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 290, 90, 30));

        btnCancelar.setBackground(new java.awt.Color(25, 43, 55));
        btnCancelar.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("Cancelar");
        btnCancelar.setToolTipText("Cancelar");
        panel17.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 290, 90, 30));

        btnModificar.setBackground(new java.awt.Color(255, 102, 0));
        btnModificar.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnModificar.setForeground(new java.awt.Color(255, 255, 255));
        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        panel17.add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 290, 100, 30));

        getContentPane().add(panel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 680, 360));

        panel18.setBackground(new java.awt.Color(255, 102, 0));

        btnRegresarMenu.setBackground(new java.awt.Color(255, 102, 0));
        btnRegresarMenu.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnRegresarMenu.setForeground(new java.awt.Color(255, 255, 255));
        btnRegresarMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Img/regreso.png"))); // NOI18N
        btnRegresarMenu.setToolTipText("Regresar");
        btnRegresarMenu.setBorder(null);

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Menú");

        javax.swing.GroupLayout panel18Layout = new javax.swing.GroupLayout(panel18);
        panel18.setLayout(panel18Layout);
        panel18Layout.setHorizontalGroup(
            panel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel18Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnRegresarMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(0, 607, Short.MAX_VALUE))
        );
        panel18Layout.setVerticalGroup(
            panel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel18Layout.createSequentialGroup()
                .addComponent(btnRegresarMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
            .addGroup(panel18Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(panel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 30));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void comboBoxObraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxObraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxObraActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarActionPerformed

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
            java.util.logging.Logger.getLogger(CambiosObra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CambiosObra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CambiosObra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CambiosObra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CambiosObra().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnRegresarMenu;
    private javax.swing.JComboBox<String> comboBoxObra;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private java.awt.Panel panel16;
    private java.awt.Panel panel17;
    private java.awt.Panel panel18;
    private java.awt.Panel ticketBoletos;
    private javax.swing.JTextField txtDuracion;
    private javax.swing.JTextField txtGenero;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtPrimerActor;
    private java.awt.TextArea txtResumenTematico;
    private javax.swing.JTextField txtSegundoActor;
    // End of variables declaration//GEN-END:variables
}
