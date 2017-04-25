package org.wrh.bufferreader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class BufferedReaderDemo01 {

	public static void main(String[] args) {
		BufferedReader br=null;
		br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("请输入：");
		String str=null;
		try {
			str = br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("输入的内容是："+str);
	}

}
