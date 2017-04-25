package com.wrh.samplefactory;

public class Test {

	public static void main(String[] args) {
		//根据需求，得到宝马实例对象
		Car car1=SampleFactory.getCar("BMW");
		System.out.println(car1.getName());
		//根据需求，得到奥迪实例对象
		Car car2=SampleFactory.getCar("Audi");
		System.out.println(car2.getName());
	}

}
