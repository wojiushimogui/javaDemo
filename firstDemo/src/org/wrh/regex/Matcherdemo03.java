package org.wrh.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Matcherdemo03 {

	public static void main(String[] args) {//ֱ����String��������һ��ƥ��
		String str="111-23-333";
		String pat="\\d{3}-\\d{2}-\\d{3}";//��������
		if(str.matches(pat))
			System.out.println("matcher success");
		else System.out.println("matcher failure ");
		
	}

}
