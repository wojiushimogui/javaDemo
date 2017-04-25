package org.wrh.strategy;

public class WhiteDuck extends Duck {
	
	public WhiteDuck(){
		flyBehavior=new  FlyNoWay();
		quackDuck=new Quack();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("I am white");

	}

}
