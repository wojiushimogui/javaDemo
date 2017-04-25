package com.wrh.leetcode;

public class MaximalSquare_v1 {
	
	 public int maximalSquare(char[][] matrix) {
		 if(matrix == null||matrix.length==0){
			 return 0;
		 }
		 int row = matrix.length;		 
		 int col = matrix[0].length;
		 int [] h = new int[col];
		 int res = 0;
		 for(int i=0;i<row;i++){
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
		 return res;
	 }
	 /*
	  * 函数功能：找出n个连续值为n的数，则就是此时构成的最大正方形面积
	  * */
	private int max(int[] h) {
		if(h==null||h.length==0){
			return 0;
		}
		//检查数组中是否全为零
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
		MaximalSquare_v1 ms = new MaximalSquare_v1();
		char [][] arr={
				{'1','1','1','0','0'},
				{'1','1','1','1','1'},
				{'1','1','1','1','1'},
				{'1','0','0','1','0'},
		};
		System.out.println(ms.maximalSquare(arr));
//		int [] h={3,3,3,2,2};
		
//		System.out.println(ms.max(h));
		
	}
}
