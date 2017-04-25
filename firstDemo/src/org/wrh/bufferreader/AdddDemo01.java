package org.wrh.bufferreader;
//两个数相加的第一个版本，即当我们输入的数是数字时，可以完成相加的功能，输入其他的就不行
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AdddDemo01 {

	public static void main(String[] args) {
		int i=0;
		int j=0;//用来接收的两个数
		BufferedReader br=null;
		br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("请输入第一个数：");
		String str1=null;
		try {
			str1=br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		i=Integer.parseInt(str1);
		System.out.print("请输入第二个数：");
		// str1=null;
		try {
			str1=br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		j=Integer.parseInt(str1);
		
		System.out.println("两个数的结果如下："+i+"+"+j+"="+(i+j));
		
	}

}
