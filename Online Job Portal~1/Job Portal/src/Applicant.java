
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
public class Applicant {
    Applicant()
           
    
  {
JMenuBar MenuBr = new JMenuBar();
      JMenu CreateAccountMenu = new JMenu("Create Account");
      JMenu LoginMenu = new JMenu("Login");
      JMenu UploadCVMenu = new JMenu("Upload CV");
      JMenu SearchVacancyMenu = new JMenu("Search");
      JMenu ApplyJobMenu = new JMenu ("Apply");
      JMenu TakeExamMenu = new JMenu ("Take Online Exam");
      JMenu GiveFeedbackMenu = new JMenu ("Give Feedback");
      JMenu SignOutMenu =new JMenu ("Sign Out");
      
       //create menu items
     
      
      MenuBr.add (UploadCVMenu);
      MenuBr.add (SearchVacancyMenu);
      MenuBr.add (ApplyJobMenu);
      MenuBr.add (TakeExamMenu);
      MenuBr.add (GiveFeedbackMenu);
      MenuBr.add (SignOutMenu);
      
     
      //Add  menu items to each Menu
     
          
      //
      //Create a Frame
      JFrame frame = new JFrame("Applicant Home Page");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setSize(1800,1500);
      //Add menuBar to the frame
      frame.getContentPane().add(BorderLayout.NORTH, MenuBr);
      frame.setVisible(true);
      
          
    }//end constructor
    public static void main (String args[])
    {//begin main
        //instatiate the Menu Form
        new Applicant();
    }
    }
