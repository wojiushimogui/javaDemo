package com.wrh.factorymethod;

public class Test {

	public static void main(String[] args) {
		Car carAudi,carBMW;
		AbstractFactory factory1=new ConcreteFactoryProduceAudi();
		AbstractFactory factory2=new ConcreteFactoryProduceBMW();
		carAudi=factory1.factory();//��һ���������ذµϳ���ʵ��
		carBMW=factory2.factory();//�ڶ����������ر����ʵ��
	}

}
