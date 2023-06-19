package Start_Project;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.*;

public class AboutCLub extends JFrame implements ActionListener {

    JTabbedPane jtp1 = new JTabbedPane();
    JPanel jp1 = new JPanel();
    JTextArea t1 = new JTextArea();
    JLabel label1;
    JButton b;
    JScrollPane t;

    AboutCLub() throws FileNotFoundException, IOException {
        setTitle("About Board");

        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ImageIcon i1 = new ImageIcon("D:\\CSE-110 All Program here\\CSE110_Final_Project\\Icon\\aboutClub.png");
        Image i2 = i1.getImage().getScaledInstance(100, 90, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);

        JLabel l11 = new JLabel(i3);
        l11.setBounds(350, 7, 100, 90);
        add(l11);

        label1 = new JLabel("About Club");
        label1.setFont(new Font("Osward", Font.BOLD, 38));
        label1.setBounds(300, 100, 350, 40);
        add(label1);

        FileReader f = new FileReader("D:\\CSE-110 All Program here\\CSE110_Final_Project\\clubAbout\\About.txt");
        BufferedReader brk = new BufferedReader(f);
        String s;
        while ((s = brk.readLine()) != null) {
            t1.append(s);
        }
        jp1.add(t1);
        jtp1.addTab("", t1);
        add(jtp1);
        t1.setFont(new Font("Raleway", Font.BOLD, 18));
        t1.setLineWrap(true);
        t1.setWrapStyleWord(true);

        t = new JScrollPane(t1);
        t.setBounds(100, 145, 650, 250);
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

            if (ae.getSource() == b) {
                setVisible(false);
                new UserInterface().setVisible(true);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
