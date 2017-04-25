package org.wrh.algorithmimplements;

import java.util.Arrays;

public class MergeSortImplement {
	//归并排序的实现
	public static void main(String[] args) {
		int[] a={9,6,4,6,3,1,8,7,13,19};
		System.out.println("排序前的数组如下："+Arrays.toString(a));
		mergeSort(a,0,a.length-1);
		System.out.println("排序后的数组如下："+Arrays.toString(a));
		
	}
	
	public static void mergeSort(int [] arr,int left,int right){
		if(left<right){
			int middle=left+(right-left)/2;
			mergeSort(arr,left,middle);
			mergeSort(arr,middle+1,right);
			merge(arr,left,middle,right);
			
			
		}
		
	}
	public static void merge(int[] arr,int left,int middle,int right){
		//定义几个临时数组和变量
		
		int n1=middle-left+1;
		int n2=right-middle;
		int [] arr_left=new int[n1];;
		int [] arr_right=new int[n2];
		for(int i=0;i<n1;i++){
			arr_left[i]=arr[left+i];
		
		}
		for(int j=0;j<n2;j++){
			arr_right[j]=arr[middle+1+j];
		
		}
		//归并到arr数组中
		int i=0;
		int j=0;
		int k=left;
		while(i<n1&&j<n2){
			if(arr_left[i]<=arr_right[j]){
				arr[k]=arr_left[i];
				i++;
				k++;
				
			}
			else{
				arr[k]=arr_right[j];
				j++;
				k++;
			}
			
		}
		//下面两个while循环时将左右两个数组没有排完的继续归并到院数组中
		while(i<n1){
			arr[k]=arr_left[i];
			k++;
			i++;
			
			
		}
		while(j<n2){
			arr[k]=arr_right[j];
			k++;
			j++;
			
		}
		
	}

}
