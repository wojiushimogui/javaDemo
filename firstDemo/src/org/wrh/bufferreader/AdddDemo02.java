package org.wrh.bufferreader;
//两个数相加的第二个版本，当我们输入的不是数字时，我们程序能给与提示
//用正则表达式来完成验证
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AdddDemo02 {

	public static void main(String[] args) {
		int i=0;
		int j=0;//用来接收的两个数
		boolean flag=true;
		BufferedReader br=null;
		br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("请输入第一个数：");
		String str1=null;
		while(flag){
			try {
				str1=br.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(str1.matches("\\d+")){
				i=Integer.parseInt(str1);
				flag=false;
			}
			else 
				System.out.print("输入必须为数字，请重新输入：");
			
		}
		
		flag=true;
		System.out.print("请输入第二个数：");
		// str1=null;
		while(flag){
			try {
				str1=br.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(str1.matches("\\d+")){
				j=Integer.parseInt(str1);
				flag=false;
			}
			else 
				System.out.print("输入必须为数字，请重新输入：");
			
		}
		
		System.out.println("两个数的结果如下："+i+"+"+j+"="+(i+j));
		
	}

}
