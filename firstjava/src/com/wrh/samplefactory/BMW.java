package com.wrh.samplefactory;
//�����Ʒ�ࣺ����
public class BMW  implements Car{
	private String name;
	public BMW(String name){
		this.name=name;
	}
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

}
