
import java.sql.*;


public class DatabaseConnection {
   
    private static Connection conn;
    
    public Connection baglan(  ){
        return conn;
    }
    public DatabaseConnection(  ){

       
        
        try{  
Class.forName("org.apache.derby.jdbc.EmbeddedDriver");  
conn=DriverManager.getConnection(   
"jdbc:derby://localhost:1527/bankdb", "bank", "bank" );  

}catch( Exception e ){ System.out.println( e );}  
        
    }
    
    
}
