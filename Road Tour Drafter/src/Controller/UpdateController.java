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
public class UpdateController {
    
    static String TrUserID;
    static String GdUserID;
    
    static void getUserID(String userID) {
        TrUserID = userID;
        GdUserID = userID;
    }
    
    public void updateTravelerTable(JTable travlerTable){
        ResultSet rs=null;
        DefaultTableModel TBL= (DefaultTableModel)travlerTable.getModel();
        
        TBL.setRowCount(0);
        rs = new DBSearch().saerchAllTravelers();
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
        } catch (SQLException ex) {
            Logger.getLogger(UpdateController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void updateGuideTable(JTable guideTable){
        ResultSet rs=null;
        DefaultTableModel TBL= (DefaultTableModel)guideTable.getModel();
        
        TBL.setRowCount(0);
        rs = new DBSearch().saerchAllGuides();
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
        } catch (SQLException ex) {
            Logger.getLogger(UpdateController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void updateTravelerView(JTable guideTable){
        ResultSet rs=null;
        DefaultTableModel TBL= (DefaultTableModel)guideTable.getModel();
        
        TBL.setRowCount(0);
        rs = new DBSearch().saerchAllGuides();
        try {
            while(rs.next()){
                String gdId = rs.getString("GuideID");
                   String gdName = rs.getString("GuideName");
                   String gdContact = rs.getString("GuideContact");
                   String vehicleNo = rs.getString("VehicleNo");
                   String model = rs.getString("VehicleModel");
                   int price = Integer.parseInt(rs.getString("PriceForDay"));

                   String gData[] = {gdId,gdName,gdContact,vehicleNo,model,String.valueOf(price)};
                   TBL.addRow(gData);
            }
        } catch (SQLException ex) {
            Logger.getLogger(UpdateController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    public void updateTourView(JTable travelerPageTBL){
        ResultSet rs=null;
        DefaultTableModel TBL= (DefaultTableModel)travelerPageTBL.getModel();
        
        TBL.setRowCount(0);
        rs = new DBSearch().searchTourForTr(TrUserID);
        try {
            while(rs.next()){
                   String TuId = rs.getString("TourID");
                   String SCity = rs.getString("StartCity");
                   String eCity = rs.getString("EndCity");
                   String location = rs.getString("Locations");
                   int days = Integer.parseInt(rs.getString("Days"));
                   String gId = rs.getString("GuideId");
                   int total = Integer.parseInt(rs.getString("TotalPrice"));

                   String gData[] = {TuId,SCity,eCity,location,String.valueOf(days),gId,String.valueOf(total)};
                   TBL.addRow(gData);
            }
        } catch (SQLException ex) {
            Logger.getLogger(UpdateController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void updateTourViewForGd(JTable guidePageTBL){
        ResultSet rs=null;
        DefaultTableModel TBL= (DefaultTableModel)guidePageTBL.getModel();
        
        TBL.setRowCount(0);
        rs = new DBSearch().searchTourForGd(GdUserID);
        try {
            while(rs.next()){
                   String TuId = rs.getString("TourID");
                   String TrId = rs.getString("TravelerID");
                   String SCity = rs.getString("StartCity");
                   String eCity = rs.getString("EndCity");
                   String location = rs.getString("Locations");
                   int days = Integer.parseInt(rs.getString("Days"));
                   int total = Integer.parseInt(rs.getString("TotalPrice"));

                   String gData[] = {TuId,TrId,SCity,eCity,location,String.valueOf(days),String.valueOf(total)};
                   TBL.addRow(gData);
            }
        } catch (SQLException ex) {
            Logger.getLogger(UpdateController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void updateTourTable(JTable tourTable) {
        ResultSet rs=null;
        DefaultTableModel TBL= (DefaultTableModel)tourTable.getModel();
        
        TBL.setRowCount(0);
        rs = new DBSearch().searchAllTours();
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
        } catch (SQLException ex) {
            Logger.getLogger(UpdateController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
