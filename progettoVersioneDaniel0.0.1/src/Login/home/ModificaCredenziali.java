
package Login.home;


public class ModificaCredenziali extends javax.swing.JFrame {

    Controller c8;
    
    public ModificaCredenziali(Controller theController) {
        initComponents();
        this.setLocationRelativeTo(null);
        c8=theController;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        codiceIdJL = new javax.swing.JLabel();
        prendiCodiceIdJTF = new javax.swing.JTextField();
        cercaBtnJB = new javax.swing.JButton();
        pswdJL = new javax.swing.JLabel();
        usenameJL = new javax.swing.JLabel();
        credenzialiProcuratoreJL = new javax.swing.JLabel();
        visualizzaPswdJTF = new javax.swing.JTextField();
        visualizzaUsernameJTF = new javax.swing.JTextField();
        inserimentoNuoviDatiJL = new javax.swing.JLabel();
        nuovaPswdJL = new javax.swing.JLabel();
        inputNuovaPswdJTF = new javax.swing.JTextField();
        aggiornaBtnJB = new javax.swing.JButton();
        annullaButtonJB = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        codiceIdJL.setText("CODICE ID");

        cercaBtnJB.setText("CERCA");
        cercaBtnJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cercaBtnJBActionPerformed(evt);
            }
        });

        pswdJL.setText("PASSWORD");

        usenameJL.setText("USERNAME");

        credenzialiProcuratoreJL.setText("CREDENZIALI PROCURATORE");

        visualizzaUsernameJTF.setToolTipText("");

        inserimentoNuoviDatiJL.setText("INSERISCI LA NUOVA PASSWORD");

        nuovaPswdJL.setText("NUOVA PASSWORD");

        aggiornaBtnJB.setText("AGGIORNA");
        aggiornaBtnJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aggiornaBtnJBActionPerformed(evt);
            }
        });

        annullaButtonJB.setText("ANNULLA");
        annullaButtonJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                annullaButtonJBActionPerformed(evt);
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
                        .addComponent(codiceIdJL)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(prendiCodiceIdJTF, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cercaBtnJB))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(usenameJL)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(visualizzaUsernameJTF))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(pswdJL)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(visualizzaPswdJTF, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(credenzialiProcuratoreJL))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(inserimentoNuoviDatiJL))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(nuovaPswdJL)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(inputNuovaPswdJTF, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(aggiornaBtnJB))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(annullaButtonJB)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(codiceIdJL)
                    .addComponent(prendiCodiceIdJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cercaBtnJB))
                .addGap(20, 20, 20)
                .addComponent(credenzialiProcuratoreJL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pswdJL)
                    .addComponent(visualizzaPswdJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usenameJL)
                    .addComponent(visualizzaUsernameJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(inserimentoNuoviDatiJL)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(nuovaPswdJL)
                        .addComponent(inputNuovaPswdJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(aggiornaBtnJB))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addComponent(annullaButtonJB)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cercaBtnJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cercaBtnJBActionPerformed
       String[] datiProcuratore = new String[2];
       String idCopiato = prendiCodiceIdJTF.getText();
       datiProcuratore = c8.prendiDatiProcuratorePerAggiornare(idCopiato);
       visualizzaPswdJTF.setText(datiProcuratore[1]);
       visualizzaUsernameJTF.setText(datiProcuratore[0]);
    }//GEN-LAST:event_cercaBtnJBActionPerformed

    private void aggiornaBtnJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aggiornaBtnJBActionPerformed
        String nuovaPswdCopiata = inputNuovaPswdJTF.getText();
        String idCopiato = prendiCodiceIdJTF.getText();
        
        c8.modificaPasswordProcuratore(idCopiato, nuovaPswdCopiata);
    }//GEN-LAST:event_aggiornaBtnJBActionPerformed

    private void annullaButtonJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_annullaButtonJBActionPerformed
       c8.tornaIndietroDaModificaPassword();
    }//GEN-LAST:event_annullaButtonJBActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aggiornaBtnJB;
    private javax.swing.JButton annullaButtonJB;
    private javax.swing.JButton cercaBtnJB;
    private javax.swing.JLabel codiceIdJL;
    private javax.swing.JLabel credenzialiProcuratoreJL;
    private javax.swing.JTextField inputNuovaPswdJTF;
    private javax.swing.JLabel inserimentoNuoviDatiJL;
    private javax.swing.JLabel nuovaPswdJL;
    private javax.swing.JTextField prendiCodiceIdJTF;
    private javax.swing.JLabel pswdJL;
    private javax.swing.JLabel usenameJL;
    private javax.swing.JTextField visualizzaPswdJTF;
    private javax.swing.JTextField visualizzaUsernameJTF;
    // End of variables declaration//GEN-END:variables
}
