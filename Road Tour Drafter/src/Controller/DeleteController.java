/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.DBDelete;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;

/**
 *
 * @author saran
 */
public class DeleteController {
    
    public void deleteTraveler(JTable travlerTable){
        int selectedRow = travlerTable.getSelectedRow();
        if(selectedRow != -1){
            String ID = (String)travlerTable.getValueAt(selectedRow, 0);
            
            int choice = JOptionPane.showConfirmDialog(null, "Are you sure?", "Confirmation", JOptionPane.YES_NO_OPTION);

            if (choice == JOptionPane.YES_OPTION) {
                boolean result = new DBDelete().deleteTravelerRow(ID);
                if(result){
                    JOptionPane.showMessageDialog(new JFrame(), "Sucessfully Deleted!");
                }else{
                    JOptionPane.showMessageDialog(new JFrame(), "Error When Deleting!", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }else{
            JOptionPane.showMessageDialog(new JFrame(), "Please Select a Row!", "Error", JOptionPane.ERROR_MESSAGE);
        }  
    }
    
    public void deleteGuide(JTable guideTable){
        int selectedRow = guideTable.getSelectedRow();
        if(selectedRow != -1){
            String ID = (String)guideTable.getValueAt(selectedRow, 0);
            
            int choice = JOptionPane.showConfirmDialog(null, "Are you sure?", "Confirmation", JOptionPane.YES_NO_OPTION);

            if (choice == JOptionPane.YES_OPTION) {
                boolean result = new DBDelete().deleteGuideRow(ID);
                if(result){
                    JOptionPane.showMessageDialog(new JFrame(), "Sucessfully Deleted!");
                }else{
                    JOptionPane.showMessageDialog(new JFrame(), "Error When Deleting!", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }else{
            JOptionPane.showMessageDialog(new JFrame(), "Please Select a Row!", "Error", JOptionPane.ERROR_MESSAGE);
        }  
    }
    
    public void deleteTour(JTable travelerPageTBL){
        int selectedRow = travelerPageTBL.getSelectedRow();
        if(selectedRow != -1){
            String ID = (String)travelerPageTBL.getValueAt(selectedRow, 0);
            
            int choice = JOptionPane.showConfirmDialog(null, "Are you sure?", "Confirmation", JOptionPane.YES_NO_OPTION);

            if (choice == JOptionPane.YES_OPTION) {
                boolean result = new DBDelete().deleteTourRow(ID);
                if(result){
                    JOptionPane.showMessageDialog(new JFrame(), "Sucessfully Deleted!");
                }else{
                    JOptionPane.showMessageDialog(new JFrame(), "Error When Deleting!", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }else{
            JOptionPane.showMessageDialog(new JFrame(), "Please Select a Row!", "Error", JOptionPane.ERROR_MESSAGE);
        }  
    }
    
    public void deleteTourAdmin(JTable tourTable){
        int selectedRow = tourTable.getSelectedRow();
        if(selectedRow != -1){
            String ID = (String)tourTable.getValueAt(selectedRow, 0);
            
            int choice = JOptionPane.showConfirmDialog(null, "Are you sure?", "Confirmation", JOptionPane.YES_NO_OPTION);

            if (choice == JOptionPane.YES_OPTION) {
                boolean result = new DBDelete().deleteTourRow(ID);
                if(result){
                    JOptionPane.showMessageDialog(new JFrame(), "Sucessfully Deleted!");
                }else{
                    JOptionPane.showMessageDialog(new JFrame(), "Error When Deleting!", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }else{
            JOptionPane.showMessageDialog(new JFrame(), "Please Select a Row!", "Error", JOptionPane.ERROR_MESSAGE);
        }  
    }
}
