package com.pao.ex1_Jframe;

import javax.swing.JWindow;

public class TestWindow extends JWindow {

	public TestWindow(){
		setSize(300,300);
	}

	public static void main(String [] args){
		TestWindow testWindow = new TestWindow();
		testWindow.setVisible(true);
	}
}
