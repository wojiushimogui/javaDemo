package com.wrh.testgui;

public class TestCopy {

	public static void main(String[] args) {
		int row=1000;
		int col=1000;
		int [][]arr=new int[row][col];
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				arr[i][j]=i*j;
			}
		}
		//copy1000次的耗时
		long startTime=System.currentTimeMillis();
		int num=10000;
		for(int i=0;i<num;i++){
			int [][]copyArr=getCopyArray(arr);
		}
		long endTime=System.currentTimeMillis();
		System.out.println("运行时间为："+(endTime-startTime));
	}

	private static int[][] getCopyArray(int[][] arr) {
		if(arr==null){
			return null;
		}
		int row=arr.length;
		int col=arr[0].length;
		int [][]copyArr=new int[row][col];
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				copyArr[i][j]=arr[i][j];
			}
		}
		return copyArr;
	}

}
