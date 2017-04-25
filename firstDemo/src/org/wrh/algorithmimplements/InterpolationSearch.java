package org.wrh.algorithmimplements;

import java.util.Arrays;
import java.util.Scanner;

//插入排序的实现
public class InterpolationSearch {

	public static void main(String[] args) {
		int []a={10,21,23,42,56,78,98};
		Scanner sc=new Scanner(System.in);
		System.out.print("请输入要查找的数字：");
		int x=sc.nextInt();
		int index=interpolation(a,0,a.length-1,x);
		if(index==0){
			System.out.println("在数组"+Arrays.toString(a)+"中，没有找到"+x);
		}
		else{
			System.out.println(x+"在数组"+Arrays.toString(a)+"中的位置为："+index);
		}
		
	}

	private static int interpolation(int[] a, int low,int high,int x) {
		int middle;
		while(low<high){
			middle=low+(high-low)*(x-a[low])/(a[high]-a[low]);
			if(a[middle]==x){
				return middle;
				
			}
			else if(a[middle]>x){
				high=middle-1;
				
			}
			else{
				low=middle+1;
			}
			
		}
		return -1;
	}

}
