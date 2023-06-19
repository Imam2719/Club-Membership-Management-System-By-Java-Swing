
package Start_Project;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.Scanner;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class AdminEntry extends JFrame implements ActionListener {

    JLabel l1, l2, l3;
    JTextField tf1;
    JPasswordField pf2;
    JButton b1, b2,b3;

    AdminEntry() {

        setTitle("Club Membership Management System(Admin Panel)");

        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ImageIcon i1 = new ImageIcon("D:\\CSE-110 All Program here\\CSE110_Final_Project\\Icon\\adminLogin.png");
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l11 = new JLabel(i3);
        l11.setBounds(120, 35, 100, 100);
        add(l11);

        l1 = new JLabel("Admin Login page");
        l1.setFont(new Font("Osward", Font.BOLD, 35));
        l1.setBounds(255, 50, 400, 45);
        add(l1);

        l2 = new JLabel("Username:");
        l2.setFont(new Font("Raleway", Font.BOLD, 28));
        l2.setBounds(125, 150, 375, 30);
        add(l2);

        tf1 = new JTextField(15);
        tf1.setBounds(300, 150, 230, 30);
        tf1.setFont(new Font("Arial", Font.BOLD, 14));
        add(tf1);

        l3 = new JLabel("Password:");
        l3.setFont(new Font("Raleway", Font.BOLD, 28));
        l3.setBounds(125, 220, 375, 30);
        add(l3);

        pf2 = new JPasswordField(15);
        pf2.setFont(new Font("Arial", Font.BOLD, 14));
        pf2.setBounds(300, 220, 230, 30);
        add(pf2);

        b1 = new JButton("SIGN IN");
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);

        b2 = new JButton("CLEAR");
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        
        b3 = new JButton("BACK");
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.WHITE);

        b1.setFont(new Font("Arial", Font.BOLD, 14));
        b1.setBounds(300, 300, 100, 30);
        add(b1);

        b2.setFont(new Font("Arial", Font.BOLD, 14));
        b2.setBounds(430, 300, 100, 30);
        add(b2);
        
        b3.setFont(new Font("Arial", Font.BOLD, 14));
        b3.setBounds(680, 400, 75, 20);
        add(b3);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);

        getContentPane().setBackground(Color.WHITE);

        setSize(800, 480);
        setLocationRelativeTo(null);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        try {
            if (ae.getSource() == b1) {
                String ID, password;
                ID = tf1.getText();
                password= pf2.getText();
                File fi = new File("D:\\CSE-110 All Program here\\CSE110_Final_Project\\Ducument\\admin.txt");
                int count;
                try (Scanner input = new Scanner(fi)) {
                    count = 0;
                    while(input.hasNext()){
                        String username = input.next();
                        String pin = input.next();
                        if (ID.equals(username) && password.equals(pin)) {
                            count++;
                            break;
                        }
                    }
                }
                if(count == 0){
                    JOptionPane.showMessageDialog(null, "Wrong Username or Password\nTry Again");
                }else{
                    JOptionPane.showMessageDialog(null, "Admin Login Successfully");
                    setVisible(false);
                    new AdminInterface();                   
                }
            }else if (ae.getSource() == b2) {
                    tf1.setText("");
                    pf2.setText("");
                }else if(ae.getSource() == b3){
                    this.setVisible(false);
                 new Login().setVisible(true);
                }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
  
}


