package org.wrh.huaweiproject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/*
 * ������Ŀ������50�֣��� 
ͨ����������100�����������ļӡ�������ʽ�����дһ����������������ַ�����
�����ַ����ĸ�ʽΪ����������1 ����� ������2���������������롰�������֮����һ���ո������
����˵����
1��������Ϊ������������Ҫ���Ǽ���������������
2����������ʽ��ʽ����������Ϊ��0����
��ע�⡿ֻ��Ҫ��ɸú��������㷨���м䲻��Ҫ���κ�IO���������
ʾ�� 
���룺��4 + 7��  �������11��
���룺��4 - 7��  �������-3��
���룺��9 ++ 7��  �������0�� ע����ʽ����
 * */
public class InterviewDemo012014 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] str=input();
		calculate(str);
	

	}

	private static void calculate(String[] str) {
		if(str!=null){
			if(str[1].equals("+")){//�ڶ����ַ�Ϊ��+����Ҫע��������ﲻ���á�str[1]=="+",ԭ�����==��equals��������
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
		else{//���0��ʾ��ʽ����
			System.out.println("0");
		}
		return null;
	}

}
