package com.wrh.builder;
//���ݾ���Ĳ�������������Ʒ
public class BuilderThinPerson implements Builder{
	private Product thinPerson;
    public BuilderThinPerson() {
    	thinPerson=new Product();
    }
	@Override
	public void buildHead() {
		thinPerson.add("����ͷ");
	}

	@Override
	public void buildBody() {
		thinPerson.add("��������");
	}

	@Override
	public void buildHand() {
		thinPerson.add("������");
	}

	@Override
	public void bulidFeet() {
		thinPerson.add("���˽�");
	}

	@Override
	public Product getProduct() {
		return thinPerson;
	}

}
