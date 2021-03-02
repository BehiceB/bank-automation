
public abstract class  User implements Imoneywithdrawal,Imoneydeposit,Imoneytransfer,Ichangepin,Ipayment{
    static String url="jdbc:derby://localhost:1527/bankdb";
    static String dbname="bank";
    static String dbpassword="bank";
    public String id;
    public String password;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public User(String id) {
        this.id = id;
        
    }
    public void setPassword(String password) {
        this.password = password;
    }
   
    abstract void login(String id,String password);   
    abstract void register(String id,String name,String password,String phone);
}
