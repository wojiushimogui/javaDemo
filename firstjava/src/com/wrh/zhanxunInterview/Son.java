package com.wrh.zhanxunInterview;

public class Son extends Person{
	static{
		System.out.println("Son static create "+sName);//ֻ�ܵ���static�ı���
		
	}
	{
		System.out.println("Son block create "+mName);
	}
	public static void staticMethod(){
		System.out.println("Son staticMethod "+sName);//static �����Ϳ�ֻ�ܵ���static�����ı����ͺ���
	}
	
	
	public Son(String name) {
		super(name);
		// TODO Auto-generated constructor stub
		System.out.println("Son constructor "+name);
	}

}
