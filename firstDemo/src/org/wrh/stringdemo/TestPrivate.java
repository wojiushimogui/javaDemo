package org.wrh.stringdemo;

public class TestPrivate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inner inner=new TestPrivate().new Inner();
		System.out.println("i="+inner.i);

	}
	
	public class Inner{
		private int i=9;
	}

}
