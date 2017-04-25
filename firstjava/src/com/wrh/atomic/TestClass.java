package com.wrh.atomic;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class TestClass {
	private static Class c = null;
	public static void main(String[] args) throws Exception {
		
		try {
			//获取类
			 c = Class.forName("com.wrh.atomic.Student");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		String classContentStr = getClassInformation();
		System.out.println(classContentStr);
		
		//对属性的使用
		Field fId = c.getDeclaredField("id");//不能使用c.getField("id");因为getField只能返回公共属性
		fId.setAccessible(true);//使用反射机制可以打破封装性，导致了java对象的属性不安全。
		Object obj = c.newInstance();
		fId.set(obj, 10);
		//System.out.println(fId.get(obj));
		//调用方法
		Method m =c.getDeclaredMethod("getId");
		m.invoke(obj);
		Method m2 = c.getDeclaredMethod("setId", int.class);
		m2.invoke(obj, 4);
	
	}
	private static String getClassInformation() {
		StringBuffer sb = new StringBuffer();
		sb.append(Modifier.toString(c.getModifiers())).append("class ").append(c.getSimpleName()).append(" {\n");
		
		//获取所有的属性
		Field[] fields = c.getDeclaredFields();
		//获取属性的修饰符、类型和名字
		for(Field f:fields){
			sb.append("\t");//空格
			sb.append(Modifier.toString(f.getModifiers())+" ");//属性的修饰符
			sb.append(f.getType().getSimpleName()+" ");//属性类型的名字
			sb.append(f.getName()).append(";\n");//属性的名字
		}
		
		//获取所有的方法
		Method[] methods = c.getDeclaredMethods();
		
		for(Method m:methods){
			sb.append("\t");//空格
			sb.append(Modifier.toString(m.getModifiers())+" ");//修饰符
			sb.append(m.getReturnType().getSimpleName()+" ");//返回值类型
			sb.append(m.getName());//方法的名字
			Class[] parameters=m.getParameterTypes(); //获得方法传入参数的类型
			StringBuffer sbPara = new StringBuffer();
			if(parameters.length!=0){
				for(Class p:parameters){
					sbPara.append(p.getSimpleName()+",");
				}
				sb.append("("+sbPara.substring(0,sbPara.length()-1)+")");
			}
			else{
				sb.append("()");
			}
			sb.append("{\n");//添加换行符
			sb.append("\t}\n");//添加方法的右大括号
		
		}
		sb.append("}");
		
		return sb.toString();
	}

}

class Student{
	private int id;
	private String name;
	private int age;
	public int getId() {
		System.out.println("get id :"+id);
		return id;
	}
	public void setId(int id) {
		System.out.println("set id :"+id);
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
