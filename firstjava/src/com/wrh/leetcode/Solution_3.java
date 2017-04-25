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
		//����Map����
		Arrays.sort(strs);//���ַ������������
		int len=strs.length;
		Map<String,List<String>> map=new HashMap<String ,List<String>>();
		for(int i=0;i<len;i++){
			String curString=strs[i];
			//�Ƚ����ַ���ת��Ϊchar���飬Ȼ�������������͵������к�����ͬ�ַ����ַ�������һ��key��
			char ch[]=curString.toCharArray();
			Arrays.sort(ch);
			String key=String.valueOf(ch);
			List<String> list=map.getOrDefault(key, new ArrayList<String>());//û�оͷ���Ĭ�ϵ�List
			list.add(curString);
			map.put(key, list);
		}
		return new ArrayList<>(map.values());
	}
}
