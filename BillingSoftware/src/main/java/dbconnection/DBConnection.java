/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Acer
 */
public class DBConnection {
     static Connection con=null;
   
    
     static public Connection getConnect()
    {
    
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql:///sasta_billing_software","root","root");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return con;
    }
}
