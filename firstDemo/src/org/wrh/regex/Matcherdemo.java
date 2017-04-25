package org.wrh.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Matcherdemo {

	public static void main(String[] args) {
		String str="111-23-s3";
		String pat="\\d{3}-\\d{2}-\\d{3}";//定义正则
		Pattern p=Pattern.compile(pat);
		Matcher m=p.matcher(str);
		if(m.matches())
			System.out.println("匹配成功");
		else System.out.println("matcher failure");
	}

}
