package com.wrh.abstractFactory;

public class Test {

	public static void main(String[] args) {
		AbstractFactory factory1=new ProduceHuaWeiFactory();
		AbstractFactory factory2=new ProduceMeiZuFactory();
		//第一个工厂生产第一个产品簇
		HuaWei huawei=(HuaWei)factory1.produceMobile();
		HuaWeiCover huaweicover=(HuaWeiCover)factory1.produceMobileCover();
		//第二个工厂生产第二个产品簇
		MeiZu meizu=(MeiZu)factory2.produceMobile();
		MeiZuCover meizucover=(MeiZuCover)factory2.produceMobileCover();
	}

}
