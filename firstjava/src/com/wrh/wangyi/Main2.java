package com.wrh.wangyi;
	public class Main2 {

		public static void main(String[] args) {
			String str3 ="faljfa";
			String str4 ="faljfa";
			String str5 = new String("faljfa");
			System.out.println(str3==str4);
			

			 char[] chars =str4.toCharArray();
			 char[] chars2 =str4.toCharArray();
			 System.out.println(chars);
			 System.out.println(chars2);
			 System.out.println(chars.equals(chars2));
		}

	}
