package com.wrh.copy;
//�ȿ���String���͵Ŀ�����������ǳ�����������
public class StringCopy {
	public static void main(String [] args){
		String str1="wuanghao";
		//String str2=str1.clone();
		String str2=str1;
		str2=str2+"wo";
		System.out.println(str1);
	}
}
