package org.wrh.huaweiproject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * ��Ŀһ���Ӵ����� 
��Ŀ������   
ͨ��������������һ���ַ������У��ַ������ܰ�������Ӵ����Ӵ��Կո�ָ������дһ�������Զ�����������Ӵ�����ʹ�á�,������ָ������������Ҳ����һ����,�������Ӵ��洢�� 
������롰abc def gh i        d�����������abc,def,gh,i,d,  
��ע�⡿ֻ��Ҫ��ɸú��������㷨���м䲻��Ҫ���κ�IO ��������� 
ʾ��   
���룺��abc def gh i        d��
�������abc,def,gh,i,d,��
 * */
public class InterviewDemo2013 {

	public static void main(String[] args) {
		String str=input();
		substringSplit(str);
	}
	/*
	 * �������ܣ�����
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
	 * �������ܣ����ַ����ָ���Ӵ��������
	 * */
	public static void substringSplit(String str){
		String[] strArray=str.split("\\s+");//���ÿո���ָ��
		print(strArray);
	}
	/*
	 * �������ܣ����
	 * */
	public static void print(String [] arr){
		for(int i=0;i<arr.length-1;i++){
			System.out.print(arr[i]+",");
			
		}
		System.out.print(arr[arr.length-1]);
		
	}

}
