package org.wrh.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Matcherdemo03 {

	public static void main(String[] args) {//直接用String类来进行一个匹配
		String str="111-23-333";
		String pat="\\d{3}-\\d{2}-\\d{3}";//定义正则
		if(str.matches(pat))
			System.out.println("matcher success");
		else System.out.println("matcher failure ");
		
	}

}
