package com.wrh.firstpro;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class testDateDemo01 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=null;
		FileOutputStream fos=new FileOutputStream("d:"+File.separator+"lossCount_1.txt");
		try {
			 br=new BufferedReader(new FileReader("d:"+File.separator+"lossCount.txt"));
			 
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String str=new String();
		String temp[];
		/*
		 * 用来统计检测时各个属性出现的个数
		 * 其中第一行表示：无错检时的各个属性出现的个数
		 * 第二行表示：有一个错检时各个属性除夕拿的个数
		 * 以此类推
		 * */
		int attributeCount[][]=new int[10][10];
		
		while((str=br.readLine())!=null){
			temp=str.split("\\s+");
			switch(temp[temp.length-1]){
			case "0":
				for(int i=0;i<temp.length-1;i++){
					(attributeCount[0][Integer.parseInt(temp[i])])++;
				}
				
				break;
			case "0.111111111":
				for(int i=0;i<temp.length-1;i++){
					attributeCount[1][Integer.parseInt(temp[i])]++;
				}
				break;
			case "0.222222222":
				for(int i=0;i<temp.length-1;i++){
					attributeCount[2][Integer.parseInt(temp[i])]++;
				}
				break;
			case "0.333333333":
				for(int i=0;i<temp.length-1;i++){
					attributeCount[3][Integer.parseInt(temp[i])]++;
				}
				break;
			case "0.444444444":
				for(int i=0;i<temp.length-1;i++){
					attributeCount[4][Integer.parseInt(temp[i])]++;
				}
				break;
			case "0.555555556":
				for(int i=0;i<temp.length-1;i++){
					attributeCount[5][Integer.parseInt(temp[i])]++;
				}
				break;
			case "0.666666667":
				for(int i=0;i<temp.length-1;i++){
					attributeCount[6][Integer.parseInt(temp[i])]++;
				}
				break;
			case "0.77777778":
				for(int i=0;i<temp.length-1;i++){
					attributeCount[6][Integer.parseInt(temp[i])]++;
				}
				break;
			case "0.888888889":
				for(int i=0;i<temp.length-1;i++){
					attributeCount[8][Integer.parseInt(temp[i])]++;
				}
				break;
			case "1":
				for(int i=0;i<temp.length-1;i++){
					attributeCount[9][Integer.parseInt(temp[i])]++;
				}
				break;
			default:
				System.out.println("error");
			}
			
			
		
		}
		for(int i=0;i<attributeCount.length;i++){
			System.out.println(Arrays.toString(attributeCount[i]));
		}
		for(int i=0;i<attributeCount.length;i++){
			fos.write(Arrays.toString(attributeCount[i]).getBytes());
			fos.write("\r\n".getBytes());
			fos.flush();
		}
		
		
		br.close();
		fos.close();
		
		
		

	}

}
