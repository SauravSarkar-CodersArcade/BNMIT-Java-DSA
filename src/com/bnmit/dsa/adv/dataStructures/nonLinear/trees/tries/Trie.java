package com.bnmit.dsa.adv.dataStructures.nonLinear.trees.tries;

import java.util.Arrays;
import java.util.List;

class TrieNode {
    TrieNode[] children;
    boolean wordEnd;
    TrieNode(){
        wordEnd = false;
        children = new TrieNode[26]; // Alphabets a to z ot A to Z
    }
}
public class Trie {
    // insert & search -> aryan -> {'a','r','y','a','n'};
    static void insertWord(TrieNode root, String word){
        TrieNode curr = root;
        for (char c : word.toCharArray()){
            if(curr.children[c-'a'] == null){
                // null means node is not present
                // So, we create a node of that character
                curr.children[c-'a'] = new TrieNode();
            }
            // Move to the children node for the next character
            curr = curr.children[c-'a'];
        }
        curr.wordEnd = true; // We have stored the word
    }
    static boolean searchWord(TrieNode root, String word){
        TrieNode curr = root;
        for (char c : word.toCharArray()){
            if(curr.children[c-'a'] == null){
                // Node is not present in the trie, return false
                return false;
            }
            curr = curr.children[c-'a'];
        }
        return curr.wordEnd;
    }

    public static void main(String[] args) {
        TrieNode root = new TrieNode();
        List<String> inputWords = Arrays.
                asList("ananya", "yathin", "dhriti", "kamal", "vishakh");
        for (String word : inputWords){
            insertWord(root,word);
        }
        List<String> searchWords = Arrays.
                asList("ananya", "yathin", "dhriti", "kamal", "vishakh",
                        "saurav", "ashank", "rahul");
        for (String word : searchWords){
            if(searchWord(root,word)){
                System.out.println(word + " is present in the Trie.");
            }else {
                System.out.println(word + " is not present in the Trie.");
            }
        }
    }
}
