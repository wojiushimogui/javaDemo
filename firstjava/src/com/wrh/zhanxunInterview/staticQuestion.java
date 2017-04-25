package com.wrh.zhanxunInterview;

public class staticQuestion {

	public static void main(String[] args) {
		Person childA=new Son("childA");
		//Son s=new Son("childA");
		Person childB=new Daughter("childB");
		childA.staticMethod();
		childA.method();
		childB.staticMethod();
		childB.method();

	}

}
