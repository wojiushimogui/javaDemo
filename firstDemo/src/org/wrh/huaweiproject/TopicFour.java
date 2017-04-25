package org.wrh.huaweiproject;

import java.util.Scanner;

/*
 * 第三题：等式变换
输入一个正整数X，在下面的等式左边的数字之间添加+号或者-号，使得等式成立。
1 2 3 4 5 6 7 8 9 = X
比如：
12-34+5-67+89 = 5
1+23+4-5+6-7-8-9 = 5
请编写程序，统计满足输入整数的所有整数个数。
输入：       正整数，等式右边的数字
输出：       使该等式成立的个数
样例输入：5
样例输出：21
 * */
public class TopicFour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int right_num=input();
		boolean flag=true;
		/*
		 * while循环保证了我们输入的数据是在0到123456789范围内的
		 * */
		while(flag){
			if (right_num<0||right_num>123456789){
				System.out.println("请输入正整数且不大于123456789的数");
				right_num=input();
			}
			else
			{
				flag=false;
			}
		}
		equilInput(right_num);
		

	}
	private static void equilInput(int right_num) {
		int count=0;
	}
	/*
	 * 读取从控制台输入的数据
	 * */
	private static int input() {
		Scanner sc =new Scanner(System.in);
		return sc.nextInt();
	}

}
