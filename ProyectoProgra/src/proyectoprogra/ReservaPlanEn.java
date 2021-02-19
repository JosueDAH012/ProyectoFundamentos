/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoprogra;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Usuario
 */
public class ReservaPlanEn extends javax.swing.JFrame {

    DefaultTableModel model = new DefaultTableModel();
    
    
    
    public ReservaPlanEn() {
        initComponents();
        model.addColumn("Type#");
         model.addColumn("Day");
        model.addColumn("Subscription");
        model.addColumn("Course");
        this.TABLAUNO.setModel(model);
        this.setLocationRelativeTo(null);
    }
    public Image getIconImage(){
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/Logo.jpg"));
        return retValue;
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
        jPanel1 = new javax.swing.JPanel();
        Instruccion3 = new javax.swing.JLabel();
        JCBperiodoS = new javax.swing.JComboBox<>();
        JLBtiposuscrip = new javax.swing.JLabel();
        JCBtiposuscrip = new javax.swing.JComboBox<>();
        JLBtiposuscrip1 = new javax.swing.JLabel();
        JLBtiposuscrip2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TABLAUNO = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        JLBtiposuscrip3 = new javax.swing.JLabel();
        JCBdia = new javax.swing.JComboBox<>();
        JCBhoracurso = new javax.swing.JComboBox<>();
        JBagregar = new javax.swing.JButton();
        JBeliminar = new javax.swing.JButton();
        JBeliminart = new javax.swing.JButton();
        Instruccion4 = new javax.swing.JLabel();
        JBsalir = new javax.swing.JButton();
        JBguardar = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Reservar Plan");
        setIconImage(getIconImage());
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0), 2));

        Instruccion3.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        Instruccion3.setForeground(new java.awt.Color(255, 153, 0));
        Instruccion3.setText("Reserva");

        JCBperiodoS.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar:", "1 Cuatrimestre", "2 Cuatrimestres", "1 Año" }));

        JLBtiposuscrip.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        JLBtiposuscrip.setForeground(new java.awt.Color(255, 153, 0));
        JLBtiposuscrip.setText("Tipo Suscripción");

        JCBtiposuscrip.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione:", "Estándar", "Premium" }));

        JLBtiposuscrip1.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        JLBtiposuscrip1.setForeground(new java.awt.Color(255, 153, 0));
        JLBtiposuscrip1.setText("Día");

        JLBtiposuscrip2.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        JLBtiposuscrip2.setForeground(new java.awt.Color(255, 153, 0));
        JLBtiposuscrip2.setText("Mi Horario");

        TABLAUNO.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(TABLAUNO);

        jPanel2.setBackground(new java.awt.Color(255, 153, 51));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 9, Short.MAX_VALUE)
        );

        JLBtiposuscrip3.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        JLBtiposuscrip3.setForeground(new java.awt.Color(255, 153, 0));
        JLBtiposuscrip3.setText("Hora de curso");

        JCBdia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " Seleccione:", " Lunes", " Martes", " Miercoles", " Jueves", " Viernes" }));

        JCBhoracurso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " Seleccione:", " 7:30 am - 11:30 am", " 10:30 am - 2:30 pm", " 1:30 pm - 5:30 pm", " 4:30 pm - 8:30 pm", " 6:00 pm - 10:00 pm" }));

        JBagregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Agregar.png"))); // NOI18N
        JBagregar.setPreferredSize(new java.awt.Dimension(70, 40));
        JBagregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JBagregarMouseClicked(evt);
            }
        });
        JBagregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBagregarActionPerformed(evt);
            }
        });

        JBeliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Eliminar.png"))); // NOI18N
        JBeliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JBeliminarMouseClicked(evt);
            }
        });
        JBeliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBeliminarActionPerformed(evt);
            }
        });

        JBeliminart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Eliminar Todo.png"))); // NOI18N
        JBeliminart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBeliminartActionPerformed(evt);
            }
        });

        Instruccion4.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        Instruccion4.setForeground(new java.awt.Color(255, 153, 0));
        Instruccion4.setText("Periodo de Suscripción");

        JBsalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Salir.png"))); // NOI18N
        JBsalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JBsalirMouseClicked(evt);
            }
        });

        JBguardar.setText("Guardar");
        JBguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBguardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Instruccion4)
                        .addGap(200, 200, 200)
                        .addComponent(JCBperiodoS, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Instruccion3)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(29, 29, 29)
                            .addComponent(JBguardar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(JBsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 549, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(JLBtiposuscrip2)
                                .addComponent(JLBtiposuscrip1)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(JLBtiposuscrip3)
                                        .addComponent(JLBtiposuscrip))
                                    .addGap(23, 23, 23)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(JCBtiposuscrip, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(JCBhoracurso, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(JCBdia, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGap(39, 39, 39)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(JBagregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(JBeliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(8, 8, 8))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(61, 61, 61)
                                    .addComponent(JBeliminart, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, Short.MAX_VALUE))))))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Instruccion3)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JCBperiodoS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Instruccion4))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JLBtiposuscrip2)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JLBtiposuscrip1)
                            .addComponent(JCBdia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(JCBhoracurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(JLBtiposuscrip3))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(JLBtiposuscrip)
                                    .addComponent(JCBtiposuscrip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(JBeliminar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(JBagregar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(33, 33, 33)
                                .addComponent(JBeliminart, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)))))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JBsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBguardar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBagregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBagregarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_JBagregarMouseClicked
    ConfirmeHorarioEn x= new ConfirmeHorarioEn();
    public static String dia, sus, hora; int tipo=1;
    private void JBagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBagregarActionPerformed

        String[] agregar = new String[4];
        dia= agregar[0] = (String) JCBdia.getSelectedItem();
        sus=agregar[1] = (String) JCBtiposuscrip.getSelectedItem();
        hora= agregar[2] = (String) JCBhoracurso.getSelectedItem();
        Object file []={tipo,dia,sus,hora};
        model.addRow(file);
