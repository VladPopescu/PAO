package com.pao.ex3_buttons;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class HandleActionEventExample extends JFrame implements ActionListener {

	public HandleActionEventExample() {

		this.getContentPane().setLayout(new FlowLayout());
		JButton button1 = new JButton("Yes");
		JButton button2 = new JButton("No");


		button1.addActionListener(this);
		button2.addActionListener(this);


		add(button1);
		add(button2);

	}


	@Override
	public void actionPerformed(ActionEvent e) {
		String action = e.getActionCommand();
		if (action.equals("Yes")) {
			System.out.println("Yes Button pressed!");
		}
		else if (action.equals("No")) {
			System.out.println("No Button pressed!");
		}
	}

	public static void main(String[] args) {
		JFrame frame = new HandleActionEventExample();
		frame.setSize(400,400);


		frame.pack();

		frame.setVisible(true);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
