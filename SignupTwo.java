
package Start_Project;



import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class SignupTwo extends JFrame implements ActionListener {

    JLabel l1,l2,l3,lfn1;
    JButton b,b1;
     JTextField te;
    String userID ="333";

    SignupTwo(String userID) {

        this.userID = userID;
        
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon("D:\\CSE-110 All Program here\\CSE110_Final_Project\\Icon\\Password.png");
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l14 = new JLabel(i3);
        l14.setBounds(200, 50, 100, 100);
        add(l14);
        setTitle("Set Password Form ");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        l2 = new JLabel("Hi User!");
        l2.setFont(new Font("Raleway", Font.BOLD, 50));
        l2.setBounds(350, 100, 600, 70);
        add(l2);
       
        l2 = new JLabel("Set Your Paswword.");
        l2.setFont(new Font("Raleway", Font.BOLD, 35));
        l2.setBounds(250, 180, 600, 50);
        add(l2);
        
        l1 = new JLabel("User Id :      "+userID);
        l1.setFont(new Font("Raleway", Font.BOLD, 22));
        l1.setBounds(300, 250, 300, 40);
        add(l1);

      
        lfn1 = new JLabel("Password :");
        lfn1.setFont(new Font("Raleway", Font.BOLD, 22));
        lfn1.setBounds(300, 300, 120, 30);
        add(lfn1);
        
        te = new JTextField();
        te.setFont(new Font("Raleway", Font.BOLD, 14));
        te.setBounds(420, 300, 150, 30);
        add(te);

        b = new JButton("Save");
        b.setFont(new Font("Raleway", Font.BOLD, 18));
        b.setBackground(Color.BLACK);
        b.setForeground(Color.WHITE);
        b.setBounds(370, 350, 80, 20);
        add(b);
        
        b1 = new JButton("Back");
        b1.setFont(new Font("Raleway", Font.BOLD, 14));
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBounds(650, 450, 80, 20);
        add(b1);
        

        

        b.addActionListener(this);
        b1.addActionListener(this);

        getContentPane().setBackground(Color.WHITE);

        setSize(850, 580);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {

            String pass = te.getText();
           
        try {
             BufferedWriter wr = new BufferedWriter(new FileWriter("D:\\CSE-110 All Program here\\CSE110_Final_Project\\Ducument\\password.txt", true));
             wr.write( userID + "\t" + pass+"\n");
             wr.close();
            if(ae.getSource()==b) {   
                 JOptionPane.showMessageDialog(null, "Sucessfully SignIn.\nNow You Can LogIn.");
                  setVisible(false);
                new UserLogin().setVisible(true);
                
            }else if(ae.getSource()==b1) {
                setVisible(false);
                JOptionPane.showMessageDialog(null, "You Can not Back.SignIn Again From First. ");
               new UserLogin().setVisible(true);
                 
            }
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
