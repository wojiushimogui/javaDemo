package com.wrh.wangyi;

import java.util.Arrays;
import java.util.Scanner;


	public class Main {

		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			while(in.hasNextInt()){
				int n = in.nextInt();
				if(n<1||n>100){//nֵ����Ч�Լ��
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
				if(avg*n!=totalNum){//����������
					System.out.println(-1);
					return ;
				}
				/*
				 * ���avgΪ��������datas������ֻ��ȫ�����������п��ܣ�
				 * ���avgΪż������datas������ֻ��ȫ��Ϊż�����п���
				 * */
				int isOld = avg&0x01;
				boolean flag = false;
				for(int i=0;i<n;i++){
					if((datas[i]&0x01)!=isOld){
						flag = true;//˵��û�н������
						break;
					}
				}
				if(flag){
					System.out.println(-1);
					continue;
				}
				//��ʼ�ƶ��������ƶ����ٴ�
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
