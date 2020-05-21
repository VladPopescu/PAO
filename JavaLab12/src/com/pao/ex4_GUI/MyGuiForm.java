package com.pao.ex4_GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class MyGuiForm extends JFrame {

	private JButton button1;
	private javax.swing.JLabel JLabel;
	private JPanel rootPanel;

	public MyGuiForm(){
		add(rootPanel);
		setTitle("This is my title");
		setSize(400, 500);

		button1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(rootPanel, "You've pushed the button...");
			}
		});
	}


}
