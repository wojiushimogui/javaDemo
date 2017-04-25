package org.wrh.locale;

import java.util.Locale;
import java.util.ResourceBundle;

public class Localedemo02 {
	public static void main(String[] args){
		Locale loc1=new Locale("zh","CN");
		Locale loc2=new Locale("en","US");
		ResourceBundle rB1=ResourceBundle.getBundle("Message", loc1);
		ResourceBundle rB2=ResourceBundle.getBundle("Message", loc2);
		System.out.println("内容为："+rB1.getString("info"));
		System.out.println("内容为："+rB2.getString("info"));
		
	}

}
