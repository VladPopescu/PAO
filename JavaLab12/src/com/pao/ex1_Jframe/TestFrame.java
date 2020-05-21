package com.pao.ex1_Jframe;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Label;
import java.awt.Panel;

import javax.swing.JButton;
import javax.swing.JFrame;

public class TestFrame extends JFrame {

	public TestFrame() {
		setTitle("Test Application");
		setSize(200, 200);
		setBackground(Color.gray);
		Panel topPanel = new Panel();
		topPanel.setLayout(new BorderLayout());
		getContentPane().add(topPanel);
		Label labelHello = new Label("Hello World!");
		topPanel.add(labelHello, BorderLayout.NORTH);
		JButton jButton1 = new JButton("APASA BUTTONU");
		jButton1.setSize(50, 50);
		topPanel.add(jButton1);
	}

	public static void main(String args[]) {
		TestFrame mainFrame = new TestFrame();
		mainFrame.setVisible(true);
	}

}
