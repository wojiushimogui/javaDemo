package com.wrh.templateMethod;

public abstract class AbstractTemplate {
	public abstract void sort(int [] arr);
	public void my_print(int [] arr){
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]+"  ");
		}	
	}
	//模板方法：调用其他的操作，这些操作可以是具体的，也可以是抽象的。
	public void sortAndPrint(int []arr){
		this.sort(arr);
		this.my_print(arr);
	}
}
