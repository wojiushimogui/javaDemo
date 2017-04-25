package com.wrh.test;

public class Test2 {
	public static void main(String[] args){
		Integer a = 1;
		int a2 = 1;	
		Integer a3 = new Integer(1);
		//a自动拆箱
		System.out.println(a==a2);//true
		//a3自动拆箱
		System.out.println(a3==a2);//true
		//a2自动装箱
		System.out.println(a.equals(a2));//true
		
	}
}
