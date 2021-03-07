/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login.home;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;


public class EliminaProcuratore extends javax.swing.JFrame {
    Controller c5;
    /**
     * Creates new form EliminaProcuratore
     */
     public EliminaProcuratore(){
         
     }
    public EliminaProcuratore(Controller theContreller) {
        c5 = theContreller;
        this.setLocationRelativeTo(null);
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        testoEliminaJL = new javax.swing.JLabel();
        prendiMatricolaDaEliminareJTF = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        visualizzaProcuratoreDaEliminareJT = new javax.swing.JTable();
        btnCercaJB = new javax.swing.JButton();
        btnEliminaProcuratoreJB = new javax.swing.JButton();
        btnTornaIndiertroJB = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        testoEliminaJL.setText("Inserisci la matricola da eliminare");

        visualizzaProcuratoreDaEliminareJT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome ", "Cognome", "Codice Fiscale", "Codice Identificativo"
            }
        ));
        jScrollPane1.setViewportView(visualizzaProcuratoreDaEliminareJT);

        btnCercaJB.setText("CERCA");
        btnCercaJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCercaJBActionPerformed(evt);
            }
        });

        btnEliminaProcuratoreJB.setText("ELIMINA");
        btnEliminaProcuratoreJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminaProcuratoreJBActionPerformed(evt);
            }
        });

        btnTornaIndiertroJB.setText("TORNA INDIETRO");
        btnTornaIndiertroJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTornaIndiertroJBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(testoEliminaJL)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(prendiMatricolaDaEliminareJTF, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnCercaJB)
                                .addGap(0, 32, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnTornaIndiertroJB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEliminaProcuratoreJB)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(testoEliminaJL)
                    .addComponent(prendiMatricolaDaEliminareJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCercaJB))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTornaIndiertroJB)
                    .addComponent(btnEliminaProcuratoreJB))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void visualizzaDatiInTabella(){
        ConnectionToDataBase db1 = new ConnectionToDataBase();
        Connection connct1 = db1.connectionToDatabase();
        String idCopiato = prendiMatricolaDaEliminareJTF.getText();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        try{
            stmt = connct1.prepareStatement("SELECT * FROM procuratori_tbl WHERE code_id LIKE ?");
            stmt.setString(1, idCopiato+"%");
            rs = stmt.executeQuery();
            while(rs.next()){
               String id = rs.getString("code_id");
               String codiceFiscale = rs.getString("codice_fiscale");
               String nome = rs.getString("nome");
               String cognome = rs.getString("cognome");
               
               //Array di stringhe per inserire i dati nella jtable
               String tbData[]= {nome, cognome, codiceFiscale, id};
               DefaultTableModel tblModel = (DefaultTableModel)visualizzaProcuratoreDaEliminareJT.getModel();
               //Aggiungiamo ogni stringa dell'array nella jtable
               tblModel.addRow(tbData);
               
            }
            
        }catch(Exception e){
                System.out.println("Errore nella stampa ");
                System.exit(0);
            }
    }
    
    private void btnCercaJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCercaJBActionPerformed
      visualizzaDatiInTabella();
    }//GEN-LAST:event_btnCercaJBActionPerformed

    private void btnEliminaProcuratoreJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminaProcuratoreJBActionPerformed
      String idEliminare = prendiMatricolaDaEliminareJTF.getText();
      System.out.println(idEliminare);
      int loginIdEliminare = c5.cercaIdLoginProcuratoreController(idEliminare);
      c5.cancellaProcuratore(idEliminare);
      c5.eliminaProcuratoreDaLogin(loginIdEliminare);
     
    }//GEN-LAST:event_btnEliminaProcuratoreJBActionPerformed

    private void btnTornaIndiertroJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTornaIndiertroJBActionPerformed
        c5.tornaIndietroSezioneProcuratori();
    }//GEN-LAST:event_btnTornaIndiertroJBActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCercaJB;
    private javax.swing.JButton btnEliminaProcuratoreJB;
    private javax.swing.JButton btnTornaIndiertroJB;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField prendiMatricolaDaEliminareJTF;
    private javax.swing.JLabel testoEliminaJL;
    private javax.swing.JTable visualizzaProcuratoreDaEliminareJT;
    // End of variables declaration//GEN-END:variables
}
