// Write a java (GUI) program for temperature converter (Fahrenheit to Celsius).

package com.sbparvez;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Assign39 {
    public static void main(String[] args) {
        JFrame jfm = new JFrame("Fahrenheit to Celsius Converter");
        jfm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jfm.setSize(400, 300);

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        JLabel label1 = new JLabel("Enter Fahrenheit temperature:");
        JTextField faren = new JTextField(15);

        JLabel label2 = new JLabel("Temperature in Celsius:");
        JTextField celsius = new JTextField(15);

        JButton btn = new JButton("Convert");

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double fahrenheit = Double.parseDouble(faren.getText());
                double cels = (fahrenheit - 32) * 5 / 9;
                celsius.setText(String.format("%.2f", cels));
            }
        });

        panel.add(label1);
        panel.add(faren);
        panel.add(label2);
        panel.add(celsius);
        panel.add(btn);
        jfm.add(panel);

        jfm.setVisible(true);
    }
}
