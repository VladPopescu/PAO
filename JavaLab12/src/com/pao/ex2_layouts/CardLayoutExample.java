package com.pao.ex2_layouts;

import java.awt.CardLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class CardLayoutExample extends JFrame implements ActionListener {

	CardLayout card;

	JButton b1, b2, b3;

	Container c;

	CardLayoutExample()
	{
		c = getContentPane();

		card = new CardLayout(40, 30);

		c.setLayout(card);

		b1 = new JButton("GEEK");
		b2 = new JButton("FOR");
		b3 = new JButton("GEEKS");


		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);

		c.add("a", b1);
		c.add("b", b2);
		c.add("c", b3);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		card.next(c);
	}


	public static void main(String[] args)
	{

		CardLayoutExample cl = new CardLayoutExample();
		cl.setSize(400, 400);
		cl.setVisible(true);

		cl.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
