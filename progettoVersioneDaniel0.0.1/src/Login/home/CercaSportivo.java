
package Login.home;

public class CercaSportivo extends javax.swing.JFrame {
    
    ControllerSportivo cSport2;
    
    public CercaSportivo(ControllerSportivo theControllerSportivo) {
        cSport2=theControllerSportivo;
        this.setLocationRelativeTo(null);
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        codiceFiscaleJL = new javax.swing.JLabel();
        inputCodiceFiscaleJTF = new javax.swing.JTextField();
        cercaJB = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        visualizzazioneDatiSportiviJT = new javax.swing.JTable();
        annullaJB = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        codiceFiscaleJL.setText("CODICE FISCALE");

        cercaJB.setText("CERCA");
        cercaJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cercaJBActionPerformed(evt);
            }
        });

        visualizzazioneDatiSportiviJT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "CF", "NOME", "COGNOME", "SESSO", "DATA DI NASCITA", "IBAN", "SPORT", "E-MAIL"
            }
        ));
        jScrollPane1.setViewportView(visualizzazioneDatiSportiviJT);

        annullaJB.setText("ANNULLA");
        annullaJB.setToolTipText("");
        annullaJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                annullaJBActionPerformed(evt);
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
                        .addComponent(codiceFiscaleJL)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(inputCodiceFiscaleJTF, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cercaJB))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(annullaJB))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(codiceFiscaleJL)
                    .addComponent(inputCodiceFiscaleJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cercaJB))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(annullaJB)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cercaJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cercaJBActionPerformed
       
    }//GEN-LAST:event_cercaJBActionPerformed

    private void annullaJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_annullaJBActionPerformed
        cSport2.tornaIndietroDafCercaSportivo();
    }//GEN-LAST:event_annullaJBActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton annullaJB;
    private javax.swing.JButton cercaJB;
    private javax.swing.JLabel codiceFiscaleJL;
    private javax.swing.JTextField inputCodiceFiscaleJTF;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable visualizzazioneDatiSportiviJT;
    // End of variables declaration//GEN-END:variables
}
