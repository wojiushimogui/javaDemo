package com.wrh.builder;
//�����߽ӿڣ�һ�������ṩ����������һ���Ǹ��ݲ��������Ʒ��һ���Ƿ����齨�õĲ�Ʒ
//�����������Խ�����Ϊ������������  ͷ�����塢�ֺͽ�4��������
public interface Builder {
	public void buildHead();
	public void buildBody();
	public void buildHand();
	public void bulidFeet();
	public Product getProduct();
}
