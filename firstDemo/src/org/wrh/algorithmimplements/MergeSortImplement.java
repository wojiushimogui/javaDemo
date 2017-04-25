package org.wrh.algorithmimplements;

import java.util.Arrays;

public class MergeSortImplement {
	//�鲢�����ʵ��
	public static void main(String[] args) {
		int[] a={9,6,4,6,3,1,8,7,13,19};
		System.out.println("����ǰ���������£�"+Arrays.toString(a));
		mergeSort(a,0,a.length-1);
		System.out.println("�������������£�"+Arrays.toString(a));
		
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
		//���弸����ʱ����ͱ���
		
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
		//�鲢��arr������
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
		//��������whileѭ��ʱ��������������û������ļ����鲢��Ժ������
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
