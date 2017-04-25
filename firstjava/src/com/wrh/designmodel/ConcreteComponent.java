package com.wrh.designmodel;

public class ConcreteComponent extends Component {
	@Override
	public void addMessage() {
		System.out.println("我是消息体");
	}
 
}
