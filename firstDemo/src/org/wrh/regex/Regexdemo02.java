package org.wrh.regex;
//��������ʹ����������֤�ַ����Ƿ�ȫ�����������
public class Regexdemo02 {

	public static void main(String[] args) {
		String str="1234567";
		if(str.matches("\\d+")){//����ַ����Ƿ��������Ǹ�����������ʽ
			System.out.println("ƥ��ɹ�");
		}
		else System.out.println("ƥ��ʧ��");
	}

}
