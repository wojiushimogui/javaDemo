package org.wrh.regex;
//�ھ��ӵ�the��you���ָ��
public class StringRegexdemo04 {

	public static void main(String[] args) {
	String str="when you have found the shrubbery ,you must cut down";
	String pat="shrubbery ,";
	String [] s=str.split(pat);
	for(String st:s)
		System.out.println(st);
			
		
	}

}
