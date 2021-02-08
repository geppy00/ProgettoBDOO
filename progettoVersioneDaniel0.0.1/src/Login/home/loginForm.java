
package Login.home;


public class loginForm extends javax.swing.JFrame {
    Controller c1;
    
    public loginForm(Controller theController){
        initComponents();
        this.setLocationRelativeTo(null);
          c1 = theController;
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jToggleButton1 = new javax.swing.JToggleButton();
        jLabel4 = new javax.swing.JLabel();

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Login/home/background.png"))); // NOI18N
        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 51, 51));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setName("Gestore Procuratori"); // NOI18N
        setUndecorated(true);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 102, 102));
        jPanel3.setPreferredSize(new java.awt.Dimension(500, 0));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField1.setBackground(new java.awt.Color(255, 102, 102));
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setText("Username");
        jTextField1.setBorder(null);
        jTextField1.setCaretColor(new java.awt.Color(255, 255, 255));
        jTextField1.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        jPanel3.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 230, 30));

        jPasswordField1.setBackground(new java.awt.Color(255, 102, 102));
        jPasswordField1.setForeground(new java.awt.Color(255, 255, 255));
        jPasswordField1.setBorder(null);
        jPasswordField1.setCaretColor(new java.awt.Color(255, 255, 255));
        jPasswordField1.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        jPanel3.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, 230, 30));
        jPanel3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, 230, 10));
        jPanel3.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 230, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Login/home/icons8_group_32px.png"))); // NOI18N
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 40, 40));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Login/home/icons8_password_32px.png"))); // NOI18N
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, -1, 40));

        jButton2.setBackground(new java.awt.Color(255, 102, 102));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Login/home/icons8_checkmark_32px_1.png"))); // NOI18N
        jButton2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton2.setBorderPainted(false);
        jButton2.setFocusable(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 310, 50, 50));

        jToggleButton1.setBackground(new java.awt.Color(255, 102, 102));
        jToggleButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Login/home/icons8_multiply_32px.png"))); // NOI18N
        jToggleButton1.setBorder(null);
        jToggleButton1.setFocusable(false);
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 19, 50, -1));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(476, 0, 510, 662));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Login/home/background.png"))); // NOI18N
        jLabel4.setText("jLabel4");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 660));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       String passwordUtente, nomeUtente = jTextField1.getText();
       passwordUtente = jPasswordField1.getText();
       boolean ritorno = c1.accedi(nomeUtente, passwordUtente);
       if(ritorno == true)
           System.out.println("Accesso effettuato con successo :DDDDDDDDD");
       else
           System.out.println("Accesso non effettuato con successo :DDDDDDDDD");
    }//GEN-LAST:event_jButton2ActionPerformed

    
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(loginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(loginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(loginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(loginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       

     
        /*java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new loginForm().setVisible(true);
            }
        });*/
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables
}
