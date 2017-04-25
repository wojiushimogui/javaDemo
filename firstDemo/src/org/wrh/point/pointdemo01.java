package org.wrh.point;

public class pointdemo01<T> {
	private T x;
	private T y;
	
	public pointdemo01(T x, T y) {
		super();
		this.x = x;
		this.y = y;
	}
	public T getX() {
		return x;
	}
	public void setX(T x) {
		this.x = x;
	}
	public T getY() {
		return y;
	}
	public void setY(T y) {
		this.y = y;
	}
	
	public String toString(){
		return "点的坐标为（"+x+","+y+")";
	}
}
