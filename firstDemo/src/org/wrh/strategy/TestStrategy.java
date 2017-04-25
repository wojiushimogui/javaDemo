package org.wrh.strategy;

public class TestStrategy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Duck wd=new WhiteDuck();
		wd.flyPerform();;
		wd.quackPerform();
		wd.setFlyBehavior(new FlyRocketPower());
		wd.flyPerform();

	}

}
