package com.wrh.designmodel;

public class SourceAddressDecorate extends MessageDecorate{
	private Component component;
    public SourceAddressDecorate(Component component) {
    	super(component);
		this.component=component;
	}
	@Override
	public void addMessage() {
		component.addMessage();
		System.out.println("ÃÌº”‘≠µÿ÷∑");
		
	}
	
}
