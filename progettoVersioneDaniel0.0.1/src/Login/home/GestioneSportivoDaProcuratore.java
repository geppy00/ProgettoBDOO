
package Login.home;

public class GestioneSportivoDaProcuratore extends javax.swing.JFrame {

     ControllerSportivo cSportivoDaProcuratore2;
    
    public GestioneSportivoDaProcuratore( ControllerSportivo theControllerSportivo) {
        this.setLocationRelativeTo(null);
        cSportivoDaProcuratore2=theControllerSportivo;
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        testoIntroduttivoJL = new javax.swing.JLabel();
        addNewSportivoJB = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        testoIntroduttivoJL.setFont(new java.awt.Font("Elephant", 1, 24)); // NOI18N
        testoIntroduttivoJL.setText("SCEGLI UNA DELLE OPERAZIONI PER I TUOI SPORTIVI");

        addNewSportivoJB.setText("AGGIUNGI UN NUOVO SPORTIVO");
        addNewSportivoJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNewSportivoJBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addNewSportivoJB)
                    .addComponent(testoIntroduttivoJL))
                .addContainerGap(85, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(testoIntroduttivoJL)
                .addGap(61, 61, 61)
                .addComponent(addNewSportivoJB)
                .addContainerGap(135, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addNewSportivoJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addNewSportivoJBActionPerformed
        cSportivoDaProcuratore2.apriAggiungSportivo();
    }//GEN-LAST:event_addNewSportivoJBActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addNewSportivoJB;
    private javax.swing.JLabel testoIntroduttivoJL;
    // End of variables declaration//GEN-END:variables
}
