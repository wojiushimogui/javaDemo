package com.wrh.zhanxunInterview;

public class Daughter extends Person {
	static{
		System.out.println("Daughter static create "+sName);//ֻ�ܵ���static�ı���
		
	}
	{
		System.out.println("Daughter block create "+mName);
	}
	public static void staticMethod(){
		System.out.println("Daughter staticMethod "+sName);//static �����Ϳ�ֻ�ܵ���static�����ı����ͺ���
	}
	public void method(){
		System.out.println("Daughter Method "+mName);//����static�������Ա�����static�ĺ�������
	}
	public Daughter(String name) {
		super(name);
		// TODO Auto-generated constructor stub
		System.out.println("Daughter constructor "+name);
	}

}
