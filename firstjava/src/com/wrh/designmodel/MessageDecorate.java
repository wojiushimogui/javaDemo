package com.wrh.designmodel;

public abstract class MessageDecorate extends Component {
	//��һ��Componentʵ��
	private Component component;
	public MessageDecorate(Component component){
		this.component=component;
	}
	
}
