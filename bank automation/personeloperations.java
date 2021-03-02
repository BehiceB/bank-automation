
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class personeloperations extends javax.swing.JFrame {
 
    public personeloperations() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        moneydeposit = new javax.swing.JButton();
        moneywithdrawal = new javax.swing.JButton();
        moneytransfer = new javax.swing.JButton();
        invoicepayment = new javax.swing.JButton();
        learningbalance = new javax.swing.JButton();
        loanapproval = new javax.swing.JButton();
        changepin = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        id_area = new javax.swing.JTextField();
        creditcardapp = new javax.swing.JButton();
        exit_button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        moneydeposit.setText("ParaYatırma");
        moneydeposit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moneydepositActionPerformed(evt);
            }
        });

        moneywithdrawal.setText("Para Çekme");
        moneywithdrawal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moneywithdrawalActionPerformed(evt);
            }
        });

        moneytransfer.setText("Para Transfer");
        moneytransfer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moneytransferActionPerformed(evt);
            }
        });

        invoicepayment.setText("Fature Ödeme");
        invoicepayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                invoicepaymentActionPerformed(evt);
            }
        });

        learningbalance.setText("Bakiye Öğrenme");
        learningbalance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                learningbalanceActionPerformed(evt);
            }
        });

        loanapproval.setText("Müşterilere Kredi Onayı Verme");
        loanapproval.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loanapprovalActionPerformed(evt);
            }
        });

        changepin.setText("Şifre Değiştirme");
        changepin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changepinActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("PERSONEL İD ");

        creditcardapp.setText("Kredi Kartı Başvuruları Onayla");
        creditcardapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                creditcardappActionPerformed(evt);
            }
        });

        exit_button.setText("ÇIKIŞ");
        exit_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exit_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(id_area, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(moneydeposit)
                            .addComponent(moneywithdrawal)
                            .addComponent(moneytransfer)
                            .addComponent(invoicepayment))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(loanapproval)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(changepin, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(learningbalance, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(creditcardapp, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(exit_button, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(moneydeposit)
                    .addComponent(loanapproval))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(moneywithdrawal)
                    .addComponent(creditcardapp))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(moneytransfer)
                    .addComponent(learningbalance))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(invoicepayment)
                    .addComponent(changepin))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(id_area, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(exit_button, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void changepinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changepinActionPerformed
         String id=id_area.getText();
        
        if(id.equals("")){
            JOptionPane.showMessageDialog(null,"PERSONEL İD'Sİ EKSİK");
            personeloperations pop=new personeloperations();
            pop.setVisible(true);
        }
        else{
            
            BankPersonel bp=new BankPersonel(id);
            bp.changepin(id);
        }
    }//GEN-LAST:event_changepinActionPerformed

    private void moneytransferActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moneytransferActionPerformed
        String id=id_area.getText();
        if(id.equals("")){
            JOptionPane.showMessageDialog(null,"PERSONEL İD'Sİ EKSİK");
            personeloperations pop=new personeloperations();
            pop.setVisible(true);
        }
        else{
            
             BankPersonel bp=new BankPersonel(id);
             bp.moneytransfer(id);
        }
    }//GEN-LAST:event_moneytransferActionPerformed

    private void moneydepositActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moneydepositActionPerformed
         String id=id_area.getText();
        if(id.equals("")){
            JOptionPane.showMessageDialog(null,"PERSONEL İD'Sİ EKSİK");
            personeloperations pop=new personeloperations();
            pop.setVisible(true);
        }
        else{
            BankPersonel bp=new BankPersonel(id);
            bp.moneydeposit(id);
        }
    }//GEN-LAST:event_moneydepositActionPerformed

    private void moneywithdrawalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moneywithdrawalActionPerformed
       String id=id_area.getText();
        if(id.equals("")){
            JOptionPane.showMessageDialog(null,"PERSONEL İD'Sİ EKSİK");
            personeloperations pop=new personeloperations();
            pop.setVisible(true);
        }
        else{
           BankPersonel bp=new BankPersonel(id);
           bp.moneywithdrawal(id);
        }
    }//GEN-LAST:event_moneywithdrawalActionPerformed

    private void learningbalanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_learningbalanceActionPerformed
        
      String id=id_area.getText();
      
        if(id.equals("")){
            JOptionPane.showMessageDialog(null,"PERSONEL İD'Sİ EKSİK");
             personeloperations pop=new personeloperations();
            pop.setVisible(true);
        }
        else{
      DatabaseConnection connect=new DatabaseConnection();
           Connection conn=connect.baglan();
            try{           
          Statement stmt=conn.createStatement();
          ResultSet rs=stmt.executeQuery("Select * from bank.bankpersonel where personel_id='"+id+"'");
          if(rs.next()){
              int balance=rs.getInt(5);
              JOptionPane.showMessageDialog(null,"Bakiyeniz "+balance);
          }
          else{
              JOptionPane.showMessageDialog(null,"PERSONEL İD HATALI");
               personeloperations pop=new personeloperations();
            pop.setVisible(true);
          }
          
      }
        catch(Exception e){
          
      }
     } 
        
    }//GEN-LAST:event_learningbalanceActionPerformed

    private void loanapprovalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loanapprovalActionPerformed
        String id=id_area.getText();
      
        if(id.equals("")){
            JOptionPane.showMessageDialog(null,"PERSONEL İD'Sİ EKSİK");
             personeloperations pop=new personeloperations();
            pop.setVisible(true);
        }
        else{
           DatabaseConnection connect=new DatabaseConnection();
           Connection conn=connect.baglan();
            try{           
          Statement stmt=conn.createStatement();
          String personelapproval="";
          ResultSet rs=stmt.executeQuery("Select * from bank.loanapp where personelapproval='"+personelapproval+"'");
          if(rs.next()){
              String app_id=rs.getString(1);
              int amount=rs.getInt(2);
              String response=JOptionPane.showInputDialog(app_id+" kullanıcı "+amount+"başvuruyu onayla/reddet.(onayla veya reddet şeklinde cevabınızı yazın.)");
              ResultSet rs2=stmt.executeQuery("Select * from bank.loanapp where userid='"+app_id+"'");          
              if(rs2.next()){
                 
                  stmt.execute("UPDATE bank.loanapp SET personelapproval='"+response+"'");
                  JOptionPane.showMessageDialog(null,"YANITINIZ KAYDEDİLDİ");
              }
          }
          else{
              JOptionPane.showMessageDialog(null,"Onay bekleyen kredi işlemi yok");
          }
            }catch(Exception e){
                
            }  
        }
    }//GEN-LAST:event_loanapprovalActionPerformed

    private void invoicepaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_invoicepaymentActionPerformed
        personelpayment ppay=new personelpayment();
        ppay.setVisible(true);
    }//GEN-LAST:event_invoicepaymentActionPerformed

    private void creditcardappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_creditcardappActionPerformed
        String id=id_area.getText();
      
        if(id.equals("")){
            JOptionPane.showMessageDialog(null,"PERSONEL İD'Sİ EKSİK");
             personeloperations pop=new personeloperations();
            pop.setVisible(true);
        }
        else{
        DatabaseConnection connect=new DatabaseConnection();
           Connection conn=connect.baglan();
            try{           
          Statement stmt=conn.createStatement();
          int personelapproval=0;
          ResultSet rs=stmt.executeQuery("Select * from bank.creditcardapp where personelapp="+personelapproval+"");
          if(rs.next()){
              String app_id=rs.getString(1);
              String response1=JOptionPane.showInputDialog(app_id+" id'li müşterinin kredi kartı başvurunu onaylamak için 1'e reddetmek için 0'a basınız.)");
              int response=new Integer(response1);
              
               ResultSet rs2=stmt.executeQuery("Select * from bank.creditcardapp where userid='"+app_id+"'");          
              if(rs2.next()){
                 
                  stmt.execute("UPDATE bank.creditcardapp SET personelapp="+response+"");
                  JOptionPane.showMessageDialog(null,"YANITINIZ KAYDEDİLDİ");
              }
              
          }
          
          else{
              JOptionPane.showMessageDialog(null,"Onay bekleyen kredi kartı işlemi yok");
          }
          
             
             
         }catch(Exception e){
             
         }
            
        }
    }//GEN-LAST:event_creditcardappActionPerformed

    private void exit_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exit_buttonActionPerformed
       loginpage login=new loginpage();
       login.setVisible(true);
    }//GEN-LAST:event_exit_buttonActionPerformed

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
            java.util.logging.Logger.getLogger(personeloperations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(personeloperations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(personeloperations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(personeloperations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new personeloperations().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton changepin;
    private javax.swing.JButton creditcardapp;
    private javax.swing.JButton exit_button;
    private javax.swing.JTextField id_area;
    private javax.swing.JButton invoicepayment;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton learningbalance;
    private javax.swing.JButton loanapproval;
    private javax.swing.JButton moneydeposit;
    private javax.swing.JButton moneytransfer;
    private javax.swing.JButton moneywithdrawal;
    // End of variables declaration//GEN-END:variables
}
