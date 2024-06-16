/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author saran
 */
public class DBConnection {
    static Connection conn; 
    static Statement stat = null; 
     
    public static Statement getStatementConnection() { 
         try { 
//Establish the connection 
         String url = "jdbc:mysql://localhost:3306/road_tour_drafter";
         conn = (Connection) DriverManager.getConnection(url, "root", ""); 
//Create the connection 
         stat = (Statement) conn.createStatement(); 
        
        } catch (Exception e) { 
            e.printStackTrace();          
        } 
           return stat; 
        }
    
    //Close the connection 
public static void closeCon() throws SQLException { 
        conn.close(); 
    }   
}