package org.wrh.strategy;

public abstract class Duck {
	public FlyBehavior flyBehavior;
	public QuackDuck quackDuck;
	public FlyBehavior getFlyBehavior() {
		return flyBehavior;
	}
	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}
	public QuackDuck getQuackDuck() {
		return quackDuck;
	}
	public void setQuackDuck(QuackDuck quackDuck) {
		this.quackDuck = quackDuck;
	}
	
	public void flyPerform(){//���ɵ���Ϊ����ȥ����
		flyBehavior.flying();
	}
	public void quackPerform(){//ͬ��
		quackDuck.quack();
	}
	
	public void swim(){
		System.out.println("�һ���Ӿ");
		
	}
	public abstract void display();

}
