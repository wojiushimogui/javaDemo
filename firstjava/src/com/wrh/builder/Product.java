package com.wrh.builder;

import java.util.ArrayList;
import java.util.List;
//产品类:一个产品的构造有add函数来完成
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
