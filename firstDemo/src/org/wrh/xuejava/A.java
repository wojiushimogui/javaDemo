package org.wrh.xuejava;

public class A {
	private String name;
	public A(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public A() {
		super();
	}
	@Override
	public String toString() {
		return "A [name=" + name + ", age=" + age + "]";
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
	private int age;

}
