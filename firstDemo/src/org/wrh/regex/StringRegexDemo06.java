package org.wrh.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringRegexDemo06 {
	
	public static void main(String[] args){
		
		String reg= "[\\u4e00-\\u9fa5]+";
		System.out.println("1------------str1是否含有中文："+"我是谁".matches(reg));//使用了String对正则的支持
		System.out.println("2-------------str2是否含有中文："+"wu我是谁".matches(reg));
		//下面不直接使用对正则的支持，用一般的正则思路
		String str1="我是谁呀";
		String str2="who are you-----678吴";
		System.out.println("3-----------str1是否含有中文："+isContainChina(str1));
		System.out.println("4-----------str1是否含有中文："+isContainChina(str2));
		
	}
	public static  boolean isContainChina(String string){
		Pattern p=Pattern.compile("[\\u4e00-\\u9fa5]+");
		Matcher matcher=p.matcher(string);
		
		//return matcher.find();
		return matcher.matches();
	}

}
