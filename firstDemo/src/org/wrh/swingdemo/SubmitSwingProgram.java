package org.wrh.swingdemo;

import java.util.concurrent.TimeUnit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class SubmitSwingProgram extends JFrame{
	JLabel label;
	public SubmitSwingProgram(){
		label=new JLabel("A label");
		this.add(label);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(300, 400);
		this.setVisible(true);
		
	}
	static SubmitSwingProgram ssp;
	public static void main(String[] args){
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				ssp=new SubmitSwingProgram();
				System.out.println(ssp.getClass().getSimpleName());
			}
		});
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				ssp.label.setText("see,it's different");
				
			}
		});
	}
};


	
