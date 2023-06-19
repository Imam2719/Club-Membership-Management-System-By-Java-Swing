
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


public class AddNewAdmin extends JFrame implements ActionListener {

    JLabel l1,l2,l3,lfn1;
    JButton b,b1;
     JTextField te,tu;

    AddNewAdmin( ) {
        
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon("D:\\CSE-110 All Program here\\CSE110_Final_Project\\Icon\\Password.png");
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l14 = new JLabel(i3);
        l14.setBounds(330, 10, 150, 150);
        add(l14);
        setTitle("New Admin set ");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        l2 = new JLabel("New Admin SignUp Form");
        l2.setFont(new Font("Raleway", Font.BOLD, 45));
        l2.setBounds(150, 135, 600, 70);
        add(l2);
       
        
        l1 = new JLabel("Set User Id :      ");
        l1.setFont(new Font("Raleway", Font.BOLD, 30));
        l1.setBounds(215, 230, 300, 40);
        add(l1);

      
        lfn1 = new JLabel("Set Password :");
        lfn1.setFont(new Font("Raleway", Font.BOLD, 30));
        lfn1.setBounds(215, 300, 300, 30);
        add(lfn1);
        
        tu = new JTextField();
        tu.setFont(new Font("Raleway", Font.BOLD, 14));
        tu.setBounds(460, 233, 150, 30);
        add(tu);
        
        te = new JTextField();
        te.setFont(new Font("Raleway", Font.BOLD, 14));
        te.setBounds(460, 302, 150, 30);
        add(te);

        b = new JButton("Set Admin");
        b.setFont(new Font("Raleway", Font.BOLD, 25));
        b.setBackground(Color.BLACK);
        b.setForeground(Color.WHITE);
        b.setBounds(350, 370, 160, 30);
        add(b);
        
        b1 = new JButton("Back");
        b1.setFont(new Font("Raleway", Font.BOLD, 14));
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBounds(680, 400, 80, 20);
        add(b1);
        
        b.addActionListener(this);
        b1.addActionListener(this);

        getContentPane().setBackground(Color.WHITE);

        setSize(800, 480);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        String userID = tu.getText();
        String pass = te.getText();
        try {
            BufferedWriter wr = new BufferedWriter(new FileWriter("D:\\CSE-110 All Program here\\CSE110_Final_Project\\Ducument\\admin.txt", true));
            wr.write(userID + "\t" + pass + "\n");
            wr.close();
            if (ae.getSource() == b) {        
                if (userID==null || pass == null){
                    JOptionPane.showMessageDialog(null, "Plese Set Admin");
                }else{
                    JOptionPane.showMessageDialog(null, "Sucessfully Admin Added.\nNow Admin Can LogIn.");
                    setVisible(false);
                    new AddNewAdmin().setVisible(true);  
                }
            } 
            if (ae.getSource() == b1) {
                setVisible(false);
                new AdminInterface().setVisible(true);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
       public static void main(String[] args) {
        new AddNewAdmin().setVisible(true);
    } 
}
