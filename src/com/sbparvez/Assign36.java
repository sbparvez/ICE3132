// Write a java (GUI) simple program ass following specification:
// There will be one text box, one commmand button. User will click
// on command button, the number will increment into the textbox.

package com.sbparvez;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Assign36 {
    private static int number=0;

    public static void main(String[] args) {
        JFrame jfm = new JFrame("My Frame");
        jfm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jfm.setSize(400, 300);

        JButton btn = new JButton("OK");
        JTextField text = new JTextField("Hello Java Click 0", 20);
        text.setEditable(false);

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                number++;
                text.setText("Hello Java Click " + Integer.toString(number));
            }
        });

        JPanel panel = new JPanel();
        panel.add(btn);
        panel.add(text);

        jfm.add(panel);
        jfm.setVisible(true);
    }
}
