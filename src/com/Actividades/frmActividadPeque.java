/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Actividades;



import com.Edades.frmEdades;
import javax.swing.JButton;

/**
 *
 * @author user
 */
public class frmActividadPeque extends javax.swing.JFrame {

    /**
     * Creates new form frmActividadPeque
     */
    public frmActividadPeque() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    public JButton getBtnA1() {
        return btnA1;
    }

    public void setBtnA1(JButton btnA1) {
        this.btnA1 = btnA1;
    }

    public JButton getBtnA2() {
        return btnA2;
    }

    public void setBtnA2(JButton btnA2) {
        this.btnA2 = btnA2;
    }

    public JButton getBtnEdad() {
        return BtnEdad;
    }

    public JButton getBtnA3() {
        return btnA3;
    }

    public JButton getBtnA4() {
        return btnA4;
    }
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jPanel1 = new javax.swing.JPanel();
        btnA1 = new javax.swing.JButton();
        btnA2 = new javax.swing.JButton();
        btnA3 = new javax.swing.JButton();
        btnA4 = new javax.swing.JButton();
        BtnEdad = new javax.swing.JButton();

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Topics");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        btnA1.setBackground(new java.awt.Color(255, 51, 0));
        btnA1.setFont(new java.awt.Font("Segoe Print", 0, 40)); // NOI18N
        btnA1.setText("Pronouns");
        btnA1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnA1MouseClicked(evt);
            }
        });

        btnA2.setBackground(new java.awt.Color(102, 204, 255));
        btnA2.setFont(new java.awt.Font("Segoe Print", 0, 40)); // NOI18N
        btnA2.setText("Prepositions");
        btnA2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnA2MouseClicked(evt);
            }
        });

        btnA3.setBackground(new java.awt.Color(0, 255, 51));
        btnA3.setFont(new java.awt.Font("Segoe Print", 0, 40)); // NOI18N
        btnA3.setText("Adjectives");
        btnA3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnA3MouseClicked(evt);
            }
        });

        btnA4.setBackground(new java.awt.Color(204, 0, 204));
        btnA4.setFont(new java.awt.Font("Segoe Print", 0, 40)); // NOI18N
        btnA4.setText("Cardinal Numbers");
        btnA4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnA4MouseClicked(evt);
            }
        });
        btnA4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnA4ActionPerformed(evt);
            }
        });

        BtnEdad.setText("<--   Escoger Otra Dificultad");
        BtnEdad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnEdadMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnA4, javax.swing.GroupLayout.PREFERRED_SIZE, 625, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnA3, javax.swing.GroupLayout.PREFERRED_SIZE, 625, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnA2, javax.swing.GroupLayout.PREFERRED_SIZE, 625, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnA1, javax.swing.GroupLayout.PREFERRED_SIZE, 625, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(46, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(BtnEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(btnA1)
                .addGap(30, 30, 30)
                .addComponent(btnA2)
                .addGap(32, 32, 32)
                .addComponent(btnA3)
                .addGap(30, 30, 30)
                .addComponent(btnA4, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(BtnEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void btnA4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnA4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnA4ActionPerformed

    private void BtnEdadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnEdadMouseClicked
        
    }//GEN-LAST:event_BtnEdadMouseClicked

    private void btnA1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnA1MouseClicked
//       
    }//GEN-LAST:event_btnA1MouseClicked

    private void btnA2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnA2MouseClicked
//      
    }//GEN-LAST:event_btnA2MouseClicked

    private void btnA3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnA3MouseClicked
//       
    }//GEN-LAST:event_btnA3MouseClicked

    private void btnA4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnA4MouseClicked
//       
    }//GEN-LAST:event_btnA4MouseClicked

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
            java.util.logging.Logger.getLogger(frmActividadPeque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmActividadPeque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmActividadPeque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmActividadPeque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmActividadPeque().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnEdad;
    private javax.swing.JButton btnA1;
    private javax.swing.JButton btnA2;
    private javax.swing.JButton btnA3;
    private javax.swing.JButton btnA4;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}