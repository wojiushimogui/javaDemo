package com.wrh.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution_1 {
	public  String my_sort(String str){
		char[] s1 = str.toCharArray();
		Arrays.sort(s1);
		return String.valueOf(s1);
	}
    public List<List<String>> groupAnagrams(String[] strs) {
    	Arrays.sort(strs);
    	List<List<String>> list=new ArrayList<List<String>>();
        if(strs==null){
        	return list;
        }
        for(int i=0;i<strs.length;i++){
        	 List<String > list1=new ArrayList<String>();
        	 if(strs[i]!=""){
        		 list1.add(strs[i]);
        	 }
        	 else{
        		 continue;
        	 }
        	 String tempStr1=my_sort(strs[i]);
        	for(int j=i+1;j<strs.length;j++){
        		if(tempStr1.equals(my_sort(strs[j]))){
        			list1.add(strs[j]);
        			strs[j]="";
        		}
        	}
        	list.add(list1);
        	}
    	return list;
    }
    public static void main(String []args){
    	Solution_1 s=new Solution_1();
    	String[] strs=new String[]{"eat","ate","tea","nat","tan","ban"};
    	List<List<String>> l=s.groupAnagrams(strs);
    	for(List list:l){
    		System.out.println(list.toString());
    	}
    }
}
