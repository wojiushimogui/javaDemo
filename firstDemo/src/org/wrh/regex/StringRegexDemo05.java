package org.wrh.regex;

public class StringRegexDemo05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="123.3445";
		if(str.matches("\\d+")){
			System.out.println("matches");
			
			
		}
		else
			System.out.println("not matches");

	}

}
