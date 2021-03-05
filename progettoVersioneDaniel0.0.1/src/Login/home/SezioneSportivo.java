
package Login.home;

public class SezioneSportivo extends javax.swing.JFrame {

    ControllerSportivo c9;
    
    public SezioneSportivo(ControllerSportivo theControllerSportivo) {
        c9=theControllerSportivo;
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sezSportivoJL = new javax.swing.JLabel();
        aggiungiSportivoJB = new javax.swing.JButton();
        modificaSportivoJB = new javax.swing.JButton();
        eliminaSportivoJB = new javax.swing.JButton();
        cercaSportivoJB = new javax.swing.JButton();
        visualizzaTuttiSportiviJB = new javax.swing.JButton();
        tornaIndietroJB = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        datiSportiviTabellaJT = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        sezSportivoJL.setFont(new java.awt.Font("Eras Bold ITC", 0, 24)); // NOI18N
        sezSportivoJL.setText("SEZIONE SPORTIVI");

        aggiungiSportivoJB.setText("AGGIUNGI SPORTIVO");
        aggiungiSportivoJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aggiungiSportivoJBActionPerformed(evt);
            }
        });

        modificaSportivoJB.setText("MODIFICA SPORTIVO");

        eliminaSportivoJB.setText("ELIMINARE SPORTIVO");

        cercaSportivoJB.setText("CERCA SPORTIVO");
        cercaSportivoJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cercaSportivoJBActionPerformed(evt);
            }
        });

        visualizzaTuttiSportiviJB.setText("VISUALLIZZA TUTTI I SPORTIVI");

        tornaIndietroJB.setText("TORNA INDIETRO");
        tornaIndietroJB.setToolTipText("");
        tornaIndietroJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tornaIndietroJBActionPerformed(evt);
            }
        });

        datiSportiviTabellaJT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID SPORTIVO", "CF", "NOME", "COGNOME"
            }
        ));
        jScrollPane1.setViewportView(datiSportiviTabellaJT);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(aggiungiSportivoJB)
                        .addGap(67, 67, 67)
                        .addComponent(modificaSportivoJB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                        .addComponent(eliminaSportivoJB)
                        .addGap(59, 59, 59)
                        .addComponent(cercaSportivoJB))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(visualizzaTuttiSportiviJB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tornaIndietroJB))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(244, 244, 244)
                        .addComponent(sezSportivoJL)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(sezSportivoJL)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aggiungiSportivoJB)
                    .addComponent(modificaSportivoJB)
                    .addComponent(eliminaSportivoJB)
                    .addComponent(cercaSportivoJB))
                .addGap(103, 103, 103)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(visualizzaTuttiSportiviJB)
                    .addComponent(tornaIndietroJB))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void aggiungiSportivoJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aggiungiSportivoJBActionPerformed
        
    }//GEN-LAST:event_aggiungiSportivoJBActionPerformed

    private void cercaSportivoJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cercaSportivoJBActionPerformed
       c9.apriCercaSportivo();
    }//GEN-LAST:event_cercaSportivoJBActionPerformed

    private void tornaIndietroJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tornaIndietroJBActionPerformed
       c9.tornaIndietroDaSezioneSportivo();
    }//GEN-LAST:event_tornaIndietroJBActionPerformed

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aggiungiSportivoJB;
    private javax.swing.JButton cercaSportivoJB;
    private javax.swing.JTable datiSportiviTabellaJT;
    private javax.swing.JButton eliminaSportivoJB;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton modificaSportivoJB;
    private javax.swing.JLabel sezSportivoJL;
    private javax.swing.JButton tornaIndietroJB;
    private javax.swing.JButton visualizzaTuttiSportiviJB;
    // End of variables declaration//GEN-END:variables
}
