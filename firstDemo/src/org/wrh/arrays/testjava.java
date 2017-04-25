package org.wrh.arrays;
class A
{
	}
class B{
	
}
public class testjava {
	public static void main(String [] args){
		A a=new A();
		Class aClass=a.getClass();
		Class a1Class=A.class;
		try {
			Class a2Class=Class.forName("A");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
