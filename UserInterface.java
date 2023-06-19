
package Start_Project;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class UserInterface extends JFrame implements ActionListener { 
    JLabel label1;
    JButton btn1, btn2,btn3,btn4,btn5,btn6,btn7; 
    UserInterface() {      
        setTitle("USER INTERFACE");      
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);      
        ImageIcon logo = new ImageIcon("D:\\CSE-110 All Program here\\CSE110_Final_Project\\Icon\\UserDemo.png");
        Image icon = logo.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon logo1 = new ImageIcon(icon);
        JLabel logoLabel = new JLabel(logo1);
        logoLabel.setBounds(260, 20, 300, 100);
        add(logoLabel);
           
        label1 = new JLabel("Home");
        label1.setFont(new Font("Osward", Font.BOLD, 38));
        label1.setBounds(350, 130, 350, 40);
        add(label1);       
        btn1 = new JButton("Media");
        btn1.setBackground(Color.BLACK);
        btn1.setForeground(Color.WHITE);
        
        btn2 = new JButton("Notice");
        btn2.setBackground(Color.BLACK);
        btn2.setForeground(Color.WHITE);
       
        btn3 = new JButton("Report");
        btn3.setBackground(Color.BLACK);
        btn3.setForeground(Color.WHITE);
       
        btn4 = new JButton("Event");
        btn4.setBackground(Color.BLACK);
        btn4.setForeground(Color.WHITE);
       
        btn5 = new JButton("Contact Us");
        btn5.setBackground(Color.BLACK);
        btn5.setForeground(Color.WHITE);
       
        btn6 = new JButton("About CLub");
        btn6.setBackground(Color.BLACK);
        btn6.setForeground(Color.WHITE);
      
        btn7 = new JButton("Log Out");
        btn7.setBackground(Color.BLACK);
        btn7.setForeground(Color.WHITE);     
        
        btn1.setFont(new Font("Arial", Font.BOLD, 17));
        btn1.setBounds(140, 200, 180, 30);
        add(btn1);
        
        btn2.setFont(new Font("Arial", Font.BOLD, 17));
        btn2.setBounds(500, 200, 180, 30);
        add(btn2);
        
        btn3.setFont(new Font("Arial", Font.BOLD, 17));
        btn3.setBounds(140, 250, 180, 30);
        add(btn3);
        
        btn4.setFont(new Font("Arial", Font.BOLD, 17));
        btn4.setBounds(500, 250, 180, 30);
        add(btn4);
        
        btn5.setFont(new Font("Arial", Font.BOLD, 17));
        btn5.setBounds(140, 300, 180, 30);
        add(btn5);
        
        btn6.setFont(new Font("Arial", Font.BOLD, 17));
        btn6.setBounds(500, 300, 180, 30);
        add(btn6);
       
        btn7.setFont(new Font("Arial", Font.BOLD, 17));
        btn7.setBounds(335, 368, 150, 25);
        add(btn7);
        
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        btn4.addActionListener(this);
        btn5.addActionListener(this);
        btn6.addActionListener(this);
        btn7.addActionListener(this);
        
        getContentPane().setBackground(Color.WHITE);
        
        setSize(800, 480);
        setLocationRelativeTo(null);
        add(label1);
        setVisible(true);   
    }   
    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == btn1) {            
            setVisible(false);
            new Media().setVisible(true);
        } else if (ae.getSource() == btn2) { 
           setVisible(false);
            new ClubNotice().setVisible(true);
        }
        else if (ae.getSource() == btn3) {            
           setVisible(false);
            new Reoprt();
        }
         else if (ae.getSource() == btn4) { 
           setVisible(false);
            new ClubEvent().setVisible(true);
        }
       
         else if (ae.getSource() == btn5) {            
           setVisible(false);
            new ContactClube();
        }
        else if (ae.getSource() == btn6) { 
           setVisible(false);
            try {
                new AboutCLub() ;
            } catch (IOException ex) {
                Logger.getLogger(UserInterface.class.getName()).log(Level.SEVERE, null, ex);
            }
       
        }else if (ae.getSource() == btn7) {            
            setVisible(false);
            new Login().setVisible(true);
        }
        } 
         public static void main(String[] args) {
        new UserInterface().setVisible(true);
    }
    }

