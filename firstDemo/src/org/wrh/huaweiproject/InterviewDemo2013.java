package org.wrh.huaweiproject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 题目一：子串分离 
题目描述：   
通过键盘输入任意一个字符串序列，字符串可能包含多个子串，子串以空格分隔。请编写一个程序，自动分离出各个子串，并使用’,’将其分隔，并且在最后也补充一个’,’并将子串存储。 
如果输入“abc def gh i        d”，结果将是abc,def,gh,i,d,  
【注意】只需要完成该函数功能算法，中间不需要有任何IO 的输入输出 
示例   
输入：“abc def gh i        d”
输出：“abc,def,gh,i,d,”
 * */
public class InterviewDemo2013 {

	public static void main(String[] args) {
		String str=input();
		substringSplit(str);
	}
	/*
	 * 函数功能：输入
	 * */
	private static String input() {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try {
			return br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	/*
	 * 函数功能：将字符串分割成子串，并输出
	 * */
	public static void substringSplit(String str){
		String[] strArray=str.split("\\s+");//利用空格将其分割开来
		print(strArray);
	}
	/*
	 * 函数功能：输出
	 * */
	public static void print(String [] arr){
		for(int i=0;i<arr.length-1;i++){
			System.out.print(arr[i]+",");
			
		}
		System.out.print(arr[arr.length-1]);
		
	}

}
