
package Login.home;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;
import javax.swing.table.DefaultTableModel;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CercaProcuratore extends javax.swing.JFrame {
    private static final String FORMAT = "yyyy/MM/dd";
    Controller c7;
    public CercaProcuratore(Controller theController) {
        this.setLocationRelativeTo(null);
        c7=theController;
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cercaProcuratoreJL = new javax.swing.JLabel();
        inputMatricolaDaCercareJTF = new javax.swing.JTextField();
        cercaProcuratoreBottoneJB = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabellaDatiProcuratoreCercatoJT = new javax.swing.JTable();
        tornaIndietrocpJB = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cercaProcuratoreJL.setText("CODICE IDENTIFICATIVO");

        inputMatricolaDaCercareJTF.setToolTipText("");

        cercaProcuratoreBottoneJB.setText("CERCA");
        cercaProcuratoreBottoneJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cercaProcuratoreBottoneJBActionPerformed(evt);
            }
        });

        tabellaDatiProcuratoreCercatoJT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Codice Fiscale", "Nome", "Cognome", "Data di Nascita", "Città di Nascita", "Via di Residenza", "Città di Residenza", "CAP", "IBAN"
            }
        ));
        jScrollPane1.setViewportView(tabellaDatiProcuratoreCercatoJT);

        tornaIndietrocpJB.setText("TORNA INDIETRO");
        tornaIndietrocpJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tornaIndietrocpJBActionPerformed(evt);
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
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cercaProcuratoreJL)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(inputMatricolaDaCercareJTF, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cercaProcuratoreBottoneJB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 444, Short.MAX_VALUE)
                        .addComponent(tornaIndietrocpJB))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cercaProcuratoreJL)
                    .addComponent(inputMatricolaDaCercareJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cercaProcuratoreBottoneJB)
                    .addComponent(tornaIndietrocpJB))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tornaIndietrocpJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tornaIndietrocpJBActionPerformed
        c7.tornaIndietroDaCercaProcuratore();
    }//GEN-LAST:event_tornaIndietrocpJBActionPerformed

    public String convertiDate(Date dataDiNascita){
        DateFormat df = new SimpleDateFormat(FORMAT);
        String strDate = df.format(dataDiNascita);
        return strDate;
    }
    
    private void cercaProcuratoreBottoneJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cercaProcuratoreBottoneJBActionPerformed
       ConnectionToDataBase db1 = new ConnectionToDataBase();
        Connection connct1 = db1.connectionToDatabase();
        String idCopiatoDaCercare = inputMatricolaDaCercareJTF.getText();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        try{
            stmt = connct1.prepareStatement("SELECT * FROM procuratori_tbl WHERE code_id LIKE ?");
            stmt.setString(1, idCopiatoDaCercare+"%");
            rs = stmt.executeQuery();
            while(rs.next()){
               String id = rs.getString("code_id");
               String codiceFiscale = rs.getString("codice_fiscale");
               String nome = rs.getString("nome");
               String cognome = rs.getString("cognome");
               Date dataDiNascita = rs.getDate("data_di_nascita");
               String cittaDiNascita = rs.getString("citta_nascita");
               String via =  rs.getString("via");
               String citta =  rs.getString("citta");
               int cap = rs.getInt("cap");
               String iban = rs.getString("iban");
                
               //Effettuo le conversioni per creare un unico array di String
               String capConvertitoStr = Integer.toString(cap);
               String dataDiNascitaConvertitoStr = convertiDate(dataDiNascita);
               
               //Array di stringhe per inserire i dati nella jtable
               String tbData[]= {id, codiceFiscale, nome, cognome, dataDiNascitaConvertitoStr, cittaDiNascita, via, citta, capConvertitoStr, iban};
               DefaultTableModel tblModel = (DefaultTableModel)tabellaDatiProcuratoreCercatoJT.getModel();
               //Aggiungiamo ogni stringa dell'array nella jtable
               tblModel.addRow(tbData);
               
            }
            
        }catch(Exception e){
                System.out.println("Errore nella stampa ");
                System.exit(0);
            }
    }//GEN-LAST:event_cercaProcuratoreBottoneJBActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cercaProcuratoreBottoneJB;
    private javax.swing.JLabel cercaProcuratoreJL;
    private javax.swing.JTextField inputMatricolaDaCercareJTF;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabellaDatiProcuratoreCercatoJT;
    private javax.swing.JButton tornaIndietrocpJB;
    // End of variables declaration//GEN-END:variables
}
