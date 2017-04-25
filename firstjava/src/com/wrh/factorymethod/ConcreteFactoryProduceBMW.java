package com.wrh.factorymethod;
//具体工厂类：专门生产宝马车
public class ConcreteFactoryProduceBMW implements AbstractFactory{

	@Override
	public Car factory() {
		return new BMW();
	}

}
