package org.wrh.huaweiproject;

import java.util.Scanner;

/*
 * �����⣺��ʽ�任
����һ��������X��������ĵ�ʽ��ߵ�����֮�����+�Ż���-�ţ�ʹ�õ�ʽ������
1 2 3 4 5 6 7 8 9 = X
���磺
12-34+5-67+89 = 5
1+23+4-5+6-7-8-9 = 5
���д����ͳ������������������������������
���룺       ����������ʽ�ұߵ�����
�����       ʹ�õ�ʽ�����ĸ���
�������룺5
���������21
 * */
public class TopicFour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int right_num=input();
		boolean flag=true;
		/*
		 * whileѭ����֤�������������������0��123456789��Χ�ڵ�
		 * */
		while(flag){
			if (right_num<0||right_num>123456789){
				System.out.println("�������������Ҳ�����123456789����");
				right_num=input();
			}
			else
			{
				flag=false;
			}
		}
		equilInput(right_num);
		

	}
	private static void equilInput(int right_num) {
		int count=0;
	}
	/*
	 * ��ȡ�ӿ���̨���������
	 * */
	private static int input() {
		Scanner sc =new Scanner(System.in);
		return sc.nextInt();
	}

}
