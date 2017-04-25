package org.wrh.algorithmimplements;

import java.util.Arrays;
import java.util.Scanner;

//���������ʵ��
public class QuickSort {

	public static void main(String[] args) {
		//int []a={5,8,6,4,6,7,9,2,4,1,3,6,5,7};
		/**
		 * �ӿ���̨����һ������
		 */
		int [] a=new int[10];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<a.length;i++){
			System.out.println("������һ������");
			a[i]=sc.nextInt();
			
		}
		
		System.out.println("��������֮ǰ���������£�"+Arrays.toString(a));
		quickSort(a,0,a.length-1);
		System.out.println("��������֮����������£�"+Arrays.toString(a));
		
	}
	public static void quickSort(int arr[],int l,int r){
		int q;
		if(l<r){
			 /*
			  * �õ���ԪԪ�ص�λ���±�
			  * */
			q=partition(arr,l,r);
			quickSort(arr,l,q-1);
			quickSort(arr,q+1,r);
		
		}
	
	}
	public static int partition(int []arr,int l,int r){
		//ѡȡ��һ��Ԫ����Ϊ��Ԫ��Ҳ����ѡȡ����λ�õ�Ԫ����Ϊ��Ԫ
		int x=arr[l];
		int i=l;
		for(int j=l+1;j<=r;j++){
			/*
			 * С�ڵ�����Ԫ������Ԫ�ط�����ԪԪ�ص���ߣ������ķ����ұ�
			 * */
			if(arr[j]<=x){
				i++;
				swap(arr,i,j);
			
			}
			
		}
		swap(arr,i,l);
		
		return i;
	}
	public static void swap(int [] arr,int m,int n){
		int temp=arr[m];
		arr[m]=arr[n];
		arr[n]=temp;
		
	}

}
