//ReportCheck
package Start_Project;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class ReportCheck extends JFrame implements ActionListener {

    JLabel l1, l2, l3;
    JMenuBar mb;
    JMenu file;
    JMenuItem open;
    JTextArea ta; 
    JButton b;
    JScrollPane t;
    int a;

    ReportCheck( ) {
      
        setTitle("Report Checker Board");
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ImageIcon i1 = new ImageIcon("D:\\CSE-110 All Program here\\CSE110_Final_Project\\Icon\\CheckReoprt.png");
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        
        JLabel l11 = new JLabel(i3);
        l11.setBounds(280, 7, 200,90);
        add(l11);
        
        open = new JMenuItem("Click Here");
        open.addActionListener(this);

        open.setBackground(Color.WHITE);
        open.setForeground(Color.BLACK);
        open.setFont(new Font("Osward", Font.BOLD, 15));
        open.setBounds(320, 110, 115,20);
        add(open);
                     
        ta = new JTextArea(600, 500);
        ta.setFont(new Font("Raleway", Font.PLAIN, 16));
        ta.setLineWrap(true);
        ta.setWrapStyleWord(true);
        
        t = new JScrollPane(ta);
        t.setBounds(80, 145, 650, 240);
        add(t);
  
        b = new JButton("BACK");
        b.setBackground(Color.BLACK);
        b.setForeground(Color.WHITE);
               
        b.setFont(new Font("Arial", Font.BOLD, 14));
        b.setBounds(680, 400, 75, 20);
        add(b);
      
        b.addActionListener(this);

        getContentPane().setBackground(Color.WHITE);

        setSize(800, 480);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent ae) {
        try {
               if (ae.getSource() == open) {
            JFileChooser fc = new JFileChooser("D:\\CSE-110 All Program here\\CSE110_Final_Project\\MemberReport");
            int i = fc.showOpenDialog(this);
            if (i == JFileChooser.APPROVE_OPTION) {
                File f = fc.getSelectedFile();
                String filepath = f.getPath();
                BufferedReader br = new BufferedReader(new FileReader(filepath));
                    String s1 = "", s2 = "";
                    while ((s1 = br.readLine()) != null) {
                        s2 += s1 + "\n";
                    }
                    ta.setText(s2);
                    br.close();                    
            }
              } 
         else if(ae.getSource() == b){  
                 setVisible(false);
                 new AdminInterface();        
               }
                } catch (FileNotFoundException ex) {
            Logger.getLogger(ClubNotice.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ClubNotice.class.getName()).log(Level.SEVERE, null, ex);
        }
         catch (Exception e) {
            e.printStackTrace();
        }
    }
}
