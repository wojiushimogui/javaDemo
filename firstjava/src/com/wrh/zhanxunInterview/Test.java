package com.wrh.zhanxunInterview;

class Test1{  
    public static int X=100;  
    public final static int Y=200  ;
	public Test1(){  
	    System.out.println("Test���캯��ִ��");  
	} 
	
	static{  
	    System.out.println("static����ִ��");  
	} 
	
	public static void display(){  
	    System.out.println("��̬������ִ��");  
	} 
	
	public void display_1(){  
	    System.out.println("ʵ��������ִ��");  
	}  
}  
public class Test{  
	public static void main(String args[]){   
		
	         Test1 t=new Test1();
	         Test1  t2=new Test1();
	       
	}     
} 
