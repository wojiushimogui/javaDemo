package com.wrh.wangyi;

import java.util.Scanner;

public class Solution1 {

	public static void main(String[] args) {
//		Long val = (Long)10000000000000000002L;
//		System.out.println(val);
//		System.out.println(Math.pow(10, 18));
//		
//		System.out.println(val>Math.pow(10, 18));
		Scanner in = new Scanner(System.in);
		while(in.hasNextLong()){
			long h = in.nextLong();
			long res = maxWear(h);
			System.out.println(res);
			
			
		}
	}
	//��x+x^2<=h������x
	private static long maxWear(Long h) {
		if(h<=0||h>Math.pow(10, 18)){//��Ч�Լ��
			return 0L;
		}
		long end =(long) Math.sqrt(h);
		long start = 0L;
		long mid = 0L;
		while(start<=end){
			mid = start +((end-start)/2);
			long temp = mid*(mid+1);
			if(temp == h){
				return mid;
			}
			if(temp<h){
				start = mid+1;
			}
			else if(temp>h){
				end = mid-1;
			}
		}
		
		return start-1;
	}

}
