
import java.sql.*;
import javax.swing.JOptionPane;


public class BankManager extends User  {
public int salary;
   public String province;
   public String position;

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
    public BankManager(String id) {
        super(id);
    }
 DatabaseConnection connect=new DatabaseConnection();
           Connection conn=connect.baglan();
    @Override
    void login(String id, String password) {
   
            try{           
          Statement stmt=conn.createStatement();
           String logincontrol="Select * from bank.manager where manager_id='"+id+"' AND password='"+password+"'";
           ResultSet rs=stmt.executeQuery(logincontrol);
           if(rs.next()){
               String name=rs.getString(2);
               JOptionPane.showMessageDialog(null,"HOŞGELDİNİZ "+name);
              manageroperations mop=new manageroperations(); 
               mop.setVisible(true);          
           }
           
           else{
               JOptionPane.showMessageDialog(null,"KULLANICI ADI VEYA ŞİFRE HATALI");
           }
           
         
     }catch(Exception a){
         
     }
    }

    @Override
    void register(String id, String name, String password, String phone) {
        int salary=this.getSalary();
        String province=this.getProvince();
        String position=this.getPosition();
         try{
           
          Statement stmt=conn.createStatement();
          
          stmt.execute("INSERT INTO bank.manager VALUES('"+id+"','"+name+"','"+password+"','"+phone+"',0,1500,"+salary+",'"+province+"','"+position+"')");
           JOptionPane.showMessageDialog(null,name+" Başarıyla kayıt olundu.Manager id'niz:"+id);
           loginpage login=new loginpage();
           login.setVisible(true);
    }catch(Exception e){
        
    }
    }

    @Override
    public void moneywithdrawal(String id) {
        
            try{           
          Statement stmt=conn.createStatement();
            ResultSet rs=stmt.executeQuery("Select * from bank.manager where manager_id='"+id+"'");
            if(rs.next()){
                String tutar=JOptionPane.showInputDialog("Lütfen çekmek istediğiniz tutarı giriniz");
              int amount=Integer.parseInt(tutar);
             int balance=rs.getInt(5);
              int addbalance=rs.getInt(6);
              if(amount<=balance){
                  balance-=amount;
               JOptionPane.showMessageDialog(null,amount+" hesabınızdan çekildi. Kalan bakiye:"+balance);
               stmt.execute("UPDATE bank.manager SET balance="+balance+" ");       
              }
              else{
                  if((balance+addbalance)<amount){
                      JOptionPane.showMessageDialog(null,"BAKİYE YETERSİZ");    
                  }
                  else{
                       JOptionPane.showMessageDialog(null,balance+" Hesabınızdan çekildi"+(amount-balance)+"ek hesbaınızdan çekildi");
                      amount=amount-balance;
                      balance=0;        
                      addbalance-=amount;
                     stmt.execute("UPDATE bank.manager SET balance="+balance+",addbalance="+addbalance+" ");
                  }
              }
            }
            else{
                
              JOptionPane.showMessageDialog(null,"YÖNETİCİ İD HATALI");
              manageroperations mop=new manageroperations();
            mop.setVisible(true);
          
            }
      }catch(Exception e){
          
      }
    }

    @Override
    public void moneydeposit(String id) {
 
            try{           
          Statement stmt=conn.createStatement();
          ResultSet rs=stmt.executeQuery("Select * from bank.manager where manager_id='"+id+"'");
          if(rs.next()){
             
              String tutar=JOptionPane.showInputDialog("Lütfen yatırmak istediğiniz tutarı giriniz");
              int amount=Integer.parseInt(tutar);
             int balance=rs.getInt(5);
             balance+=amount;
            stmt.execute("UPDATE bank.manager SET balance="+balance+" ");
            
            JOptionPane.showMessageDialog(null,amount+"Hesabınıza eklendi");
            
          }
          else{
              JOptionPane.showMessageDialog(null,"YÖNETİCİ İD HATALI.SİSTEMİMİZDE KAYITLI BÖYLE BİR İD BULUNMAMAKTADIR.LÜTFEN KONTROL EDİNİZ");
               manageroperations mop=new manageroperations();
            mop.setVisible(true);
          }
        }catch(Exception e){
            
        } 
    }

