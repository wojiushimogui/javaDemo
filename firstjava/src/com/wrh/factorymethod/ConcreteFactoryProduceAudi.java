package com.wrh.factorymethod;
//���幤����2��ר�������µϳ�
public class ConcreteFactoryProduceAudi implements AbstractFactory{

	@Override
	public Car factory() {
		return new Audi();
	}

}
