/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoprogra;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Usuario
 */
public class MisVehiculosEn extends javax.swing.JFrame {
     DefaultTableModel misvehiculos = new DefaultTableModel();
   
    public MisVehiculosEn() {
        initComponents();
        misvehiculos.addColumn("Brand");
        misvehiculos.addColumn("Model");
        misvehiculos.addColumn("License Plate");
        misvehiculos.addColumn("Year");
        this.JTvehiculos.setModel(misvehiculos);
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        JLBInicio = new javax.swing.JLabel();
        JLBmarca = new javax.swing.JLabel();
        JLBmodelo = new javax.swing.JLabel();
        JLBmodelo1 = new javax.swing.JLabel();
        JCBmarca = new javax.swing.JComboBox<>();
        JCBaño = new javax.swing.JComboBox<>();
        JBagregar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTvehiculos = new javax.swing.JTable();
        JBeliminar = new javax.swing.JButton();
        JBeliminart = new javax.swing.JButton();
        JTFmodelo = new javax.swing.JTextField();
        JBReservaPlan = new javax.swing.JButton();
        JLBplaca = new javax.swing.JLabel();
        JTFplaca = new javax.swing.JTextField();
        jBtnGuardar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Mis Vehiculos");

        jPanel1.setToolTipText("");

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0), 2));
        jPanel2.setForeground(new java.awt.Color(255, 102, 0));

        JLBInicio.setForeground(new java.awt.Color(255, 153, 0));
        JLBInicio.setText("Inicio");
        JLBInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JLBInicioMouseClicked(evt);
            }
        });

        JLBmarca.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        JLBmarca.setForeground(new java.awt.Color(255, 153, 0));
        JLBmarca.setText("Brand");

        JLBmodelo.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        JLBmodelo.setForeground(new java.awt.Color(255, 153, 0));
        JLBmodelo.setText("Model");

        JLBmodelo1.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        JLBmodelo1.setForeground(new java.awt.Color(255, 153, 0));
        JLBmodelo1.setText("Year");

        JCBmarca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar:", "Abarth", "Alfa Romeo\t", "Aston Martin\t", "Audi", "Bentley", "BMW", "Cadillac\t", "Caterham", "Chevrolet", "Citroen", "Dacia\t", "Ferrari\t", "Fiat\t", "Ford\t", "Honda", "Infiniti", "Isuzu\t", "Iveco\t", "Jaguar\t", "Jeep", "Kia\t", "KTM\t", "Lada\t", "Lamborghini\t", "Lancia", "Land Rover\t", "Lexus\t", "Lotus\t", "Maserati\t", "Mazda", "Mercedes-Benz\t", "Mini\t", "Mitsubishi\t", "Morgan", "Nissan", "Opel\t", "Peugeot\t", "Piaggio\t", "Porsche", "Renault", "Rolls-Royce\t", "Seat\t", "Skoda\t", "Smart\t", "SsangYong", "Subaru\t", "Suzuki\t", "Tata\t", "Tesla\t", "Toyota", "Volkswagen\t", "Volvo" }));
        JCBmarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCBmarcaActionPerformed(evt);
            }
        });

        JCBaño.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar:", "2019", "2018", "2017", "2016", "2015", "2014", "2013", "2012", "2011", "2010", "2009", "2008", "2007", "2006", "2005", "2004", "2003", "2002", "2001", "2000", "1999", "1998", "1997", "1996", "1995", "1994", "1993", "1992", "1991", "1990", "1989", "1988", "1987", "1986", "1985", "1984", "1983", "1982", "1981", "1980", "1979", "1978", "1977", "1976", "1975", "1974", "1973", "1972", "1971", "1970", "1969", "1968", "1967", "1966", "1965", "1964", "1963", "1962", "1961", "1960", "1959", "1958", "1957", "1956", "1955", "1954", "1953", "1952", "1951", "1950" }));

        JBagregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Agregar.png"))); // NOI18N
        JBagregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBagregarActionPerformed(evt);
            }
        });

        JTvehiculos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(JTvehiculos);

        JBeliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Eliminar.png"))); // NOI18N
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

        JBReservaPlan.setText("Reserva plan");
        JBReservaPlan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JBReservaPlanMouseClicked(evt);
            }
        });

        JLBplaca.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        JLBplaca.setForeground(new java.awt.Color(255, 153, 0));
        JLBplaca.setText("License Plate");

        jBtnGuardar.setText("Guardar");
        jBtnGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBtnGuardarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(JLBInicio))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(JLBmodelo)
                                    .addComponent(JLBmodelo1)
                                    .addComponent(JLBplaca))
                                .addGap(50, 50, 50)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(JCBmarca, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(189, 189, 189))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(JCBaño, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(JTFmodelo, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(JTFplaca, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(207, 207, 207))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(JLBmarca)
                                .addGap(60, 60, 60)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(JBeliminart, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(JBagregar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JBeliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBtnGuardar)
                        .addGap(60, 60, 60)
                        .addComponent(JBReservaPlan)
                        .addGap(64, 64, 64)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JLBInicio)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(212, 212, 212)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JLBplaca)
                            .addComponent(JTFplaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JLBmarca)
                            .addComponent(JCBmarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JBagregar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(JLBmodelo)
                                .addComponent(JTFmodelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(JBeliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(46, 46, 46)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(JBeliminart, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(JLBmodelo1)
                        .addComponent(JCBaño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jBtnGuardar)
                        .addComponent(JBReservaPlan)))
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JLBInicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JLBInicioMouseClicked
        // TODO add your handling code here:
       PantallaPrincipalEn d = new PantallaPrincipalEn();
       d.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_JLBInicioMouseClicked

    private void JBagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBagregarActionPerformed
       
        String [] agregar = new String[4];
        agregar[0] = (String)JCBmarca.getSelectedItem();
        agregar[1] = JTFmodelo.getText();
        agregar[2] = JTFplaca.getText();
        agregar[3] = (String)JCBaño.getSelectedItem();
        misvehiculos.addRow(agregar);
        
    }//GEN-LAST:event_JBagregarActionPerformed

    private void JCBmarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCBmarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JCBmarcaActionPerformed

    private void JBeliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBeliminarActionPerformed
        
        int elim = JTvehiculos.getSelectedRowCount();
        if (elim >0){
            misvehiculos.removeRow(elim);
        }else{
            JOptionPane.showMessageDialog(null, "No data to eliminate ");
        }
        
    }//GEN-LAST:event_JBeliminarActionPerformed

    private void JBeliminartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBeliminartActionPerformed
       int elimtotal = JTvehiculos.getRowCount();
        for(int i=elimtotal-1; i >= 0; i--){
        misvehiculos.removeRow(i);
    }
        
        
    }//GEN-LAST:event_JBeliminartActionPerformed

    private void JBReservaPlanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBReservaPlanMouseClicked
        // TODO add your handling code here:
        ReservaPlanEn d = new ReservaPlanEn();
        d.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_JBReservaPlanMouseClicked

    private void jBtnGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnGuardarMouseClicked
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Save Correctly");
    }//GEN-LAST:event_jBtnGuardarMouseClicked

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
            java.util.logging.Logger.getLogger(MisVehiculosEn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MisVehiculosEn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MisVehiculosEn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MisVehiculosEn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MisVehiculosEn().setVisible(true);
            }
        });
        
        
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBReservaPlan;
    private javax.swing.JButton JBagregar;
    private javax.swing.JButton JBeliminar;
    private javax.swing.JButton JBeliminart;
    private javax.swing.JComboBox<String> JCBaño;
    private javax.swing.JComboBox<String> JCBmarca;
    private javax.swing.JLabel JLBInicio;
    private javax.swing.JLabel JLBmarca;
    private javax.swing.JLabel JLBmodelo;
    private javax.swing.JLabel JLBmodelo1;
    private javax.swing.JLabel JLBplaca;
    private javax.swing.JTextField JTFmodelo;
    private javax.swing.JTextField JTFplaca;
    private javax.swing.JTable JTvehiculos;
    private javax.swing.JButton jBtnGuardar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
