package com.wrh.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class WordDictionary2 {
	// Adds a word into the data structure.
	private Trie t = new Trie();
    public void addWord(String word) {
        t.insert(word);
    }

    // Returns if the word is in the data structure. A word could
    // contain the dot character '.' to represent any one letter.
    public boolean search(String word) {
    	//先将word最后的点点给去掉
    	
        return t.search(word);
    }
    
     class TrieNode {
        // Initialize your data structure here.
    	public boolean leaf;//标识一个word到此结束
    	public Map<Character,TrieNode> childrens = new HashMap<Character,TrieNode>();
        public TrieNode() {
            
        }
    }
    class Trie {
        private TrieNode root;

        public Trie() {
            root = new TrieNode();
        }

        // Inserts a word into the trie.
        public void insert(String word) {
        	Map<Character,TrieNode> childrens = root.childrens;
        	for(int i=0;i<word.length();i++){
        		Character ch =word.charAt(i);
        		TrieNode t = null;
        		if(childrens.containsKey(ch)){
        			t = childrens.get(ch);
        		}
        		else{//此字符是一个新的分支
        			t = new TrieNode();
        			childrens.put(ch, t);
        		}
        		//继续寻找或插入第二个字符
        		childrens = t.childrens;
        		
        		//设置单词的标识
        		if(i==word.length()-1){
        			t.leaf = true;
        		}
        	}
        }

        // Returns if the word is in the trie.
        public boolean search(String word) {
            TrieNode t = searchWord(word,root);
            return t!=null&&t.leaf;
        	
        }
        
        public TrieNode searchWord(String word,TrieNode node){
        	Map<Character,TrieNode> childrens = node.childrens;
        	TrieNode t = null;
        	for(int i=0;i<word.length();i++){
        		Character ch = word.charAt(i);
        		if(ch=='.'){
        			Set<Character>  set = childrens.keySet();
        			TrieNode tt = null;
        			//如果是最后一个通配符，则只要还存在分支节点的leaf为true，则就能匹配
        			if(i==word.length()-1){
        				for(Character c :set){
        					tt = childrens.get(c);
        					if(tt.leaf){
        						return tt;
        					}
        				}
        				return null;
        			}
        			//对每个分支进行匹配检查
        			for(Character c:set){
        				t = childrens.get(c);
        				tt =searchWord(word.substring(i+1),t);
        				if(tt!=null){
        					return tt;
        				}
        			}
        			return null;//所有的都没有找到；
        		}
        		else if(ch!='.'&&!childrens.containsKey(ch)){//如果没有此分支，则返回null
        			return null;
        		}
        		else{//如果有此分支，则更新childrens
        			t = childrens.get(ch);
        			childrens = t.childrens;
        		}
        	}
        	return t;
        }

        // Returns if there is any word in the trie
        // that starts with the given prefix.
        public boolean startsWith(String prefix) {
            TrieNode t = searchWord(prefix,root);
            return t!=null;
        }
    }
    
    public static void main(String[] args){
    	WordDictionary2 wd = new WordDictionary2();
    }
}




