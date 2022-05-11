/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package prolab3_banking_project.view;

import prolab3_banking_project.session.CustomerSession;

/**
 *
 * @author Ali Erkin
 */
public class TemsilciAnaMenu extends javax.swing.JFrame {

    /**
     * Creates new form TemsilciAnaMenu
     */
    public TemsilciAnaMenu() {
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

        bilgiGuncelle = new javax.swing.JButton();
        musteriEkle = new javax.swing.JButton();
        musteriSil = new javax.swing.JButton();
        musteriIslemGoruntule = new javax.swing.JButton();
        musteriTalepGoruntule = new javax.swing.JButton();
        MusteriGenelDurumGoruntule = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bilgiGuncelle.setText("Bilgi Güncelle");
        bilgiGuncelle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bilgiGuncelleActionPerformed(evt);
            }
        });

        musteriEkle.setText("Müşteri Ekle");
        musteriEkle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                musteriEkleActionPerformed(evt);
            }
        });

        musteriSil.setText("Müşteri Sil");

        musteriIslemGoruntule.setText("Müşteri İşlemlerini Görüntüle");

        musteriTalepGoruntule.setText("Müşteri Taleplerini Görüntüle");

        MusteriGenelDurumGoruntule.setText("Müşteri Genel Durum Görüntüle");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(103, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(MusteriGenelDurumGoruntule)
                    .addComponent(musteriEkle, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bilgiGuncelle, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(musteriSil, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(musteriIslemGoruntule, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(musteriTalepGoruntule, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(98, 98, 98))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(bilgiGuncelle)
                .addGap(18, 18, 18)
                .addComponent(musteriEkle)
                .addGap(18, 18, 18)
                .addComponent(musteriSil)
                .addGap(18, 18, 18)
                .addComponent(musteriIslemGoruntule)
                .addGap(18, 18, 18)
                .addComponent(musteriTalepGoruntule)
                .addGap(18, 18, 18)
                .addComponent(MusteriGenelDurumGoruntule)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void musteriEkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_musteriEkleActionPerformed
        this.setVisible(false);
        new TemsilciMusteriEkle().setVisible(true);
        //CustomerSession.getParentFrame().add(this);
        
        
    }//GEN-LAST:event_musteriEkleActionPerformed

    private void bilgiGuncelleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bilgiGuncelleActionPerformed
          
    }//GEN-LAST:event_bilgiGuncelleActionPerformed

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
            java.util.logging.Logger.getLogger(TemsilciAnaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TemsilciAnaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TemsilciAnaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TemsilciAnaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TemsilciAnaMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton MusteriGenelDurumGoruntule;
    private javax.swing.JButton bilgiGuncelle;
    private javax.swing.JButton musteriEkle;
    private javax.swing.JButton musteriIslemGoruntule;
    private javax.swing.JButton musteriSil;
    private javax.swing.JButton musteriTalepGoruntule;
    // End of variables declaration//GEN-END:variables
}
