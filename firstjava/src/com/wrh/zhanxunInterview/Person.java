package com.wrh.zhanxunInterview;

public class Person {
	String mName=null;
	static String sName=null;
	static{
		System.out.println("Person static create "+sName);//只能调用static的变量
		
	}
	{
		System.out.println("Person block create "+mName);
	}
	public static void staticMethod(){
		System.out.println("Person staticMethod "+sName);//static 函数和块只能调用static声明的变量和函数
	}
	
	public void method(){
		System.out.println("Person Method "+mName);//但是static变量可以被不是static的函数调用
	}
	
	public Person(String name){
		sName=name;
		mName=name;
		System.out.println("Person constructor "+name);
	}
		

}
