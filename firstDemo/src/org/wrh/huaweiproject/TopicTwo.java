package org.wrh.huaweiproject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * ��һ�⣺ƴ��ת����
������һ��ֻ����ƴ�����ַ������������Ӧ���������С�ת����ϵ���£�
������      ƴ��        yi  er  san  si  wu  liu  qi  ba  jiu
      ����������        1   2   3      4   5    6    7   8   9
�����ַ�ֻ����Сд��ĸ�������ַ�����������ƥ��

����ʱ�����ƣ�������
�ڴ����ƣ�       ������
���룺              һ���ַ���������С��1000
�����              һ���ַ������֣���
�������룺       yiersansi
���������       1234
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
			case "sa"://����3��ƴ������ǰ�����ַ��Ϳ��Եõ�
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
				if(str.length()>2&&str.charAt(2)=='u'){//Ҫ���жϺ����Ƿ����ַ������������������磺����һ���ַ�����"sansiqi"
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
