package com.wrh.firstpro;

import java.util.Arrays;

public class ProgrammingBeautifuldemo_2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={30,40,70,31,9,10,15,-7};
		int arr1[]=findMaxAndSecondMax(arr,0,arr.length-1);
		System.out.println("����"+Arrays.toString(arr)+"�е��������͵ڶ������Ϊ��"+Arrays.toString(arr1));

	}

	private static int[] findMaxAndSecondMax(int[] arr,int left,int right) {
		// TODO Auto-generated method stub
		int max,secondMax;
		/*
		 * �������л�������Ԫ�ػ�������Ԫ�أ��ͷ���
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
			System.out.println(" ÿ�η��ص����飺"+Arrays.toString(temp_arr));
			return temp_arr;
		}
		
		int middle=left+(right-left)/2;
		/*
		 * temp_left��temp_right��������ĳ��ȶ�Ϊ2
		 * �����������������������з�������max��secondMax
		 * */
		int temp_left[]=findMaxAndSecondMax(arr,left,middle);
		int temp_right[]=findMaxAndSecondMax(arr, middle+1, right);
		
		if(temp_left[0]>temp_right[0]){
			/*
			 * ���ֵ�ڵ�һ��������ʱ����ڶ����ֵ���п���Ϊ��һ���������еĵڶ��������
			 * �����ǵڶ�����������������
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
		 * �����ֵ�͵ڶ���ֵ��ϳ�Ϊһ�����鷵��
		 * */
		int maxSecondMax[]={max,secondMax};
		System.out.println("shuzu  wuwu"+Arrays.toString(maxSecondMax));
		return maxSecondMax;
	}

}
