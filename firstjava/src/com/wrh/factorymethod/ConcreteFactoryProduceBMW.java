package com.wrh.factorymethod;
//���幤���ࣺר����������
public class ConcreteFactoryProduceBMW implements AbstractFactory{

	@Override
	public Car factory() {
		return new BMW();
	}

}
