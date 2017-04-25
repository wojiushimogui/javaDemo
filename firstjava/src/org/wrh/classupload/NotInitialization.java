package org.wrh.classupload;

public class NotInitialization {

	public static void main(String[] args) {
		System.out.println(ConstClass.i);
	}

}
class ConstClass{
	public static final int i=3;
	static{
		System.out.println("ConstClass init");
	}
}
