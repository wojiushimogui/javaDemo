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
		h.setPrice(5000.f);//�۸�ñ�֪ͨ���еĹ۲���
		System.out.println("1����ʱ�۲��ߵĸ���Ϊ��"+h.countObservers());
		h.deleteObserver(p4);
		System.out.println("2����ʱ�۲��ߵĸ���Ϊ��"+h.countObservers());
		h.deleteObservers();
		System.out.println("3����ʱ�۲��ߵĸ���Ϊ��"+h.countObservers());
		
	}

}
