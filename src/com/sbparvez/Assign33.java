// Write a java (GUI) program to create label, button and textbox into a frame
// using 	(a) JFrame class and the following layout, and
//		(b) Frame class and the following layout.
//			(i) 	Default Layout
//			(ii) 	Flow Layout
//			(iii)	Border Layout
//			(iv)	Grid Layout

package com.sbparvez;

import java.awt.*;
import javax.swing.*;
class newFlow {
	newFlow() {
		JFrame jfm = new JFrame("My Frame, Flow Layout");
		jfm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jfm.setSize(500, 400);
		jfm.setLayout(new FlowLayout());

		JLabel lb = new JLabel("Label");
		JTextField text = new JTextField(15);
		JButton btn = new JButton("Send");

		jfm.add(lb);
		jfm.add(text);
		jfm.add(btn);
		jfm.setVisible(true);
	}
}

class newBorder {
	newBorder() {
		JFrame jfm = new JFrame("My Frame, Border Layout");
		jfm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jfm.setSize(500, 400);
		jfm.setLayout(new BorderLayout());

		JLabel lb = new JLabel("Label");
		JTextField text = new JTextField(15);
		JButton btn = new JButton("Send");

		jfm.add(lb, BorderLayout.WEST);
		jfm.add(text, BorderLayout.CENTER);
		jfm.add(btn, BorderLayout.EAST);
		jfm.setVisible(true);
	}
}

class newGrid {
	newGrid() {
		JFrame jfm = new JFrame("My Frame, Grid Layout");
		jfm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jfm.setSize(500, 400);
		jfm.setLayout(new GridLayout(1, 3));

		JLabel lb = new JLabel("Label");
		JTextField text = new JTextField(20);
		JButton btn = new JButton("Send");

		jfm.add(lb);
		jfm.add(text);
		jfm.add(btn);
		jfm.setVisible(true);
	}
}

public class Assign33 {
	public static void main(String[] args) {
		// using Flow layout
		new newFlow();

		// using Border layout
		new newBorder();

		// using Grid layout
		new newGrid();
	}
}