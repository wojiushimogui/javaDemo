//��֤�ַ����Ƿ�ȫ�����������
//����һ����ʹ������
package org.wrh.regex;

public class Regexdemo01 {

	public static void main(String[] args) {
		String str="123as566";
		boolean flag=true;
		char[] c=str.toCharArray();//���ַ���תΪ�ַ�����
		for(int i=0;i<c.length;i++)
			if(!(c[i]>='0'&&c[i]<='9'))
			{
				flag=false;
				break;
			}
		if(flag){
			System.out.println("ƥ��ɹ�");
		}
		else System.out.println("ƥ��ʧ��");
	}

}
