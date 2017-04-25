package org.wrh.petshop;

public class Cat implements Pet {
		private String name;
		private int age;
		private double price;
		
		public Cat(String name, int age, double price) {
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
			// TODO Auto-generated method stub
			return this.age;
		}
		@Override
		public double getPrice() {
			// TODO Auto-generated method stub
			return this.price;
		}
		public String toString(){
			return "猫的名字："+this.name+",猫的年龄："+this.age+",猫的价格："+this.price;
		}
		
}
