package com.wrh.testhashmap;

public class TestReference {
	public int i;
	public static void main(String[] args) {
		TestReference tf = new TestReference();
		tf.i = 0;
		System.out.println("Before changeInteger i = "+tf.i);
		
		changeInteger(tf);
		
		System.out.println("After changeInteger i = "+tf.i);
		
		System.out.println("--------------------------");
		
		tf.i=0;
		System.out.println("Before changeReference i = "+tf.i);
		changeReference(tf);
		System.out.println("After changeReference i = "+tf.i);
		
	}
	private static void changeReference(TestReference tf) {
		tf = new TestReference();
		tf.i = 5;
		System.out.println("In changeReference i = "+tf.i);
	}
	private static void changeInteger(TestReference tf) {
		
		tf.i = 5;
		System.out.println("In changeInteger i = "+tf.i);
	}

}
