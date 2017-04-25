package com.wrh.leetcode;


//class TrieNode {
//    // Initialize your data structure here.
//	public boolean leaf = false;//标识一个word到此结束
//	//每个节点至多有26个子节点
//	public TrieNode[] childrens = new TrieNode[26];
//    public TrieNode() {
//        
//    }
//}
//
//public class Trie_v1 {
//    private TrieNode root;
//
//    public Trie_v1() {
//        root = new TrieNode();
//    }
//
//    // Inserts a word into the trie.
//    public void insert(String word) {
//    	TrieNode[] childrens = root.childrens;
//    	for(int i=0;i<word.length();i++){
//    		int index = word.charAt(i)-'a';
//    		TrieNode t = null;
//    		if(childrens[index]!=null){//有此分支
//    			t = childrens[index];
//    			childrens = t.childrens;
//    		}
//    		else{
//    			t = new TrieNode();
//    			childrens[index]=t;
//    			childrens = t.childrens;
//    		}
//    		
//    		if(i == word.length()-1){
//    			t.leaf = true;
//    		}
//    	}
//    }
//
//    // Returns if the word is in the trie.
//    public boolean search(String word) {
//       TrieNode t =searchWord(word);
//       return t!=null&&t.leaf;
//    	
//    }
//    
//    public TrieNode searchWord(String word){
//    	TrieNode[] childrens = root.childrens;
//    	TrieNode t = null;
//    	for(int i=0;i<word.length();i++){
//    		int index = word.charAt(i)- 'a';
//    		if(childrens[index]==null){//如果不存在此分支
//    			return null;
//    		}
//    		else{
//    			t = childrens[index];
//    			childrens = t.childrens;
//    		}
//    	}
//    	return t;
//    }
//    // Returns if there is any word in the trie
//    // that starts with the given prefix.
//    public boolean startsWith(String prefix) {
//       return searchWord(prefix)!=null;
//    }
//}
