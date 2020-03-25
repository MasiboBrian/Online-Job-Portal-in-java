
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Admin {
     Admin()
    {

JMenuBar MenuBr = new JMenuBar();
      JMenu ManageUserMenu = new JMenu("Manage Applicant");
      JMenu ManageHROfficerMenu = new JMenu("Manage HR Officer");
      JMenu ManageVacanciesMenu = new JMenu("Manage Vacancies");
      JMenu SignOutMenu =new JMenu ("Sign Out");
       //create menu items
      
      JMenuItem BlockA = new JMenuItem ("Block applicant");
      JMenuItem EditA = new JMenuItem ("Edit Applicant");
      JMenuItem DeleteA = new JMenuItem ("Delete Applicant");
      
      JMenuItem BlockHR = new JMenuItem("Block HR Officer");
      JMenuItem EditHR = new JMenuItem ("Edit HR Officer");
      JMenuItem DeleteHR = new JMenuItem("Delete");
      
      JMenuItem ApproveV = new JMenuItem ("Approve Vacancy");
      JMenuItem EditV =new JMenuItem ("Edit Vacancy");
      JMenuItem PostV = new JMenuItem ("Post Vacancy");
      JMenuItem DeleteV = new JMenuItem ("Delete Vacancy");
      
      
      JMenuItem SendMail = new JMenuItem ("Send Mails");
      JMenuItem ScheduleTests = new JMenuItem ("Schedule Tests");
      JMenuItem SortApplicants = new JMenuItem ("Sort Successful Applicants");
      
      ManageUserMenu.add(BlockA);
      ManageUserMenu.add(EditA);
      ManageUserMenu.add(DeleteA);
      ManageUserMenu.add(SendMail);
      
      ManageHROfficerMenu.add(BlockHR);
      ManageHROfficerMenu.add(EditHR);
      ManageHROfficerMenu.add(DeleteHR);
      
      ManageVacanciesMenu.add(ApproveV);
      ManageVacanciesMenu.add(EditV);
      ManageVacanciesMenu.add(PostV);
      ManageVacanciesMenu.add(DeleteV);
      ManageVacanciesMenu.add(ScheduleTests);
      ManageVacanciesMenu.add(SortApplicants);
   
      
     
      //add Menu to Menu Bar
      MenuBr.add(ManageUserMenu);
      MenuBr.add(ManageHROfficerMenu);
      MenuBr.add(ManageVacanciesMenu);
      MenuBr.add(SignOutMenu);
      
     
      //Add  menu items to each Menu
     
    
      
      //
      //Create a Frame
      JFrame frame = new JFrame("System Administrator Home");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setSize(1800,1500);
      //Add menuBar to the frame
      frame.getContentPane().add(BorderLayout.NORTH, MenuBr);
      frame.setVisible(true);
      
          
    }//end constructor
    public static void main (String args[])
    {//begin main
        //instatiate the Menu Form
        new Admin();
    }
}