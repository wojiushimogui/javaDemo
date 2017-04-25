package org.wrh.observedemo;

public class testObser {

	public static void main(String[] args) {
		House h=new House(4000);
		Person p1=new Person();
		Person p2=new Person();
		Person p3=new Person();
		Person p4=new Person();
		h.addObserver(p1);
		h.addObserver(p2);
		h.addObserver(p3);
		h.addObserver(p4);
		h.setPrice(5000.f);//价格该表，通知所有的观察者
		System.out.println("1、此时观察者的个数为："+h.countObservers());
		h.deleteObserver(p4);
		System.out.println("2、此时观察者的个数为："+h.countObservers());
		h.deleteObservers();
		System.out.println("3、此时观察者的个数为："+h.countObservers());
		
	}

}
