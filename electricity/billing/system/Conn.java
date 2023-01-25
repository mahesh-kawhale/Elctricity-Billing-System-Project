package electricity.billing.system;

import java.sql.*;

public class Conn {

    Connection c;
    Statement s;      // interface
    
    public Conn() 
    {
        try 
        {
        	Class.forName("com.mysql.cj.jdbc.Driver");//load the driver
        	
        	// Make connection
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/ele", "root", "root"); 
            
            //create statement
            s = c.createStatement();    
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }
}
