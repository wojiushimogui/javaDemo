package com.wrh.abstractFactory;

public class Test {

	public static void main(String[] args) {
		AbstractFactory factory1=new ProduceHuaWeiFactory();
		AbstractFactory factory2=new ProduceMeiZuFactory();
		//��һ������������һ����Ʒ��
		HuaWei huawei=(HuaWei)factory1.produceMobile();
		HuaWeiCover huaweicover=(HuaWeiCover)factory1.produceMobileCover();
		//�ڶ������������ڶ�����Ʒ��
		MeiZu meizu=(MeiZu)factory2.produceMobile();
		MeiZuCover meizucover=(MeiZuCover)factory2.produceMobileCover();
	}

}
