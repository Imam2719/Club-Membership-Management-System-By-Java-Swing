
package Start_Project;


import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

import javax.swing.JTextField;

public class Signup extends JFrame implements ActionListener {

    JLabel lr,l1, l2, ln, ldb, lg, le, lms,lms2, lad, lnd,ledu;
    JTextField tn, tdb, te, tad, tct,stdID;
    JRadioButton r1, r2, r3, r4, r5;
    JButton b,b1;
    JComboBox c1, c3,c4,c5;

    String userID;
    int at;

    Signup(String userID, int at) {

        this.userID = userID;
        this.at = at;
        setLayout(null);
        setTitle("NEW MEMBER APPLICATION FORM");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ImageIcon i1 = new ImageIcon("D:\\CSE-110 All Program here\\CSE110_Final_Project\\Icon\\Form.png");
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l11 = new JLabel(i3);
        l11.setBounds(100, 40, 100, 100);
        add(l11);

        l1 = new JLabel("APPLICATION FORM NO. " + userID);
        l1.setFont(new Font("Raleway", Font.BOLD, 30));
        l1.setBounds(225, 60, 600, 40);
        add(l1);

        l2 = new JLabel("Form 2: Personal Details");
        l2.setFont(new Font("Raleway", Font.BOLD, 22));
        l2.setBounds(290, 120, 600, 30);
        add(l2);

        ln = new JLabel("Name:");
        ln.setFont(new Font("Raleway", Font.BOLD, 20));
        ln.setBounds(100, 190, 100, 30);
        add(ln);

        ldb = new JLabel("Mobile:");
        ldb.setFont(new Font("Raleway", Font.BOLD, 20));
        ldb.setBounds(100, 240, 200, 30);
        add(ldb);

        lg = new JLabel("Gender:");
        lg.setFont(new Font("Raleway", Font.BOLD, 20));
        lg.setBounds(100, 290, 200, 30);
        add(lg);

        le = new JLabel("Email Address:");
        le.setFont(new Font("Raleway", Font.BOLD, 20));
        le.setBounds(100, 340, 200, 30);
        add(le);
        
        lr = new JLabel("Religion:");
        lr.setFont(new Font("Raleway", Font.BOLD, 20));
        lr.setBounds(100, 530, 100, 30);
        add(lr);

        lms = new JLabel("Interested Field :");
        lms.setFont(new Font("Raleway", Font.BOLD, 20));
        lms.setBounds(100, 390, 200, 30);
        add(lms);
        
        lms2 = new JLabel("Semester:");
        lms2.setFont(new Font("Raleway", Font.BOLD, 20));
        lms2.setBounds(450, 390, 200, 30);
        add(lms2);

        lad = new JLabel("Department:");
        lad.setFont(new Font("Raleway", Font.BOLD, 20));
        lad.setBounds(100, 440, 200, 30);
        add(lad);
        
        ledu = new JLabel("Blood Group:");
        ledu.setFont(new Font("Raleway", Font.BOLD, 20));
        ledu.setBounds(450, 530, 200, 30);
        add(ledu);

        lnd = new JLabel("Student ID:");
        lnd.setFont(new Font("Raleway", Font.BOLD, 20));
        lnd.setBounds(100, 490, 200, 30);
        add(lnd);

        tn = new JTextField();
        tn.setFont(new Font("Raleway", Font.BOLD, 14));
        tn.setBounds(300, 190, 400, 30);
        add(tn);

        tdb = new JTextField();
        tdb.setFont(new Font("Raleway", Font.BOLD, 14));
        tdb.setBounds(300, 240, 400, 30);
        add(tdb);

        te = new JTextField();
        te.setFont(new Font("Raleway", Font.BOLD, 14));
        te.setBounds(300, 340, 400, 30);
        add(te);

        tad = new JTextField();
        tad.setFont(new Font("Raleway", Font.BOLD, 14));
        tad.setBounds(300, 440, 400, 30);
        add(tad);

        tct = new JTextField();
        tct.setFont(new Font("Raleway", Font.BOLD, 14));
        tct.setBounds(300, 490, 400, 30);
        add(tct);

        b = new JButton("Next");
        b.setFont(new Font("Raleway", Font.BOLD, 14));
        b.setBackground(Color.BLACK);
        b.setForeground(Color.WHITE);
        b.setBounds(620, 615, 80, 20);
        add(b);
        
        b1 = new JButton("Back");
        b1.setFont(new Font("Raleway", Font.BOLD, 14));
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBounds(120, 610, 80, 20);
        add(b1);
        
        String religion[] = {"Select ","Islam", "Hindu", "Buddhist", "Christian", "Other"};
        c1 = new JComboBox(religion);
        c1.setBackground(Color.WHITE);
        c1.setFont(new Font("Raleway", Font.BOLD, 14));
        c1.setBounds(300, 530, 130, 30);
        add(c1);
        
        String blood[] = {"Select","A+", "A-", "AB+", "AB-", "O+","O-"};
        c3 = new JComboBox(blood);
        c3.setBackground(Color.WHITE);
        c3.setFont(new Font("Raleway", Font.BOLD, 14));
        c3.setBounds(580, 530, 125, 30);
        add(c3);
        
        String skills[] = {"Select ","IT", "Writting", "Presentation", "Designing", "Vidio Editting","Research","PhotoGraphy","Organizing","Cultural","Singin","Others"};
        c4 = new JComboBox(skills);
        c4.setBackground(Color.WHITE);
        c4.setFont(new Font("Raleway", Font.BOLD, 14));
        c4.setBounds(300, 390, 130, 30);
        add(c4);
        
        String semester[] = {"Select","1st", "2nd","3rd","4th", "5th","6th","7th","8th","9th","10th","11th","12th","Abobe"};
        c5 = new JComboBox(semester);
        c5.setBackground(Color.WHITE);
        c5.setFont(new Font("Raleway", Font.BOLD, 14));
        c5.setBounds(565, 390, 130, 30);
        add(c5);

        r1 = new JRadioButton("Male");
        r1.setFont(new Font("Raleway", Font.BOLD, 14));
        r1.setBackground(Color.WHITE);
        r1.setBounds(300, 290, 60, 30);
        add(r1);

        r2 = new JRadioButton("Female");
        r2.setFont(new Font("Raleway", Font.BOLD, 14));
        r2.setBackground(Color.WHITE);
        r2.setBounds(450, 290, 90, 30);
        add(r2);
        
        r3 = new JRadioButton("Other");
        r3.setFont(new Font("Raleway", Font.BOLD, 14));
        r3.setBackground(Color.WHITE);
        r3.setBounds(600, 290, 90, 30);
        add(r3);

        ButtonGroup groupgender = new ButtonGroup();
        groupgender.add(r1);
        groupgender.add(r2);
        groupgender.add(r3);

        b.addActionListener(this);
        b1.addActionListener(this);

        getContentPane().setBackground(Color.WHITE);

        setSize(800, 700);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
                      
        String name = tn.getText();
        String mbl = tdb.getText();
        String gender = null;
        
        if (r1.isSelected()) {
            gender = "Male";
        } else if (r2.isSelected()) {
            gender = "Female";
        }else if (r3.isSelected()) {
            gender = "Other";
        }
        String email = te.getText();              
        String department = tad.getText(); 
        String stdID = tct.getText();
        
        String religion = (String) c1.getSelectedItem();
        String blood = (String) c3.getSelectedItem();
        String skills = (String) c4.getSelectedItem();
        
        String semester = (String) c5.getSelectedItem();

        try {
            
            if (at == 1) {

                BufferedWriter wr = new BufferedWriter(new FileWriter("D:\\CSE-110 All Program here\\CSE110_Final_Project\\Ducument\\GenerelMember.txt", true));
                wr.write("User Id: " + userID + "\nName: " + name + "\nMobile: " + mbl + "\nGender: " + gender + "\nEmail: " + email + "\nSkills: " + skills + "\nDepartment: " + department + "\nStudent Id : " + stdID + "\nSemester :" + semester + "\nReligion : " + religion + "\nBlood Group : " + blood + "\n\n\n");
                wr.close();

            } else if (at == 2) {

                BufferedWriter wrr = new BufferedWriter(new FileWriter("D:\\CSE-110 All Program here\\CSE110_Final_Project\\Ducument\\Moderator.txt", true));
                wrr.write("User Id : " + userID + "\nName : " + name + "\nDate of Birth : " + mbl + "\nGender : " + gender + "\nEmail : " + email + "\nSkills: " + skills + "\nDepartment " + department + "\nStudent Id : " + stdID + "\nReligion : " + religion + "\nBlood Group : " + blood + "\n\n\n");
                wrr.close();
            }
            if(ae.getSource() == b1)  {
                 this.setVisible(false);
                 new ApplicationType().setVisible(true);
              } else if(ae.getSource()== b ){
                  if(name==null || mbl==null || gender==null || email==null || skills ==null || department==null || stdID==null ||  religion ==null || blood ==null){
                         JOptionPane.showMessageDialog(null, "You miss any point!\n\tTry again.");
                         setVisible(false);
                         new Signup(userID,at);
                         
                  }else{
                      setVisible(false);
                new SignupTwo(userID).setVisible(true);
                  }                
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    }


