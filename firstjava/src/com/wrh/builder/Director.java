package com.wrh.builder;
/*
 * ������
 * 
 * ��������̶̹�
 * */

public class Director {
	//�����迪ʼ����
	public void Constructor(Builder builder){
		builder.buildHand();
		builder.buildBody();
		builder.buildHand();
		builder.bulidFeet();
	}
}
