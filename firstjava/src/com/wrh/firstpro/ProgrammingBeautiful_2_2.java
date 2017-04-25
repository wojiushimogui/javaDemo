package com.wrh.firstpro;

import java.util.Arrays;

/*
 * 寻找数组中的第二大值
 * */
public class ProgrammingBeautiful_2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={20,1,5,7,4,8,9};
		/*
		 * 保存数组中的最大值
		 * */
		int max;
		/*
		 * 保存数组中的第二大值
		 * */
		int secondMax;
		/*
		 * 用该数组的第一个元素初始化max
		 * */
		max=arr[0];
		/*
		 * 用整数的最小数来初始化secondMax
		 * 
		 * */
		secondMax=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++){
			if(arr[i]>max){
				/*
				 * 在更新最大值之前，先用max来更新secondMax
				 * */
				secondMax=max;
				max=arr[i];
				
			}
			else if(arr[i]>secondMax){
				secondMax=arr[i];
				
			}
		
		}
		System.out.println("数组"+Arrays.toString(arr)+"第二大的数为："+secondMax);
		
	}

}
