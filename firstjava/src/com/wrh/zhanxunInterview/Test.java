package com.wrh.zhanxunInterview;

class Test1{  
    public static int X=100;  
    public final static int Y=200  ;
	public Test1(){  
	    System.out.println("Test构造函数执行");  
	} 
	
	static{  
	    System.out.println("static语句块执行");  
	} 
	
	public static void display(){  
	    System.out.println("静态方法被执行");  
	} 
	
	public void display_1(){  
	    System.out.println("实例方法被执行");  
	}  
}  
public class Test{  
	public static void main(String args[]){   
		
	         Test1 t=new Test1();
	         Test1  t2=new Test1();
	       
	}     
} 
