package com.wrh.testgui;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextField;

public class testJmenu extends JFrame {
	/*
	 * �ı�����
	 * */
	private JTextField t=new JTextField(15);
	/*
	 * �����¼�
	 * */
	private ActionListener listener=new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			t.setText(((JMenuItem)e.getSource()).getText());
		}
	};
	private JMenu m=new JMenu();
	private JMenuItem item=new JMenuItem("�½�");
	private JMenuItem item1=new JMenuItem("����");
	private JMenuItem item2=new JMenuItem("��");
	private JMenuBar menubar=new JMenuBar();
	public testJmenu(){
		item.addActionListener(listener);
		item1.addActionListener(listener);
		item2.addActionListener(listener);
		m.add(item);
		m.add(item1);
		m.add(item2);
		menubar.add(m);
		this.add(menubar);
		this.setLocation(100,100);
		setLayout(new FlowLayout());
		this.setSize(60,50);
		this.setVisible(true);
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testJmenu test=new testJmenu();
		
		
	}

}
