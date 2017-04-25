package com.wrh.atomic;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class TestClass2 {
	private static Class c = null;
	public static void main(String[] args) throws Exception {
		Student2 s = new Student2(2,"haohao",22);
		
		c = s.getClass();
		//对属性的使用
		Field fId = c.getDeclaredField("id");//不能使用c.getField("id");因为getField只能返回公共属性
		fId.setAccessible(true);//使用反射机制可以打破封装性，导致了java对象的属性不安全。
		
		int id =(int)fId.get(s);
		System.out.println(id);
	}

}

class Student2{
	private int id;
	private String name;
	private int age;
	public Student2(int id,String name,int age){
		this.id = id;
		this.name = name;
		this.age = age;
	}
}
