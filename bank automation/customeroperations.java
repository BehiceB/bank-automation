
import java.sql.*;
import javax.swing.JOptionPane;


public class customeroperations extends javax.swing.JFrame  {

 
    
    public customeroperations() {
        initComponents();
    }

      DatabaseConnection connect=new DatabaseConnection();
           Connection conn=connect.baglan();
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        moneywithdrawal = new javax.swing.JButton();
        learningbalance = new javax.swing.JButton();
        moneydeposit = new javax.swing.JButton();
        moneytransfer = new javax.swing.JButton();
        payment = new javax.swing.JButton();
        changepin = new javax.swing.JButton();
        creditlimit = new javax.swing.JButton();
        loanquery = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        id_area = new javax.swing.JTextField();
        loanapplication = new javax.swing.JButton();
        loandebt = new javax.swing.JButton();
        creditcardapp = new javax.swing.JButton();
        exitbutton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        moneywithdrawal.setText("Para Çekme");
        moneywithdrawal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moneywithdrawalActionPerformed(evt);
            }
        });

        learningbalance.setText("Bakiye Öğrenme");
        learningbalance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                learningbalanceActionPerformed(evt);
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

        payment.setText("Fatura Ödeme");
        payment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paymentActionPerformed(evt);
            }
        });

        changepin.setText("Şifre Değiştirme");
        changepin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changepinActionPerformed(evt);
            }
        });

        creditlimit.setText("Kredi Kartı Linit Güncelleme");
        creditlimit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                creditlimitActionPerformed(evt);
            }
        });

        loanquery.setText("Kredi Başvuru Sonucu Sorgula");
        loanquery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loanqueryActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Müşteri İD");

        loanapplication.setText("Kredi Başvuru");
        loanapplication.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loanapplicationActionPerformed(evt);
            }
        });

        loandebt.setText("Kredi Borçları Görüntüle");
        loandebt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loandebtActionPerformed(evt);
            }
        });

        creditcardapp.setText("Kredi Kartı Başvuru");
        creditcardapp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                creditcardappActionPerformed(evt);
            }
        });

        exitbutton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        exitbutton.setText("ÇIKIŞ");
        exitbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitbuttonActionPerformed(evt);
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(loanapplication, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(changepin, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE))
                                .addGap(58, 58, 58)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(loandebt, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(creditcardapp, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(loanquery, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addComponent(creditlimit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(payment, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                                .addComponent(moneydeposit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(moneywithdrawal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(moneytransfer, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(learningbalance, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(65, 65, 65))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(id_area, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(138, 138, 138)
                        .addComponent(exitbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(moneydeposit)
                    .addComponent(loanquery)
                    .addComponent(learningbalance))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(payment)
                    .addComponent(creditlimit)
                    .addComponent(moneytransfer))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loanapplication)
                    .addComponent(loandebt)
                    .addComponent(moneywithdrawal))
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(changepin)
                    .addComponent(creditcardapp))
                .addGap(78, 78, 78)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(id_area, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(exitbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(63, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void learningbalanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_learningbalanceActionPerformed
       String id=id_area.getText();
      
        if(id.equals("")){
            JOptionPane.showMessageDialog(null,"MÜŞTERİ İD'Sİ EKSİK");
            customeroperations cop=new customeroperations();
            cop.setVisible(true);
        }
        else{
 
            try{           
          Statement stmt=conn.createStatement();
          ResultSet rs=stmt.executeQuery("Select * from bank.customer where customer_id='"+id+"'");
          if(rs.next()){
              int balance=rs.getInt(5);
              JOptionPane.showMessageDialog(null,"Bakiyeniz "+balance);
          }
          else{
              JOptionPane.showMessageDialog(null,"MÜŞTERİ İD HATALI");
              customeroperations cop=new customeroperations();
              cop.setVisible(true);
          }
          
      }
        catch(Exception e){
          
      }
        } 
        
    }//GEN-LAST:event_learningbalanceActionPerformed

    private void moneydepositActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moneydepositActionPerformed
       String id=id_area.getText();
      
        if(id.equals("")){
            JOptionPane.showMessageDialog(null,"MÜŞTERİ İD'Sİ EKSİK");
            customeroperations cop=new customeroperations();
            cop.setVisible(true);
        }
        else{
            Customer c=new Customer(id);
            c.moneydeposit(id);
      
        }
        
        
        
        
    }//GEN-LAST:event_moneydepositActionPerformed

    private void moneywithdrawalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moneywithdrawalActionPerformed
     String id=id_area.getText();
     if(id.equals("")){
            JOptionPane.showMessageDialog(null,"MÜŞTERİ İD'Sİ EKSİK");
            customeroperations cop=new customeroperations();
            cop.setVisible(true);
        }
     else{
    Customer c=new Customer(id);
    c.moneywithdrawal(id);
    }//GEN-LAST:event_moneywithdrawalActionPerformed
   }
     
     
    private void moneytransferActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moneytransferActionPerformed
        String id=id_area.getText();
        if(id.equals("")){
            JOptionPane.showMessageDialog(null,"MÜŞTERİ İD'Sİ EKSİK");
            customeroperations cop=new customeroperations();
            cop.setVisible(true);
        }
        else{
            Customer c=new Customer(id);
            c.moneytransfer(id);
      
        }
    }//GEN-LAST:event_moneytransferActionPerformed

    private void changepinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changepinActionPerformed
      String id=id_area.getText();
        if(id.equals("")){
            JOptionPane.showMessageDialog(null,"MÜŞTERİ İD'Sİ EKSİK");
            customeroperations cop=new customeroperations();
            cop.setVisible(true);
        }
        else{
            Customer c=new Customer(id);
            c.changepin(id);
      
        }
        
        
    }//GEN-LAST:event_changepinActionPerformed

    private void loanapplicationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loanapplicationActionPerformed
       String id=id_area.getText();
       if(id.equals("")){
            JOptionPane.showMessageDialog(null,"MÜŞTERİ İD'Sİ EKSİK");
            customeroperations cop=new customeroperations();
            cop.setVisible(true);
        }
       else{
          
       try{
          
           String number=JOptionPane.showInputDialog("Bankamızdan ne kadar kredi almak istersiniz?");
           int amount=new Integer(number);
           String managerapproval="";
           String personelapproval="";
          Statement stmt=conn.createStatement();
          stmt.execute("INSERT INTO bank.loanapp VALUES('"+id+"',"+amount+",'"+managerapproval+"','"+personelapproval+"')");
           JOptionPane.showMessageDialog(null,"Kredi başvurunuz alındı.Oanylanması için bekleyiniz.");
       }catch(Exception e){
           
       }
       }
    }//GEN-LAST:event_loanapplicationActionPerformed

    private void loanqueryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loanqueryActionPerformed
        String id=id_area.getText();
       if(id.equals("")){
            JOptionPane.showMessageDialog(null,"MÜŞTERİ İD'Sİ EKSİK");
            customeroperations cop=new customeroperations();
            cop.setVisible(true);
        }
       else{
          
            try{           
          Statement stmt=conn.createStatement();
          ResultSet rs=stmt.executeQuery("Select * from bank.loanapp where userid='"+id+"'");
             if(rs.next()){
                String papp= rs.getString(4);
                
                String mapp= rs.getString(3);
                System.out.print(papp+mapp);
                if(papp.equals("onayla") && mapp.equals("onayla")){
                    int amount =rs.getInt(2);
                    String situation="ödenmedi";
                    
                    stmt.execute("INSERT INTO bank.loandebt VALUES('"+id+"',"+amount+",'"+situation+"')");
                    JOptionPane.showMessageDialog(null,"Tebrikler.Krediniz Onaylandı. Bizi tercih ettiğiniz için teşekkür ederiz..");
                    
                }
                else{
                    JOptionPane.showMessageDialog(null,"Kredi başvurunuz onaylanmamıştır.");
                    
                }
                 
             }  
           }catch(Exception e){
               
           }
       }
        
    }//GEN-LAST:event_loanqueryActionPerformed

    private void paymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paymentActionPerformed
        customerpayment cpay=new customerpayment();
        cpay.setVisible(true);
    }//GEN-LAST:event_paymentActionPerformed

    private void creditcardappActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_creditcardappActionPerformed
        String id=id_area.getText();
       if(id.equals("")){
            JOptionPane.showMessageDialog(null,"MÜŞTERİ İD'Sİ EKSİK");
            customeroperations cop=new customeroperations();
            cop.setVisible(true);
        }
       else{
           
            try{           
          Statement stmt=conn.createStatement();
            ResultSet rs=stmt.executeQuery("Select * from bank.creditcardapp where userid='"+id+"'");
            if(rs.next()){
                JOptionPane.showMessageDialog(null,"Onay bekleyen kredi kartı başvurunuz bulunmaktadır.");
                
            }
            else{
                stmt.execute("INSERT INTO bank.creditcardapp VALUES('"+id+"',0,0)");
                JOptionPane.showMessageDialog(null,"Başvurunuz alınmıştır.");
            }
            
            
               
           }catch(Exception e){
               
           }
           
       }
    }//GEN-LAST:event_creditcardappActionPerformed

    private void creditlimitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_creditlimitActionPerformed
        String id=id_area.getText();
       if(id.equals("")){
            JOptionPane.showMessageDialog(null,"MÜŞTERİ İD'Sİ EKSİK");
            customeroperations cop=new customeroperations();
            cop.setVisible(true);
        }
       else{
          
            try{           
          Statement stmt=conn.createStatement();
            ResultSet rs=stmt.executeQuery("Select * from bank.creditcarduser where userid='"+id+"'");
           if(rs.next()){
               int limit=rs.getInt(2);
               JOptionPane.showMessageDialog(null,"Kredi kartı limitiniz "+limit+"kadardır. Limitinizin 3 katına kadar arturabilirsiniz.");
               String response=JOptionPane.showInputDialog("Artırmak istediğiniz limit tutarını giriniz");
               int newlimit=new Integer(response);
               if(newlimit>=limit*3){
                   JOptionPane.showMessageDialog(null,"Kredi kartı limitiniz "+limit+"kadardır. Limitinizin 3 katına kadar arturabilirsiniz.");
               }
               else{
                   stmt.execute("UPDATE bank.creditcarduser SET balance="+newlimit+"");
                   JOptionPane.showMessageDialog(null,"Limit artırma işleminiz başarıyla gerçekleşti");
               }
               
           }else{
               ResultSet rs2=stmt.executeQuery("Select * from bank.creditcardapp where userid='"+id+"'");
               if(rs2.next()){
                   int pers=rs2.getInt(2);
                   int mana=rs2.getInt(3);
                   if(pers==1 && mana==1){
                       ResultSet rs3=stmt.executeQuery("Select * from bank.customer where customer_id='"+id+"'");
                       if(rs3.next()){
                           int balance=rs3.getInt(5);
                           int firstlimit=balance*3;
                           stmt.execute("Insert into bank.creditcarduser VALUES('"+id+"',"+firstlimit+")");
                           JOptionPane.showMessageDialog(null,"Kredi Kartı başvurunuz onaylanmıştır.Limitiniz: "+firstlimit);
                           JOptionPane.showMessageDialog(null,"Limitinizi müşteri işlemlerinden arttırabilirsiniz");
                          
                       }
                   }
                   else{
                       JOptionPane.showMessageDialog(null,"Kredi kartınız henüz onaylanmamış.Bu işlemi gerçekleştiremiyoruz.");
                   }
               }
               else{
                   JOptionPane.showMessageDialog(null,"Kredi Kartınız bulunmamaktadır.İsterseniz müşteri işlemlerinden başvurabilirsiniz.");
                    customeroperations cop=new customeroperations();
            cop.setVisible(true);
               }
               
           }
            
               
           }catch(Exception e){
               
           }
           
           
       }
        
        
    }//GEN-LAST:event_creditlimitActionPerformed

    private void exitbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitbuttonActionPerformed
       loginpage login=new loginpage();
       login.setVisible(true);
    }//GEN-LAST:event_exitbuttonActionPerformed

    private void loandebtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loandebtActionPerformed
       String id=id_area.getText();
       if(id.equals("")){
            JOptionPane.showMessageDialog(null,"MÜŞTERİ İD'Sİ EKSİK");
            customeroperations cop=new customeroperations();
            cop.setVisible(true);
        }
       else{
         
            try{           
          Statement stmt=conn.createStatement();
            ResultSet rs=stmt.executeQuery("Select * from bank.loandebt where user_id='"+id+"'");
            if(rs.next()){
                int amount=rs.getInt(2);
                JOptionPane.showMessageDialog(null,amount+" tuttarında kredi borcunuz bulunmamaktadır");
            }else{
                JOptionPane.showMessageDialog(null,"Kredi borcunuz bulunmamaktadır");
            }
            
           }catch(Exception e){
               
           }
           
       }
        
        
        
    }//GEN-LAST:event_loandebtActionPerformed
    
   
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
            java.util.logging.Logger.getLogger(customeroperations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(customeroperations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(customeroperations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(customeroperations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new customeroperations().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton changepin;
    private javax.swing.JButton creditcardapp;
    private javax.swing.JButton creditlimit;
    private javax.swing.JButton exitbutton;
    private javax.swing.JTextField id_area;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton learningbalance;
    private javax.swing.JButton loanapplication;
    private javax.swing.JButton loandebt;
    private javax.swing.JButton loanquery;
    private javax.swing.JButton moneydeposit;
    private javax.swing.JButton moneytransfer;
    private javax.swing.JButton moneywithdrawal;
    private javax.swing.JButton payment;
    // End of variables declaration//GEN-END:variables
}

