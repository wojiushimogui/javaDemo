package com.wrh.zhanxunInterview;

public class Son extends Person{
	static{
		System.out.println("Son static create "+sName);//只能调用static的变量
		
	}
	{
		System.out.println("Son block create "+mName);
	}
	public static void staticMethod(){
		System.out.println("Son staticMethod "+sName);//static 函数和块只能调用static声明的变量和函数
	}
	
	
	public Son(String name) {
		super(name);
		// TODO Auto-generated constructor stub
		System.out.println("Son constructor "+name);
	}

}
