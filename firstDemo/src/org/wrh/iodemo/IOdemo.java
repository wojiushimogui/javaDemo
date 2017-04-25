package org.wrh.iodemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//完成两个整数的相加功能
public class IOdemo {

	public static void main(String[] args) throws IOException {
		System.out.print("请输入第一个整数：");
		BufferedReader buf=null;
		buf=new BufferedReader(new InputStreamReader(System.in));
		String str1=buf.readLine();
		//if(Integer.parseInt(str))
		System.out.print("请输入第二个整数：");
		String str2=buf.readLine();
		int sum=Integer.parseInt(str1)+Integer.parseInt(str2);
		
		System.out.print("两个数的和为："+sum);
	}

}
