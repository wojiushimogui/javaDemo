package com.wrh.atomic;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class TestClass2 {
	private static Class c = null;
	public static void main(String[] args) throws Exception {
		Student2 s = new Student2(2,"haohao",22);
		
		c = s.getClass();
		//�����Ե�ʹ��
		Field fId = c.getDeclaredField("id");//����ʹ��c.getField("id");��ΪgetFieldֻ�ܷ��ع�������
		fId.setAccessible(true);//ʹ�÷�����ƿ��Դ��Ʒ�װ�ԣ�������java��������Բ���ȫ��
		
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
