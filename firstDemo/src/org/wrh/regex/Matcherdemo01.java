package org.wrh.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Matcherdemo01 {

	public static void main(String[] args) {
		//Íê³ÉÌæ»»
		String str="a1b22C333D4444F5555555";
		String pat="\\d+";
		Pattern p=Pattern.compile(pat);
		Matcher m=p.matcher(str);
		String str1=m.replaceAll("?");
			System.out.println(str1);
	}

}
