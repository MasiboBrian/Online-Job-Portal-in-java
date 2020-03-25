import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.*;
public class Login
{
    //declare reference variable
    JLabel lblform, lblusername, lblpassword;
    JTextField txtusername;
    JButton btnlogin;
    JLabel lblNewUser;
    JPasswordField txtpassword;
    
Login()
        
{ 
    //create a form
    JFrame loginform = new JFrame("Applicant Login");
    // Create componetnts to be placed on the form
    lblform = new JLabel("Welcome to Phastar Job Portal");
    lblform.setForeground(Color.blue);
    lblform.setFont(new Font("Serif", Font.BOLD, 20));
    lblusername = new JLabel("Username");
    lblpassword = new JLabel("Password");
    txtusername = new JTextField();
    txtpassword = new JPasswordField();
    btnlogin = new JButton("Login");
    lblNewUser = new JLabel("Create Acount");
    //Specify the x, y, widthand height of components
    //(x,y) is the coordinate of the upper-left corner of the component
    lblform.setBounds(80,30,400,30);
    lblusername.setBounds(80,70,200,30);
    lblpassword.setBounds(80,110,200,30);
    txtusername.setBounds(300,70,200,30);
    txtpassword.setBounds(300,110,200,30);
    btnlogin.setBounds(300,160,100,30);
    lblNewUser.setBounds(300,200,100,30);
       
    //Add the components on the container
    loginform.add(lblform);
    loginform.add(lblusername);
    loginform.add(txtusername);
    loginform.add(txtpassword);
    loginform.add(lblpassword);
    loginform.add(btnlogin);
    loginform.add(lblNewUser);
    //define the size of the container
    loginform.setSize(600,300);
    loginform.setLayout(null);
    loginform.setVisible(true);
}
public static void main(String[]args){
    //create a new Login form
    new Login();}

 
}