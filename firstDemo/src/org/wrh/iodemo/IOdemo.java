package org.wrh.iodemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//���������������ӹ���
public class IOdemo {

	public static void main(String[] args) throws IOException {
		System.out.print("�������һ��������");
		BufferedReader buf=null;
		buf=new BufferedReader(new InputStreamReader(System.in));
		String str1=buf.readLine();
		//if(Integer.parseInt(str))
		System.out.print("������ڶ���������");
		String str2=buf.readLine();
		int sum=Integer.parseInt(str1)+Integer.parseInt(str2);
		
		System.out.print("�������ĺ�Ϊ��"+sum);
	}

}
