package org.wrh.algorithmimplements;

import java.util.Arrays;

//堆排序的实现
/*
 * 堆排序需要两个步骤：
 * 第一：建堆
 * 第二：排序
 * 其中建堆和排序的过程中都需要维护堆的性质
 * */
public class HeapSortImplement {

	public static void main(String[] args) {
		int []arr={9,8,7,4,6,5,4,9,3,1,8,0,2};
		System.out.println("排序前的数组如下："+Arrays.toString(arr));
		//建堆
		buildHeap(arr,arr.length);
		//排序
		heapSort(arr,arr.length);
		
		System.out.println("排序后的数组如下："+Arrays.toString(arr));
	}
	
	/*
	 * 完成对数组的排序
	 * 思想如下：因为我们采用的是最大堆，因此我们将一个元素与最后的一个元素交换，然后调用heapify来调整，就这样继续下去，直至结束
	 * */
	private static void heapSort(int[] arr, int length) {
		int heap_size=length;
		while(heap_size>0){
			heap_size--;//将堆的大小减一，使得将数组中的最后面已经排好序的在堆中隐藏掉
			swap(arr,0,heap_size);//注意这里是下标为零的位置与最后的位置进行交换；容易写成“1”
			headify(arr,0,heap_size);
			
		}
		
	}
	/*
	 * 此函数是将任意数组建成一个最大堆
	 * 建堆的要点在于：由于(n/2)+1到n的下标元素是堆的叶子节点，首先将这些叶子节点各看成一个单元素的堆，然后逐级往上面进行调整使其成为最大堆
	 * */
	private static void buildHeap(int[] arr, int length) {
		for(int i=length/2-1;i>=0;i--){
			//调用维护堆的函数
			headify(arr,i,arr.length);
			
			
		}
	}

	/*
	 * 当我们对堆进行改变之后，我们需要对堆进行调整，使其具有最大堆的性质，此函数就完成此功能
	 * */
	private static void headify(int[] arr, int i,int heap_size) {
		//i位置的值可能不是最大值，而i位置的左孩子和右孩子还具有最大堆的性质，故需要调整
		int left=2*i+1;
		int right=2*i+2;
		int largest;
		/*
		 * 注意：首先要判断的是left和right是否在数组的边界之内;然后才比较出最大值进行交换，最后再维护最大堆性质
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
		 * 这里要注意的是：只有当i与largest不相等的时候，才交换，若相等则说明的是此时是满足最大堆性质的
		 * */
		if(i!=largest){
			swap(arr,i,largest);
			headify(arr,largest,heap_size);
		}
		
	}
	
	/*
	 * 用来调整数组中两个位置的顺序
	 * */
	private static void swap(int[] arr, int i, int largest) {
		if(i!=largest){
			int temp=arr[i];
			arr[i]=arr[largest];
			arr[largest]=temp;
			
		}
	}

}
