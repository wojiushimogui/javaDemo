package com.wrh.atomic;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;


public class TestAtomicIntegerFieldUpdater {

	public static void main(String[] args){
		TestAtomicIntegerFieldUpdater tIA = new TestAtomicIntegerFieldUpdater();
		tIA.doIt();
	}
	
	public AtomicIntegerFieldUpdater<DataDemo> updater(String name){
		return AtomicIntegerFieldUpdater.newUpdater(DataDemo.class,name);
		
	}
	
	public void doIt(){
		DataDemo data = new DataDemo();
		System.out.println("publicVar = "+updater("publicVar").getAndAdd(data, 2));
		/*
		 * ������DataDemo��������value2/value3,��TestAtomicIntegerFieldUpdater�в��ܷ���
		 * */
		//System.out.println("protectedVar = "+updater("protectedVar").getAndAdd(data,2));
		//System.out.println("privateVar = "+updater("privateVar").getAndAdd(data,2));

		//System.out.println("staticVar = "+updater("staticVar").getAndIncrement(data));//��java.lang.IllegalArgumentException
		/*
		 * ���汨�쳣��must be integer
		 * */
		//System.out.println("integerVar = "+updater("integerVar").getAndIncrement(data));
		//System.out.println("longVar = "+updater("longVar").getAndIncrement(data));
	}

}

class DataDemo{
	public volatile int publicVar=3;
	protected volatile int protectedVar=4;
	private volatile  int privateVar=5;
	
	public volatile static int staticVar = 10;
	//public  final int finalVar = 11;
	
	public volatile Integer integerVar = 19;
	public volatile Long longVar = 18L;

}
