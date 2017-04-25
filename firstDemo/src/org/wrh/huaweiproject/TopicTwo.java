package org.wrh.huaweiproject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 第一题：拼音转数字
输入是一个只包含拼音的字符串，请输出对应的数字序列。转换关系如下：
描述：      拼音        yi  er  san  si  wu  liu  qi  ba  jiu
      阿拉伯数字        1   2   3      4   5    6    7   8   9
输入字符只包含小写字母，所有字符都可以正好匹配

运行时间限制：无限制
内存限制：       无限制
输入：              一行字符串，长度小于1000
输出：              一行字符（数字）串
样例输入：       yiersansi
样例输出：       1234
 * */
public class TopicTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str=null;
	//	String[] strArray={"ling","yi" ,"er" , "san", "si", "wu" , "liu" , "qi", "ba" , "jiu"};
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try {
			 str=br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		myPrint(str);
	
	}

	private static void myPrint(String str) {
		// TODO Auto-generated method stub
		int len=str.length();
		while(len>0){
			int temp=len;
			switch(str.substring(0, 2)){
			case "yi":
				System.out.print(1);
				len=len-2;
				break;
			case "er":
				System.out.print(2);
				len=len-2;
				break;
			case "sa"://由于3的拼音根据前两个字符就可以得到
				System.out.print(3);
				len=len-3;
				break;
			case "si":
				System.out.print(4);
				len=len-2;
			break;
			case "wu":
				System.out.print(5);
				len=len-2;
				break;
			case "li":
				if(str.length()>2&&str.charAt(2)=='u'){
					System.out.print(6);
					len=len-3;
					break;
				}
				else{
					System.out.print(0);
					len=len-2;
					break;
				}
				
			case "qi":
				if(str.length()>2&&str.charAt(2)=='u'){//要先判断后面是否还有字符，才能这样做；例如：这样一个字符串："sansiqi"
					System.out.print(9);
					len=len-3;
					break;
				}
				else{
					System.out.print(7);
					len=len-2;
					break;
				}
				
			case "ba":
				System.out.print(8);
				len=len-2;
				break;
			
			
			}
			str=str.substring(temp-len);
		}
		
	}

}
