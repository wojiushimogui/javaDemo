package com.wrh.builder;

public class BuilderFatPerson implements Builder{
	Product fatPerson;
	
	public BuilderFatPerson() {
		super();
		fatPerson=new Product();
	}

	@Override
	public void buildHead() {
		fatPerson.add("����ͷ");
	}

	@Override
	public void buildBody() {
		fatPerson.add("��������");
	}

	@Override
	public void buildHand() {
		fatPerson.add("������");
	}

	@Override
	public void bulidFeet() {
		fatPerson.add("���˽�");
	}

	@Override
	public Product getProduct() {
		// TODO Auto-generated method stub
		return fatPerson;
	}

}
