package com.bnmit.dsa.adv.dataStructures.nonLinear.trees.tries.longestCommonPrefix;
import java.util.Arrays;
class TrieNode{
    TrieNode[] children = new TrieNode[26];
    boolean isEndOfWord;
    int childrenCount;
    TrieNode(){
        isEndOfWord = false;
        childrenCount = 0;
        Arrays.fill(children,null);
    }
}
public class LongestCommonPrefix {
    public static void insert(TrieNode root, String key){
        TrieNode current = root;
        for(char c : key.toCharArray()){
            int index = c - 'a';
            if(current.children[index] == null){
                current.children[index] = new TrieNode();
                current.childrenCount++;
            }
            current = current.children[index];
        }
        current.isEndOfWord = true;
    }
    public static String longestCommonPrefix(TrieNode root){
        // c+o+d+e -> StringBuilder
        StringBuilder prefix = new StringBuilder();
        TrieNode current = root;
        while (current != null && current.childrenCount == 1 && !current.isEndOfWord){
            for (int i=0; i<26; i++){
                if(current.children[i] != null){
                    prefix.append((char) (i + 'a'));
                    current = current.children[i]; // Move to the next character
                    break;
                }
            }
        }
        return prefix.toString();
    }
    public static void main(String[] args) {
        TrieNode root = new TrieNode();
        String[] words = {"flower", "flow", "flight", "flown", "fly","ab"};
        for (String word : words){
            insert(root,word);
        }
        String lcp = longestCommonPrefix(root); // fl
        if(lcp.isEmpty()){
            System.out.println("There's no common prefix among the input words.");
        }else {
            System.out.println("The longest common prefix is: " + lcp);
        }
    }
}
