package com.wrh.threadInterrupt;
//isInterrupt()�������÷�
public class ThreadIsInterrupt {

	public static void main(String[] args) {
		System.out.println("A�㣺 Thread.currentThread().isInterrupted()="+Thread.currentThread().isInterrupted());
		Thread.currentThread().interrupt();;//�߳��ж�
		System.out.println("B�㣺 Thread.currentThread().isInterrupted()="+Thread.currentThread().isInterrupted());
		System.out.println("C�㣺 Thread.currentThread().isInterrupted()="+Thread.currentThread().isInterrupted());
	}

}
