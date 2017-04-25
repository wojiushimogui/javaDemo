package com.wrh.abstractFactory;

public class ProduceHuaWeiFactory implements AbstractFactory{

	@Override
	public AbstractProductMobilePhone produceMobile() {
		return new HuaWei();
	}

	@Override
	public MobilePhoneCover produceMobileCover() {
		// TODO Auto-generated method stub
		return new HuaWeiCover();
	}

}
