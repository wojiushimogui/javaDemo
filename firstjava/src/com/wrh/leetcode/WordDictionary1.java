package com.wrh.leetcode;

import java.util.ArrayList;
import java.util.List;

public class WordDictionary1 {
	// Adds a word into the data structure.
	List<String> words = new ArrayList<String> ();
    public void addWord(String word) {
        words.add(word);
    }

    // Returns if the word is in the data structure. A word could
    // contain the dot character '.' to represent any one letter.
    public boolean search(String word) {
        for(String str:words){
        	if(str.matches(word)){
        		return true;
        	}
        }
        return false;
    }
    
    public static void main(String[] args){
    	WordDictionary1 wd = new WordDictionary1();
    	wd.addWord("pad");
    	wd.addWord("bad");
    	System.out.println(wd.search("ad"));
    	System.out.println(wd.search(".ad"));
    }
}
