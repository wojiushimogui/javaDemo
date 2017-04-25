package com.wrh.designmodel;

public abstract class MessageDecorate extends Component {
	//有一个Component实例
	private Component component;
	public MessageDecorate(Component component){
		this.component=component;
	}
	
}
