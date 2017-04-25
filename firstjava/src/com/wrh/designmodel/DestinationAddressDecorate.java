package com.wrh.designmodel;

public class DestinationAddressDecorate extends MessageDecorate{
	private Component component;
	public DestinationAddressDecorate(Component component) {
		super(component);
		this.component=component;
	}

	@Override
	public void addMessage() {
		component.addMessage();
		System.out.println("添加目的地址");
	}

}
