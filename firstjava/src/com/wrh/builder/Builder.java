package com.wrh.builder;
//建造者接口：一般至少提供两个方法，一个是根据部件建造产品，一个是返回组建好的产品
//由于这里是以建造人为例：包括建造  头、身体、手和脚4个方法。
public interface Builder {
	public void buildHead();
	public void buildBody();
	public void buildHand();
	public void bulidFeet();
	public Product getProduct();
}
