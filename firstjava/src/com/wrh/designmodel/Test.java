package com.wrh.designmodel;

public class Test {

	public static void main(String[] args) {
		//先定义一个被装饰者
		Component component=new ConcreteComponent();
		//开始装饰
		//第一步：开始装饰源地址
		SourceAddressDecorate source=new SourceAddressDecorate(component);
		//第二步：开始装饰目的地址
		DestinationAddressDecorate destination=new DestinationAddressDecorate(source);
		//上面两步装饰的第二种写法如下
		//DestinationAddressDecorate destination=new DestinationAddressDecorate(new SourceAddressDecorate(new ConcreteComponent))
		destination.addMessage();
	}

}
