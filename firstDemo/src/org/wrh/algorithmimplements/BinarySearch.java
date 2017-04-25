package org.wrh.algorithmimplements;

import java.util.Arrays;
import java.util.Scanner;
//二叉树查找
public class BinarySearch {

	public static void main(String[] args) {
		/*
		 * 输入任意一个数组，先对其进行排序，然后对其进行二叉树查找
		 * */
		int [] a=new int[3];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<a.length;i++){
			System.out.println("input a number:");
			a[i]=sc.nextInt();
		}
		System.out.println("input a need search number:");
		int x=sc.nextInt();
		//这里我们利用快速排序
		System.out.println("排序前的数组如下："+Arrays.toString(a));
		quickSort(a,0,a.length-1);
		System.out.println("排序后的数组如下："+Arrays.toString(a));
		
		//接下来进行二叉树查找,若查找到该元素，则返回该元素在数组中的位置
		int index=binarySearch(a,0,a.length-1,x);
		if(index==-1){
			System.out.println("该元素不在数组中");
		}
		else{
			System.out.println("该元素"+x+"在数组"+Arrays.toString(a)+"的第"+index+"位置");
		}
		
	}

	private static int binarySearch(int[] a, int l,int r,int x) {
		if(l<=r){
			int middle=l+(r-l)/2;
			if(a[middle]==x){
				return  middle;
				
			}
			else if(a[middle]<x){
				return binarySearch(a,middle+1,r,x);
				
			}
			else{
				return binarySearch(a, l, middle-1, x);
			}
			
		}
		return -1;
	}

	private static void quickSort(int[] arr, int l, int r) {
		if(l<r){
			int q=partition(arr,l,r);
			quickSort(arr,l,q-1);
			quickSort(arr,q+1,r);
		}
		
	}

	private static int partition(int[] arr, int l, int r) {
		/*
		 * 选取第一个数组元素为主元
		 * */
		int x=arr[l];
		int i=l;
		for(int j=l+1;j<=r;j++){
			if(arr[j]<=x){
				i++;
				swap(arr,i,j);
				
			}
			
		}
		swap(arr,i,l);
		
		return i;
	}

	private static void swap(int[] arr, int i, int j) {
		if(i!=j){
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			
		}
	}

}
