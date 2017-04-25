package com.wrh.test;

public class Test1 {
	public static void main(String[] args){
		Integer a = 1;
		Integer b = 2;
		Integer c = 3;
		Integer d = 3;
		Integer c2 = new Integer(3);
		Integer d2 = new Integer(3);
		Integer e = 127;
		Integer f = 127;
		Integer g = 128;
		Integer h = 128;
		
		
		
		System.out.println(c == d);//true
		System.out.println(c2 == d2);
		System.out.println(c == c2);
		
		System.out.println(e == f);//false
		System.out.println(c == (a+b));//false
		System.out.println(c.equals((a+b)));//true
		
	}
}
