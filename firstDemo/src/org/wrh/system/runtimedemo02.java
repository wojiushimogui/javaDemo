package org.wrh.system;
public class runtimedemo02 {
	      public static void main(String[] args) {  
	        System.out.println("1、空闲的内存："+Runtime.getRuntime().freeMemory());  
	        System.out.println("1、此时总共的内存："+Runtime.getRuntime().totalMemory());  
	        System.out.println("1、最大能够得到的内存："+Runtime.getRuntime().maxMemory());  
	        long begin = System.currentTimeMillis();  
	        
	       String[] aaa = new String[2000000];  
	       System.out.println("2、此时空闲的内存："+Runtime.getRuntime().freeMemory());  
	       System.out.println("2、此时的最大的内存："+Runtime.getRuntime().totalMemory());  
	       System.out.println("2、最大能够得到的内存："+Runtime.getRuntime().maxMemory());  
	      
	       for (int i = 0; i < 2000000; i++) {  
	         aaa[i] = new String("aaa");  
	       }  
	       System.out.println("3、此时空闲的内存："+Runtime.getRuntime().freeMemory());  
	       System.out.println("3、此时的最大的内存："+Runtime.getRuntime().totalMemory());  
	       System.out.println("3、最大能够得到的内存："+Runtime.getRuntime().maxMemory());  
	       long end = System.currentTimeMillis();  
	       System.out.println("程序运行所用的时间为："+(end-begin));
	     }  
}  

