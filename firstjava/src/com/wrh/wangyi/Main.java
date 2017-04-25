package com.wrh.wangyi;

import java.util.Arrays;
import java.util.Scanner;


	public class Main {

		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			while(in.hasNextInt()){
				int n = in.nextInt();
				if(n<1||n>100){//n值的有效性检查
	                continue;
	            }
				int[] datas = new int[n];
				for(int i = 0;i<n;i++){
					if(in.hasNextInt()){
						datas[i]=in.nextInt();
					}
				}
				
				//System.out.println(Arrays.toString(datas));
				int totalNum = 0;
				for(int i=0;i<n;i++){
					totalNum+=datas[i];
				}
				int avg =totalNum/n;
				if(avg*n!=totalNum){//方案不成立
					System.out.println(-1);
					return ;
				}
				/*
				 * 如果avg为奇数，则datas数组中只有全部是奇数才有可能，
				 * 如果avg为偶数，则datas数组中只有全部为偶数才有可能
				 * */
				int isOld = avg&0x01;
				boolean flag = false;
				for(int i=0;i<n;i++){
					if((datas[i]&0x01)!=isOld){
						flag = true;//说明没有解决方案
						break;
					}
				}
				if(flag){
					System.out.println(-1);
					continue;
				}
				//开始移动，最少移动多少次
				int count = 0;
				for(int i=0;i<n;i++){	
					if(datas[i]>avg){
						int temp = datas[i]- avg;
						count +=(temp>>1);
					}
				}
				
				System.out.println(count);
				
				String str ="faljfa";
				String str2 ="faljfa";
				String str3 ="faljfa";
				String str4 ="faljfa";
			
			}
		}

	}
