/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.awt.Color;
import java.awt.TextArea;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.plaf.basic.BasicMenuBarUI;

/**
 *
 * @author diana
 */
public class CrearObra extends javax.swing.JFrame {

    /**
     * Creates new form VentanaCrearObras
     */
    public CrearObra() {
        initComponents();
    }

    public JButton getBtnAgregar() {
        return btnAgregar;
    }

    public void setBtnAgregar(JButton btnAgregar) {
        this.btnAgregar = btnAgregar;
    }

    public JButton getBtnCancelar() {
        return btnCancelar;
    }

    public void setBtnCancelar(JButton btnCancelar) {
        this.btnCancelar = btnCancelar;
    }

    public JButton getBtnRegresarMenu() {
        return btnRegresarMenu;
    }

    public void setBtnRegresarMenu(JButton btnRegresarMenu) {
        this.btnRegresarMenu = btnRegresarMenu;
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
    
    

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel7 = new java.awt.Panel();
        panel6 = new java.awt.Panel();
        jLabel5 = new javax.swing.JLabel();
        txtResumenTematico = new java.awt.TextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        txtNombre = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtSegundoActor = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtDuracion = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtGenero = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtPrimerActor = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        panel4 = new java.awt.Panel();
        panel8 = new java.awt.Panel();
        jLabel4 = new javax.swing.JLabel();
        btnRegresarMenu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Agregar obras");
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel7.setBackground(new java.awt.Color(255, 255, 254));
        panel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel6.setBackground(new java.awt.Color(25, 43, 55));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Agregar Obras");

        javax.swing.GroupLayout panel6Layout = new javax.swing.GroupLayout(panel6);
        panel6.setLayout(panel6Layout);
        panel6Layout.setHorizontalGroup(
            panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel6Layout.createSequentialGroup()
                .addContainerGap(493, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panel6Layout.setVerticalGroup(
            panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        panel7.add(panel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 50));
        panel7.add(txtResumenTematico, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 100, 320, 170));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(25, 43, 55));
        jLabel2.setText("Nombre");
        panel7.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(25, 43, 55));
        jLabel3.setText("Resumen temático");
        panel7.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 80, 160, -1));

        btnAgregar.setBackground(new java.awt.Color(255, 102, 0));
        btnAgregar.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnAgregar.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregar.setText("Agregar");
        btnAgregar.setToolTipText("Agregar");
        panel7.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 290, 130, 30));

        txtNombre.setBackground(new java.awt.Color(255, 255, 255));
        txtNombre.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        panel7.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 240, -1));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(25, 43, 55));
        jLabel7.setText("Primer actor principal");
        panel7.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        txtSegundoActor.setBackground(new java.awt.Color(255, 255, 255));
        txtSegundoActor.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        panel7.add(txtSegundoActor, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 240, -1));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(25, 43, 55));
        jLabel8.setText("Segundo actor principal");
        jLabel8.setToolTipText("");
        panel7.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, -1));

        txtDuracion.setBackground(new java.awt.Color(255, 255, 255));
        txtDuracion.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        panel7.add(txtDuracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 300, 110, -1));

        jLabel11.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(25, 43, 55));
        jLabel11.setText("Duración");
        panel7.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 280, -1, -1));

        txtGenero.setBackground(new java.awt.Color(255, 255, 255));
        txtGenero.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        panel7.add(txtGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 240, -1));

        jLabel12.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(25, 43, 55));
        jLabel12.setText("Genero");
        panel7.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        txtPrimerActor.setBackground(new java.awt.Color(255, 255, 255));
        txtPrimerActor.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        panel7.add(txtPrimerActor, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 240, -1));

        txtPrecio.setBackground(new java.awt.Color(255, 255, 255));
        txtPrecio.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        panel7.add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 110, -1));

        jLabel13.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(25, 43, 55));
        jLabel13.setText("Precio");
        panel7.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, -1, -1));

        btnCancelar.setBackground(new java.awt.Color(25, 43, 55));
        btnCancelar.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("Cancelar");
        btnCancelar.setToolTipText("Cancelar");
        panel7.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 290, 130, 30));

        getContentPane().add(panel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, -1, 360));

        panel4.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout panel4Layout = new javax.swing.GroupLayout(panel4);
        panel4.setLayout(panel4Layout);
        panel4Layout.setHorizontalGroup(
            panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 690, Short.MAX_VALUE)
        );
        panel4Layout.setVerticalGroup(
            panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        getContentPane().add(panel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 690, 30));

        panel8.setBackground(new java.awt.Color(255, 102, 0));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Menú");

        btnRegresarMenu.setBackground(new java.awt.Color(255, 102, 0));
        btnRegresarMenu.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        btnRegresarMenu.setForeground(new java.awt.Color(255, 255, 255));
        btnRegresarMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Img/regreso.png"))); // NOI18N
        btnRegresarMenu.setToolTipText("Regresar");
        btnRegresarMenu.setBorder(null);

        javax.swing.GroupLayout panel8Layout = new javax.swing.GroupLayout(panel8);
        panel8.setLayout(panel8Layout);
        panel8Layout.setHorizontalGroup(
            panel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel8Layout.createSequentialGroup()
                .addComponent(btnRegresarMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(0, 607, Short.MAX_VALUE))
        );
        panel8Layout.setVerticalGroup(
            panel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel8Layout.createSequentialGroup()
                .addGap(0, 1, Short.MAX_VALUE)
                .addComponent(btnRegresarMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addContainerGap())
        );

        getContentPane().add(panel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 30));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(CrearObra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrearObra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrearObra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrearObra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CrearObra().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnRegresarMenu;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private java.awt.Panel panel4;
    private java.awt.Panel panel6;
    private java.awt.Panel panel7;
    private java.awt.Panel panel8;
    private javax.swing.JTextField txtDuracion;
    private javax.swing.JTextField txtGenero;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtPrimerActor;
    private java.awt.TextArea txtResumenTematico;
    private javax.swing.JTextField txtSegundoActor;
    // End of variables declaration//GEN-END:variables
}
