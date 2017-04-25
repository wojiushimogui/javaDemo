package com.wrh.abstractFactory;

public class ProduceMeiZuFactory implements AbstractFactory{

	@Override
	public AbstractProductMobilePhone produceMobile() {
		return new MeiZu();
	}

	@Override
	public MobilePhoneCover produceMobileCover() {
		return new MeiZuCover();
	}

}
