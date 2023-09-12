// Write a java (GUI) program to create (and to display) two frames. One frame is the "master" frame.
// Click its close button, and everthing closes down. The other frame is temporary.
// Click its close button, and only it is closed.

package com.sbparvez;

import javax.swing.*;

public class Assign32 {
	public static void main(String[] args) {
		JFrame mfm = new JFrame("Click to Close Everything");
		mfm.setSize(300, 400);
		mfm.setLayout(null);
		mfm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JFrame jfm = new JFrame("Click to Close Just This");
		jfm.setSize(300, 400);
		jfm.setLayout(null);
		jfm.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

		jfm.setVisible(true);
		mfm.setVisible(true);
	}
}