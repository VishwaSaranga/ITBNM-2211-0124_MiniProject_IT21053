/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import static Model.DBConnection.conn;
import com.mysql.jdbc.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author saran
 */
public class DBSearch {
    
    Statement stmt; 
    ResultSet rs; 

    public ResultSet searchAdmin(String usName) { 
        try { 
            stmt = DBConnection.getStatementConnection(); 
            String AdminName = usName; 
            //Execute the Query 
            rs = stmt.executeQuery("SELECT * FROM admin where AdminName='" + AdminName + "'"); 
        } catch (SQLException e) { 
        } 
    return rs; 
    } 
    
    public ResultSet searchTraveler(String TrName) { 
        try { 
            stmt = DBConnection.getStatementConnection(); 
            String TravelerName = TrName; 
            //Execute the Query 
            rs = stmt.executeQuery("SELECT * FROM traveler where TravelerName='" + TravelerName + "'"); 
        } catch (SQLException e) { 
        } 
    return rs; 
    }
    
    public ResultSet searchGuide(String GdName) { 
        try { 
            stmt = DBConnection.getStatementConnection(); 
            String GuideName = GdName; 
            //Execute the Query 
            rs = stmt.executeQuery("SELECT * FROM guide where GuideName='" + GuideName + "'"); 
        } catch (SQLException e) { 
        } 
    return rs; 
    } 
    
    public ResultSet saerchAllTravelers() {
        try { 
            stmt = DBConnection.getStatementConnection(); 
            //Execute the Query 
            rs = stmt.executeQuery("SELECT * FROM traveler"); 
        } catch (SQLException e) { 
        } 
    return rs; 
    }
    
    public ResultSet saerchAllGuides() {
        try { 
            stmt = DBConnection.getStatementConnection(); 
            //Execute the Query 
            rs = stmt.executeQuery("SELECT * FROM guide"); 
        } catch (SQLException e) { 
        } 
    return rs; 
    }
    
    public ResultSet similerTravelersSearch(String TrName){
        try { 
            stmt = DBConnection.getStatementConnection();  
            rs = stmt.executeQuery("SELECT * FROM traveler where UPPER(TravelerName) LIKE '%%"+TrName.toUpperCase()+"%%'"); 
        } catch (SQLException e) { 
        } 
    return rs; 
    }
    
    public ResultSet similerGuideSearch(String GdName){
        try { 
            stmt = DBConnection.getStatementConnection();  
            rs = stmt.executeQuery("SELECT * FROM guide where UPPER(GuideName) LIKE '%%"+GdName.toUpperCase()+"%%'"); 
        } catch (SQLException e) { 
        } 
    return rs; 
    }
    
    public ResultSet searchTrEdit(String ID) {
      try{
          stmt=DBConnection.getStatementConnection();
          String TravelerID = ID;
          rs=stmt.executeQuery("SELECT * FROM traveler WHERE TravelerID ='"+TravelerID+"' ");
        }
        catch(SQLException e){
        }
    return rs;
    }
    
    public ResultSet searchGdEdit(String ID) {
      try{
          stmt=DBConnection.getStatementConnection();
          String GuideID = ID;
          rs=stmt.executeQuery("SELECT * FROM guide WHERE GuideID ='"+GuideID+"' ");
        }
        catch(SQLException e){
        }
    return rs;
    }
    
    public ResultSet searchGuideForPrice(String GdId) throws SQLException {
       try{
        stmt = DBConnection.getStatementConnection();

        rs=stmt.executeQuery("SELECT PriceForDay FROM guide WHERE GuideID ='"+GdId+"' ");
        }
        catch(SQLException e){
        }
    return rs;
    }

    public ResultSet searchAllTours() {
        try { 
            stmt = DBConnection.getStatementConnection(); 
            //Execute the Query 
            rs = stmt.executeQuery("SELECT * FROM tourdetails"); 
        } catch (SQLException e) { 
        } 
    return rs;
    }
    
    public ResultSet searchTourForTr(String TrUserID){
        try { 
            stmt = DBConnection.getStatementConnection(); 
            //Execute the Query 
            rs = stmt.executeQuery("SELECT * FROM tourdetails WHERE TravelerId ='"+TrUserID+"' "); 
        } catch (SQLException e) { 
        } 
    return rs;
    }
    
    public ResultSet searchTourForGd(String GdUserID){
        try { 
            stmt = DBConnection.getStatementConnection(); 
            //Execute the Query 
            rs = stmt.executeQuery("SELECT * FROM tourdetails WHERE GuideId ='"+GdUserID+"' "); 
        } catch (SQLException e) { 
        } 
    return rs;
    }

    public ResultSet similerTourSearch(String TrID) {
        try { 
            stmt = DBConnection.getStatementConnection();  
            rs = stmt.executeQuery("SELECT * FROM tourdetails where UPPER(TourID) LIKE '%%"+TrID.toUpperCase()+"%%'"); 
        } catch (SQLException e) { 
        } 
    return rs; 
    }
    
}