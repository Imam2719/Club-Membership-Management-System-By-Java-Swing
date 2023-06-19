
package Start_Project;


import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

public class ApplicationType extends JFrame implements ActionListener {

    JLabel l1, l2, l3;
    JRadioButton r1, r2, r3;
    JButton b,b1;

    Random rand = new Random();
    int rn = rand.nextInt(10000);
    String userID = String.valueOf(rn);

    ApplicationType() {

        setTitle("NEW MEMBER APPLICATION FORM");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ImageIcon i1 = new ImageIcon("C:\\Users\\USER\\Downloads\\User.jpg");
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l11 = new JLabel(i3);
        l11.setBounds(20, 0, 100, 100);
        add(l11);

        l1 = new JLabel("SIGNUP FORM NO. " + userID);
        l1.setFont(new Font("Raleway", Font.BOLD, 38));
        l1.setForeground(Color.BLACK);
        l1.setBounds(140, 20, 600, 40);
        add(l1);

        Font f = new Font("Raleway", Font.BOLD, 22);
        l2 = new JLabel("Form 1: Application For ");
        l2.setFont(f);
        l2.setBounds(290, 80, 800, 30);
        add(l2);

        l3.setBounds(100, 145, 400, 30);
        add(l3);

        r1 = new JRadioButton("General Member");
        Font f2 = new Font("Raleway", Font.BOLD, 16);
        r1.setFont(f2);
        r1.setBackground(Color.WHITE);
        r1.setBounds(350, 200, 300, 30);
        add(r1);

        r2 = new JRadioButton("Moderator");
        r2.setFont(f2);
        r2.setBackground(Color.WHITE);
        r2.setBounds(350, 230, 300, 30);
        add(r2);

      

        ButtonGroup groupgender = new ButtonGroup();
        groupgender.add(r1);
        groupgender.add(r2);
    

        setLayout(null);

        b = new JButton("NEXT");
        b.setBackground(Color.BLACK);
        b.setForeground(Color.WHITE);
        
        b1 = new JButton("BACK");
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);

        b.setFont(new Font("Arial", Font.BOLD, 14));
        b.setBounds(300, 350, 230, 30);
        add(b);
       
        b1.setFont(new Font("Arial", Font.BOLD, 14));
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

        int at = 0;

        if (r1.isSelected()) {

            at = 1;
        } else if (r2.isSelected()) {

            at = 2;
        }  else {
            at = 0;
        }
        try {
            if (ae.getSource() == b) {
                if (at == 0) {
                    JOptionPane.showMessageDialog(null, "Choose One Option.");
                } else {
                    new Signup(userID, at);
                    setVisible(false);
                }

            }else if (ae.getSource() == b1){
                 this.setVisible(false);
                 new UserLogin().setVisible(true);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
