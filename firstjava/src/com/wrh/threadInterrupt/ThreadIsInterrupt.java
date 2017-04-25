package com.wrh.threadInterrupt;
//isInterrupt()方法的用法
public class ThreadIsInterrupt {

	public static void main(String[] args) {
		System.out.println("A点： Thread.currentThread().isInterrupted()="+Thread.currentThread().isInterrupted());
		Thread.currentThread().interrupt();;//线程中断
		System.out.println("B点： Thread.currentThread().isInterrupted()="+Thread.currentThread().isInterrupted());
		System.out.println("C点： Thread.currentThread().isInterrupted()="+Thread.currentThread().isInterrupted());
	}

}
