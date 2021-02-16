
package Login.home;

/**
 *
 * @author Giuseppe
 */
public class InserireNuovoProcuratore extends javax.swing.JFrame {
    Controller c3;
    /**
     * Creates new form InserireNuovoProcuratore
     */
    public InserireNuovoProcuratore(Controller theController) {
        initComponents();
        this.setLocationRelativeTo(null);
        c3 = theController;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        codeIdJL = new javax.swing.JLabel();
        codeIDInputJTF = new javax.swing.JTextField();
        codiceFiscaleJL = new javax.swing.JLabel();
        codeFiscInputJTF = new javax.swing.JTextField();
        nomeJL = new javax.swing.JLabel();
        nomeInputJTF = new javax.swing.JTextField();
        cognomeJL = new javax.swing.JLabel();
        cognomeInputJTF = new javax.swing.JTextField();
        dataNascitaJL = new javax.swing.JLabel();
        cittaNascitaJL = new javax.swing.JLabel();
        cittaNascitaJTF = new javax.swing.JTextField();
        viaJL = new javax.swing.JLabel();
        viaInputJTF = new javax.swing.JTextField();
        cittaJL = new javax.swing.JLabel();
        cittaInputJTF = new javax.swing.JTextField();
        capJL = new javax.swing.JLabel();
        capInputJTF = new javax.swing.JTextField();
        ibanJL = new javax.swing.JLabel();
        ibanInputJTF = new javax.swing.JTextField();
        okButtonJB = new javax.swing.JButton();
        dateOfBirth = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        codeIdJL.setText("Codice Identificativo");

        codiceFiscaleJL.setText("Codice Fiscale");

        nomeJL.setText("Nome");

        cognomeJL.setText("Cognome");

        dataNascitaJL.setText("Data di nascita");

        cittaNascitaJL.setText("Città nascita");

        viaJL.setText("Via");

        cittaJL.setText("Città");

        capJL.setText("CAP");

        ibanJL.setText("IBAN");

        okButtonJB.setText("OK");
        okButtonJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonJBActionPerformed(evt);
            }
        });

        dateOfBirth.setDateFormatString("dd-MM-yyyy");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(codeIdJL)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(codeIDInputJTF, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(codiceFiscaleJL)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(codeFiscInputJTF, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(nomeJL)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nomeInputJTF, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cognomeJL)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cognomeInputJTF, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(dataNascitaJL)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dateOfBirth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(cittaNascitaJL)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cittaNascitaJTF, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(okButtonJB)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(viaJL, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(viaInputJTF, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cittaJL)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cittaInputJTF, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(capJL)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(capInputJTF, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ibanJL)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ibanInputJTF, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(codeIdJL)
                    .addComponent(codeIDInputJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(codiceFiscaleJL)
                    .addComponent(codeFiscInputJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nomeJL)
                    .addComponent(nomeInputJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cognomeJL)
                        .addComponent(cognomeInputJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(dataNascitaJL)
                        .addComponent(cittaNascitaJL)
                        .addComponent(cittaNascitaJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(dateOfBirth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viaJL)
                    .addComponent(viaInputJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cittaJL)
                    .addComponent(cittaInputJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(capJL)
                    .addComponent(capInputJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ibanJL)
                    .addComponent(ibanInputJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(okButtonJB)
                .addContainerGap(7, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void okButtonJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonJBActionPerformed
        String capCopiatoStringa = capInputJTF.getText();
        String cittaResidenzaCopiato, codiceFiscCopiato, cognomeCopiato, dataDiNascitaCopiato, ibanCopiato, nomeCopiato, viaCopiato, codiceIDCopiato, cittaNascitaCopiato;

        int capCopiato = Integer.parseInt(capCopiatoStringa);
        
       java.sql.Date date = new java.sql.Date(dateOfBirth.getDate().getTime()); //Conversione data da java a sql per inserirla nel database
        
        
        cittaResidenzaCopiato = cittaInputJTF.getText();
        codiceFiscCopiato =codeFiscInputJTF.getText();
        cognomeCopiato=cognomeInputJTF.getText();
        //dataDiNascitaCopiato=dataNascitaInputJTF.getText();
        ibanCopiato=ibanInputJTF.getText();
        nomeCopiato=nomeInputJTF.getText();
        viaCopiato=viaInputJTF.getText();
        codiceIDCopiato=codeIDInputJTF.getText();
        cittaNascitaCopiato=cittaNascitaJTF.getText();
        
        c3.okButtonInserimento(capCopiato, cittaResidenzaCopiato, codiceFiscCopiato, cognomeCopiato, (java.sql.Date) date, ibanCopiato, nomeCopiato, viaCopiato, codiceIDCopiato, cittaNascitaCopiato);
    }//GEN-LAST:event_okButtonJBActionPerformed

    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField capInputJTF;
    private javax.swing.JLabel capJL;
    private javax.swing.JTextField cittaInputJTF;
    private javax.swing.JLabel cittaJL;
    private javax.swing.JLabel cittaNascitaJL;
    private javax.swing.JTextField cittaNascitaJTF;
    private javax.swing.JTextField codeFiscInputJTF;
    private javax.swing.JTextField codeIDInputJTF;
    private javax.swing.JLabel codeIdJL;
    private javax.swing.JLabel codiceFiscaleJL;
    private javax.swing.JTextField cognomeInputJTF;
    private javax.swing.JLabel cognomeJL;
    private javax.swing.JLabel dataNascitaJL;
    private com.toedter.calendar.JDateChooser dateOfBirth;
    private javax.swing.JTextField ibanInputJTF;
    private javax.swing.JLabel ibanJL;
    private javax.swing.JTextField nomeInputJTF;
    private javax.swing.JLabel nomeJL;
    private javax.swing.JButton okButtonJB;
    private javax.swing.JTextField viaInputJTF;
    private javax.swing.JLabel viaJL;
    // End of variables declaration//GEN-END:variables
}