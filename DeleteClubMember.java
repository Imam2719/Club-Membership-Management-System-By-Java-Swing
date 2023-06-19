//DeleteClubMember

package Start_Project;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class DeleteClubMember extends JFrame implements ActionListener {

    JLabel l1, l2, l3;
    JTextField te,te1;
    JButton b,bb1;

    DeleteClubMember() {

        setTitle("Remove Club Member");

        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ImageIcon i1 = new ImageIcon("D:\\CSE-110 All Program here\\CSE110_Final_Project\\Icon\\RemoveClubMember.png");
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l11 = new JLabel(i3);
        l11.setBounds(320, 10, 120, 120);
        add(l11);

        l1 = new JLabel("Admin Working");
        l1.setFont(new Font("Osward", Font.BOLD, 45));
        l1.setBounds(250, 120, 350, 55);
        add(l1);
        
        l2 = new JLabel("Put UserID:");
        l2.setFont(new Font("Raleway", Font.BOLD, 30));
        l2.setBounds(250,190, 350, 50);
        add(l2);
        l3 = new JLabel("User Password:");
        l3.setFont(new Font("Raleway", Font.BOLD, 30));
        l3.setBounds(250,245, 350, 50);
        add(l3);
            
        te = new JTextField();
        te.setFont(new Font("Raleway", Font.BOLD, 14));
        te.setBounds(420,200, 100, 30);
        add(te);
        
        te1 = new JTextField();
        te1.setFont(new Font("Raleway", Font.BOLD, 14));
        te1.setBounds(480,255, 100, 30);
        add(te1);
                     
        b = new JButton("BACK");
        b.setBackground(Color.BLACK);
        b.setForeground(Color.WHITE);
        b.setFont(new Font("Arial", Font.BOLD, 14));
        b.setBounds(680, 400, 75, 20);
        add(b);
        
        bb1 = new JButton("Remove From Club");
        bb1.setBackground(Color.BLACK);
        bb1.setForeground(Color.WHITE);
        bb1.setFont(new Font("Arial", Font.BOLD, 20));
        bb1.setBounds(310, 320, 218, 25);
        add(bb1);
     
        b.addActionListener(this);
        bb1.addActionListener(this);
        
        getContentPane().setBackground(Color.WHITE);

        setSize(800, 480);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent ae) {
        try {
            if (ae.getSource() == bb1) {
                File f = new File("D:\\CSE-110 All Program here\\CSE110_Final_Project\\Ducument\\password.txt");
                File tmp = new File("D:\\CSE-110 All Program here\\CSE110_Final_Project\\Ducument\\tmp.txt");
                int count;
                try (Scanner input = new Scanner(f)) {
                    String userID = te.getText();
                    String pass = te1.getText();
                    count = 0;
                    while (input.hasNext()) {
                        String user = input.next();
                        String pin = input.next();
                        if (!userID.equals(user) && !pass.equals(pin)) {
                            try (BufferedWriter wr1 = new BufferedWriter(new FileWriter(tmp, true))) {
                                wr1.write(user + "\t"+pin+"\n");
                            }
                            count++;
                        }
                    }
                }
                f.delete();
                tmp.renameTo(f);
                if (count == 0) {
                    JOptionPane.showMessageDialog(null, "Something Wrong\nTry Again");
                } else {
                    JOptionPane.showMessageDialog(null, "Remove Successfully");
                    setVisible(false);
                    new DeleteClubMember().setVisible(true);
                }
            } else if (ae.getSource() == b) {
                setVisible(false);
                new AdminInterface().setVisible(true);
            }
        } catch (Exception e) {
            System.out.println("Error "+e);
        }
    }
}
