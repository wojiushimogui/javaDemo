package org.wrh.algorithmimplements;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//Ͱ�����ʵ��
public class BucketSortImplement {

	public static void main(String[] args) {
		double []a={0.94,0.83,0.79,0.61,0.55,0.46,0.33,0.25,0.12,0.99,0.002,0.854,0.42345};
		System.out.println("����ǰ������Ԫ��Ϊ��"+Arrays.toString(a));
		bucketSort(a,a.length);
		System.out.println("����������Ԫ��Ϊ��"+Arrays.toString(a));
		
	}

	private static void bucketSort(double[] a, int length) {
		/*
		 * ������һ��List��������ΪͰ
		 * */
		//List<Double> list[]=new ArrayList<Double>[]();//����Ūһ��List���������������⣬���ֲ���
		ArrayList<ArrayList<Double>> list=new ArrayList<ArrayList<Double>>() ;
		/*
		 * ע�⣺�������ȱ���ö���ЩԪ�ؽ��г�ʼ��,�Ż�ʹ�������get���������п�ָ���쳣
		 * */
		for(int i=0;i<a.length;i++){
			list.add(new ArrayList<Double>());
		}
		/*
		 * �ٽ����е�Ԫ�ط��ڶ�Ӧ��Ͱ�� 
		 * */
		
		for(int i=0;i<length;i++){
			list.get((int)(a[i]*length)).add(a[i]);
			
		}
		/*
		 * ��ÿ��Ͱ��Ԫ������
		 * */
		for(int i=0;i<length;i++){
			Collections.sort(list.get(i));
			
		}
		/*
		 * ���Ͱ������Ԫ�غϲ�
		 * */
		int index=0;
		for(List<Double> arrayList:list){
			for(Double d:arrayList){
				a[index++]=d;
			}
			
		}
	}

}
