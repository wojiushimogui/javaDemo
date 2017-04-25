package org.wrh.regex;
//检查一个句子是否以大写字母开头，句话结尾
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
