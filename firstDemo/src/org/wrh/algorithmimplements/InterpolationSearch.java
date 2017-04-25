package org.wrh.algorithmimplements;

import java.util.Arrays;
import java.util.Scanner;

//���������ʵ��
public class InterpolationSearch {

	public static void main(String[] args) {
		int []a={10,21,23,42,56,78,98};
		Scanner sc=new Scanner(System.in);
		System.out.print("������Ҫ���ҵ����֣�");
		int x=sc.nextInt();
		int index=interpolation(a,0,a.length-1,x);
		if(index==0){
			System.out.println("������"+Arrays.toString(a)+"�У�û���ҵ�"+x);
		}
		else{
			System.out.println(x+"������"+Arrays.toString(a)+"�е�λ��Ϊ��"+index);
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
