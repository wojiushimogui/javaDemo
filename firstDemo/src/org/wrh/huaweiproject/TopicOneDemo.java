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
public class TopicOneDemo {

	public static void main(String[] args) {
		/*
		 * m����Ҫ������ַ�������
		 * */
		int m;

		/*
		 * n���������ÿ���ַ����ĳ���
		 * */
		int n;
		/*
		 * ��ȡ�ӿ���̨������ַ���
		 * */
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str=null;
		try {
			str = br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/*
		 * ���ӿ���̨��������ݸ��ݶ��ŷֿ�
		 * */
		String[] strArrayTemp=str.split(",");
		//�����еĵ�һ��Ԫ�ؾ������ǵ�mֵ
		m=Integer.valueOf(strArrayTemp[0]);
		//�����еĵڶ���Ԫ�ؾ������ǵ�nֵ
		n=Integer.valueOf(strArrayTemp[1]);
		/*
		 * ������������ַ���������ȡ��������������һ��������
		 * */
		String strArray[]=new String[m];
		for(int i=0;i<m;i++){
			strArray[i]=strArrayTemp[2+i];
		}
		splitStringPrint(strArray,n); 
				
	}
	/*
	 * ��ɽ��ַ�������Ҫ�����
	 * */
	private static void splitStringPrint(String[] string,int len) {
		// TODO Auto-generated method stub
		
		for(String str:string){
			while(str.length()>len){
				System.out.print(str.substring(0, len)+"  ");
				str=str.substring(len, str.length());
			}
			//���ڳ���С��len�Ľ�����
			int stringLength=str.length();
			if(stringLength>0&&stringLength<=len){
				for(int i=0;i<len-stringLength;i++){
					str+="0";
				}
				System.out.print(str+"  ");
				
			}
		}
		
	}

}
