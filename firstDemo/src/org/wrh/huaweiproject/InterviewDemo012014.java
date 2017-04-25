package org.wrh.huaweiproject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/*
 * 三、题目描述（50分）： 
通过键盘输入100以内正整数的加、减运算式，请编写一个程序输出运算结果字符串。
输入字符串的格式为：“操作数1 运算符 操作数2”，“操作数”与“运算符”之间以一个空格隔开。
补充说明：
1、操作数为正整数，不需要考虑计算结果溢出的情况。
2、若输入算式格式错误，输出结果为“0”。
【注意】只需要完成该函数功能算法，中间不需要有任何IO的输入输出
示例 
输入：“4 + 7”  输出：“11”
输入：“4 - 7”  输出：“-3”
输入：“9 ++ 7”  输出：“0” 注：格式错误
 * */
public class InterviewDemo012014 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] str=input();
		calculate(str);
	

	}

	private static void calculate(String[] str) {
		if(str!=null){
			if(str[1].equals("+")){//第二个字符为“+”，要注意的是这里不能用“str[1]=="+",原因就是==与equals的区别了
				System.out.println(Integer.valueOf(str[0])+Integer.valueOf(str[2]));
				
			}
			else if(str[1].equals("-")){
				System.out.println(Integer.valueOf(str[0])-Integer.valueOf(str[2]));
			}
			else{
				System.out.println("0");
			}
			
			
		}
	}

	private static String[] input() {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String[] str=null;
		try {
			 str=br.readLine().split("\\s+");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Arrays.toString(str));
		if(str.length==3&&str[0].matches("\\d+")&&str[1].matches("-|\\+")&&str[2].matches("\\d+")){
			return str;
			
		}
		else{//输出0表示格式错误
			System.out.println("0");
		}
		return null;
	}

}
