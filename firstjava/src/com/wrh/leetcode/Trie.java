package com.wrh.leetcode;

import java.util.HashMap;
import java.util.Map;

//class TrieNode {
//    // Initialize your data structure here.
//	public boolean leaf;//标识一个word到此结束
//	public Map<Character,TrieNode> childrens = new HashMap<Character,TrieNode>();
//    public TrieNode() {
//        
//    }
//}
//
//public class Trie {
//    private TrieNode root;
//
//    public Trie() {
//        root = new TrieNode();
//    }
//
//    // Inserts a word into the trie.
//    public void insert(String word) {
//    	Map<Character,TrieNode> childrens = root.childrens;
//    	for(int i=0;i<word.length();i++){
//    		Character ch =word.charAt(i);
//    		TrieNode t = null;
//    		if(childrens.containsKey(ch)){
//    			t = childrens.get(ch);
//    		}
//    		else{//此字符是一个新的分支
//    			t = new TrieNode();
//    			childrens.put(ch, t);
//    		}
//    		//继续寻找或插入第二个字符
//    		childrens = t.childrens;
//    		
//    		//设置单词的标识
//    		if(i==word.length()-1){
//    			t.leaf = true;
//    		}
//    	}
//    }
//
//    // Returns if the word is in the trie.
//    public boolean search(String word) {
//        TrieNode t = searchWord(word);
//        return t!=null&&t.leaf;
//    	
//    }
//    
//    public TrieNode searchWord(String word){
//    	Map<Character,TrieNode> childrens = root.childrens;
//    	TrieNode t = null;
//    	for(int i=0;i<word.length();i++){
//    		Character ch = word.charAt(i);
//    		if(!childrens.containsKey(ch)){//如果没有此分支，则返回null
//    			return null;
//    		}
//    		else{//如果有此分支，则更新childrens
//    			t = childrens.get(ch);
//    			childrens = t.childrens;
//    		}
//    	}
//    	return t;
//    }
//
//    // Returns if there is any word in the trie
//    // that starts with the given prefix.
//    public boolean startsWith(String prefix) {
//        TrieNode t = searchWord(prefix);
//        return t!=null;
//    }
//}