    @Override
    public void moneytransfer(String id) {
       
            try{           
          Statement stmt=conn.createStatement();
          ResultSet rs=stmt.executeQuery("Select * from bank.manager where manager_id='"+id+"'");
          if(rs.next()){
              String account_id=JOptionPane.showInputDialog("Lütfen para göndermek istediğiniz hesap numarasını girin.");
             
              String tutar=JOptionPane.showInputDialog("Lütfen göndermek istediğiniz tutarı giriniz");
              int amount=Integer.parseInt(tutar);
             int balance=rs.getInt(5);
             int addbalance=rs.getInt(6);
              if(amount<=balance){
                  balance-=amount;
               JOptionPane.showMessageDialog(null,amount+" hesabınızdan transfer edildi. Kalan bakiye:"+balance);
               stmt.execute("UPDATE bank.manager SET balance="+balance+" ");       
              }
              else{
                  if((balance+addbalance)<amount){
                      JOptionPane.showMessageDialog(null,"BAKİYE YETERSİZ");    
                  }
                  else{
                       JOptionPane.showMessageDialog(null,balance+" transfer edildi."+(amount-balance)+"ek hesbaınızdan transfer edildi");
                      amount=amount-balance;
                      balance=0;        
                      addbalance-=amount;
                     stmt.execute("UPDATE bank.manager SET balance="+balance+",addbalance="+addbalance+" ");
                  }
              }
            }
            else{
                
              JOptionPane.showMessageDialog(null,"YÖNETİCİ İD HATALI.SİSTEMİMİZDE KAYITLI BÖYLE BİR İD BULUNMAMAKTADIR.LÜTFEN KONTROL EDİNİZ");
               manageroperations mop=new manageroperations();
             mop.setVisible(true);
          
            }
          
            
        }catch(Exception e){
            
        }
    }

    @Override
    public void changepin(String id) {
      
            try{           
          Statement stmt=conn.createStatement();
          ResultSet rs=stmt.executeQuery("Select * from bank.manager where manager_id='"+id+"'");
          if(rs.next()){
             String password=rs.getString(3);
             String input=JOptionPane.showInputDialog("Mevcut şifrenizi giriniz");
              if(!input.equals(password)){
                  JOptionPane.showMessageDialog(null,"Şifre hatalı. Lütfen mevcut şifrenizi giriniz.");
                  
              }
              else{
              String newpassword=JOptionPane.showInputDialog("Yeni şifrenizi girin.");
              stmt.execute("UPDATE bank.manager SET password='"+newpassword+"' ");
              JOptionPane.showMessageDialog(null,"ŞİFRENİZ DEĞİŞTİRİLDİ");
              }  
          }
          else{
              JOptionPane.showMessageDialog(null, "YÖNETİCİ İDS'Sİ HATALI.SİSTEMİMİZDE KAYITLI BÖYLE BİR İD BULUNMAMAKTADIR.LÜTFEN KONTROL EDİNİZ");
             manageroperations mop=new manageroperations();
             mop.setVisible(true);
          } 
       }catch(Exception e){
           
    }
    }

    @Override
    public void payment(String id,String billname) {
       
            try{           
          Statement stmt=conn.createStatement();
          ResultSet rs=stmt.executeQuery("Select * from bank.manager where manager_id='"+id+"'");
          if(rs.next()){
              String account_id=JOptionPane.showInputDialog("Lütfen para ödemek istediğiniz fatura numarasını girin.");
             String tutar=JOptionPane.showInputDialog("Lütfen fatura tutarını giriniz");
              int amount=Integer.parseInt(tutar);
             int balance=rs.getInt(5);
             int addbalance=rs.getInt(6);
             if(amount<=balance){
                  balance-=amount;
               JOptionPane.showMessageDialog(null,amount+" tutarında faturanız ödendi.");
               stmt.execute("UPDATE bank.manager SET balance="+balance+" ");       
              }
              else{
                  if((balance+addbalance)<amount){
                      JOptionPane.showMessageDialog(null,"BAKİYE YETERSİZ. ÖDEME İŞLEMİNİ GERÇEKLEŞTİREMİYORUZ.");    
                  }
                  else{
                       JOptionPane.showMessageDialog(null,amount+" tl tutarında "+billname+" faturanız ödendi.");
                      amount=amount-balance;
                      balance=0;        
                      addbalance-=amount;
                     stmt.execute("UPDATE bank.manager SET balance="+balance+",addbalance="+addbalance+" ");
                  }
              }
              
          }
           else{
              JOptionPane.showMessageDialog(null, "YÖNETİCİ İDS'Sİ HATALI.SİSTEMİMİZDE KAYITLI BÖYLE BİR İD BULUNMAMAKTADIR.LÜTFEN KONTROL EDİNİZ");
             manageroperations mop=new manageroperations();
             mop.setVisible(true);
             
          }  
       }catch(Exception e){
           
       }
    }
    
}
