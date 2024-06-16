/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.DBConnection;
import Model.DBSearch;
import View.AdminLoginPage;
import View.AdminPage;
import View.GuideLoginPage;
import View.GuidePage;
import View.TravelerLoginPage;
import View.TravelerPage;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author saran
 */
public class LoginController {
    
    public static void Adminlogin(String usName, String pass, JFrame frame) { 
    try { 
        String username = null; // initial value of the username 
        String password = null; // initial value of the password 
        ResultSet rs = new DBSearch().searchAdmin(usName); 
        //Process the Query 
        while (rs.next()) { 
        username = rs.getString("AdminName"); //assign database login name to the variable
        password = rs.getString("AdminPassword"); //assign database password to the variable 
            } 
            if (username != null && password != null) { 
                if (password.equals(pass)) { 
                    System.out.println("Login Successfull");
                    new AdminPage().setVisible(true);
                    frame.dispose();
                }else { 
                    JOptionPane.showMessageDialog(null, "Please check the credentials", "Error", JOptionPane.ERROR_MESSAGE); 
                } 
            } else { 
                JOptionPane.showMessageDialog(null, "Please check the Credentials", "Error", JOptionPane.ERROR_MESSAGE); 
            } 
            DBConnection.closeCon(); 
        } catch (SQLException ex) {        
            Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex); 
        } 
    } 

    public static void Travelerlogin(String TrName, String Trpass) {
        try { 
        String username = null; // initial value of the username 
        String password = null; // initial value of the password 
        String TrUserID = null;
        ResultSet rs = new DBSearch().searchTraveler(TrName); 
        //Process the Query 
        while (rs.next()) { 
        username = rs.getString("TravelerName"); //assign database login name to the variable
        password = rs.getString("TravelerPassword"); //assign database password to the variable 
        TrUserID = rs.getString("TravelerID");
            } 
            if (username != null && password != null) { 
                if (password.equals(Trpass)) { 
                    System.out.println("Login Successfull");
                    System.out.println(TrUserID);
                    UpdateController.getUserID(TrUserID);
                    TravelerLoginPage.getFrames()[0].dispose();
                    new TravelerPage().setVisible(true);                   
                }else { 
                    JOptionPane.showMessageDialog(null, "Please check the credentials", "Error", JOptionPane.ERROR_MESSAGE); 
                } 
            } else { 
                JOptionPane.showMessageDialog(null, "Please check the Credentials", "Error", JOptionPane.ERROR_MESSAGE); 
            } 
            //DBConnection.closeCon(); 
        } catch (SQLException ex) {        
            Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex); 
        } 
    }
    
    public static void Guidelogin(String GdName, String Gdpass) {
        try { 
        String username = null; // initial value of the username 
        String password = null; // initial value of the password
        String GdUserID = null;
        ResultSet rs = new DBSearch().searchGuide(GdName); 
        //Process the Query 
        while (rs.next()) { 
        username = rs.getString("GuideName"); //assign database login name to the variable
        password = rs.getString("GuidePassword"); //assign database password to the variable
        GdUserID = rs.getString("GuideID");
            } 
            if (username != null && password != null) { 
                if (password.equals(Gdpass)) { 
                    System.out.println("Login Successfull");
                    System.out.println(GdUserID);
                    UpdateController.getUserID(GdUserID);
                    GuideLoginPage.getFrames()[0].dispose();
                    new GuidePage().setVisible(true);
                }else { 
                    JOptionPane.showMessageDialog(null, "Please check the credentials", "Error", JOptionPane.ERROR_MESSAGE); 
                } 
            } else { 
                JOptionPane.showMessageDialog(null, "Please check the Credentials", "Error", JOptionPane.ERROR_MESSAGE); 
            } 
            DBConnection.closeCon(); 
        } catch (SQLException ex) {        
            Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex); 
        } 
    }
}