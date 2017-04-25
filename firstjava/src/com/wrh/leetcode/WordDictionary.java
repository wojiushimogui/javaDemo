package com.wrh.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class WordDictionary {
	// Adds a word into the data structure.
	private TrieNode root = new TrieNode();
    public void addWord(String word) {
    	Map<Character,TrieNode> childrens = root.childrens;
    	for(int i=0;i<word.length();i++){
    		Character ch =word.charAt(i);
    		TrieNode t = null;
    		if(childrens.containsKey(ch)){
    			t = childrens.get(ch);
    		}
    		else{//���ַ���һ���µķ�֧
    			t = new TrieNode();
    			childrens.put(ch, t);
    		}
    		//����Ѱ�һ����ڶ����ַ�
    		childrens = t.childrens;
    		
    		//���õ��ʵı�ʶ
    		if(i==word.length()-1){
    			t.leaf = true;
    		}
    	}
    }

    // Returns if the word is in the data structure. A word could
    // contain the dot character '.' to represent any one letter.
    public boolean search(String word) {  	
        return searchWord(word,root);
    }
    
     public boolean searchWord(String word,TrieNode node) {
    	 if(word==null||node ==null){
    		 return false;
    	 }
    	 if(word.length()==0){
    		 return node.leaf;
    	 }
    	 Map<Character,TrieNode> childrens = node.childrens;
    	 Character ch =word.charAt(0);
    	 if(ch=='.'){
    		 Set<Character> set = childrens.keySet();
    		 String str = word.substring(1);
    		 for(Character c:set){
    			 if(searchWord(str,childrens.get(c))){
    				 return true;
    			 }
    		 }
    	 }
    	 else if(!childrens.containsKey(ch)){
    		 return false;
    	 }
    	 else {
    		 return  searchWord(word.substring(1),childrens.get(ch));
    	 }
    	 return false;
	}
     
    
}
class TrieNode {
    // Initialize your data structure here.
	public boolean leaf;//��ʶһ��word���˽���
	public Map<Character,TrieNode> childrens = new HashMap<Character,TrieNode>();
    public TrieNode() {
        
    }
}






