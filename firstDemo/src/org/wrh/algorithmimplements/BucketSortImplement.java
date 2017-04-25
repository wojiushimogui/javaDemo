package org.wrh.algorithmimplements;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//桶排序的实现
public class BucketSortImplement {

	public static void main(String[] args) {
		double []a={0.94,0.83,0.79,0.61,0.55,0.46,0.33,0.25,0.12,0.99,0.002,0.854,0.42345};
		System.out.println("排序前的数组元素为："+Arrays.toString(a));
		bucketSort(a,a.length);
		System.out.println("排序后的数组元素为："+Arrays.toString(a));
		
	}

	private static void bucketSort(double[] a, int length) {
		/*
		 * 借助用一个List数组来作为桶
		 * */
		//List<Double> list[]=new ArrayList<Double>[]();//本想弄一个List数组来解决这个问题，发现不行
		ArrayList<ArrayList<Double>> list=new ArrayList<ArrayList<Double>>() ;
		/*
		 * 注意：这里首先必须得对这些元素进行初始化,才会使得下面得get函数不会有空指向异常
		 * */
		for(int i=0;i<a.length;i++){
			list.add(new ArrayList<Double>());
		}
		/*
		 * 再将所有的元素放在对应的桶中 
		 * */
		
		for(int i=0;i<length;i++){
			list.get((int)(a[i]*length)).add(a[i]);
			
		}
		/*
		 * 将每个桶的元素排序
		 * */
		for(int i=0;i<length;i++){
			Collections.sort(list.get(i));
			
		}
		/*
		 * 最后将桶的所有元素合并
		 * */
		int index=0;
		for(List<Double> arrayList:list){
			for(Double d:arrayList){
				a[index++]=d;
			}
			
		}
	}

}
