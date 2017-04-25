package com.wrh.abstractFactory;
//工厂接口
public interface AbstractFactory {
	//生产手机
	public AbstractProductMobilePhone produceMobile();
	//生产手机对应的手机套
	public MobilePhoneCover produceMobileCover();
	
}
