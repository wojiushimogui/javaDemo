package com.wrh.samplefactory;
//�����Ʒ�ࣺ�µϳ�
public class Audi implements Car{
	private String name;
	public Audi(String name){
		this.name=name;
	}
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}
}
