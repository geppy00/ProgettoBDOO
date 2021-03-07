
package Login.home;

public class AccessoProcuratore extends javax.swing.JFrame {

    Controller cSportivoDaProcuratore1;
    ControllerSportivo c1;
    
    public AccessoProcuratore(ControllerSportivo theControllerSportivo) {
        this.setLocationRelativeTo(null);
        c1 = theControllerSportivo;
        initComponents();
    }
    
    public AccessoProcuratore(Controller theController,  ControllerSportivo theControllerSportivo) {
        this.setLocationRelativeTo(null);
        cSportivoDaProcuratore1 = theController;
        c1 = theControllerSportivo;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        testoIntroduttivoJL = new javax.swing.JLabel();
        tastoLogoutJB = new javax.swing.JButton();
        addSportivoDaProcuratoreJB = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        testoIntroduttivoJL.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        testoIntroduttivoJL.setForeground(new java.awt.Color(102, 0, 102));
        testoIntroduttivoJL.setText("WELCOME PROCURATORE");

        tastoLogoutJB.setText("DISCONNETTI");
        tastoLogoutJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tastoLogoutJBActionPerformed(evt);
            }
        });

        addSportivoDaProcuratoreJB.setBackground(new java.awt.Color(0, 0, 0));
        addSportivoDaProcuratoreJB.setForeground(new java.awt.Color(255, 0, 51));
        addSportivoDaProcuratoreJB.setText("GESTIONE SPORTIVO");
        addSportivoDaProcuratoreJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addSportivoDaProcuratoreJBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(170, Short.MAX_VALUE)
                .addComponent(testoIntroduttivoJL)
                .addGap(162, 162, 162))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(tastoLogoutJB))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(384, 384, 384)
                        .addComponent(addSportivoDaProcuratoreJB)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(testoIntroduttivoJL)
                .addGap(79, 79, 79)
                .addComponent(addSportivoDaProcuratoreJB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 287, Short.MAX_VALUE)
                .addComponent(tastoLogoutJB)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addSportivoDaProcuratoreJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addSportivoDaProcuratoreJBActionPerformed

        c1.apriGestioneSportivoDaProcuratore();
    }//GEN-LAST:event_addSportivoDaProcuratoreJBActionPerformed

    private void tastoLogoutJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tastoLogoutJBActionPerformed
        c1.tornaIndietroDaAccessoComeProcuratore();
    }//GEN-LAST:event_tastoLogoutJBActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addSportivoDaProcuratoreJB;
    private javax.swing.JButton tastoLogoutJB;
    private javax.swing.JLabel testoIntroduttivoJL;
    // End of variables declaration//GEN-END:variables
}
