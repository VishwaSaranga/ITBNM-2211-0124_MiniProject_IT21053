/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import javax.swing.JOptionPane;

/**
 *
 * @author saran
 */
public class EditController {
    
    public static void travelerEdit(String oldID, String TravelerID, String TravelerNIC,String TravelerName,String TravelerContact,String TravelerPassword){
        new Model.DBUpdate().updateTraveler(oldID, TravelerID, TravelerNIC, TravelerName, TravelerContact,  TravelerPassword);
        JOptionPane.showMessageDialog(null, "Details has been updated", "Successful",JOptionPane.INFORMATION_MESSAGE);
    }
    
    public static void guideEdit(String oldID, String guideID, String guideNIC, String guideName, String guideContact, String guidePassword, String VehicleNo, String VehicleModel, int PriceForDay){
        new Model.DBUpdate().updateGuide(oldID, guideID, guideNIC, guideName, guideContact,  guidePassword, VehicleNo, VehicleModel, PriceForDay);
        JOptionPane.showMessageDialog(null, "Details has been updated", "Successful",JOptionPane.INFORMATION_MESSAGE);
    }
}
