package com.wrh.templateMethod;

public abstract class AbstractTemplate {
	public abstract void sort(int [] arr);
	public void my_print(int [] arr){
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]+"  ");
		}	
	}
	//ģ�巽�������������Ĳ�������Щ���������Ǿ���ģ�Ҳ�����ǳ���ġ�
	public void sortAndPrint(int []arr){
		this.sort(arr);
		this.my_print(arr);
	}
}
