package com.wrh.testgui;

public class CopyOfTestCopy {

	public static void main(String[] args) {
		int row=1000;
		int col=1000;
		int [][]arr=new int[row][col];
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				arr[i][j]=i*j;
			}
		}
		//copy1000�εĺ�ʱ
		long startTime=System.currentTimeMillis();
		int [][]copyArr=new int[row][col];
		int num=1;
		for(int i=0;i<num;i++){
			//int [][]copyArr=getCopyArray(arr);
			copyArr=arr.clone();
		}
		//copyArr[0][0]=100;
		System.out.println(arr[0][0]);
		long endTime=System.currentTimeMillis();
		System.out.println("����ʱ��Ϊ��"+(endTime-startTime));
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
