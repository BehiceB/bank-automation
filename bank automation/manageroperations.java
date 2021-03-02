
import java.sql.*;
import javax.swing.JOptionPane;


public class manageroperations extends javax.swing.JFrame {

     

    public static int getTEXT_CURSOR() {
        return TEXT_CURSOR;
    }
    public manageroperations() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        loanapproval = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        id_area = new javax.swing.JTextField();
        moneywithdrawal = new javax.swing.JButton();
        moneydeposit = new javax.swing.JButton();
        moneytransfer = new javax.swing.JButton();
        invoicepayment = new javax.swing.JButton();
        creditcardapp = new javax.swing.JButton();
        changepin = new javax.swing.JButton();
        learningbalance = new javax.swing.JButton();
        exit_button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        loanapproval.setText("Müşterilere Kredi Onayı Verme");
        loanapproval.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loanapprovalActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Yönetici İD");

        moneywithdrawal.setText("Para Çekme");
        moneywithdrawal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moneywithdrawalActionPerformed(evt);
            }
        });

        moneydeposit.setText("Para Yatırma");
        moneydeposit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moneydepositActionPerformed(evt);
            }
        });

        moneytransfer.setText("Para Transfer");
        moneytransfer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moneytransferActionPerformed(evt);
            }
        });

        invoicepayment.setText("Fatura Ödeme");
        invoicepayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                invoicepaymentActionPerformed(evt);
            }
        });

        creditcardapp.setText("Kredi Kartı Başvuruları Onayla");
        creditcardapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                creditcardappActionPerformed(evt);
            }
        });

        changepin.setText("Şifre Değiştirme");
        changepin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changepinActionPerformed(evt);
            }
        });

        learningbalance.setText("Bakiye Öğrenme");
        learningbalance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                learningbalanceActionPerformed(evt);
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
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(moneywithdrawal, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(moneydeposit, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(creditcardapp)
                            .addComponent(loanapproval)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(learningbalance)
                            .addGap(41, 41, 41)
                            .addComponent(changepin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(moneytransfer, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(45, 45, 45)
                            .addComponent(invoicepayment, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(exit_button, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                            .addComponent(id_area))))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(moneywithdrawal)
                    .addComponent(loanapproval))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(moneydeposit)
                    .addComponent(creditcardapp))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(moneytransfer)
                    .addComponent(invoicepayment))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(learningbalance)
                    .addComponent(changepin))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 23, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(76, 76, 76))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(id_area, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(exit_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loanapprovalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loanapprovalActionPerformed
        String id=id_area.getText();
      
        if(id.equals("")){
            JOptionPane.showMessageDialog(null,"YÖNETİCİ İD'Sİ EKSİK");
             manageroperations mop=new manageroperations();
            mop.setVisible(true);
        }
        else{
            DatabaseConnection connect=new DatabaseConnection();
           Connection conn=connect.baglan();
            try{           
          Statement stmt=conn.createStatement();
          String managerapproval="";
          ResultSet rs=stmt.executeQuery("Select * from bank.loanapp where managerapproval='"+managerapproval+"'");
          if(rs.next()){
              String app_id=rs.getString(1);
              int amount=rs.getInt(2);
              String response=JOptionPane.showInputDialog(app_id+" kullanıcı "+amount+"başvuruyu onayla/reddet.(onayla veya reddet şeklinde cevabınızı yazın.)");
              ResultSet rs2=stmt.executeQuery("Select * from bank.loanapp where userid='"+app_id+"'");          
              if(rs2.next()){
                  
                  stmt.execute("UPDATE bank.loanapp SET managerapproval='"+response+"'");
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

    private void moneywithdrawalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moneywithdrawalActionPerformed
        String id=id_area.getText();
      
        if(id.equals("")){
            JOptionPane.showMessageDialog(null,"YÖNETİCİ İD'Sİ EKSİK");
             manageroperations mop=new manageroperations();
            mop.setVisible(true);
        }
        else{
            User bm=new BankManager(id);
            bm.moneywithdrawal(id);
        }
    }//GEN-LAST:event_moneywithdrawalActionPerformed

    private void moneydepositActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moneydepositActionPerformed
       String id=id_area.getText();
      
        if(id.equals("")){
            JOptionPane.showMessageDialog(null,"YÖNETİCİ İD'Sİ EKSİK");
             personeloperations mop=new personeloperations();
            mop.setVisible(true);
        }
        else{
            User bm=new BankManager(id);
            bm.moneydeposit(id);
        }
    }//GEN-LAST:event_moneydepositActionPerformed

    private void moneytransferActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moneytransferActionPerformed
         String id=id_area.getText();
      
        if(id.equals("")){
            JOptionPane.showMessageDialog(null,"YÖNETİCİ İD'Sİ EKSİK");
             personeloperations mop=new personeloperations();
            mop.setVisible(true);
        }
        else{
            User bm=new BankManager(id);
            bm.moneytransfer(id);
        }
    }//GEN-LAST:event_moneytransferActionPerformed

    private void invoicepaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_invoicepaymentActionPerformed
        managerpayment mpay=new managerpayment();
        mpay.setVisible(true);
    }//GEN-LAST:event_invoicepaymentActionPerformed

    private void creditcardappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_creditcardappActionPerformed
        String id=id_area.getText();
      
        if(id.equals("")){
            JOptionPane.showMessageDialog(null,"YÖNETİCİ İD'Sİ EKSİK");
             manageroperations mop=new manageroperations();
            mop.setVisible(true);
        }
        else{
        DatabaseConnection connect=new DatabaseConnection();
           Connection conn=connect.baglan();
            try{           
          Statement stmt=conn.createStatement();
          int managerapproval=0;
          ResultSet rs=stmt.executeQuery("Select * from bank.creditcardapp where managerapp="+managerapproval+"");
          if(rs.next()){
              String app_id=rs.getString(1);
              String response1=JOptionPane.showInputDialog(app_id+" id'li müşterinin kredi kartı başvurunu onaylamak için 1'e reddetmek için 0'a basınız.)");
              int response=new Integer(response1);
              
               ResultSet rs2=stmt.executeQuery("Select * from bank.creditcardapp where userid='"+app_id+"'");          
              if(rs2.next()){
                 
                  stmt.execute("UPDATE bank.creditcardapp SET managerapp="+response+"");
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

    private void changepinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changepinActionPerformed
        String id=id_area.getText();
      
        if(id.equals("")){
            JOptionPane.showMessageDialog(null,"YÖNETİCİ İD'Sİ EKSİK");
             manageroperations mop=new manageroperations();
            mop.setVisible(true);
        }
        else{
            User bm=new BankManager(id);
            bm.changepin(id);
        }
        
        
    }//GEN-LAST:event_changepinActionPerformed

    private void learningbalanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_learningbalanceActionPerformed
         String id=id_area.getText();
      
        if(id.equals("")){
            JOptionPane.showMessageDialog(null,"YÖNETİCİ İD'Sİ EKSİK");
            manageroperations mop=new manageroperations();
            mop.setVisible(true);
        }
        else{
            DatabaseConnection connect=new DatabaseConnection();
           Connection conn=connect.baglan();
      try{
           
          Statement stmt=conn.createStatement();
          ResultSet rs=stmt.executeQuery("Select * from bank.manager where manager_id='"+id+"'");
          if(rs.next()){
              int balance=rs.getInt(5);
              JOptionPane.showMessageDialog(null,"Bakiyeniz "+balance);
          }
          else{
              JOptionPane.showMessageDialog(null,"YÖNETİCİ İD HATALI");
               manageroperations mop=new manageroperations();
            mop.setVisible(true);
          }
          
      }
        catch(Exception e){
          
      }
        } 
    }//GEN-LAST:event_learningbalanceActionPerformed

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
            java.util.logging.Logger.getLogger(manageroperations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(manageroperations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(manageroperations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(manageroperations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new manageroperations().setVisible(true);
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
