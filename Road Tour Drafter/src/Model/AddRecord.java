/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author saran
 */
public class AddRecord {
    Statement stmt;
    
    public void AddTraveler(String ID, String NIC, String Name, String Contact, String Password){
       try {
            stmt = DBConnection.getStatementConnection();
            
            stmt.executeUpdate("INSERT INTO traveler VALUES('"+ID+"', '"+NIC+"', '"+Name+"', '"+Password+"','"+Contact+"')");
        }
        catch(SQLException e){
        } 
    }
    
    public void AddGuide(String ID, String NIC, String Name, String Contact, String Password, String VehicleNo, String Model, int Price){
       try {
            stmt = DBConnection.getStatementConnection();
            
            stmt.executeUpdate("INSERT INTO guide VALUES('"+ID+"', '"+NIC+"', '"+Name+"', '"+Password+"','"+Contact+"','"+VehicleNo+"','"+Model+"','"+Price+"')");
        }
        catch(SQLException e){
        } 
    }

    public void AddTour(String ID, String travelerId, String startCity, String endCity, String location, int days, String guideId, int price) {
        try {
            stmt = DBConnection.getStatementConnection();
            
            stmt.executeUpdate("INSERT INTO tourdetails VALUES('"+ID+"', '"+travelerId+"', '"+startCity+"', '"+endCity+"','"+location+"','"+days+"','"+guideId+"','"+price+"')");
        }
        catch(SQLException e){
        } 
    }

    
}
