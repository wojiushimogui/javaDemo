package com.wrh.someAlgrithomProgram;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;


public class printTreeByLever {

	public static void main(String[] args) {
		short i=0;
		//i=i+1;�﷨����,ԭ��Ϊ  i+1�Ľ��Ϊint�ͣ������ܽ�Ĭ�Ͻ�int��ת��Ϊshort
		i+=1;
		int a=1;
		int b=1;
		
		try{
			a=b/0;
			System.out.println("wuranghaowuanghao");
			
		}
		catch(Exception e){
			e.printStackTrace();
			return;//��return��finallyҲ����Ҫִ��
		}
		finally{
			
			System.out.println("wuanghao");
		}
		}
	}

