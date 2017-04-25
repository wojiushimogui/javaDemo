package org.wrh.point;

public class pointdemo03<T> {//设置泛型下限
	private T x;
	private T y;
	
	public pointdemo03(T x, T y) {
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
