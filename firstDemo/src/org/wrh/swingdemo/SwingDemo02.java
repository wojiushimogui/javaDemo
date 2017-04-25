package org.wrh.swingdemo;

import java.util.concurrent.TimeUnit;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class SwingDemo02 {

	public static void main(String[] args) throws InterruptedException {
		JFrame frame=new JFrame("Hello Swing");
		JLabel label1=new JLabel("label 1");
		JLabel label2=new JLabel("label 2");
		JLabel label3=new JLabel("label3");
		JLabel label4=new JLabel("label 4");
		JLabel label5=new JLabel("label 5");
		frame.add(label1);
		frame.add(label2);
		frame.add(label3);
		frame.add(label4);
		frame.add(label5);
		//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 400);
		frame.setVisible(true);
	}

}
