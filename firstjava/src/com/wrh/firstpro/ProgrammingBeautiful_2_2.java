package com.wrh.firstpro;

import java.util.Arrays;

/*
 * Ѱ�������еĵڶ���ֵ
 * */
public class ProgrammingBeautiful_2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={20,1,5,7,4,8,9};
		/*
		 * ���������е����ֵ
		 * */
		int max;
		/*
		 * ���������еĵڶ���ֵ
		 * */
		int secondMax;
		/*
		 * �ø�����ĵ�һ��Ԫ�س�ʼ��max
		 * */
		max=arr[0];
		/*
		 * ����������С������ʼ��secondMax
		 * 
		 * */
		secondMax=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++){
			if(arr[i]>max){
				/*
				 * �ڸ������ֵ֮ǰ������max������secondMax
				 * */
				secondMax=max;
				max=arr[i];
				
			}
			else if(arr[i]>secondMax){
				secondMax=arr[i];
				
			}
		
		}
		System.out.println("����"+Arrays.toString(arr)+"�ڶ������Ϊ��"+secondMax);
		
	}

}
