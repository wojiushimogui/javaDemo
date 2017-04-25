package org.wrh.swingdemo;

import java.util.concurrent.TimeUnit;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class SwingDemo01 {

	public static void main(String[] args) throws InterruptedException {
		JFrame frame=new JFrame("hello swing");
		JLabel label=new JLabel("a label");
		frame.add(label);
		frame.setSize(300, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		TimeUnit.SECONDS.sleep(2);
		label.setText("我是吴让好，正在学java");
	}

}
