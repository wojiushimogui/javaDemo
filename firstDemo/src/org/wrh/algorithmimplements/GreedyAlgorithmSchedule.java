package org.wrh.algorithmimplements;

import java.util.Arrays;

//̰���㷨���������ȵ�ʵ��
public class GreedyAlgorithmSchedule {

	public static void main(String[] args) {
		/*
		 * ����Ϊ5����������ʼʱ��ͽ���ʱ�䣬Ϊ��������������Ѿ�������ʱ���ź�����
		 * */
		int []s={1,1,3,6,6,8,10};
		int []f={2,3,4,8,9,9,11};
		interalSchedualing(s,f,s.length);
	}

	private static void interalSchedualing(int[] s, int[] f, int length) {
		int []select=new int[length];//��¼����ѡ��Ĺ������±�,Ϊ"1"��ʾ�±��Ӧ�Ĺ�����ѡ����
		int i=0;
		select[i]=1;//����һ����������
		for(int j=1;j<length;j++){
			if(s[j]>=f[i]){//�����ǰ��������ʼʱ�����ǰһ����ѡ�еĹ����Ľ���ʱ�䣬����Ӧ�ñ�ѡ��
				i=j;
				select[i]=1;
				
			}
			
		}
		System.out.println("�������ȵ������"+Arrays.toString(select));
	}

}
