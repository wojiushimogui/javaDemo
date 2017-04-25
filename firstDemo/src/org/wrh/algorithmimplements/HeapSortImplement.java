package org.wrh.algorithmimplements;

import java.util.Arrays;

//�������ʵ��
/*
 * ��������Ҫ�������裺
 * ��һ������
 * �ڶ�������
 * ���н��Ѻ�����Ĺ����ж���Ҫά���ѵ�����
 * */
public class HeapSortImplement {

	public static void main(String[] args) {
		int []arr={9,8,7,4,6,5,4,9,3,1,8,0,2};
		System.out.println("����ǰ���������£�"+Arrays.toString(arr));
		//����
		buildHeap(arr,arr.length);
		//����
		heapSort(arr,arr.length);
		
		System.out.println("�������������£�"+Arrays.toString(arr));
	}
	
	/*
	 * ��ɶ����������
	 * ˼�����£���Ϊ���ǲ��õ������ѣ�������ǽ�һ��Ԫ��������һ��Ԫ�ؽ�����Ȼ�����heapify��������������������ȥ��ֱ������
	 * */
	private static void heapSort(int[] arr, int length) {
		int heap_size=length;
		while(heap_size>0){
			heap_size--;//���ѵĴ�С��һ��ʹ�ý������е�������Ѿ��ź�����ڶ������ص�
			swap(arr,0,heap_size);//ע���������±�Ϊ���λ��������λ�ý��н���������д�ɡ�1��
			headify(arr,0,heap_size);
			
		}
		
	}
	/*
	 * �˺����ǽ��������齨��һ������
	 * ���ѵ�Ҫ�����ڣ�����(n/2)+1��n���±�Ԫ���Ƕѵ�Ҷ�ӽڵ㣬���Ƚ���ЩҶ�ӽڵ������һ����Ԫ�صĶѣ�Ȼ������������е���ʹ���Ϊ����
	 * */
	private static void buildHeap(int[] arr, int length) {
		for(int i=length/2-1;i>=0;i--){
			//����ά���ѵĺ���
			headify(arr,i,arr.length);
			
			
		}
	}

	/*
	 * �����ǶԶѽ��иı�֮��������Ҫ�Զѽ��е�����ʹ��������ѵ����ʣ��˺�������ɴ˹���
	 * */
	private static void headify(int[] arr, int i,int heap_size) {
		//iλ�õ�ֵ���ܲ������ֵ����iλ�õ����Ӻ��Һ��ӻ��������ѵ����ʣ�����Ҫ����
		int left=2*i+1;
		int right=2*i+2;
		int largest;
		/*
		 * ע�⣺����Ҫ�жϵ���left��right�Ƿ�������ı߽�֮��;Ȼ��űȽϳ����ֵ���н����������ά����������
		 * */
		if(left<heap_size&&arr[left]>arr[i]){
			largest=left;
			
		}
		else {
			largest=i;
		}
		if(right<heap_size&&arr[right]>arr[largest]){
			largest=right;
			
		}
		/*
		 * ����Ҫע����ǣ�ֻ�е�i��largest����ȵ�ʱ�򣬲Ž������������˵�����Ǵ�ʱ�������������ʵ�
		 * */
		if(i!=largest){
			swap(arr,i,largest);
			headify(arr,largest,heap_size);
		}
		
	}
	
	/*
	 * ������������������λ�õ�˳��
	 * */
	private static void swap(int[] arr, int i, int largest) {
		if(i!=largest){
			int temp=arr[i];
			arr[i]=arr[largest];
			arr[largest]=temp;
			
		}
	}

}
