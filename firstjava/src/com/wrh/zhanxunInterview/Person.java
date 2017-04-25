package com.wrh.zhanxunInterview;

public class Person {
	String mName=null;
	static String sName=null;
	static{
		System.out.println("Person static create "+sName);//ֻ�ܵ���static�ı���
		
	}
	{
		System.out.println("Person block create "+mName);
	}
	public static void staticMethod(){
		System.out.println("Person staticMethod "+sName);//static �����Ϳ�ֻ�ܵ���static�����ı����ͺ���
	}
	
	public void method(){
		System.out.println("Person Method "+mName);//����static�������Ա�����static�ĺ�������
	}
	
	public Person(String name){
		sName=name;
		mName=name;
		System.out.println("Person constructor "+name);
	}
		

}
