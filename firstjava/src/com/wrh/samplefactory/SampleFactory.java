package com.wrh.samplefactory;

public class SampleFactory {
	public static Car getCar(String name){
		if(name=="BMW"){
			return new BMW("����");
		}
		else if(name=="Audi"){
			return new Audi("�µ�");
		}
		else{
			System.out.println("û���ҵ���Ӧ�ĳ����࣬�޷����ؾ����ʵ������");
			return null;
		}
	}
}
