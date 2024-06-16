/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import com.mysql.jdbc.Statement;
import java.sql.SQLException;

/**
 *
 * @author saran
 */
public class DBUpdate {
    
    Statement stmt; 
    
    public void updateTraveler(String oldID, String ID, String NIC,String Name,String Contact,String Password){
        try{
            stmt = DBConnection.getStatementConnection();
            stmt.executeUpdate("Update traveler SET TravelerID='"+ID+"',TravelerNIC='"+NIC+"',TravelerName='"+Name+"',TravelerPassword='"+Password+"',TravelerContact='"+Contact+"' WHERE TravelerID='"+oldID+"' ");
        }
        catch(SQLException e){
        }
    }
    
    public void updateGuide(String oldID, String ID, String NIC,String Name,String Contact,String Password, String VehicleNo, String Model, int Price){
        try{
            stmt = DBConnection.getStatementConnection();
            stmt.executeUpdate("Update guide SET GuideID='"+ID+"',GuideNIC='"+NIC+"',GuideName='"+Name+"',GuidePassword='"+Password+"',GuideContact='"+Contact+"',VehicleNo='"+VehicleNo+"',VehicleModel='"+Model+"',PriceForDay='"+Price+"' WHERE GuideID='"+oldID+"' ");
        }
        catch(SQLException e){
        }
    }
}
