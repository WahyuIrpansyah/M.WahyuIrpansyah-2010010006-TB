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
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author ACER
 */
public class DataKelotok extends javax.swing.JFrame {
private Connection con;
public Statement stat;
    /**
     * Creates new form DataKelotok
     */
    public DataKelotok() {
        initComponents();
        tampilan(); 
  }

    public final Connection conn = new Koneksi().getConnection();
    Statement st;
    ResultSet rs;
    PreparedStatement pst;
    DefaultTableModel tabMode;

    public void tampilan(){
        Object [] baris = {"Kelotok", "Nama Penumpang", "Jumlah Penumpang", "Tujuan Wisata"};
        tabMode = new DefaultTableModel(null, baris);
        klotokTB.setModel(tabMode);
        try {
                String sql = "SELECT * FROM tb_klotok";
                st = conn.createStatement();
                rs = st.executeQuery(sql);
                while (rs.next()){
                        String kl = rs.getString("klotok");
                        String nm = rs.getString("nama");
                        String jp = rs.getString("jumlah_penumpang");
                        String tw = rs.getString("tujuan_wisata");

                        Object [] data = {kl,nm,jp,tw};
                        tabMode.addRow(data);
                }
        } catch (Exception e){
                System.out.println(e.toString());
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        klotokTB = new javax.swing.JTable();
        editBTN = new javax.swing.JButton();
        hapusBTN = new javax.swing.JButton();
        cetakBTN = new javax.swing.JButton();
        KembaliBTN = new javax.swing.JButton();
        namaTF = new javax.swing.JTextField();
        klotokTF = new javax.swing.JTextField();
        jumlahTF = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tujuanCB = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("DATA KELOTOK");

        klotokTB.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Kelotok", "Nama Penumpang", "Jumlah Penumpang", "Tujuan Wisata"
            }
        ));
        klotokTB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                klotokTBMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(klotokTB);

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

        jLabel5.setText("Jumlah Penumpang");

        jLabel4.setText("Tujuan Wisata");

        jLabel3.setText("Nama Penumpang");

        jLabel2.setText("Klotok");

        tujuanCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PILIH OBJEK WISATA", "Wisata Pulau Kembang", "Wisata Keliling Banjarmasin", "Wisata Kampung Hijau" }));
        tujuanCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tujuanCBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 581, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(klotokTF, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                                    .addComponent(namaTF))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jumlahTF)
                                    .addComponent(tujuanCB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(187, 187, 187))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(editBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(hapusBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cetakBTN)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(KembaliBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(54, 54, 54))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(klotokTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(namaTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jumlahTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(tujuanCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(3, 3, 3)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
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

    private void klotokTBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_klotokTBMouseClicked
        // TODO add your handling code here:
        int tabel = klotokTB.getSelectedRow();
        klotokTF.setText(klotokTB.getValueAt (tabel, 0).toString());
        namaTF.setText(klotokTB.getValueAt (tabel, 1).toString());
        jumlahTF.setText(klotokTB.getValueAt (tabel, 2).toString());
    }//GEN-LAST:event_klotokTBMouseClicked

    private void cetakBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cetakBTNActionPerformed
        // TODO add your handling code here:
         JasperReport jr;
        JasperPrint  jp;
        Map<String, Object> kode = new HashMap<String, Object>();
        JasperDesign jd;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tb_objekwisataklotok","root","");
            File report =new File("src\\Laporan\\RptDataKlotok.jrxml");
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

            String sql = "UPDATE tb_klotok SET nama = '"+ namaTF.getText() +"',jumlah_penumpang = '"+ jumlahTF.getText() +"',tujuan_wisata = '"+tujuanCB.getSelectedItem()+"' WHERE klotok = '"+ klotokTF.getText() +"' ";
            st = conn.createStatement();
            ubah = st.executeUpdate(sql);

            if (ubah == 1){
             int ok = JOptionPane.showConfirmDialog(null,"apakah anda yakin?","Konfirmasi Dialog",JOptionPane.YES_NO_OPTION);
             JOptionPane.showMessageDialog(null, "Sukses");
            }
        } catch (Exception e){
             System.out.println(e.toString());
        } 
    }//GEN-LAST:event_editBTNActionPerformed

    private void hapusBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusBTNActionPerformed
        // TODO add your handling code here:
         try {
            int hapus;
            
            String sql = "DELETE FROM tb_klotok WHERE klotok = '"+klotokTF.getText()+"' ";
            st = conn.createStatement();
            hapus = st.executeUpdate(sql);

            if (hapus == 1){
            int ok = JOptionPane.showConfirmDialog(null,"Apakah Anda Yakin?","Konfirmasi Dialog",JOptionPane.YES_NO_OPTION);
             JOptionPane.showMessageDialog(null, "Sukses");

            }
        } catch (Exception e){
             System.out.println(e.toString());
        } 
    }//GEN-LAST:event_hapusBTNActionPerformed

    private void tujuanCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tujuanCBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tujuanCBActionPerformed

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
            java.util.logging.Logger.getLogger(DataKelotok.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DataKelotok.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DataKelotok.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DataKelotok.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DataKelotok().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton KembaliBTN;
    private javax.swing.JButton cetakBTN;
    private javax.swing.JButton editBTN;
    private javax.swing.JButton hapusBTN;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jumlahTF;
    private javax.swing.JTable klotokTB;
    private javax.swing.JTextField klotokTF;
    private javax.swing.JTextField namaTF;
    private javax.swing.JComboBox<String> tujuanCB;
    // End of variables declaration//GEN-END:variables
}
