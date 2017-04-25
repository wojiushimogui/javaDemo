package com.wrh.zhanxunInterview;

public class Daughter extends Person {
	static{
		System.out.println("Daughter static create "+sName);//只能调用static的变量
		
	}
	{
		System.out.println("Daughter block create "+mName);
	}
	public static void staticMethod(){
		System.out.println("Daughter staticMethod "+sName);//static 函数和块只能调用static声明的变量和函数
	}
	public void method(){
		System.out.println("Daughter Method "+mName);//但是static变量可以被不是static的函数调用
	}
	public Daughter(String name) {
		super(name);
		// TODO Auto-generated constructor stub
		System.out.println("Daughter constructor "+name);
	}

}
