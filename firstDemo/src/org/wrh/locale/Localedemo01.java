package org.wrh.locale;

import java.util.Locale;
import java.util.ResourceBundle;

public class Localedemo01 {
	public static void main(String[] args){
		Locale loc=Locale.getDefault();
		ResourceBundle rB=ResourceBundle.getBundle("Message",loc);
		String value=rB.getString("info");
		System.out.println("ÄÚÈÝÎª£º"+value);
	}

}
