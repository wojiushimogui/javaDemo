package com.wrh.builder;
//根据具体的部件来构造具体产品
public class BuilderThinPerson implements Builder{
	private Product thinPerson;
    public BuilderThinPerson() {
    	thinPerson=new Product();
    }
	@Override
	public void buildHead() {
		thinPerson.add("瘦人头");
	}

	@Override
	public void buildBody() {
		thinPerson.add("瘦人身体");
	}

	@Override
	public void buildHand() {
		thinPerson.add("瘦人手");
	}

	@Override
	public void bulidFeet() {
		thinPerson.add("瘦人脚");
	}

	@Override
	public Product getProduct() {
		return thinPerson;
	}

}
