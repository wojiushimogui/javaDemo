package org.wrh.algorithmimplements;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		//ѡ�������ʵ��
		int[] a={9,8,7,6,5,4,3,2,1,0};
		System.out.println("����ǰ���������£�"+Arrays.toString(a));
		int min;
		for(int i=0;i<a.length-1;i++){
			min=i;
			int j=i+1;
			for(;j<a.length;j++){//��������û������Ĳ�����Ѱ�ҵ���Сֵ
				if(a[min]>a[j]){
					min=j;
					
				}
				
			}
			//ÿ��ѭ���ҵ���Сֵ����뵱ǰλ�ý��н���
			swap(a,i,min);
		
		}
		System.out.println("�������������£�"+Arrays.toString(a));
		

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
