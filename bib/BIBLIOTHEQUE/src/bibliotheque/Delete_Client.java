/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package bibliotheque;

import javax.swing.JOptionPane;

/**
 *
 * @author Myriam
 */
public class Delete_Client extends javax.swing.JFrame {

    /**
     * Creates new form Delete_Client
     */
    Employee emp;
    public Delete_Client() {
        initComponents();
    }

     public Delete_Client(Employee emp) {
        initComponents();
        this.emp=emp;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel25 = new javax.swing.JPanel();
        jPanel26 = new javax.swing.JPanel();
        jPanel27 = new javax.swing.JPanel();
        jPanel28 = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        supprimer_btn = new javax.swing.JButton();
        quit_btn4 = new javax.swing.JButton();
        jLabel38 = new javax.swing.JLabel();
        cin = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        quit_btn5 = new javax.swing.JButton();
        home = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel25.setBackground(new java.awt.Color(130, 0, 60));

        jPanel26.setBackground(new java.awt.Color(255, 245, 245));

        jPanel27.setBackground(new java.awt.Color(102, 0, 51));

        jPanel28.setBackground(new java.awt.Color(255, 245, 245));

        jLabel37.setFont(new java.awt.Font("Trebuchet MS", 3, 48)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(130, 0, 60));
        jLabel37.setText("Supprimer");

        supprimer_btn.setBackground(new java.awt.Color(130, 0, 60));
        supprimer_btn.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        supprimer_btn.setForeground(new java.awt.Color(255, 255, 255));
        supprimer_btn.setText("Supprimer");
        supprimer_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supprimer_btnActionPerformed(evt);
            }
        });

        quit_btn4.setBackground(new java.awt.Color(130, 0, 60));
        quit_btn4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        quit_btn4.setForeground(new java.awt.Color(255, 255, 255));
        quit_btn4.setText("QUIT");
        quit_btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quit_btn4ActionPerformed(evt);
            }
        });

        jLabel38.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(130, 0, 60));
        jLabel38.setText("Cin");

        cin.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cinFocusLost(evt);
            }
        });

        jLabel39.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(130, 0, 60));
        jLabel39.setText("ADMIN department");

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel28Layout.createSequentialGroup()
                .addContainerGap(131, Short.MAX_VALUE)
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel28Layout.createSequentialGroup()
                        .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(quit_btn4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel39, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel28Layout.createSequentialGroup()
                        .addComponent(jLabel37)
                        .addGap(98, 98, 98))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel28Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel28Layout.createSequentialGroup()
                        .addComponent(jLabel38)
                        .addGap(18, 18, 18)
                        .addComponent(cin, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(118, 118, 118))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel28Layout.createSequentialGroup()
                        .addComponent(supprimer_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(143, 143, 143))))
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel39)
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel28Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel37))
                    .addGroup(jPanel28Layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cin, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel38))))
                .addGap(18, 18, 18)
                .addComponent(supprimer_btn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(quit_btn4)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel27Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bibliotheque/Capture d'écran 2024-03-04 230632.png"))); // NOI18N
        jLabel43.setText("jLabel4");

        quit_btn5.setBackground(new java.awt.Color(130, 0, 60));
        quit_btn5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        quit_btn5.setForeground(new java.awt.Color(255, 255, 255));
        quit_btn5.setText("Deconnecter");
        quit_btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quit_btn5ActionPerformed(evt);
            }
        });

        home.setBackground(new java.awt.Color(130, 0, 60));
        home.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        home.setForeground(new java.awt.Color(255, 255, 255));
        home.setText("Home");
        home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel25Layout.createSequentialGroup()
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(quit_btn5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 134, Short.MAX_VALUE)
                        .addComponent(home, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
                .addComponent(jPanel26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(quit_btn5)
                    .addComponent(home))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void supprimer_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supprimer_btnActionPerformed
        // TODO add your handling code here:
        Gestion_Employee gest=new Gestion_Employee();
        gest.suprimer_client(Integer.parseInt(cin.getText()));
        JOptionPane.showMessageDialog(null, "Done.. le client "+cin.getText()+" est supprimé avec succées");
    }//GEN-LAST:event_supprimer_btnActionPerformed

    private void quit_btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quit_btn4ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_quit_btn4ActionPerformed

    private void cinFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cinFocusLost
        // TODO add your handling code here:
        Control_Saisie cntrl=new Control_Saisie();

        if (!cntrl.verif_Number(cin.getText()) || cin.getText().length() != 8) {
            JOptionPane.showMessageDialog(null, "Veuillez vérifier votre CIN svp :/");
        }
    }//GEN-LAST:event_cinFocusLost

    private void quit_btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quit_btn5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quit_btn5ActionPerformed

    private void homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeActionPerformed
        // TODO add your handling code here:
        this.dispose();

        new Administration_home(emp).setVisible(true);
    }//GEN-LAST:event_homeActionPerformed

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
            java.util.logging.Logger.getLogger(Delete_Client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Delete_Client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Delete_Client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Delete_Client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Delete_Client().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cin;
    private javax.swing.JButton home;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JButton quit_btn4;
    private javax.swing.JButton quit_btn5;
    private javax.swing.JButton supprimer_btn;
    // End of variables declaration//GEN-END:variables
}