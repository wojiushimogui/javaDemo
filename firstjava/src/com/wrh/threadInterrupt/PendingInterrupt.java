package com.wrh.threadInterrupt;

public class PendingInterrupt {
	private static boolean flag;
	public static void main(String[] args) {
		flag=true;
		if(flag){
			Thread.currentThread().interrupt();//�жϵ�ǰ�߳�
		}
		long curTime=System.currentTimeMillis();
		try {//��ǰ�߳�����20��
			System.out.println("��ǰ�̼߳���sleep��ǰһ�����");
			Thread.sleep(20000);
			System.out.println("����û�б��ж�");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println("�����ж�");
			return;
		}
		
		System.out.println("�������е�ʱ��:"+(System.currentTimeMillis()-curTime));
		
	}

}

/*
 * ��falg=falseʱ
 * �����   ��ǰ�̼߳���sleep��ǰһ�����
 * 		����û�б��ж�
		�������е�ʱ��:20000
	��flag=trueʱ
	�������ǰ�̼߳���sleep��ǰһ�����
		�����ж�
		�������е�ʱ��:0
 * */
