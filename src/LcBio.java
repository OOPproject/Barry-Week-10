

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author barry
 */
public class LcBio extends javax.swing.JFrame {

    /**
     * Creates new form BiologyHigher
     */
    public LcBio() {
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

        Title = new javax.swing.JLabel();
        btnMD = new javax.swing.JButton();
        btnMS = new javax.swing.JButton();
        btnQuiz = new javax.swing.JButton();
        btnExp = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Title.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        Title.setText("Leaving Cert Biology");

        btnMD.setFont(new java.awt.Font("Georgia", 0, 11)); // NOI18N
        btnMD.setText("Module Description");
        btnMD.setPreferredSize(new java.awt.Dimension(140, 40));
        btnMD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMDActionPerformed(evt);
            }
        });

        btnMS.setFont(new java.awt.Font("Georgia", 0, 11)); // NOI18N
        btnMS.setText("Marking Scheme");
        btnMS.setPreferredSize(new java.awt.Dimension(140, 40));
        btnMS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMSActionPerformed(evt);
            }
        });

        btnQuiz.setFont(new java.awt.Font("Georgia", 0, 11)); // NOI18N
        btnQuiz.setText("Quiz");
        btnQuiz.setPreferredSize(new java.awt.Dimension(140, 40));
        btnQuiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuizActionPerformed(evt);
            }
        });

        btnExp.setFont(new java.awt.Font("Georgia", 0, 11)); // NOI18N
        btnExp.setText("Experiments");
        btnExp.setPreferredSize(new java.awt.Dimension(140, 40));
        btnExp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExpActionPerformed(evt);
            }
        });

        jButton1.setText("<- Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnMD, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Title)
                            .addComponent(btnMS, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnQuiz, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnExp, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1)))
                .addContainerGap(83, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(Title)
                .addGap(18, 18, 18)
                .addComponent(btnMD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btnMS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(btnQuiz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(btnExp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(44, 44, 44))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMSActionPerformed
        // TODO add your handling code here:
        dispose();
        dispose();
        new BioMarkingSchemeGUI().setVisible(true);
    }//GEN-LAST:event_btnMSActionPerformed

    private void btnMDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMDActionPerformed
        // TODO add your handling code here:
        dispose();
        new BioModuleDescriptionGUI ().setVisible(true);
    }//GEN-LAST:event_btnMDActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        dispose();
        new GUI ().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnQuizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuizActionPerformed
        // TODO add your handling code here:
        dispose();
         new BioQuizGUI ().setVisible(true);
    }//GEN-LAST:event_btnQuizActionPerformed

    private void btnExpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExpActionPerformed
        // TODO add your handling code here:
        dispose();
         new BioExperimentGUI ().setVisible(true);
    }//GEN-LAST:event_btnExpActionPerformed

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
            java.util.logging.Logger.getLogger(LcBio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LcBio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LcBio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LcBio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new LcBio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Title;
    private javax.swing.JButton btnExp;
    private javax.swing.JButton btnMD;
    private javax.swing.JButton btnMS;
    private javax.swing.JButton btnQuiz;
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}