tipo++;

    }//GEN-LAST:event_JBagregarActionPerformed

    private void JBeliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBeliminarActionPerformed

        int elim = TABLAUNO.getSelectedRowCount();
        if (elim >= 0) {
            model.removeRow(elim);
        } else {
            JOptionPane.showMessageDialog(null, "There is no data to be deleted ");
        }


    }//GEN-LAST:event_JBeliminarActionPerformed

    private void JBeliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBeliminarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_JBeliminarMouseClicked

    private void JBeliminartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBeliminartActionPerformed

        int elimtotal = TABLAUNO.getRowCount();
        for (int i = elimtotal - 1; i >= 0; i--) {
            model.removeRow(i);
        }


    }//GEN-LAST:event_JBeliminartActionPerformed

    private void JBsalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBsalirMouseClicked
        // TODO add your handling code here:
        PantallaPrincipal d = new PantallaPrincipal();
        d.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_JBsalirMouseClicked
public int confirme =1;
    private void JBguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBguardarActionPerformed
x.setVisible(true);

for (int i =0; i < TABLAUNO.getRowCount(); i++){
    model.removeRow(i);
    i-=1;
    }
Object fe[]={confirme,dia,hora,sus};
confirme++;
x.model2.addRow(fe);
JCBdia.setSelectedIndex(0);
JCBtiposuscrip.setSelectedIndex(0);
JCBhoracurso.setSelectedIndex(0);
    }//GEN-LAST:event_JBguardarActionPerformed

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
            java.util.logging.Logger.getLogger(ReservaPlanEn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReservaPlanEn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReservaPlanEn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReservaPlanEn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReservaPlanEn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Instruccion3;
    private javax.swing.JLabel Instruccion4;
    private javax.swing.JButton JBagregar;
    private javax.swing.JButton JBeliminar;
    private javax.swing.JButton JBeliminart;
    private javax.swing.JButton JBguardar;
    private javax.swing.JButton JBsalir;
    private javax.swing.JComboBox<String> JCBdia;
    private javax.swing.JComboBox<String> JCBhoracurso;
    private javax.swing.JComboBox<String> JCBperiodoS;
    private javax.swing.JComboBox<String> JCBtiposuscrip;
    private javax.swing.JLabel JLBtiposuscrip;
    private javax.swing.JLabel JLBtiposuscrip1;
    private javax.swing.JLabel JLBtiposuscrip2;
    private javax.swing.JLabel JLBtiposuscrip3;
    private javax.swing.JTable TABLAUNO;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}

