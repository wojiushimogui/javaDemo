package com.wrh.copy;

public class Professor implements Cloneable{
	private String name;
	private int  age;
	public Professor(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	@Override
	public Object clone()  {
		Professor p=null;
		try {
			p=(Professor)super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return p;
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
