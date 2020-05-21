package com.pao.ex3_buttons;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class TestJButton extends JFrame implements ActionListener
{
	private int iCounter = 0;
	private JButton button = null;
	public TestJButton()
	{
		setTitle( "ActionListener Application" );
		setBackground( Color.gray );
		JPanel topPanel = new JPanel();
		topPanel.setLayout( new FlowLayout() );
		topPanel.setPreferredSize( new Dimension( 300, 200 ) );

		getContentPane().add( topPanel );
		button = new JButton( "Press Me" );
		topPanel.add( button );
		button.addActionListener( this );
	}
	public void actionPerformed( ActionEvent event )
	{
		if( event.getSource() == button )
		{
			iCounter++;
			button.setText( "Pressed " + iCounter + " times" );
			System.out.println( "Click" );
			pack();
		}
	}
	public static void main( String args[] )
	{
		TestJButton mainFrame = new TestJButton();
		mainFrame.pack();
		mainFrame.setVisible( true );
	}
}
