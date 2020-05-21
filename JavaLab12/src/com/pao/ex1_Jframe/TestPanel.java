package com.pao.ex1_Jframe;

import javax.swing.JPanel;

public class TestPanel extends JPanel {

	public TestPanel(){
		setSize(300,300);
	}

	public static void main(String [] args){
		TestPanel testPanel = new TestPanel();
		testPanel.setVisible(true);
	}
}
