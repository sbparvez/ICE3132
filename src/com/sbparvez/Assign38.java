// Write a java (GUI) program as following specification:
// There will be a MenuBar, Menus and MenuItems. User will click on
// MenuItem, the output will display on the output screen.

package com.sbparvez;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Assign38 {
    public static void main(String[] args) {
        JFrame jfm = new JFrame("Simple Menu Program");
        jfm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jfm.setSize(400, 300);

        JMenuBar menuBar = new JMenuBar();
        JMenu state = new JMenu("Indian States");
        JMenu cities = new JMenu("Indian Cities");

        JMenuItem himachal = new JMenuItem("Himachal Pradesh");
        JMenuItem rajasthan = new JMenuItem("Rajasthan");
        JMenuItem westBengal = new JMenuItem("West Bengal");
        JMenuItem andhra = new JMenuItem("Andhra Pradesh");
        JMenuItem tamilnadu = new JMenuItem("Tamilnadu");
        JMenuItem karnataka = new JMenuItem("Karnataka");

        menuBar.add(state);
        menuBar.add(cities);

        state.add(himachal);
        state.add(rajasthan);
        state.add(westBengal);
        state.addSeparator();
        state.add(andhra);
        state.add(tamilnadu);
        state.add(karnataka);

        himachal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(jfm, "Himachal Pradesh");
            }
        });

        rajasthan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(jfm, "Rajasthan");
            }
        });

        westBengal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(jfm, "West Bengal");
            }
        });

        andhra.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(jfm, "Andhra Pradesh");
            }
        });

        tamilnadu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(jfm, "Tamilnadu");
            }
        });

        karnataka.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(jfm, "Karnataka");
            }
        });

        jfm.setJMenuBar(menuBar);
        jfm.setVisible(true);

    }
}
