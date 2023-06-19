
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

public class UserLogin extends JFrame implements ActionListener {

    JLabel lr, label1, label2, label3;
    JTextField tf;
    JPasswordField pf;
    JButton btn1, btn2, btn3,btn4;

    UserLogin() {

        setTitle("USER LOGIN PANEL");

        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ImageIcon i1 = new ImageIcon("D:\\CSE-110 All Program here\\CSE110_Final_Project\\Icon\\userLogin.png");
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l11 = new JLabel(i3);
        l11.setBounds(100, 15, 100, 100);
        add(l11);

        label1 = new JLabel();
        label1.setText("User Login Page");
        Font f = new Font("SERIF", Font.BOLD, 38);
        label1.setFont(f);
        label1.setBounds(265, 65, 500, 50);
        add(label1);

        label2 = new JLabel();
        label2.setText("User Id:");
        
        Font f1 = new Font("Raleway", Font.BOLD, 28);
        label2.setFont(f1);
        label2.setBounds(125, 150, 375, 30);
        add(label2);

        tf = new JTextField(15);
        tf.setBounds(300, 150, 230, 30);
        Font f2 = new Font("Arial", Font.BOLD, 14);
        tf.setFont(f2);
        add(tf);

        label3 = new JLabel("PIN:");
        label3.setFont(f1);
        label3.setBounds(125, 220, 375, 30);
        add(label3);

        pf = new JPasswordField(15);
        pf.setFont(f2);
        pf.setBounds(300, 220, 230, 30);
        add(pf);

        btn1 = new JButton("SIGN IN");
        btn1.setBackground(Color.BLACK);
        btn1.setForeground(Color.WHITE);

        btn2 = new JButton("CLEAR");
        btn2.setBackground(Color.BLACK);
        btn2.setForeground(Color.WHITE);

        btn3 = new JButton("Become a Member");
        btn3.setBackground(Color.BLACK);
        btn3.setForeground(Color.WHITE);
        
        btn4 = new JButton("BACK");
        btn4.setBackground(Color.BLACK);
        btn4.setForeground(Color.WHITE);

        btn1.setFont(f2);
        btn1.setBounds(300, 300, 100, 30);
        add(btn1);

        btn2.setFont(f2);
        btn2.setBounds(430, 300, 100, 30);
        add(btn2);

        btn3.setFont(f2);
        btn3.setBounds(330, 350, 180, 30);
        add(btn3);
        
        btn4.setFont(f2);
        btn4.setBounds(680, 400, 75, 20);
        add(btn4);

        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        btn4.addActionListener(this);

        getContentPane().setBackground(Color.WHITE);

        setSize(800, 480);
        setLocationRelativeTo(null);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        try {
            if (ae.getSource() == btn1) {
                String ID, password;
                ID = tf.getText();
                password= pf.getText();
                File fi = new File("D:\\CSE-110 All Program here\\CSE110_Final_Project\\Ducument\\password.txt");
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
                    JOptionPane.showMessageDialog(null, "Login Successfull");
                    setVisible(false);
                    new UserInterface();                   
                }             
            } else if (ae.getSource() == btn2) {
                tf.setText("");
                pf.setText("");
            } else if (ae.getSource() == btn3) {
                setVisible(false);
                new ApplicationType();
            }else if(ae.getSource() == btn4){
                 this.setVisible(false);
                 new Login().setVisible(true);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
