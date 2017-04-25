package org.wrh.system;

public class Person {
	private String name;
	private int age;
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
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
	@Override
	public String toString() {
		return "姓名："+this.name+";年龄:"+this.age;
	}
	@Override
	protected void finalize() throws Throwable {
		System.out.println("没有人用我了，我要被回收了。。。"+this);
		
	}
	

}
