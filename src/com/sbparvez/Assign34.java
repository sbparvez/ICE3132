// Write a java (GUI) program to create MenuBar, Menus and MenuItem into a frame.

package com.sbparvez;

import javax.swing.*;

public class Assign34 {
    public static void main(String[] args) {
        JFrame jfm = new JFrame("My Frame");
        jfm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jfm.setSize(400, 300);

        JMenuBar menuBar = new JMenuBar();
        JMenu file = new JMenu("FILE");
        JMenu help = new JMenu("Help");
        JMenuItem open = new JMenuItem("Open");
        JMenuItem saveAs = new JMenuItem("Save as");

        file.add(open);
        file.add(saveAs);
//        file.addSeparator();
        menuBar.add(file);
        menuBar.add(help);

//        jfm.add(new JScrollPane(new JTextArea()));
        jfm.setJMenuBar(menuBar);
        jfm.setVisible(true);
    }
}
