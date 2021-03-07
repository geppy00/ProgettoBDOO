
package Login.home;


public class AggiungiSportivo extends javax.swing.JFrame {
    
    ControllerSportivo cSport1;
            
    public AggiungiSportivo(ControllerSportivo theControllerSportivo ) {
        cSport1=theControllerSportivo;
        this.setLocationRelativeTo(null);
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nomeJL = new javax.swing.JLabel();
        inputNomeJTF = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        CfJL = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        dataNascitaJL = new javax.swing.JLabel();
        ibanJL = new javax.swing.JLabel();
        tipoSportJL = new javax.swing.JLabel();
        inputCognomeJTF = new javax.swing.JTextField();
        inputCfJTF = new javax.swing.JTextField();
        inputIbanJTF = new javax.swing.JTextField();
        inputSportJTF = new javax.swing.JTextField();
        sceltaSessoJCB = new javax.swing.JComboBox<>();
        mailJL = new javax.swing.JLabel();
        inputMailJTF = new javax.swing.JTextField();
        ScegliDataSportivoJDC = new com.toedter.calendar.JDateChooser();
        aggiungiJB = new javax.swing.JButton();
        tornaIndietroHB = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        nomeJL.setText("NOME");

        jLabel1.setText("COGNOME");

        CfJL.setText("CODICE FISCALE");

        jLabel3.setText("SESSO");
        jLabel3.setToolTipText("");

        jLabel4.setToolTipText("");

        dataNascitaJL.setText("DATA DI NASCITA");

        ibanJL.setText("IBAN");

        tipoSportJL.setText("TIPOLOGIA SPORT");

        sceltaSessoJCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Maschio", "Femmina", "Non Binario", "Trans" }));

        mailJL.setText("E-MAIL");

        aggiungiJB.setText("AGGIUNGI");
        aggiungiJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aggiungiJBActionPerformed(evt);
            }
        });

        tornaIndietroHB.setText("ANNULLA");
        tornaIndietroHB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tornaIndietroHBActionPerformed(evt);
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tipoSportJL)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(inputSportJTF, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(CfJL)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(inputCfJTF, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sceltaSessoJCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel4)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(dataNascitaJL)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ScegliDataSportivoJDC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ibanJL)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(inputIbanJTF, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(mailJL)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(inputMailJTF, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(nomeJL)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(inputNomeJTF))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(inputCognomeJTF, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(tornaIndietroHB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(aggiungiJB)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nomeJL)
                            .addComponent(inputNomeJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(inputCognomeJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CfJL)
                            .addComponent(inputCfJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(sceltaSessoJCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(dataNascitaJL))
                    .addComponent(ScegliDataSportivoJDC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ibanJL)
                    .addComponent(inputIbanJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tipoSportJL)
                    .addComponent(inputSportJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mailJL)
                    .addComponent(inputMailJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aggiungiJB)
                    .addComponent(tornaIndietroHB))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void aggiungiJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aggiungiJBActionPerformed
       String[] datiSportivo = new String[7];
       datiSportivo[0] = inputCfJTF.getText();
       datiSportivo[1] = inputNomeJTF.getText();
       datiSportivo[2] = inputCognomeJTF.getText();
       datiSportivo[3] = sceltaSessoJCB.getSelectedItem().toString();
       datiSportivo[4] = inputIbanJTF.getText();
       datiSportivo[5] = inputSportJTF.getText();
       datiSportivo[6] = inputMailJTF.getText();
       
       java.sql.Date dataNascitaSql = new java.sql.Date(ScegliDataSportivoJDC.getDate().getTime()); //Conversione data da java a sql per inserirla nel database
       
       cSport1.AddSportivo(datiSportivo,(java.sql.Date) dataNascitaSql);
    }//GEN-LAST:event_aggiungiJBActionPerformed

    private void tornaIndietroHBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tornaIndietroHBActionPerformed
        cSport1.tornaIndietroDaAggiungiProcuratore();
    }//GEN-LAST:event_tornaIndietroHBActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CfJL;
    private com.toedter.calendar.JDateChooser ScegliDataSportivoJDC;
    private javax.swing.JButton aggiungiJB;
    private javax.swing.JLabel dataNascitaJL;
    private javax.swing.JLabel ibanJL;
    private javax.swing.JTextField inputCfJTF;
    private javax.swing.JTextField inputCognomeJTF;
    private javax.swing.JTextField inputIbanJTF;
    private javax.swing.JTextField inputMailJTF;
    private javax.swing.JTextField inputNomeJTF;
    private javax.swing.JTextField inputSportJTF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel mailJL;
    private javax.swing.JLabel nomeJL;
    private javax.swing.JComboBox<String> sceltaSessoJCB;
    private javax.swing.JLabel tipoSportJL;
    private javax.swing.JButton tornaIndietroHB;
    // End of variables declaration//GEN-END:variables
}
