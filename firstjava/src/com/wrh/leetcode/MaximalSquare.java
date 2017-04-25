package com.wrh.leetcode;

public class MaximalSquare {
	
	 public int maximalSquare(char[][] matrix) {
		 if(matrix == null||matrix.length==0){
			 return 0;
		 }
		 int row = matrix.length;		 
		 int col = matrix[0].length;
		 int [] h = new int[col];
		 int res = 0;
		 int index =0;
		 while(index<row){
			 //��index�п�ʼ�ľ��󹹳ɵ�������
			 //��������
			 for(int i=0;i<col;i++){
				 h[i] = 0;
			 }
			 for(int i=index;i<row;i++){
				 for(int j=0;j<col;j++){
					 if(matrix[i][j]=='1'){
						 h[j]++;
					 }
					 else{
						 h[j]=0;
					 }
				 }
				 res =Math.max(res, max(h));
			 }
			 index++;
		 }
		 
		 return res;
	 }
	 /*
	  * �������ܣ��ҳ�n������ֵΪn����������Ǵ�ʱ���ɵ�������������
	  * */
	private int max(int[] h) {
		if(h==null||h.length==0){
			return 0;
		}
		//����������Ƿ�ȫΪ��
		int res =0;
		for(int i=0;i<h.length;i++){
			if(h[i]!=0){
				res = 1;
				break;
			}
		}
		if(res==0){
			return 0;
		}
		
		int count =1;
		int startValue=h[0];
		for(int i=1;i<h.length;i++){
			if(h[i]!=startValue){
				startValue = h[i];
				count =1;
			}
			else{
				count++;
				if(count == startValue){
					res = Math.max(res, count*startValue);
				}
			}
		}
		return res;
	}
	
	public static void main(String[] args){
		MaximalSquare ms = new MaximalSquare();
//		char [][] arr={
//				{'1','1','1','0','0'},
//				{'1','1','1','1','1'},
//				{'1','1','1','1','1'},
//				{'1','0','0','1','0'},
//		};
		char [][] arr={
				{'0','0','0'},
				{'0','0','0'},
				{'1','1','1'}
		};
		System.out.println(ms.maximalSquare(arr));
//		int [] h={3,3,3,2,2};
		
//		System.out.println(ms.max(h));
		
	}
}
