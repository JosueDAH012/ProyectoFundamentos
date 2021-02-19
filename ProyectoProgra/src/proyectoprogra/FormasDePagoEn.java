/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoprogra;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class FormasDePagoEn extends javax.swing.JFrame {

    /**
     * Creates new form FormasDePago
     */
    public FormasDePagoEn() {
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

        jPnFormasPago = new javax.swing.JPanel();
        jLbNombre = new javax.swing.JLabel();
        jTxFNombre = new javax.swing.JTextField();
        jLbApellido = new javax.swing.JLabel();
        jTxFApellido = new javax.swing.JTextField();
        jLbTarjeta = new javax.swing.JLabel();
        CbxTarjeta = new javax.swing.JComboBox<>();
        jLbNumTarjeta = new javax.swing.JLabel();
        jTxFNumTarjeta = new javax.swing.JTextField();
        jLbCvc = new javax.swing.JLabel();
        jPsdCvc = new javax.swing.JPasswordField();
        jLbInicio = new javax.swing.JLabel();
        jBtnListo = new javax.swing.JButton();
        jBtnPagar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Informacion Pago");

        jPnFormasPago.setBackground(new java.awt.Color(102, 102, 102));
        jPnFormasPago.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0), 2));

        jLbNombre.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        jLbNombre.setForeground(new java.awt.Color(255, 153, 0));
        jLbNombre.setText("Name");
        jLbNombre.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLbApellido.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        jLbApellido.setForeground(new java.awt.Color(255, 153, 0));
        jLbApellido.setText("Last Name");

        jTxFApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxFApellidoActionPerformed(evt);
            }
        });

        jLbTarjeta.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        jLbTarjeta.setForeground(new java.awt.Color(255, 153, 0));
        jLbTarjeta.setText("Type of card");

        CbxTarjeta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Visa", "MasterCard", "Credomatic", "AmericanSpress", "Paypal" }));
        CbxTarjeta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CbxTarjetaMouseClicked(evt);
            }
        });
        CbxTarjeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CbxTarjetaActionPerformed(evt);
            }
        });

        jLbNumTarjeta.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        jLbNumTarjeta.setForeground(new java.awt.Color(255, 153, 0));
        jLbNumTarjeta.setText("Card Number");

        jLbCvc.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        jLbCvc.setForeground(new java.awt.Color(255, 153, 0));
        jLbCvc.setText("CVC CODE");

        jPsdCvc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPsdCvcActionPerformed(evt);
            }
        });

        jLbInicio.setForeground(new java.awt.Color(255, 153, 0));
        jLbInicio.setText("START");
        jLbInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLbInicioMouseClicked(evt);
            }
        });

        jBtnListo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Listo.jpeg"))); // NOI18N
        jBtnListo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBtnListoMouseClicked(evt);
            }
        });
        jBtnListo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnListoActionPerformed(evt);
            }
        });

        jBtnPagar.setText("Pagar");
        jBtnPagar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBtnPagarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPnFormasPagoLayout = new javax.swing.GroupLayout(jPnFormasPago);
        jPnFormasPago.setLayout(jPnFormasPagoLayout);
        jPnFormasPagoLayout.setHorizontalGroup(
            jPnFormasPagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnFormasPagoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPnFormasPagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPnFormasPagoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLbInicio))
                    .addGroup(jPnFormasPagoLayout.createSequentialGroup()
                        .addGroup(jPnFormasPagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPnFormasPagoLayout.createSequentialGroup()
                                .addComponent(jLbNombre)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTxFNombre))
                            .addGroup(jPnFormasPagoLayout.createSequentialGroup()
                                .addGroup(jPnFormasPagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLbTarjeta)
                                    .addComponent(jLbNumTarjeta)
                                    .addComponent(jLbApellido)
                                    .addGroup(jPnFormasPagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jBtnPagar)
                                        .addComponent(jLbCvc)))
                                .addGap(20, 20, 20)
                                .addGroup(jPnFormasPagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPnFormasPagoLayout.createSequentialGroup()
                                        .addComponent(jPsdCvc, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(jTxFNumTarjeta, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(CbxTarjeta, javax.swing.GroupLayout.Alignment.TRAILING, 0, 219, Short.MAX_VALUE)
                                    .addComponent(jTxFApellido)))
                            .addComponent(jBtnListo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );
        jPnFormasPagoLayout.setVerticalGroup(
            jPnFormasPagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPnFormasPagoLayout.createSequentialGroup()
                .addComponent(jLbInicio)
                .addGap(11, 11, 11)
                .addGroup(jPnFormasPagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLbNombre)
                    .addComponent(jTxFNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPnFormasPagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLbApellido)
                    .addComponent(jTxFApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPnFormasPagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLbTarjeta)
                    .addComponent(CbxTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPnFormasPagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLbNumTarjeta)
                    .addComponent(jTxFNumTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPnFormasPagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLbCvc)
                    .addComponent(jPsdCvc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(jPnFormasPagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBtnListo, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnPagar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPnFormasPago, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPnFormasPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLbInicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLbInicioMouseClicked

        PantallaPrincipalEn d = new PantallaPrincipalEn();
        d.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLbInicioMouseClicked

    private void jBtnListoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnListoMouseClicked

        System.out.println("The data was saved correctly");
    }//GEN-LAST:event_jBtnListoMouseClicked

    private void CbxTarjetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CbxTarjetaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CbxTarjetaActionPerformed

    private void CbxTarjetaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CbxTarjetaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_CbxTarjetaMouseClicked

    private void jTxFApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxFApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxFApellidoActionPerformed

    private void jPsdCvcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPsdCvcActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPsdCvcActionPerformed

    private void jBtnListoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnListoActionPerformed
        JOptionPane.showMessageDialog(null, "Saved correctly");
    }//GEN-LAST:event_jBtnListoActionPerformed

    private void jBtnPagarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnPagarMouseClicked
        // TODO add your handling code here:
        PagarEn d = new PagarEn();
        d.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jBtnPagarMouseClicked

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
            java.util.logging.Logger.getLogger(FormasDePagoEn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormasDePagoEn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormasDePagoEn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormasDePagoEn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormasDePagoEn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CbxTarjeta;
    private javax.swing.JButton jBtnListo;
    private javax.swing.JButton jBtnPagar;
    private javax.swing.JLabel jLbApellido;
    private javax.swing.JLabel jLbCvc;
    private javax.swing.JLabel jLbInicio;
    private javax.swing.JLabel jLbNombre;
    private javax.swing.JLabel jLbNumTarjeta;
    private javax.swing.JLabel jLbTarjeta;
    private javax.swing.JPanel jPnFormasPago;
    private javax.swing.JPasswordField jPsdCvc;
    private javax.swing.JTextField jTxFApellido;
    private javax.swing.JTextField jTxFNombre;
    private javax.swing.JTextField jTxFNumTarjeta;
    // End of variables declaration//GEN-END:variables
}
