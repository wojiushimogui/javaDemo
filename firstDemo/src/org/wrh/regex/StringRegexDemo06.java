package org.wrh.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringRegexDemo06 {
	
	public static void main(String[] args){
		
		String reg= "[\\u4e00-\\u9fa5]+";
		System.out.println("1------------str1�Ƿ������ģ�"+"����˭".matches(reg));//ʹ����String�������֧��
		System.out.println("2-------------str2�Ƿ������ģ�"+"wu����˭".matches(reg));
		//���治ֱ��ʹ�ö������֧�֣���һ�������˼·
		String str1="����˭ѽ";
		String str2="who are you-----678��";
		System.out.println("3-----------str1�Ƿ������ģ�"+isContainChina(str1));
		System.out.println("4-----------str1�Ƿ������ģ�"+isContainChina(str2));
		
	}
	public static  boolean isContainChina(String string){
		Pattern p=Pattern.compile("[\\u4e00-\\u9fa5]+");
		Matcher matcher=p.matcher(string);
		
		//return matcher.find();
		return matcher.matches();
	}

}
