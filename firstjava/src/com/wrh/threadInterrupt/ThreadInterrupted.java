package com.wrh.threadInterrupt;

public class ThreadInterrupted {

	public static void main(String[] args) {
		System.out.println("A�㣺Thread.interruped()�Ľ��Ϊ"+Thread.interrupted());
		//�߳��ж�
		Thread.currentThread().interrupt();
		System.out.println("B�㣺Thread.interruped()�Ľ��Ϊ"+Thread.interrupted());
		
		System.out.println("C�㣺Thread.interruped()�Ľ��Ϊ"+Thread.interrupted());
	}

}
/*
 * ���н����
 *  A�㣺Thread.interruped()�Ľ��Ϊfalse
	B�㣺Thread.interruped()�Ľ��Ϊtrue
	C�㣺Thread.interruped()�Ľ��Ϊfalse
 * */
