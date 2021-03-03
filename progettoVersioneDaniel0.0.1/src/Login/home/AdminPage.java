
package Login.home;


public class AdminPage extends javax.swing.JFrame {
    
    SezioneProcuratori p1;
    Controller c2;
    ControllerSportivo c1;
    
    public AdminPage(Controller theController, ControllerSportivo theControllerSportivo) {
        initComponents();
        this.setLocationRelativeTo(null);
        c2 = theController;
        this.c1 = theControllerSportivo;
        System.out.println("C2 NELL ADMINPAGE"+c2);
        System.out.println("C1 NELL ADMINPAGE"+c1);
    }
    
     /*public AdminPage(ControllerSportivo theControllerSportivo) {
        initComponents();
        this.setLocationRelativeTo(null);
        c1 = theControllerSportivo;
         System.out.println("C1 NELL ADMINPAGE"+c1);
    }*/

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bottonForProcuratoreJB = new javax.swing.JButton();
        bottonForSportivoJB = new javax.swing.JButton();
        bottonForSponsorJB = new javax.swing.JButton();
        titoloFinestraJL = new javax.swing.JLabel();
        tornaIndietroLoginJB = new javax.swing.JButton();

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
        bottonForSportivoJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bottonForSportivoJBActionPerformed(evt);
            }
        });

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

        tornaIndietroLoginJB.setText("TORNA A LOGIN");
        tornaIndietroLoginJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tornaIndietroLoginJBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tornaIndietroLoginJB)
                        .addContainerGap(436, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(titoloFinestraJL)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bottonForProcuratoreJB)
                                .addGap(137, 137, 137)
                                .addComponent(bottonForSponsorJB)
                                .addGap(17, 17, 17)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bottonForSportivoJB))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(titoloFinestraJL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bottonForProcuratoreJB)
                    .addComponent(bottonForSportivoJB)
                    .addComponent(bottonForSponsorJB))
                .addGap(99, 99, 99)
                .addComponent(tornaIndietroLoginJB)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bottonForSponsorJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bottonForSponsorJBActionPerformed
       System.out.println("C1="+c1);
       c1.apriSezioneSportivo();
    }//GEN-LAST:event_bottonForSponsorJBActionPerformed

    private void bottonForProcuratoreJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bottonForProcuratoreJBActionPerformed
        c2.apriSezioneProcuratori();
        
    }//GEN-LAST:event_bottonForProcuratoreJBActionPerformed

    private void tornaIndietroLoginJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tornaIndietroLoginJBActionPerformed
        c2.tornaIndietroLogin();
    }//GEN-LAST:event_tornaIndietroLoginJBActionPerformed

    private void bottonForSportivoJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bottonForSportivoJBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bottonForSportivoJBActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bottonForProcuratoreJB;
    private javax.swing.JButton bottonForSponsorJB;
    private javax.swing.JButton bottonForSportivoJB;
    private javax.swing.JLabel titoloFinestraJL;
    private javax.swing.JButton tornaIndietroLoginJB;
    // End of variables declaration//GEN-END:variables
}
