package com.wrh.leetcode;

public class ExceptionTest {
	public void  testException(){
		
		try{
			//����һ�����쳣�ĺ���
			inside_try();
		}
		catch(Exception e){
			inside_catch(e);
		}
		finally{
			inside_finally();
		}
	}
	//��һ���쳣�ĺ���
	public void inside_try(){}
	//�����쳣�ĺ���
	public void inside_catch(Exception e){}
	public void inside_finally(){}
}
