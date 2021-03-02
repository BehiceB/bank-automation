
import javax.swing.JOptionPane;


public class managerpayment extends javax.swing.JFrame {


    public managerpayment() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        id_area = new javax.swing.JTextField();
        elektrik = new javax.swing.JRadioButton();
        internet = new javax.swing.JRadioButton();
        telefon = new javax.swing.JRadioButton();
        dogalgaz = new javax.swing.JRadioButton();
        su = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Yönetici İD");

        elektrik.setText("Elektrik");
        elektrik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elektrikActionPerformed(evt);
            }
        });

        internet.setText("İnternet");
        internet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                internetActionPerformed(evt);
            }
        });

        telefon.setText("Telefon");
        telefon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefonActionPerformed(evt);
            }
        });

        dogalgaz.setText("Doğalgaz");
        dogalgaz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dogalgazActionPerformed(evt);
            }
        });

        su.setText("Su");
        su.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(su)
                    .addComponent(dogalgaz)
                    .addComponent(telefon)
                    .addComponent(internet)
                    .addComponent(elektrik)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(id_area, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(77, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(elektrik)
                .addGap(18, 18, 18)
                .addComponent(internet)
                .addGap(18, 18, 18)
                .addComponent(telefon)
                .addGap(18, 18, 18)
                .addComponent(dogalgaz)
                .addGap(18, 18, 18)
                .addComponent(su)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(id_area, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void elektrikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elektrikActionPerformed
        String billname="elektrik";
        String id=id_area.getText();
        if(id.equals("")){
           JOptionPane.showMessageDialog(null, "Yönetici İd'nizi giriniz");
           managerpayment mpay=new managerpayment();
           mpay.setVisible(true);
       }
       else{
           BankManager bm=new BankManager(id);
           bm.payment(id,billname);
       }    
    }//GEN-LAST:event_elektrikActionPerformed

    private void internetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_internetActionPerformed
       String billname="internet";
        String id=id_area.getText();
        if(id.equals("")){
           JOptionPane.showMessageDialog(null, "Yönetici İd'nizi giriniz");
           managerpayment mpay=new managerpayment();
           mpay.setVisible(true);
       }
       else{
           BankManager bm=new BankManager(id);
           bm.payment(id,billname);
       } 
    }//GEN-LAST:event_internetActionPerformed

    private void telefonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefonActionPerformed
        String billname="telefon";
        String id=id_area.getText();
        if(id.equals("")){
           JOptionPane.showMessageDialog(null, "Yönetici İd'nizi giriniz");
           managerpayment mpay=new managerpayment();
           mpay.setVisible(true);
       }
       else{
           BankManager bm=new BankManager(id);
           bm.payment(id,billname);
       } 
    }//GEN-LAST:event_telefonActionPerformed

    private void dogalgazActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dogalgazActionPerformed
       String billname="dogalgaz";
        String id=id_area.getText();
        if(id.equals("")){
           JOptionPane.showMessageDialog(null, "Yönetici İd'nizi giriniz");
           managerpayment mpay=new managerpayment();
           mpay.setVisible(true);
       }
       else{
           BankManager bm=new BankManager(id);
           bm.payment(id,billname);
       } 
    }//GEN-LAST:event_dogalgazActionPerformed

    private void suActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suActionPerformed
      String billname="su";
        String id=id_area.getText();
        if(id.equals("")){
           JOptionPane.showMessageDialog(null, "Yönetici İd'nizi giriniz");
           managerpayment mpay=new managerpayment();
           mpay.setVisible(true);
       }
       else{
           BankManager bm=new BankManager(id);
          bm.payment(id,billname);
       } 
    }//GEN-LAST:event_suActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(managerpayment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(managerpayment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(managerpayment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(managerpayment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new managerpayment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton dogalgaz;
    private javax.swing.JRadioButton elektrik;
    private javax.swing.JTextField id_area;
    private javax.swing.JRadioButton internet;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JRadioButton su;
    private javax.swing.JRadioButton telefon;
    // End of variables declaration//GEN-END:variables
}
