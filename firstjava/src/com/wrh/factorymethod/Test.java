package com.wrh.factorymethod;

public class Test {

	public static void main(String[] args) {
		Car carAudi,carBMW;
		AbstractFactory factory1=new ConcreteFactoryProduceAudi();
		AbstractFactory factory2=new ConcreteFactoryProduceBMW();
		carAudi=factory1.factory();//第一个工厂返回奥迪车的实例
		carBMW=factory2.factory();//第二个工厂返回宝马的实例
	}

}
