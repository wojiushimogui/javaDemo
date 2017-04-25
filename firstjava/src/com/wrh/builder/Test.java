package com.wrh.builder;

public class Test {

	public static void main(String[] args) {
		Director director=new Director();
		BuilderThinPerson builderThinPerson=new BuilderThinPerson();
		director.Constructor(builderThinPerson);//��������
		
		Product p=builderThinPerson.getProduct();
		p.show();
		
		//��������
		BuilderFatPerson fatBuilder=new BuilderFatPerson();
		director.Constructor(fatBuilder);
		Product fatPerson=fatBuilder.getProduct();
		fatPerson.show();
	}

}
