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
	
	public void flyPerform(){//将飞的行为交出去处理
		flyBehavior.flying();
	}
	public void quackPerform(){//同上
		quackDuck.quack();
	}
	
	public void swim(){
		System.out.println("我会游泳");
		
	}
	public abstract void display();

}
