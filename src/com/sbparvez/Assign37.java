package com.sbparvez;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
public class Assign37 extends JFrame implements ActionListener {

    JFrame frame;
    JButton red, green, blue, pink, yellow, magenta, orange;

    Assign37() {

        Font font = new Font("Lucida Calligraphy", Font.BOLD, 9);
        frame = new JFrame("Colourful window");
        Color c = new Color(255, 255, 255);

        red = new JButton("RED");
        red.setBounds(40, 100, 100, 40);
        red.setFont(font);
        red.setBackground(c);

        green = new JButton("GREEN");
        green.setBounds(150, 100, 100, 40);
        green.setFont(font);
        green.setBackground(c);

        frame.add(red);
        frame.add(green);


        red.addActionListener(this);
        green.addActionListener(this);

        frame.getContentPane().setBackground(Color.black);
        frame.setLayout(null);
        frame.setSize(650, 600);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent ae)
    {

        if(ae.getSource() == red)
            frame.getContentPane().setBackground(Color.RED);
        if(ae.getSource() == green)
            frame.getContentPane().setBackground(Color.GREEN);

    }

    public static void main(String[] args) {

        new Assign37();

    }

}