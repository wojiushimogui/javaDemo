package com.wrh.threadInterrupt;

public class ThreadInterrupted {

	public static void main(String[] args) {
		System.out.println("A点：Thread.interruped()的结果为"+Thread.interrupted());
		//线程中断
		Thread.currentThread().interrupt();
		System.out.println("B点：Thread.interruped()的结果为"+Thread.interrupted());
		
		System.out.println("C点：Thread.interruped()的结果为"+Thread.interrupted());
	}

}
/*
 * 运行结果：
 *  A点：Thread.interruped()的结果为false
	B点：Thread.interruped()的结果为true
	C点：Thread.interruped()的结果为false
 * */
