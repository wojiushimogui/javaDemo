package org.wrh.system;
public class runtimedemo02 {
	      public static void main(String[] args) {  
	        System.out.println("1�����е��ڴ棺"+Runtime.getRuntime().freeMemory());  
	        System.out.println("1����ʱ�ܹ����ڴ棺"+Runtime.getRuntime().totalMemory());  
	        System.out.println("1������ܹ��õ����ڴ棺"+Runtime.getRuntime().maxMemory());  
	        long begin = System.currentTimeMillis();  
	        
	       String[] aaa = new String[2000000];  
	       System.out.println("2����ʱ���е��ڴ棺"+Runtime.getRuntime().freeMemory());  
	       System.out.println("2����ʱ�������ڴ棺"+Runtime.getRuntime().totalMemory());  
	       System.out.println("2������ܹ��õ����ڴ棺"+Runtime.getRuntime().maxMemory());  
	      
	       for (int i = 0; i < 2000000; i++) {  
	         aaa[i] = new String("aaa");  
	       }  
	       System.out.println("3����ʱ���е��ڴ棺"+Runtime.getRuntime().freeMemory());  
	       System.out.println("3����ʱ�������ڴ棺"+Runtime.getRuntime().totalMemory());  
	       System.out.println("3������ܹ��õ����ڴ棺"+Runtime.getRuntime().maxMemory());  
	       long end = System.currentTimeMillis();  
	       System.out.println("�����������õ�ʱ��Ϊ��"+(end-begin));
	     }  
}  

