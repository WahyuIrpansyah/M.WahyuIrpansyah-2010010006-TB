/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objekwisataklotok;

import db.Koneksi;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.HashMap;
import java.util.Map;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;





public class DataPembelian extends javax.swing.JFrame {
private Connection con;
    /**
     * Creates new form DataPembelian
     */
    public DataPembelian() {
        initComponents();
        tampilan(); 
    }

    public final Connection conn = new Koneksi().getConnection();
    Statement st;
    ResultSet rs;
    PreparedStatement pst;
    DefaultTableModel tabMode;

    public void tampilan(){
        Object [] baris = {"Nama", "Jumlah Penumpang", "Harga Tiket", "Total"};
        tabMode = new DefaultTableModel(null, baris);
        pembelianTB.setModel(tabMode);
        try {
                String sql = "SELECT * FROM tb_pembelian";
                st = conn.createStatement();
                rs = st.executeQuery(sql);
                
                while (rs.next()){
                        String nm = rs.getString("nama");
                        String jp = rs.getString("jumlah_penumpang");
                        String ht = rs.getString("harga_tiket");
                        String tl = rs.getString("total");

                        Object [] data = {nm,jp,ht,tl};
                        tabMode.addRow(data);
                }
        } catch (Exception e){
                System.out.println(e.toString());
        }
    }
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        pembelianTB = new javax.swing.JTable();
        editBTN = new javax.swing.JButton();
        hapusBTN = new javax.swing.JButton();
        cetakBTN = new javax.swing.JButton();
        KembaliBTN = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        namaTF = new javax.swing.JTextField();
        jumlahTF = new javax.swing.JTextField();
        hargaTF = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        totalTF = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 255, 204));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("DATA PEMBELIAN");

        pembelianTB.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nama", "Jumlah Penumpang", "Harga Tiket", "Total"
            }
        ));
        pembelianTB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pembelianTBMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(pembelianTB);
        if (pembelianTB.getColumnModel().getColumnCount() > 0) {
            pembelianTB.getColumnModel().getColumn(0).setHeaderValue("Nama");
            pembelianTB.getColumnModel().getColumn(1).setHeaderValue("Jumlah Penumpang");
            pembelianTB.getColumnModel().getColumn(2).setResizable(false);
            pembelianTB.getColumnModel().getColumn(2).setHeaderValue("Harga Tiket");
            pembelianTB.getColumnModel().getColumn(3).setHeaderValue("Total");
        }

        editBTN.setText("Edit Data");
        editBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBTNActionPerformed(evt);
            }
        });

        hapusBTN.setText("Hapus Data");
        hapusBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusBTNActionPerformed(evt);
            }
        });

        cetakBTN.setText("Cetak Laporan");
        cetakBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cetakBTNActionPerformed(evt);
            }
        });

        KembaliBTN.setText("Kembali");
        KembaliBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KembaliBTNActionPerformed(evt);
            }
        });

        jLabel2.setText("Nama");

        jLabel3.setText("Jumlah Penumpang");

        jLabel4.setText("Total");

        jLabel5.setText("Harga Tiket");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(109, 109, 109))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(namaTF, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jumlahTF, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(hargaTF, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(totalTF, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(editBTN, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(hapusBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cetakBTN)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(KembaliBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(namaTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jumlahTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(hargaTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(totalTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editBTN)
                    .addComponent(hapusBTN)
                    .addComponent(cetakBTN)
                    .addComponent(KembaliBTN))
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void KembaliBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KembaliBTNActionPerformed
        // TODO add your handling code here:
        new MenuUtama().setVisible(true);
        dispose();
    }//GEN-LAST:event_KembaliBTNActionPerformed

    private void hapusBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusBTNActionPerformed
        // TODO add your handling code here:
        try {
            int hapus;
            
            String sql = "DELETE FROM tb_pembelian WHERE nama = '"+namaTF.getText()+"' ";
            st = conn.createStatement();
            hapus = st.executeUpdate(sql);

            if (hapus == 1){
             int ok = JOptionPane.showConfirmDialog(null,"Hapus..?","Konfirmasi Dialog",JOptionPane.YES_NO_OPTION);
             JOptionPane.showMessageDialog(null, "Sukses");
            }
        } catch (Exception e){
             System.out.println(e.toString());
        }    
    }//GEN-LAST:event_hapusBTNActionPerformed

    private void pembelianTBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pembelianTBMouseClicked
        // TODO add your handling code here:
        int tabel = pembelianTB.getSelectedRow();
        namaTF.setText(pembelianTB.getValueAt (tabel, 0).toString());
        jumlahTF.setText(pembelianTB.getValueAt (tabel, 1).toString());
        hargaTF.setText(pembelianTB.getValueAt (tabel, 2).toString());
        totalTF.setText(pembelianTB.getValueAt (tabel, 3).toString());
    }//GEN-LAST:event_pembelianTBMouseClicked

    private void cetakBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cetakBTNActionPerformed
        // TODO add your handling code here:
        JasperReport jr;
        JasperPrint  jp;
        Map<String, Object> kode = new HashMap<String, Object>();
        JasperDesign jd;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tb_objekwisataklotok","root","");
            File report =new File("src\\Laporan\\RptDataPembelian.jrxml");
            jd=JRXmlLoader.load(report);
            kode.clear();
            jr=JasperCompileManager.compileReport(jd);
            jp=JasperFillManager.fillReport(jr, kode, con);
            JasperViewer.viewReport(jp, false);
        }catch (Exception e){
        JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_cetakBTNActionPerformed

    private void editBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBTNActionPerformed
        // TODO add your handling code here:
          try {
            int ubah;

            String sql = "UPDATE tb_pembelian SET jumlah_penumpang = '"+ jumlahTF.getText() +"',harga_tiket = '"+hargaTF.getText()+"',total = '"+totalTF.getText()+"' WHERE nama = '"+ namaTF.getText() +"' ";
            st = conn.createStatement();
            ubah = st.executeUpdate(sql);

            if (ubah == 1){
             int ok = JOptionPane.showConfirmDialog(null,"apakah ada yakin..?","Konfirmasi Dialog",JOptionPane.YES_NO_OPTION);
             JOptionPane.showMessageDialog(null, "Sukses");
            }
        } catch (Exception e){
             System.out.println(e.toString());
        } 
    }//GEN-LAST:event_editBTNActionPerformed

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
            java.util.logging.Logger.getLogger(DataPembelian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DataPembelian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DataPembelian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DataPembelian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DataPembelian().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton KembaliBTN;
    private javax.swing.JButton cetakBTN;
    private javax.swing.JButton editBTN;
    private javax.swing.JButton hapusBTN;
    private javax.swing.JTextField hargaTF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jumlahTF;
    private javax.swing.JTextField namaTF;
    private javax.swing.JTable pembelianTB;
    private javax.swing.JTextField totalTF;
    // End of variables declaration//GEN-END:variables
}
