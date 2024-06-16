/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import static Controller.InsertController.AddTraveler;
import Model.DBSearch;
import View.AddGuide;
import View.AddTraveler;
import View.GuideLoginPage;
import View.TravelerLoginPage;
import View.TravelerPage;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author saran
 */
public class InsertController {
    
    public static void InsertTraveler(String ID, String NIC, String Name, String Contact, String Password){
        
        if(ID.length()==0 || NIC.length()==0 || Name.length()==0 || Contact.length()==0 || Password.length()==0){
            JOptionPane.showMessageDialog(null, " Insufficient values ","Error", JOptionPane.ERROR_MESSAGE); 
        }
       
        else{
            new Model.AddRecord().AddTraveler(ID,NIC,Name,Contact,Password); 
            JOptionPane.showMessageDialog(null, "New Record has been inserted", "Successfull", JOptionPane.INFORMATION_MESSAGE);
            System.out.println("Adding Successfull");
            TravelerLoginPage.getFrames()[0].dispose();
            new TravelerLoginPage().setVisible(true);
        }      
    }
    
    public static void InsertGuide(String ID, String NIC, String Name, String Contact, String Password, String VehicleNo, String Model, int Price){
        
        if(ID.length()==0 || NIC.length()==0 || Name.length()==0 || Contact.length()==0 || Password.length()==0 || VehicleNo.length()==0 || Model.length()==0){
            JOptionPane.showMessageDialog(null, " Insufficient values ","Error", JOptionPane.ERROR_MESSAGE); 
        }
       
        else{
            new Model.AddRecord().AddGuide(ID,NIC,Name,Contact,Password,VehicleNo,Model,Price); 
            JOptionPane.showMessageDialog(null, "New Record has been inserted", "Successfull", JOptionPane.INFORMATION_MESSAGE);
            System.out.println("Adding Successfull");
            GuideLoginPage.getFrames()[0].dispose();
            new GuideLoginPage().setVisible(true);
        }      
    }
    
    /**As with the insert methods, I created the add methods for admin purposes.
     * Because when system owners need to add more admin controllers then I need to edit only these parts.**/
    
    public static void AddTraveler(String ID, String NIC, String Name, String Contact, String Password){
        
        if(ID.length()==0 || NIC.length()==0 || Name.length()==0 || Contact.length()==0 || Password.length()==0){
            JOptionPane.showMessageDialog(null, " Insufficient values ","Error", JOptionPane.ERROR_MESSAGE); 
        }
       
        else{
            new Model.AddRecord().AddTraveler(ID,NIC,Name,Contact,Password); 
            JOptionPane.showMessageDialog(null, "New Record has been inserted", "Successfull", JOptionPane.INFORMATION_MESSAGE);
            System.out.println("Adding Successfull");
            AddTraveler.getFrames()[0].dispose();
            new AddTraveler().setVisible(true);
        }      
    }
    
    public static void AddGuide(String ID, String NIC, String Name, String Contact, String Password, String VehicleNo, String Model, int Price){
        
        if(ID.length()==0 || NIC.length()==0 || Name.length()==0 || Contact.length()==0 || Password.length()==0 || VehicleNo.length()==0 || Model.length()==0){
            JOptionPane.showMessageDialog(null, " Insufficient values ","Error", JOptionPane.ERROR_MESSAGE); 
        }
       
        else{
            new Model.AddRecord().AddGuide(ID,NIC,Name,Contact,Password,VehicleNo,Model,Price); 
            JOptionPane.showMessageDialog(null, "New Record has been inserted", "Successfull", JOptionPane.INFORMATION_MESSAGE);
            System.out.println("Adding Successfull");
            AddGuide.getFrames()[0].dispose();
            new AddGuide().setVisible(true);
        }      
    }
    
    public static void AddTour(String travelerId, String startCity, String endCity, String location, int days, String guideId) throws SQLException {
        if (travelerId.length() == 0 || startCity.length() == 0 || endCity.length() == 0 || location.length() == 0 || guideId.length() == 0) {
            JOptionPane.showMessageDialog(null, " Insufficient values ", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            String ID = travelerId + guideId;
            int price = retrievePriceFromDatabase(guideId);
            int total = price*days;
            new Model.AddRecord().AddTour(ID, travelerId, startCity, endCity, location, days, guideId, total);
            JOptionPane.showMessageDialog(null, "New Record has been inserted", "Successful", JOptionPane.INFORMATION_MESSAGE);
            System.out.println("Adding Successful");
        }
    }

    private static int retrievePriceFromDatabase(String guideId) throws SQLException {
        DBSearch dbSearch = new DBSearch();
        ResultSet rs = dbSearch.searchGuideForPrice(guideId);
        int price = 0;
        if (rs.next()) {
            price = rs.getInt("PriceForDay");
        }
        // Close resources (optional, consider using connection pool)
        rs.close();
        return price;
    }
}
