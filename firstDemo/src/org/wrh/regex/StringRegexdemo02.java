package org.wrh.regex;
//����String���е�spilt����IP��ַ����һ���ָ�
public class StringRegexdemo02 {

	public static void main(String[] args) {
		String str="168.193.5.8";
		String[] s=str.split("\\.");//"."�����������Ч��
		for(String st:s)
			System.out.print(st+"��");
		
	}

}
