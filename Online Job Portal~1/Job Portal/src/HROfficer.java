
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
public class HROfficer {
    HROfficer()
    
    {
  

JMenuBar MenuBr = new JMenuBar();
      JMenu CreateAccountMenu = new JMenu("Create Account");
      JMenu LoginMenu = new JMenu("Login");
      JMenu CreateVacancyMenu = new JMenu("Create Vacancy");
      JMenu PostVacancyMenu = new JMenu("Post Vacancy");
      JMenu ShortlistMenu = new JMenu ("Shortlist");
      JMenu ViewCV = new JMenu ("View CV");
      JMenu EmployApplicantMenu = new JMenu ("Employ Applicant");
      JMenu SignOutMenu =new JMenu ("Sign Out");
      
       //create menu items
      
      MenuBr.add (CreateVacancyMenu);
      MenuBr.add (PostVacancyMenu);
      MenuBr.add (ShortlistMenu);
      MenuBr.add (ViewCV);
      MenuBr.add (EmployApplicantMenu);
      MenuBr.add (SignOutMenu);
    
        
      //
      //Create a Frame
      JFrame frame = new JFrame("Human Resource Officer Home Page");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setSize(1800,1500);
      //Add menuBar to the frame
      frame.getContentPane().add(BorderLayout.NORTH, MenuBr);
      frame.setVisible(true);
      
          
    }//end constructor
    public static void main (String args[])
    {//begin main
        //instatiate the Menu Form
        new HROfficer();
    }
}