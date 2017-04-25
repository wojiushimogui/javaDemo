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

	public void setPrice(double price) {//���۸�ı�ʱӦ֪ͨ���еĹ۲���
		this.setChanged();//֪ͨ���ݿ��Ա��޸���
		this.price = price;
		this.notifyObservers(price);
	}

	@Override
	public String toString() {
		return "����";
	}
	

}
