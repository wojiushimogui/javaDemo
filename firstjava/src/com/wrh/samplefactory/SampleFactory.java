package com.wrh.samplefactory;

public class SampleFactory {
	public static Car getCar(String name){
		if(name=="BMW"){
			return new BMW("宝马");
		}
		else if(name=="Audi"){
			return new Audi("奥迪");
		}
		else{
			System.out.println("没有找到相应的车的类，无法返回具体的实例对象");
			return null;
		}
	}
}
