package com.wrh.samplefactory;

public class Test {

	public static void main(String[] args) {
		//�������󣬵õ�����ʵ������
		Car car1=SampleFactory.getCar("BMW");
		System.out.println(car1.getName());
		//�������󣬵õ��µ�ʵ������
		Car car2=SampleFactory.getCar("Audi");
		System.out.println(car2.getName());
	}

}
