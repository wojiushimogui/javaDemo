package org.wrh.huaweiproject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

/*
 * ��Ҫ��ֽ��ַ���������������M��N��M���������M���ַ�����N���������ÿ���ַ�����λ����������0��
 * ���磺����2,8�� ��abc�� ����123456789���������Ϊ��abc00000��,��12345678��,��90000000��
 * */
public class TopicOneDemo01 {

	public static void main(String[] args) {
		/*
		 * m����Ҫ������ַ�������
		 * */
		int m;

		/*
		 * n���������ÿ���ַ����ĳ���
		 * */
		int n;
		String[] strArrayTemp=input();
		
		//�����еĵ�һ��Ԫ�ؾ������ǵ�mֵ
		m=Integer.valueOf(strArrayTemp[0]);
		//�����еĵڶ���Ԫ�ؾ������ǵ�nֵ
		n=Integer.valueOf(strArrayTemp[1]);
		/*
		 * ������������ַ���������ȡ��������������һ��������
		 * ����Ҫע�����Ҫ��������������ǽ�ȥ�����������룺4,4,abc�����������������ʵ��������ַ����ĸ�����������Ҫ������ַ����ĸ���Ҫ�٣�
		 * */
		String strArray[]=new String[m];
		/*
		 * ��������ַ�����������һ��������
		 * */
		for(int i=0;i<strArrayTemp.length-2;i++){
				strArray[i]=strArrayTemp[2+i];	
		}
		if((strArrayTemp.length-2)<m){//������ʵ��������ַ����ĸ�����������Ҫ������ַ����ĸ���Ҫ�٣�����""���ַ�������
			for(int i=strArrayTemp.length-2;i<m;i++){
				strArray[i]="";	
		}
			
		}
		splitStringPrint(strArray,n,m); 
				
	}
	/*
	 * �������ܣ���ȡ�ӿ���̨������ַ���
	 * */
	private static String[] input() {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str=null;
		try {
			str = br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		/*
		 * whileѭ����֤�����Ƿ���Ҫ��ģ�����֤m��nֵ��������ʵ��������ַ����ĸ���ҪС�ڵ���Ҫ������ĸ�������������������룺2,3��abc,asdf,asdfgh�������������
		 * */
		while(true){
			/*
			 * ���ӿ���̨��������ݸ��ݶ��ŷֿ�
			 * */
			String[] strArrayTemp=str.split(",");
			if(strArrayTemp[0].matches("\\d+")&&strArrayTemp[1].matches("\\d+")&&(strArrayTemp.length<=Integer.valueOf(strArrayTemp[0]))){
				return strArrayTemp;
			}
			else{
				try {
					System.out.println("���������룺");
					str=br.readLine();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	/*
	 * ��ɽ��ַ�������Ҫ�����
	 * */
	private static void splitStringPrint(String[] string,int len,int m) {
		// TODO Auto-generated method stub
		
		for(int i=0;i<m;i++){
			while(string[i].length()>len){
				System.out.print(string[i].substring(0, len)+"  ");
				string[i]=string[i].substring(len, string[i].length());
			}
			//���ڳ���С��len�Ľ�����
			int stringLength=string[i].length();
			if(stringLength>=0&&stringLength<=len){
				for(int j=0;j<len-stringLength;j++){
					string[i]+="0";
				}
				System.out.print(string[i]+"  ");
				
			}
		}
		
	}

}
