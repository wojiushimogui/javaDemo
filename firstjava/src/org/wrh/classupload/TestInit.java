package org.wrh.classupload;

class Parent{
	public static int value=1;
	static{
		System.out.println("Parent init");
		value=2;
	}
}

class Son extends Parent{
	public static int value_1=value;
	static{
		System.out.println("Son init");
	}
	
}
public class TestInit {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Son.value_1);

	}

}
