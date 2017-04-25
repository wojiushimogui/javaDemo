package com.wrh.samplefactory;
//具体产品类：宝马车
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
