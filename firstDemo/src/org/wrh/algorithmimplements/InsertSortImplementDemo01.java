package org.wrh.algorithmimplements;

import java.util.Arrays;

public class InsertSortImplementDemo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={9,7,6,4,5,6,2,4,1,5,6,9,7,8};
		System.out.println("排序前的数组如下："+Arrays.toString(a));
		int temp;
		for(int i=1;i<a.length;i++){
			temp=a[i];
			int j=i-1;
			while(j>=0&&a[j]>temp){
				a[j+1]=a[j];
				--j;
				
			}
			a[j+1]=temp;
			
		}
		System.out.println("排序后的数组如下"+Arrays.toString(a));

	}

}
