package org.wrh.huaweiproject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/*
 * �ڶ��⣺ȥ���ظ��ַ�������
����ʱ�����ƣ�������
�������ƣ�       ������
���룺              �ַ���
�����              ȥ���ظ��ַ���������ַ���
�������룺       aabcdefff
���������       abcdef
 * */
public class TopicThree {

	public static void main(String[] args) {
		/*
		 * �����ַ���
		 * */
		String str=input();
		elimimateRepeatAndSort(str);
	}

	private static void elimimateRepeatAndSort(String str) {
		/*
		 * ��Ϊ��java��Set�����в��������ظ�Ԫ�أ�
		 * �����������Set���������ַ����е�ÿ��Ԫ�ط��뼴�������ظ�Ԫ��
		 * */
		Set<Character> set=new HashSet<Character>();
		for(int i=0;i<str.length();i++){
			set.add(str.charAt(i));
			
		}
		/*
		 * ����Set����û����������������ǽ�Setת��Ϊ���飬
		 * Ȼ��������Arrays��sort��������������������
		 * */
		Object[]c=set.toArray();
		Arrays.sort(c);
		print(c);
	}
	/*
	 * �������������ĺ���
	 * */
	private static void print(Object[] c) {
		// TODO Auto-generated method stub
		for(Object o:c){
			System.out.print(o);
		}
		
	}
	/*
	 * ��ȡ�ӿ���̨���������
	 * */
	private static String input() {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try {
			return br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	

}
