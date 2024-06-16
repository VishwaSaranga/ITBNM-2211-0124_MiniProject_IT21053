/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.DBSearch;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author saran
 */
public class SearchController {
    
    public void searchTraveler(JTable travelerTable, String TrName){
        System.out.println(TrName);
        int numOfRow = 0;
        ResultSet rs = null;
        DefaultTableModel TBL= (DefaultTableModel)travelerTable.getModel();
        rs = new DBSearch().similerTravelersSearch(TrName);
        try {
            if(rs!=null){
                if(rs.last()){
                    numOfRow = rs.getRow();
                    rs.beforeFirst();
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(SearchController.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(numOfRow>0){
           TBL.setRowCount(0);
           try {
               while(rs.next()){
                   String trId = rs.getString("TravelerID");
                   String trNIC = rs.getString("TravelerNIC");
                   String trName = rs.getString("TravelerName");
                   String trContact = rs.getString("TravelerContact");
                   String trPassword = rs.getString("TravelerPassword");

                   String tData[] = {trId,trNIC,trName,trPassword,trContact};
                   TBL.addRow(tData);

               }
           }catch (SQLException ex) {
               Logger.getLogger(SearchController.class.getName()).log(Level.SEVERE, null, ex);
           }
        }  
    }
    
    public void searchGuide(JTable guideTable, String GdName){
        System.out.println(GdName);
        int numOfRow = 0;
        ResultSet rs = null;
        DefaultTableModel TBL= (DefaultTableModel)guideTable.getModel();
        rs = new DBSearch().similerGuideSearch(GdName);
        try {
            if(rs!=null){
                if(rs.last()){
                    numOfRow = rs.getRow();
                    rs.beforeFirst();
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(SearchController.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(numOfRow>0){
           TBL.setRowCount(0);
           try {
               while(rs.next()){
                   String gdId = rs.getString("GuideID");
                   String gdNIC = rs.getString("GuideNIC");
                   String gdName = rs.getString("GuideName");
                   String gdContact = rs.getString("GuideContact");
                   String gdPassword = rs.getString("GuidePassword");
                   String vehicleNo = rs.getString("VehicleNo");
                   String model = rs.getString("VehicleModel");
                   int price = Integer.parseInt(rs.getString("PriceForDay"));

                   String gData[] = {gdId,gdNIC,gdName,gdPassword,gdContact,vehicleNo,model,String.valueOf(price)};
                   TBL.addRow(gData);

               }
           }catch (SQLException ex) {
               Logger.getLogger(SearchController.class.getName()).log(Level.SEVERE, null, ex);
           }
        }  
    }

    public void searchTour(JTable tourTable, String TrID) {
        System.out.println(TrID);
        int numOfRow = 0;
        ResultSet rs = null;
        DefaultTableModel TBL= (DefaultTableModel)tourTable.getModel();
        rs = new DBSearch().similerTourSearch(TrID);
        try {
            if(rs!=null){
                if(rs.last()){
                    numOfRow = rs.getRow();
                    rs.beforeFirst();
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(SearchController.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(numOfRow>0){
           TBL.setRowCount(0);
           try {
               while(rs.next()){
                   String tuId = rs.getString("TourID");
                String trID = rs.getString("TravelerId");
                String sCity = rs.getString("StartCity");
                String eCity = rs.getString("EndCity");
                String locations = rs.getString("Locations");
                int days = Integer.parseInt(rs.getString("Days"));
                String gdID = rs.getString("GuideId");
                int total = Integer.parseInt(rs.getString("TotalPrice"));
                        
                String tData[] = {tuId,trID,sCity,eCity,locations,String.valueOf(days),gdID,String.valueOf(total)};
                TBL.addRow(tData);

               }
           }catch (SQLException ex) {
               Logger.getLogger(SearchController.class.getName()).log(Level.SEVERE, null, ex);
           }
        }  
    }
    
}