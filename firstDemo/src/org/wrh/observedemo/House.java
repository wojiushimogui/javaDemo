package org.wrh.observedemo;

import java.util.Observable;

public class House extends Observable{
	private double price;

	public House(double price) {
		super();
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {//当价格改变时应通知所有的观察者
		this.setChanged();//通知内容可以被修改了
		this.price = price;
		this.notifyObservers(price);
	}

	@Override
	public String toString() {
		return "房子";
	}
	

}
