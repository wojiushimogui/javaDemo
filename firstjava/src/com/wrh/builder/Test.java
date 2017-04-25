package com.wrh.builder;

public class Test {

	public static void main(String[] args) {
		Director director=new Director();
		BuilderThinPerson builderThinPerson=new BuilderThinPerson();
		director.Constructor(builderThinPerson);//构造瘦人
		
		Product p=builderThinPerson.getProduct();
		p.show();
		
		//构造胖子
		BuilderFatPerson fatBuilder=new BuilderFatPerson();
		director.Constructor(fatBuilder);
		Product fatPerson=fatBuilder.getProduct();
		fatPerson.show();
	}

}
