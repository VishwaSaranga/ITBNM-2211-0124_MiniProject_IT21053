/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;

/**
 *
 * @author saran
 */
public class DBDelete {
    
    Statement stmt;
    
    public boolean deleteTravelerRow(String ID) {
        boolean result = false;
            String query = String.format("DELETE FROM traveler WHERE TravelerID='%s'",ID);
            stmt = DBConnection.getStatementConnection();
        try {
            result = stmt.executeUpdate(query) > 0;
        }catch (SQLException ex) {
            Logger.getLogger(AddRecord.class.getName()).log(Level.SEVERE,null,ex);
        }
        return result;
    }
    
    public boolean deleteGuideRow(String ID) {
        boolean result = false;
            String query = String.format("DELETE FROM guide WHERE GuideID='%s'",ID);
            stmt = DBConnection.getStatementConnection();
        try {
            result = stmt.executeUpdate(query) > 0;
        }catch (SQLException ex) {
            Logger.getLogger(AddRecord.class.getName()).log(Level.SEVERE,null,ex);
        }
        return result;
    }
    
    public boolean deleteTourRow(String ID) {
        boolean result = false;
            String query = String.format("DELETE FROM tourdetails WHERE TourID='%s'",ID);
            stmt = DBConnection.getStatementConnection();
        try {
            result = stmt.executeUpdate(query) > 0;
        }catch (SQLException ex) {
            Logger.getLogger(AddRecord.class.getName()).log(Level.SEVERE,null,ex);
        }
        return result;
    }
}
