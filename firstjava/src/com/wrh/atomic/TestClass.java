package com.wrh.atomic;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class TestClass {
	private static Class c = null;
	public static void main(String[] args) throws Exception {
		
		try {
			//��ȡ��
			 c = Class.forName("com.wrh.atomic.Student");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		String classContentStr = getClassInformation();
		System.out.println(classContentStr);
		
		//�����Ե�ʹ��
		Field fId = c.getDeclaredField("id");//����ʹ��c.getField("id");��ΪgetFieldֻ�ܷ��ع�������
		fId.setAccessible(true);//ʹ�÷�����ƿ��Դ��Ʒ�װ�ԣ�������java��������Բ���ȫ��
		Object obj = c.newInstance();
		fId.set(obj, 10);
		//System.out.println(fId.get(obj));
		//���÷���
		Method m =c.getDeclaredMethod("getId");
		m.invoke(obj);
		Method m2 = c.getDeclaredMethod("setId", int.class);
		m2.invoke(obj, 4);
	
	}
	private static String getClassInformation() {
		StringBuffer sb = new StringBuffer();
		sb.append(Modifier.toString(c.getModifiers())).append("class ").append(c.getSimpleName()).append(" {\n");
		
		//��ȡ���е�����
		Field[] fields = c.getDeclaredFields();
		//��ȡ���Ե����η������ͺ�����
		for(Field f:fields){
			sb.append("\t");//�ո�
			sb.append(Modifier.toString(f.getModifiers())+" ");//���Ե����η�
			sb.append(f.getType().getSimpleName()+" ");//�������͵�����
			sb.append(f.getName()).append(";\n");//���Ե�����
		}
		
		//��ȡ���еķ���
		Method[] methods = c.getDeclaredMethods();
		
		for(Method m:methods){
			sb.append("\t");//�ո�
			sb.append(Modifier.toString(m.getModifiers())+" ");//���η�
			sb.append(m.getReturnType().getSimpleName()+" ");//����ֵ����
			sb.append(m.getName());//����������
			Class[] parameters=m.getParameterTypes(); //��÷����������������
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
			sb.append("{\n");//��ӻ��з�
			sb.append("\t}\n");//��ӷ������Ҵ�����
		
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
