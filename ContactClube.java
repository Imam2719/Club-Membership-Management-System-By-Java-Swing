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

public class ContactClube extends JFrame implements ActionListener {
    JLabel l1,p,m,f;
    JButton b;
    ContactClube() {

        setTitle("Clube Contact Panel");
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        ImageIcon i1 = new ImageIcon("D:\\CSE-110 All Program here\\CSE110_Final_Project\\Icon\\Contact.png");
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l11 = new JLabel(i3);
        l11.setBounds(350, 0, 100, 100);
        add(l11);
        
        l1 = new JLabel("Contact with club");
        l1.setFont(new Font("Osward", Font.BOLD, 35));
        l1.setBounds(275, 100, 300, 35);
        add(l1);
        
        ImageIcon ii1 = new ImageIcon("D:\\CSE-110 All Program here\\CSE110_Final_Project\\Icon\\Phone.png");
        Image ii2 = ii1.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT);
        ImageIcon ii3 = new ImageIcon(ii2);
        JLabel ll11 = new JLabel(ii3);
        ll11.setBounds(250, 170, 50, 50);
        add(ll11);
        
        p = new JLabel("+8801864719755");
        p.setFont(new Font("Osward", Font.BOLD, 25));
        p.setBounds(350, 170, 250, 50);
        add(p);
        
        ImageIcon iri1 = new ImageIcon("D:\\CSE-110 All Program here\\CSE110_Final_Project\\Icon\\Email.png");
        Image iri2 = iri1.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT);
        ImageIcon iri3 = new ImageIcon(iri2);
        JLabel rl11 = new JLabel(iri3);
        rl11.setBounds(250, 230, 50, 50);
        add(rl11);
        
        m = new JLabel("EwuClub@email.com");
        m.setFont(new Font("Osward", Font.BOLD, 25));
        m.setBounds(350, 230, 300, 50);
        add(m);
        
        ImageIcon ai1 = new ImageIcon("D:\\CSE-110 All Program here\\CSE110_Final_Project\\Icon\\FB.png");
        Image ai2 = ai1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon ai3 = new ImageIcon(ai2);
        JLabel al11 = new JLabel(ai3);
        al11.setBounds(250, 300, 50, 50);
        add(al11);
        
        m = new JLabel("Facebook.com/ewuClub");
        m.setFont(new Font("Osward", Font.BOLD, 25));
        m.setBounds(350, 300, 300, 50);
        add(m);
                            
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
          if(ae.getSource() == b){
             
                    this.setVisible(false);
                 new UserInterface().setVisible(true);
                }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
