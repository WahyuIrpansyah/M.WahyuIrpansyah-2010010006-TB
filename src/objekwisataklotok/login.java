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
public class login extends javax.swing.JFrame {

    /**
     * Creates new form login
     */
    public login() {
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
        usernameLB = new javax.swing.JLabel();
        passwordLB = new javax.swing.JLabel();
        usernameTF = new javax.swing.JTextField();
        passwordTF = new javax.swing.JTextField();
        loginBTN = new javax.swing.JButton();
        KembaliBT = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        temaLB = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("M. Wahyu Irpansyah"));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        usernameLB.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        usernameLB.setForeground(new java.awt.Color(255, 255, 255));
        usernameLB.setText("Username");
        jPanel1.add(usernameLB, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 83, 60, -1));

        passwordLB.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        passwordLB.setForeground(new java.awt.Color(255, 255, 255));
        passwordLB.setText("Password");
        jPanel1.add(passwordLB, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 120, 60, -1));
        jPanel1.add(usernameTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 229, -1));
        jPanel1.add(passwordTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 230, -1));

        loginBTN.setText("Login");
        loginBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBTNActionPerformed(evt);
            }
        });
        jPanel1.add(loginBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 120, -1));

        KembaliBT.setText("Kembali");
        KembaliBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KembaliBTActionPerformed(evt);
            }
        });
        jPanel1.add(KembaliBT, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, 126, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 102));
        jLabel1.setText("WELCOME");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 110, 30));

        temaLB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/objekwisataklotok/tema1.jpg"))); // NOI18N
        temaLB.setText("jLabel1");
        jPanel1.add(temaLB, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 310));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 8, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBTNActionPerformed
        // TODO add your handling code here:
          if((usernameTF.getText().equals("M.Wahyu Irpansyah")) &&
            (String.valueOf(passwordTF.getText()).equals("Wahyu123"))){
        new MenuUtama().setVisible(true);
        dispose();
        }else{
            JOptionPane.showMessageDialog(
                null,
                   usernameTF.getText() +
                   ", password anda salah",
                   "Pesan Kesalahan",
                   JOptionPane.ERROR_MESSAGE);
            usernameTF.setText("");
            passwordTF.setText("");
            usernameTF.requestFocus();
        }                         
    }//GEN-LAST:event_loginBTNActionPerformed

    private void KembaliBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KembaliBTActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_KembaliBTActionPerformed

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton KembaliBT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton loginBTN;
    private javax.swing.JLabel passwordLB;
    private javax.swing.JTextField passwordTF;
    private javax.swing.JLabel temaLB;
    private javax.swing.JLabel usernameLB;
    private javax.swing.JTextField usernameTF;
    // End of variables declaration//GEN-END:variables
}
