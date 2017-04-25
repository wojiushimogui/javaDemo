package org.wrh.stringdemo;

public class TextString {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String str1="wu";
		 String str2="wu";
		 String str3=new String("wu");
		 String str4=str3.intern();//
		System.out.println("str1==str2:"+(str1==str2));
		System.out.println("str1==str3:"+(str1==str3));
		System.out.println("str1==str4:"+(str1==str4));
		System.out.println("str3==str4:"+(str3==str4));

	}

}
