package Start_Project;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Login extends JFrame implements ActionListener{  
    JLabel l1;    
    JButton b1, b2;
    Login() {

        setTitle("Club Membership Management System");

        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       ImageIcon i1 = new ImageIcon("D:\\CSE-110 All Program here\\CSE110_Final_Project\\Icon\\ClubLogo.png");
        Image i2 = i1.getImage().getScaledInstance(160, 160, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l11 = new JLabel(i3);
        l11.setBounds(310, 80, 150, 110);
        add(l11);

        l1 = new JLabel("WELCOME TO EWU CLUB");
        l1.setFont(new Font("Osward", Font.BOLD, 30));
        l1.setBounds(220, 205, 450, 50);
        add(l1);
        b1 = new JButton("ADMIN");
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b2 = new JButton("USER");
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);        
        b1.setFont(new Font("Arial", Font.BOLD, 18));
        b1.setBounds(240, 345, 100, 30);
        add(b1);

        b2.setFont(new Font("Arial", Font.BOLD, 18));
        b2.setBounds(420, 345, 100, 30);
        add(b2);        
        b1.addActionListener(this);
        b2.addActionListener(this);
        getContentPane().setBackground(Color.WHITE);
        setSize(800, 480);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent ae) {
        try {
            if (ae.getSource() == b1) {
                setVisible(false);
                 new AdminEntry();
            } else if (ae.getSource() == b2) {
               this.setVisible(false);
                new UserLogin();               
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
 

