package org.wrh.observedemo;

import java.util.Observable;
import java.util.Observer;

public class Person implements Observer{

	@Override
	public void update(Observable arg0, Object arg1) {
		System.out.println(arg0+"��ע���Ѿ����ı���"+arg1);
	}
	

}
