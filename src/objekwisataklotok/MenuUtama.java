/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objekwisataklotok;

import javax.swing.JOptionPane;

/**
 *
 * @author ACER
 */
public class MenuUtama extends javax.swing.JFrame {

    /**
     * Creates new form MenuUtama
     */
    public MenuUtama() {
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

        jPanel1 = new javax.swing.JPanel();
        menuLB = new javax.swing.JLabel();
        pembelianBTN = new javax.swing.JButton();
        datakelotokBTN = new javax.swing.JButton();
        datapembelianBTN = new javax.swing.JButton();
        logoutBTN = new javax.swing.JButton();
        tema2LB = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menuLB.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        menuLB.setForeground(new java.awt.Color(255, 255, 255));
        menuLB.setText("MENU UTAMA");
        jPanel1.add(menuLB, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, -1, -1));

        pembelianBTN.setText("Pembelian Tiket");
        pembelianBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pembelianBTNActionPerformed(evt);
            }
        });
        jPanel1.add(pembelianBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 330, 60));

        datakelotokBTN.setText("Data Kelotok");
        datakelotokBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                datakelotokBTNActionPerformed(evt);
            }
        });
        jPanel1.add(datakelotokBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, 160, 60));

        datapembelianBTN.setText("Data Pembelian");
        datapembelianBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                datapembelianBTNActionPerformed(evt);
            }
        });
        jPanel1.add(datapembelianBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 160, 60));

        logoutBTN.setText("Logout");
        logoutBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBTNActionPerformed(evt);
            }
        });
        jPanel1.add(logoutBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 350, -1));

        tema2LB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/objekwisataklotok/tema2.jpg"))); // NOI18N
        jPanel1.add(tema2LB, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 390, 200));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 485, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 297, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoutBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBTNActionPerformed
        // TODO add your handling code here:
            int result = JOptionPane.showConfirmDialog(null, "Apakah Anda Yakin", "Confirmation", JOptionPane.YES_NO_OPTION);
            if (result == JOptionPane.YES_OPTION) {
            new login().setVisible(true);
            dispose();
            } else {
    }//GEN-LAST:event_logoutBTNActionPerformed
  }
    private void pembelianBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pembelianBTNActionPerformed
        // TODO add your handling code here:
        new PembelianTiket().setVisible(true);
        dispose();
    }//GEN-LAST:event_pembelianBTNActionPerformed

    private void datakelotokBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_datakelotokBTNActionPerformed
        // TODO add your handling code here:
        new DataKelotok().setVisible(true);
         dispose();
    }//GEN-LAST:event_datakelotokBTNActionPerformed

    private void datapembelianBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_datapembelianBTNActionPerformed
        // TODO add your handling code here:
        new DataPembelian().setVisible(true);
            dispose();
    }//GEN-LAST:event_datapembelianBTNActionPerformed
 
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuUtama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton datakelotokBTN;
    private javax.swing.JButton datapembelianBTN;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton logoutBTN;
    private javax.swing.JLabel menuLB;
    private javax.swing.JButton pembelianBTN;
    private javax.swing.JLabel tema2LB;
    // End of variables declaration//GEN-END:variables
}
