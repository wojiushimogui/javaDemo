package org.wrh.regex;
//���һ�������Ƿ��Դ�д��ĸ��ͷ���仰��β
public class StringRegexdemo03 {

	public static void main(String[] args) {
		String str="Wo shi wu rang hao.";
		String pat="\\p{Upper}+.+\\.";
		if(str.matches(pat))
			System.out.println("matcher success");
		else
			System.out.println("matcher failure");
		
	}

}
