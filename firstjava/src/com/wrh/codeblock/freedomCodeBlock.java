package com.wrh.codeblock;
//���ɴ������о�
//���ɴ���������������{}����Ĵ����
//ִ��˳����new������ù��췽��֮ǰִ�С��������һ�������м������ɴ���飬����ִ��˳��������ֵ�˳��һ�£����ȳ�����ִ�С�
//��ÿ�½�һ�����󣬶���ִ��һ�Ρ�
public class freedomCodeBlock {
	{
		System.out.println("���ɴ����2������");//���⽫2д��ǰ��
	}
	public freedomCodeBlock(){
		System.out.println("���캯����ִ��");
	}
	{
		System.out.println("���ɴ����1��ִ��");
	}
	public static void main(String[] args) {
		System.out.println("main �������ڴ�������ǰ�ĵ�һ����䱻ִ��");
		new freedomCodeBlock();
		new freedomCodeBlock();
	}

}
/*
 * ���н������
main �������ڴ�������ǰ�ĵ�һ����䱻ִ��
���ɴ����2������
���ɴ����1��ִ��
���캯����ִ��
���ɴ����2������
���ɴ����1��ִ��
���캯����ִ��
 * */

