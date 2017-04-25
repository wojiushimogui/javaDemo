package org.wrh.algorithmimplements;

import java.util.Arrays;
import java.util.Scanner;
//����������
public class BinarySearch {

	public static void main(String[] args) {
		/*
		 * ��������һ�����飬�ȶ����������Ȼ�������ж���������
		 * */
		int [] a=new int[3];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<a.length;i++){
			System.out.println("input a number:");
			a[i]=sc.nextInt();
		}
		System.out.println("input a need search number:");
		int x=sc.nextInt();
		//�����������ÿ�������
		System.out.println("����ǰ���������£�"+Arrays.toString(a));
		quickSort(a,0,a.length-1);
		System.out.println("�������������£�"+Arrays.toString(a));
		
		//���������ж���������,�����ҵ���Ԫ�أ��򷵻ظ�Ԫ���������е�λ��
		int index=binarySearch(a,0,a.length-1,x);
		if(index==-1){
			System.out.println("��Ԫ�ز���������");
		}
		else{
			System.out.println("��Ԫ��"+x+"������"+Arrays.toString(a)+"�ĵ�"+index+"λ��");
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
		 * ѡȡ��һ������Ԫ��Ϊ��Ԫ
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
