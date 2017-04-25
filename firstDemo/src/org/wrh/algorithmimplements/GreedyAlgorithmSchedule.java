package org.wrh.algorithmimplements;

import java.util.Arrays;

//贪婪算法：工作调度的实现
public class GreedyAlgorithmSchedule {

	public static void main(String[] args) {
		/*
		 * 下面为5个工作的起始时间和结束时间，为方便起见，我们已经按结束时间排好序了
		 * */
		int []s={1,1,3,6,6,8,10};
		int []f={2,3,4,8,9,9,11};
		interalSchedualing(s,f,s.length);
	}

	private static void interalSchedualing(int[] s, int[] f, int length) {
		int []select=new int[length];//记录我们选择的工作的下标,为"1"表示下标对应的工作被选择了
		int i=0;
		select[i]=1;//将第一个工作加入
		for(int j=1;j<length;j++){
			if(s[j]>=f[i]){//如果当前工作的起始时间大于前一个被选中的工作的结束时间，则其应该被选中
				i=j;
				select[i]=1;
				
			}
			
		}
		System.out.println("工作调度的情况："+Arrays.toString(select));
	}

}
