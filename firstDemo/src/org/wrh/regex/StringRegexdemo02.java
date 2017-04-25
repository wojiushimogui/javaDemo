package org.wrh.regex;
//利用String类中的spilt来对IP地址进行一个分割
public class StringRegexdemo02 {

	public static void main(String[] args) {
		String str="168.193.5.8";
		String[] s=str.split("\\.");//"."这个正则是无效的
		for(String st:s)
			System.out.print(st+"、");
		
	}

}
