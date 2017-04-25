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
    	//�Ƚ�word���ĵ���ȥ��
    	
        return t.search(word);
    }
    
     class TrieNode {
        // Initialize your data structure here.
    	public boolean leaf;//��ʶһ��word���˽���
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
        			//��������һ��ͨ�������ֻҪ�����ڷ�֧�ڵ��leafΪtrue�������ƥ��
        			if(i==word.length()-1){
        				for(Character c :set){
        					tt = childrens.get(c);
        					if(tt.leaf){
        						return tt;
        					}
        				}
        				return null;
        			}
        			//��ÿ����֧����ƥ����
        			for(Character c:set){
        				t = childrens.get(c);
        				tt =searchWord(word.substring(i+1),t);
        				if(tt!=null){
        					return tt;
        				}
        			}
        			return null;//���еĶ�û���ҵ���
        		}
        		else if(ch!='.'&&!childrens.containsKey(ch)){//���û�д˷�֧���򷵻�null
        			return null;
        		}
        		else{//����д˷�֧�������childrens
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




