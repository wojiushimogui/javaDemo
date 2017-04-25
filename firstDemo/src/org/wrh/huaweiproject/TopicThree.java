package org.wrh.huaweiproject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/*
 * 第二题：去除重复字符并排序
运行时间限制：无限制
内容限制：       无限制
输入：              字符串
输出：              去除重复字符并排序的字符串
样例输入：       aabcdefff
样例输出：       abcdef
 * */
public class TopicThree {

	public static void main(String[] args) {
		/*
		 * 输入字符串
		 * */
		String str=input();
		elimimateRepeatAndSort(str);
	}

	private static void elimimateRepeatAndSort(String str) {
		/*
		 * 因为在java中Set容器中不允许有重复元素，
		 * 因此我们引入Set容器并将字符串中的每个元素放入即可消除重复元素
		 * */
		Set<Character> set=new HashSet<Character>();
		for(int i=0;i<str.length();i++){
			set.add(str.charAt(i));
			
		}
		/*
		 * 由于Set容器没有排序函数，因此我们将Set转化为数组，
		 * 然后在利用Arrays的sort对其进行排序，最后进行输出
		 * */
		Object[]c=set.toArray();
		Arrays.sort(c);
		print(c);
	}
	/*
	 * 对数组进行输出的函数
	 * */
	private static void print(Object[] c) {
		// TODO Auto-generated method stub
		for(Object o:c){
			System.out.print(o);
		}
		
	}
	/*
	 * 获取从控制台输入的数据
	 * */
	private static String input() {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try {
			return br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	

}
