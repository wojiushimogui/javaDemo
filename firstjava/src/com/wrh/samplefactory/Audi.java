package com.wrh.samplefactory;
//具体产品类：奥迪车
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
