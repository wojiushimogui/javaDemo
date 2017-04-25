package org.wrh.regex;


public class Matcherdemo02 {

	public static void main(String[] args) {
		//直接用String类中的正则完成替换
		String str="a1b22C333D4444F5555555";
		String pat="\\d+";
		System.out.println(str.replaceAll(pat, "?"));
		
	}

}
