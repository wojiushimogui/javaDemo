package com.wrh.builder;

public class BuilderFatPerson implements Builder{
	Product fatPerson;
	
	public BuilderFatPerson() {
		super();
		fatPerson=new Product();
	}

	@Override
	public void buildHead() {
		fatPerson.add("胖人头");
	}

	@Override
	public void buildBody() {
		fatPerson.add("胖人身体");
	}

	@Override
	public void buildHand() {
		fatPerson.add("胖人手");
	}

	@Override
	public void bulidFeet() {
		fatPerson.add("胖人脚");
	}

	@Override
	public Product getProduct() {
		// TODO Auto-generated method stub
		return fatPerson;
	}

}
