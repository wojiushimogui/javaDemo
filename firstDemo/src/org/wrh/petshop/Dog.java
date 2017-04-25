package org.wrh.petshop;

public class Dog implements Pet {
	private String name;
	private int age;
	private double price;

	public Dog(String name, int age, double price) {
		super();
		this.name = name;
		this.age = age;
		this.price = price;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String getName() {
		return this.name;
		
	}

	@Override
	public int getAge() {
		return this.age;
		
	}

	@Override
	public double getPrice() {
		return this.price;
		
	}

	@Override
	public String toString() {
		return "狗的名字："+this.name+",狗的年龄："+this.age+",狗的价格："+this.price;
	}
	
	

}
