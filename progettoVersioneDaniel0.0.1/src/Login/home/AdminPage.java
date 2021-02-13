/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login.home;


/**
 *
 * @author Giuseppe
 */
public class AdminPage extends javax.swing.JFrame {
    
    SezioneProcuratori p1;
    Controller c2;
    
    public AdminPage(Controller theController) {
        initComponents();
        this.setLocationRelativeTo(null);
        c2 = theController;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bottonForProcuratoreJB = new javax.swing.JButton();
        bottonForSportivoJB = new javax.swing.JButton();
        bottonForSponsorJB = new javax.swing.JButton();
        titoloFinestraJL = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bottonForProcuratoreJB.setText("PROCURATORI");
        bottonForProcuratoreJB.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        bottonForProcuratoreJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bottonForProcuratoreJBActionPerformed(evt);
            }
        });

        bottonForSportivoJB.setText("SPONSOR");
        bottonForSportivoJB.setActionCommand("");

        bottonForSponsorJB.setText("SPORTIVI");
        bottonForSponsorJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bottonForSponsorJBActionPerformed(evt);
            }
        });

        titoloFinestraJL.setFont(new java.awt.Font("Showcard Gothic", 0, 18)); // NOI18N
        titoloFinestraJL.setText("admin page");
        titoloFinestraJL.setToolTipText("");
        titoloFinestraJL.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        titoloFinestraJL.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bottonForProcuratoreJB)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(bottonForSponsorJB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 141, Short.MAX_VALUE)
                        .addComponent(bottonForSportivoJB))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(titoloFinestraJL)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(titoloFinestraJL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bottonForProcuratoreJB)
                    .addComponent(bottonForSportivoJB)
                    .addComponent(bottonForSponsorJB))
                .addGap(129, 129, 129))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bottonForSponsorJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bottonForSponsorJBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bottonForSponsorJBActionPerformed

    private void bottonForProcuratoreJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bottonForProcuratoreJBActionPerformed
        c2.apriSezioneProcuratori();
        
    }//GEN-LAST:event_bottonForProcuratoreJBActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bottonForProcuratoreJB;
    private javax.swing.JButton bottonForSponsorJB;
    private javax.swing.JButton bottonForSportivoJB;
    private javax.swing.JLabel titoloFinestraJL;
    // End of variables declaration//GEN-END:variables
}
