package org.wrh.regex;

public class StringRegexdemo01 {

	public static void main(String[] args) {
		//ʹ��String���е�����������һ���������֤
		String str="134567889r@qqe.net";
		//String pat="\\w+@\\w+.\\w+";//û�п�����ʵ�����ʹ�õ�һ������
		//�翼����ʵ�����õ������һ����������ǵ������׺�У�com��com.cn��edu��gov��net��net.cn�ȵ�
		//�������ʹ�õ��������£�
		String pat="\\w+@\\w+.(com|com.cn|edu|gov|net|net.cn)";
		if(str.matches(pat))
			System.out.println("matcher success");
		else 
			System.out.println("matcher failure");
		
	}

}
