package org.wrh.huaweiproject;

import java.util.Scanner;

/*
 * 
������Ŀ������40�֣���
ͨ����������һ��Сд��ĸ(a~z)��ɵ��ַ��������дһ���ַ���ѹ�����򣬽��ַ�����������ϯ���ظ���ĸ����ѹ���������ѹ������ַ�����
ѹ������
1����ѹ�������ظ����ֵ��ַ��������ַ���"abcbc"�����������ظ��ַ���ѹ������ַ�������"abcbc"��
2��ѹ���ֶεĸ�ʽΪ"�ַ��ظ��Ĵ���+�ַ�"�����磺�ַ���"xxxyyyyyyz"ѹ����ͳ�Ϊ"3x6yz"��
��ע�⡿ֻ��Ҫ��ɸú��������㷨���м䲻��Ҫ���κ�IO���������
ʾ�� 
���룺��cccddecc��   �������3c2de2c��
���룺��adef��     �������adef��
���룺��pppppppp�� �������8p��

 * */
public class InterviewDemo2014 {

	public static void main(String[] args) {
		String str=input();
		zipString(str);
	} 
	/* 
	 * �˺�������ѹ���ַ�
	 * */
	private static void zipString(String str) {
		int len=str.length();
		int count=1;
		for(int i=0;i<len-1;i++){
			if(str.charAt(i)==str.charAt(i+1)){//�ж�ǰһ���ַ����һ���ַ��Ƿ���ȣ�����ȣ���count��һ���������
				count++;
				if(i==len-2){//���������Ϊ����󼸸��ַ�һ�������������û����������ơ�ppppp����û�н�����
					System.out.print(count==1?str.charAt(i):(count+""+str.charAt(i)));
				}
			}
			else
			{	
			System.out.print(count==1?str.charAt(i):(count+""+str.charAt(i)));
					count=1;
				
			}
			
			
		}
		/*
		 * �߽��������������ֻ���������һ����ĸ��ǰ�����ĸ������ȵ�ʱ��ͳ�ƽ�ȥ�ˣ�
		 * ���ǵ���������ַ������ʱ���������һ���ַ�
		 * */
		if(str.charAt(len-2)!=str.charAt(len-1)){
			System.out.println(str.charAt(len-1));
		}
		
	}
/*
 * ���ܴӿ���̨��������ݣ�������whileѭ������֤������ַ���ȫ����Сд�ַ����
 * */
	private static String input() {
		Scanner sc=new Scanner(System.in);
		String string=sc.nextLine();
		//boolean flag=true;
		boolean flag_uncorrect_input=false;
		while(true){
			for(int i=0;i<string.length();i++){//�ж��ַ������Ƿ�ȫ����Сд��ĸ�������ǣ�����������
				char ch=string.charAt(i);
				if(!('a'<=ch&&ch<='z')){
					flag_uncorrect_input=true; 
					break;	
				}
			}
			if(flag_uncorrect_input){
				string=sc.nextLine();
			}
			else{
				break;
			}
			
		}
		return string;
		
	}

}
