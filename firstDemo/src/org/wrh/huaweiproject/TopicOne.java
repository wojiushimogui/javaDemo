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
public class TopicOne {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		/*
		 * m����Ҫ������ַ�������
		 * */
		System.out.println("������Ҫ�����ַ����ĸ�����");
		int m=sc.nextInt();

		/*
		 * n���������ÿ���ַ����ĳ���
		 * */
		System.out.println("�����뽫���������ÿ���ַ�������ĸ���Ϊ��");
		int n=sc.nextInt();
		/*
		 * ��ȡ�ӿ���̨������ַ���
		 * */
		System.out.println("������"+m+"���ַ���,�ÿո�ֿ�");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str=null;
		try {
			str = br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/*
		 * ���ӿ���̨��������ݸ��ݿո�ֿ�
		 * */
		String[] strArray=str.split("\\s+");
		System.out.println(Arrays.toString(strArray));
		splitStringPrint(strArray,n); 
				
	}
	/*
	 * ��ɽ��ַ�������Ҫ�����
	 * */
	private static void splitStringPrint(String[] string,int len) {
		// TODO Auto-generated method stub
		
		for(String str:string){
			while(str.length()>len){
				System.out.println(str.substring(0, len));
				str=str.substring(len, str.length());
			}
			//���ڳ���С��len�Ľ�����
			int stringLength=str.length();
			if(stringLength>0&&stringLength<=len){
				for(int i=0;i<len-stringLength;i++){
					str+="0";
				}
				System.out.println(str);
				
			}
		}
		
	}

}
