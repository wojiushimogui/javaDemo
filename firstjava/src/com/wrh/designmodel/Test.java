package com.wrh.designmodel;

public class Test {

	public static void main(String[] args) {
		//�ȶ���һ����װ����
		Component component=new ConcreteComponent();
		//��ʼװ��
		//��һ������ʼװ��Դ��ַ
		SourceAddressDecorate source=new SourceAddressDecorate(component);
		//�ڶ�������ʼװ��Ŀ�ĵ�ַ
		DestinationAddressDecorate destination=new DestinationAddressDecorate(source);
		//��������װ�εĵڶ���д������
		//DestinationAddressDecorate destination=new DestinationAddressDecorate(new SourceAddressDecorate(new ConcreteComponent))
		destination.addMessage();
	}

}
