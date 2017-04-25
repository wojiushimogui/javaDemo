package com.wrh.leetcode;

public class ExceptionTest {
	public void  testException(){
		
		try{
			//调用一个抛异常的函数
			inside_try();
		}
		catch(Exception e){
			inside_catch(e);
		}
		finally{
			inside_finally();
		}
	}
	//抛一个异常的函数
	public void inside_try(){}
	//处理异常的函数
	public void inside_catch(Exception e){}
	public void inside_finally(){}
}
