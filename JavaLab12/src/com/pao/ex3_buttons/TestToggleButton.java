package com.pao.ex3_buttons;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JToggleButton;

public class TestToggleButton extends JFrame {

	public TestToggleButton() {
		setTitle("ToggleButton Application");
		setBackground(Color.gray);
		JPanel topPanel = new JPanel();
		topPanel.setLayout(new FlowLayout());
		getContentPane().add(topPanel);
		JToggleButton button1 = new JToggleButton("Button 1", true);
		topPanel.add(button1);
		JToggleButton button2 = new JToggleButton("Button 2", false);
		topPanel.add(button2);
		JToggleButton button3 = new JToggleButton("Button 3", false);
		topPanel.add(button3);
		ButtonGroup buttonGroup = new ButtonGroup();
		buttonGroup.add(button1);
		buttonGroup.add(button2);
		buttonGroup.add(button3);
	}

	public static void main(String args[]) {
		TestToggleButton mainFrame = new TestToggleButton();
		mainFrame.pack();
		mainFrame.setVisible(true);
	}
}
