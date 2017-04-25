package org.wrh.programbeautiful;

public class CpuDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			  int busyTime = 10;  
			  int idleTime = busyTime;  
			  long startTime = 0;  
			  while (true) {  
			   startTime = System.currentTimeMillis();  
			   // busy loop  
			   while ((System.currentTimeMillis() - startTime) <= busyTime)  
			    ;  
			   // idle loop  
			   try {  
			    Thread.sleep(idleTime);  
			   } catch (InterruptedException e) {  
			    System.out.println(e);  
			   }  
			  }   

	}

}
