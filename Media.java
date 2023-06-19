//Leader
package Start_Project;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public final class Media extends JFrame implements ActionListener {
    
    CardLayout cr;
    ImageIcon i1;
    JLabel jl,j2;
    JPanel p;
    JButton b,b1,b2;

    Media() {
        setTitle("Media Panel");
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        j2 = new JLabel("The Club Image Gallery");
        j2.setBounds(230, 7, 350, 32);
        j2.setFont(new Font("Arial", Font.BOLD, 30));
        add(j2);
        cr = new CardLayout();     
        p = new JPanel(cr);
        p.setBounds(150, 50, 500, 300);
        add(p);
                       
        b = new JButton("BACK");
        b.setBackground(Color.BLACK);
        b.setForeground(Color.WHITE);        
        b.setFont(new Font("Arial", Font.BOLD, 14));
        b.setBounds(380, 400, 75, 20);
        add(b);
        
        b1 = new JButton("Previous");
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setFont(new Font("Arial", Font.BOLD, 17));
        b1.setBounds(155, 360, 110, 20);
        add(b1);
        
        b2= new JButton("Next");
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.setFont(new Font("Arial", Font.BOLD, 17));
        b2.setBounds(570, 360, 80, 20);
        add(b2);

      
        b.addActionListener(this);
        b1.addActionListener(this);
        b2.addActionListener(this);

        getContentPane().setBackground(Color.white);

        setSize(800, 480);
        setLocationRelativeTo(null);
        setVisible(true);
        imageShow();
    }
    public void imageShow(){
        String[] s = {"a.jpg","b.jpg","b.jpg","c.jpg","d.jpg","e.jpg","f.jpg","g.jpg","h.jpg","i.jpg","j.jpg","l.jpg","m.jpg"};
        for(String x : s){
            i1 = new ImageIcon("D:\\CSE-110 All Program here\\CSE110_Final_Project\\ClubImage\\"+x);  
            Image img = i1.getImage();
            Image newImg = img.getScaledInstance(p.getWidth(), p.getHeight(), Image.SCALE_SMOOTH);
            i1 = new ImageIcon(newImg);
            jl = new JLabel(i1);
            p.add(jl);      
        }
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        try {
            if (ae.getSource() == b1) {
                cr.previous(p);
            } else if (ae.getSource() == b2) {
                cr.next(p);
            } else if (ae.getSource() == b) {

                this.setVisible(false);
                new UserInterface().setVisible(true);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
