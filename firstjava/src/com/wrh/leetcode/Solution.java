package com.wrh.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//�������java������ʵ��һ�㣬��C��΢���ӵ�
public class Solution {
	Map<Integer,List<String>> map=new HashMap<Integer,List<String>>();
	public Solution(){
		  map.put(0,Arrays.asList(""));
		  map.put(1,Arrays.asList(""));
		  map.put(2, Arrays.asList("a","b","c"));
		  map.put(3, Arrays.asList("d","e","f"));
		  map.put(4, Arrays.asList("g","h","i"));
		  map.put(5, Arrays.asList("j","k","l"));
		  map.put(6, Arrays.asList("m","n","o"));
		  map.put(7, Arrays.asList("p","q","r","s"));
		  map.put(8, Arrays.asList("t","u","v"));
		  map.put(9, Arrays.asList("w","x","y","z"));
	}
	public static void main(String[] args){
		Solution s=new Solution();
		List<String> list=new ArrayList();
		list=s.letterCombinations("234");
		for(String str:list){
			System.out.print(str+"   ");
		}
	}
  public List<String> letterCombinations(String digits) {
      //�Ƚ���һ��map	 	  	  
	  List<String>  result=new ArrayList<String>();
	  List<String> tempList=new ArrayList<String>();
	  List<String> tempResult;
	  if(digits.length()==0){
		  return null;
	  }
	  else if(digits.length()==1){
		  result=map.get(digits.charAt(0)-'0');
	  }
	  else{
		  //ȡ��digits�е�һ���ַ���Ȼ��ʣ����ַ����õݹ����������
		   tempList=map.get(digits.charAt(0)-'0');
		   tempResult=letterCombinations(digits.substring(1));
		  //��tempList��tempResult����¾����������յĽ��
		  for(String str1:tempList){
			  for(String str2:tempResult){
				  
				  result.add(str1+str2);
			  }
		  }
		  
	  } 	  	  
	  return result;
      
  }

public List<List<String>> groupAnagrams(String[] strs) {
	  Arrays.sort(strs);
	  HashMap<String, List<String>> hm = new HashMap<>();
	  for(int i = 0; i < strs.length; i++){
	    String currString = strs[i];
	    char[] charArr = strs[i].toCharArray();
	    Arrays.sort(charArr);
	    String sortString = new String(charArr);
	    List<String > tempList = hm.getOrDefault(sortString, new ArrayList<String>());
	    tempList.add(currString);
	    hm.put(sortString, tempList);
	  }
	  return new ArrayList<>(hm.values());
	}
}