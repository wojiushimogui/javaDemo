package com.wrh.firstpro;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class testDateDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=null;
		FileOutputStream fos=new FileOutputStream("d:"+File.separator+"data1.txt");
		try {
			 br=new BufferedReader(new FileReader("d:"+File.separator+"data.txt"));
			 
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		StringBuffer buffer=new StringBuffer();
		String str=new String();
		String temp[];
		while((str=br.readLine())!=null){
			temp=str.split("\\s+");
			buffer.append("(");
			for(int i=0;i<temp.length-1;i++){
				buffer.append(temp[i]);
				buffer.append(",");
			}
			buffer.append(temp[temp.length-1]);
			buffer.append(")");
			fos.write(buffer.toString().getBytes());
			fos.flush();
			buffer=new StringBuffer();
		
		}
		fos.flush();
		br.close();
		fos.close();
		
		
		

	}

}
