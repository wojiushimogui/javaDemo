package org.wrh.regex;

import java.util.regex.Pattern;

public class Patterndemo {

	public static void main(String[] args) {
		String str="a1b22C333D4444F55555";
		String pat="\\d+";//定义正则
		Pattern p=Pattern.compile(pat);
		String[] str1=p.split(str);
		//for(int i=0;i<str1.length;i++)
		//{
		//	System.out.print(str1[i]+"、");
		//}
		for(String s:str1)
			System.out.print(s+"、");
	}

}
