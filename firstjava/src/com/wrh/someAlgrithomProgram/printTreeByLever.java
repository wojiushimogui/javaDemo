package com.wrh.someAlgrithomProgram;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;


public class printTreeByLever {

	public static void main(String[] args) {
		short i=0;
		//i=i+1;语法错误,原因为  i+1的结果为int型，而不能将默认将int型转化为short
		i+=1;
		int a=1;
		int b=1;
		
		try{
			a=b/0;
			System.out.println("wuranghaowuanghao");
			
		}
		catch(Exception e){
			e.printStackTrace();
			return;//有return，finally也必须要执行
		}
		finally{
			
			System.out.println("wuanghao");
		}
		}
	}

