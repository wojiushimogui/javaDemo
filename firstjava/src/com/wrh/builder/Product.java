package com.wrh.builder;

import java.util.ArrayList;
import java.util.List;
//��Ʒ��:һ����Ʒ�Ĺ�����add���������
public class Product {
	List<String> list=new ArrayList<String>();
	public void add(String str){
		list.add(str);
	}
	public void show(){
		for(String str:list){
			System.out.println(" "+str);
		}
	}

}
