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
public class TopicOneDemo01 {

	public static void main(String[] args) {
		/*
		 * m代表要输入的字符串个数
		 * */
		int m;

		/*
		 * n代表输出的每个字符串的长度
		 * */
		int n;
		String[] strArrayTemp=input();
		
		//数组中的第一个元素就是我们的m值
		m=Integer.valueOf(strArrayTemp[0]);
		//数组中的第二个元素就是我们的n值
		n=Integer.valueOf(strArrayTemp[1]);
		/*
		 * 将我们输入的字符串数据提取出来，换到另外一个数组中
		 * 这里要注意的是要把这样的情况考虑进去，当我们输入：4,4,abc这样的情况（即我们实际输入的字符串的个数比我们想要输入的字符串的个数要少）
		 * */
		String strArray[]=new String[m];
		/*
		 * 将输入的字符串换到另外一个数组中
		 * */
		for(int i=0;i<strArrayTemp.length-2;i++){
				strArray[i]=strArrayTemp[2+i];	
		}
		if((strArrayTemp.length-2)<m){//若我们实际输入的字符串的个数比我们想要输入的字符串的个数要少，则用""空字符串来填
			for(int i=strArrayTemp.length-2;i<m;i++){
				strArray[i]="";	
		}
			
		}
		splitStringPrint(strArray,n,m); 
				
	}
	/*
	 * 函数功能：读取从控制台输入的字符串
	 * */
	private static String[] input() {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str=null;
		try {
			str = br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		/*
		 * while循环保证输入是符合要求的，即保证m和n值是数字且实际输入的字符串的个数要小于等于要求输入的个数（即不允许出现输入：2,3，abc,asdf,asdfgh这种情况发生）
		 * */
		while(true){
			/*
			 * 将从控制台读入的数据根据逗号分开
			 * */
			String[] strArrayTemp=str.split(",");
			if(strArrayTemp[0].matches("\\d+")&&strArrayTemp[1].matches("\\d+")&&(strArrayTemp.length<=Integer.valueOf(strArrayTemp[0]))){
				return strArrayTemp;
			}
			else{
				try {
					System.out.println("请重新输入：");
					str=br.readLine();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	/*
	 * 完成将字符串按照要求输出
	 * */
	private static void splitStringPrint(String[] string,int len,int m) {
		// TODO Auto-generated method stub
		
		for(int i=0;i<m;i++){
			while(string[i].length()>len){
				System.out.print(string[i].substring(0, len)+"  ");
				string[i]=string[i].substring(len, string[i].length());
			}
			//对于长度小于len的将补零
			int stringLength=string[i].length();
			if(stringLength>=0&&stringLength<=len){
				for(int j=0;j<len-stringLength;j++){
					string[i]+="0";
				}
				System.out.print(string[i]+"  ");
				
			}
		}
		
	}

}
