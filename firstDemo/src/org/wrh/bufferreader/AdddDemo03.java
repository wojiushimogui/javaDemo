package org.wrh.bufferreader;

import java.util.Date;

import org.wrh.menudemo.InputData;

//��������ӵĵڶ����汾������������Ĳ�������ʱ�����ǳ����ܸ�����ʾ
//��������ʽ�������֤

public class AdddDemo03 {

	public static void main(String[] args) {
		int i=0;
		int j=0;//�������յ�������
		InputData input=new InputData();
		i=input.getInt("���������ݣ�", "�������ݱ���������������  ");
		j=input.getInt("���������ݣ�", "�������ݱ���������������  ");
		System.out.println("�������Ľ�����£�"+i+"+"+j+"="+(i+j));
		
		float m=0;
		float n=0;//�������յ�������
		m=input.getFloat("���������ݣ�", "�������ݱ�����float�ͣ�����  ");
		n=input.getFloat("���������ݣ�", "�������ݱ�����float�ͣ�����  ");
		System.out.println("�������Ľ�����£�"+m+"+"+m+"="+(m+n));
		
		///Date date1=input.getData("�������������ݣ�", "����ı�������������");
		//Date date2=input.getData("�������������ݣ�", "����ı�������������");
		//System.out.println("�������Ľ�����£�"+date1+"+"+date2+"="+(date1+date2));
		
		
	}

}
