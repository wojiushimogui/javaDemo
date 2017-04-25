package com.wrh.leetcode;

public class CountDigitOne {
	
	public int countDigitOne(int n){
		if(n<0){
			return 0;
		}
		int res = 0;
		for(int m=1;m<=n;m*=10){
			int a = n/m;
			int b = n%m;
			int ones = ((a+8)/10)*m;
			if(a%10==1){
				ones +=(b+1);
			}
			res += ones;
		}
		return res;
	}
	
	public static void main(String[] args){
		CountDigitOne c = new CountDigitOne();
		int n =99;
		System.out.println(c.countDigitOne(n));
	}
}
