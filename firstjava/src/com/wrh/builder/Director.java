package com.wrh.builder;
/*
 * 导演类
 * 
 * 构造的流程固定
 * */

public class Director {
	//按步骤开始构造
	public void Constructor(Builder builder){
		builder.buildHand();
		builder.buildBody();
		builder.buildHand();
		builder.bulidFeet();
	}
}
