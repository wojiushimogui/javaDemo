package com.wrh.factorymethod;
//具体工厂类2：专门生产奥迪车
public class ConcreteFactoryProduceAudi implements AbstractFactory{

	@Override
	public Car factory() {
		return new Audi();
	}

}
