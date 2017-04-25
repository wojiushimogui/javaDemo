package com.wrh.firstpro;

import java.util.Arrays;

public class ProgrammingBeautifuldemo_2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={30,40,70,31,9,10,15,-7};
		int arr1[]=findMaxAndSecondMax(arr,0,arr.length-1);
		System.out.println("数组"+Arrays.toString(arr)+"中的最大的数和第二大的数为："+Arrays.toString(arr1));

	}

	private static int[] findMaxAndSecondMax(int[] arr,int left,int right) {
		// TODO Auto-generated method stub
		int max,secondMax;
		/*
		 * 子数组中还有两个元素或者两个元素，就返回
		 * */
		if((right-left)<=1){
			if(arr[left]<arr[right]){
				max=arr[right];
				secondMax=arr[left];
			}
			else{
				max=arr[left];
				secondMax=arr[right];
			}
			int temp_arr[]={max,secondMax};
			System.out.println(" 每次返回的数组："+Arrays.toString(temp_arr));
			return temp_arr;
		}
		
		int middle=left+(right-left)/2;
		/*
		 * temp_left和temp_right两个数组的长度都为2
		 * 用来保存左右两个子数组中返回来的max和secondMax
		 * */
		int temp_left[]=findMaxAndSecondMax(arr,left,middle);
		int temp_right[]=findMaxAndSecondMax(arr, middle+1, right);
		
		if(temp_left[0]>temp_right[0]){
			/*
			 * 最大值在第一个子数组时，则第二大的值就有可能为第一个子数组中的第二大的数，
			 * 或者是第二个子数组中最大的数
			 * */
			max=temp_left[0];
			if(temp_right[0]>temp_left[1]){
				secondMax=temp_right[0];
			}
			else{
				secondMax=temp_left[1];
			}
			
		}
		else {
			max=temp_right[0];
			if(temp_left[0]>temp_right[1]){
				secondMax=temp_left[0];
			}
			else{
				secondMax=temp_right[1];
			}
		}
		/*
		 * 将最大值和第二大值组合成为一个数组返回
		 * */
		int maxSecondMax[]={max,secondMax};
		System.out.println("shuzu  wuwu"+Arrays.toString(maxSecondMax));
		return maxSecondMax;
	}

}
