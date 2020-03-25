/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.swing.*;
import java.awt.*;

//Use a constructor to define tyhe menu form
public class Menu {
    Menu()
    {
        //Create Menus and add them to the menu bar
      JMenuBar MenuBr = new JMenuBar();
      JMenu VacanciesMenu = new JMenu("Vacancies");
      JMenu AdministratorMenu = new JMenu("Administrator");
       //create menu items
      
      JMenu HR = new JMenu ("HR Officer");
      JMenu Applicant = new JMenu ("Applicant");
      
      
      //add Menu to Menu Bar
     
      MenuBr.add(VacanciesMenu);
      MenuBr.add(AdministratorMenu);
      MenuBr.add(HR);
      MenuBr.add(Applicant);
     
      //Add  menu items to each Menu
     
  
      
      //
      //Create a Frame
      JFrame frame = new JFrame("Phastar Job Portal");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setSize(1500,1500);
      //Add menuBar to the frame
      frame.getContentPane().add(BorderLayout.NORTH, MenuBr);
      frame.setVisible(true);
      
          
    }//end constructor
    public static void main (String args[])
    {//begin main
        //instatiate the Menu Form
        new Menu();
    }// end main
    } //end menu class



