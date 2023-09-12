// Write a java (GUI) program to create an empty Frame. Set the title of the frame to "My First GUI Frame".
// The frame is initially invisible and must be made visible by invoking its "setVisible()" method.
// Using 	(a) Frame class
//		(b) JFrame class
//		(c) Extends from JFrame

package com.sbparvez;

import java.awt.*;
import javax.swing.*;

class newFrame {
	newFrame() {
		Frame fm = new Frame();
		fm.setTitle("My First GUI Frame");
		fm.setSize(300, 400);
		fm.setLayout(null);
		fm.setVisible(true);
	}
}

class newJFrame {
	newJFrame() {
		JFrame jfm = new JFrame();
		jfm.setTitle("My First GUI JFrame");
		jfm.setSize(300, 400);
		jfm.setLayout(null);
		jfm.setVisible(true);
	}
}

class newExtendJFrame extends JFrame {
	newExtendJFrame() {
		super("My First Extended GUI JFrame");
		setSize(300, 400);
		setLayout(null);
		setVisible(true);
	}
}

public class Assign31 {
	public static void main(String[] args) {
		// using Frame class
		new newFrame();

		// using JFrame class
		new newJFrame();

		// Extends from JFrame
		JFrame jfm = new newExtendJFrame();
	}
}