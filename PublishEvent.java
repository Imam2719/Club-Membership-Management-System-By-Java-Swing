//PublishEvent
package Start_Project;


import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class PublishEvent extends JFrame implements ActionListener {

    JLabel l1,l2,l3,lfn1;
    JButton b,b1;
     JTextField te;
     JTextArea te1;
     JScrollPane t;

    PublishEvent() {       
        setLayout(null);       
        ImageIcon i1 = new ImageIcon("D:\\CSE-110 All Program here\\CSE110_Final_Project\\Icon\\PE.png");
        Image i2 = i1.getImage().getScaledInstance(120,120, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l14 = new JLabel(i3);
        l14.setBounds(40, 20, 120, 120);
        add(l14);
        setTitle("PUBLISH CLUB EVENT");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        l2 = new JLabel("Event Topic:");
        l2.setFont(new Font("Raleway", Font.BOLD, 30));
        l2.setBounds(200,60, 350, 50);
        add(l2);
              
        te = new JTextField();
        te.setFont(new Font("Raleway", Font.BOLD, 14));
        te.setBounds(380,73, 300, 30);
        add(te);
        
        te1 = new JTextArea("Write Club Event....");
        te1.setFont(new Font("Raleway", Font.PLAIN, 16));
        te1.setLineWrap(true);
        te1.setWrapStyleWord(true);
         
        t = new JScrollPane(te1);
        t.setBounds(160, 150, 550, 290);
        add(t);

        b = new JButton("Publish");
        b.setFont(new Font("Raleway", Font.BOLD, 20));
        b.setBackground(Color.BLACK);
        b.setForeground(Color.WHITE);
        b.setBounds(380, 450, 122, 25);
        add(b);
        
        b1 = new JButton("Back");
        b1.setFont(new Font("Raleway", Font.BOLD, 14));
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBounds(700, 490, 80, 20);
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

            String userID = te.getText();
            String Report = te1.getText();
           
        try {
            File myObj = new File("D:\\CSE-110 All Program here\\CSE110_Final_Project\\ClubEvent\\"+userID+".txt");         
            BufferedWriter wr = new BufferedWriter(new FileWriter(myObj, true));
             wr.write( Report+"\n");
             wr.close();
            if(ae.getSource()==b) {   
                 JOptionPane.showMessageDialog(null, "Sucessfully Club Event Published.");
                  setVisible(false);
                new PublishEvent().setVisible(true);        
            }else if(ae.getSource()==b1) {
                setVisible(false);
             new AdminInterface().setVisible(true);                 
            }           
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
    }
}
