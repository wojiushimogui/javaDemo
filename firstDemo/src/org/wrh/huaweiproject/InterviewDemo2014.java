package org.wrh.huaweiproject;

import java.util.Scanner;

/*
 * 
二、题目描述（40分）：
通过键盘输入一串小写字母(a~z)组成的字符串。请编写一个字符串压缩程序，将字符串中连续出席的重复字母进行压缩，并输出压缩后的字符串。
压缩规则：
1、仅压缩连续重复出现的字符。比如字符串"abcbc"由于无连续重复字符，压缩后的字符串还是"abcbc"。
2、压缩字段的格式为"字符重复的次数+字符"。例如：字符串"xxxyyyyyyz"压缩后就成为"3x6yz"。
【注意】只需要完成该函数功能算法，中间不需要有任何IO的输入输出
示例 
输入：“cccddecc”   输出：“3c2de2c”
输入：“adef”     输出：“adef”
输入：“pppppppp” 输出：“8p”

 * */
public class InterviewDemo2014 {

	public static void main(String[] args) {
		String str=input();
		zipString(str);
	} 
	/* 
	 * 此函数又来压缩字符
	 * */
	private static void zipString(String str) {
		int len=str.length();
		int count=1;
		for(int i=0;i<len-1;i++){
			if(str.charAt(i)==str.charAt(i+1)){//判断前一个字符与后一个字符是否相等，若想等，则count加一，否则输出
				count++;
				if(i==len-2){//此种情况是为了最后几个字符一样，则输出，若没有这个，类似“ppppp”则没有结果输出
					System.out.print(count==1?str.charAt(i):(count+""+str.charAt(i)));
				}
			}
			else
			{	
			System.out.print(count==1?str.charAt(i):(count+""+str.charAt(i)));
					count=1;
				
			}
			
			
		}
		/*
		 * 边界情况：上面的情况只包含了最后一个字母与前面的字母出现相等的时候被统计进去了，
		 * 但是当最后两个字符不相等时，输出最后的一个字符
		 * */
		if(str.charAt(len-2)!=str.charAt(len-1)){
			System.out.println(str.charAt(len-1));
		}
		
	}
/*
 * 接受从控制台输入的数据，并利用while循环来保证输入的字符串全部有小写字符组成
 * */
	private static String input() {
		Scanner sc=new Scanner(System.in);
		String string=sc.nextLine();
		//boolean flag=true;
		boolean flag_uncorrect_input=false;
		while(true){
			for(int i=0;i<string.length();i++){//判断字符串中是否全部是小写字母，若不是，则重新输入
				char ch=string.charAt(i);
				if(!('a'<=ch&&ch<='z')){
					flag_uncorrect_input=true; 
					break;	
				}
			}
			if(flag_uncorrect_input){
				string=sc.nextLine();
			}
			else{
				break;
			}
			
		}
		return string;
		
	}

}
