package org.wrh.algorithmimplements;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		//选择排序的实现
		int[] a={9,8,7,6,5,4,3,2,1,0};
		System.out.println("排序前的数组如下："+Arrays.toString(a));
		int min;
		for(int i=0;i<a.length-1;i++){
			min=i;
			int j=i+1;
			for(;j<a.length;j++){//在数组中没有排序的部分中寻找的最小值
				if(a[min]>a[j]){
					min=j;
					
				}
				
			}
			//每次循坏找到最小值后就与当前位置进行交换
			swap(a,i,min);
		
		}
		System.out.println("排序后的数组如下："+Arrays.toString(a));
		

	}
	public static void swap(int [] a,int i,int j){
		int temp;
		if(i!=j){
			temp=a[i];
			a[i]=a[j];
			a[j]=temp;
		
		}
		
	}

}
