package com.wrh.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution_3 {
	public List<List<String>> groupAnagrams(String[] strs) {
		if(strs==null){
			return null;
		}
		//借用Map来做
		Arrays.sort(strs);//对字符数组进行排序
		int len=strs.length;
		Map<String,List<String>> map=new HashMap<String ,List<String>>();
		for(int i=0;i<len;i++){
			String curString=strs[i];
			//先将此字符串转化为char数组，然后将其排序。这样就导致所有含有相同字符的字符串都是一个key。
			char ch[]=curString.toCharArray();
			Arrays.sort(ch);
			String key=String.valueOf(ch);
			List<String> list=map.getOrDefault(key, new ArrayList<String>());//没有就返回默认的List
			list.add(curString);
			map.put(key, list);
		}
		return new ArrayList<>(map.values());
	}
}
