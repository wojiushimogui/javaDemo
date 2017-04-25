package org.wrh.huaweiproject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

/*
 * 按要求分解字符串，输入两个数M，N；M代表输入的M串字符串，N代表输出的每串字符串的位数，不够补0。
 * 例如：输入2,8， “abc” ，“123456789”，则输出为“abc00000”,“12345678“,”90000000”
 * */
public class TopicOneDemo {

	public static void main(String[] args) {
		/*
		 * m代表要输入的字符串个数
		 * */
		int m;

		/*
		 * n代表输出的每个字符串的长度
		 * */
		int n;
		/*
		 * 读取从控制台输入的字符串
		 * */
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str=null;
		try {
			str = br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/*
		 * 将从控制台读入的数据根据逗号分开
		 * */
		String[] strArrayTemp=str.split(",");
		//数组中的第一个元素就是我们的m值
		m=Integer.valueOf(strArrayTemp[0]);
		//数组中的第二个元素就是我们的n值
		n=Integer.valueOf(strArrayTemp[1]);
		/*
		 * 将我们输入的字符串数据提取出来，换到另外一个数组中
		 * */
		String strArray[]=new String[m];
		for(int i=0;i<m;i++){
			strArray[i]=strArrayTemp[2+i];
		}
		splitStringPrint(strArray,n); 
				
	}
	/*
	 * 完成将字符串按照要求输出
	 * */
	private static void splitStringPrint(String[] string,int len) {
		// TODO Auto-generated method stub
		
		for(String str:string){
			while(str.length()>len){
				System.out.print(str.substring(0, len)+"  ");
				str=str.substring(len, str.length());
			}
			//对于长度小于len的将补零
			int stringLength=str.length();
			if(stringLength>0&&stringLength<=len){
				for(int i=0;i<len-stringLength;i++){
					str+="0";
				}
				System.out.print(str+"  ");
				
			}
		}
		
	}

}
