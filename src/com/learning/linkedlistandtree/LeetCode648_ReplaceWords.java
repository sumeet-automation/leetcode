package com.learning.linkedlistandtree;

import java.util.List;

public class LeetCode648_ReplaceWords {
    public String replaceWords(List<String> dictionary, String sentence) {
        StringBuilder sb = new StringBuilder();
        Trie trie = new Trie();
        for (String word : dictionary) {
            trie.addWord(word);
        }
        for (String word : sentence.split(" ")) {
            String prefix = trie.findPrefix(word);
            if (prefix.isEmpty()) {
                sb.append(word);
            } else {
                sb.append(prefix);
            }
            sb.append(" ");
        }
        return sb.toString().trim();
    }
}
    class Node {
        boolean isLastWord;
        Node[] child;

        Node() {
            child = new Node[26];
            isLastWord = false;

        }
    }

    class Trie {
        Node root;

        Trie() {
            root = new Node();
        }

        public void addWord(String word) {
            Node temp = root;
            for (char ch : word.toCharArray()) {
                int index = ch - 'a';//getting index of each character
                if (temp.child[index] == null) {
                    temp.child[index] = new Node();
                }
                temp = temp.child[index];
            }
            temp.isLastWord = true;
        }

        public String findPrefix(String word) {
            Node temp = root;
            for (int i=0;i<word.length();i++) {
                int index = word.charAt(i) - 'a';
                //re
                if (temp.child[index] == null) {
                    return "";
                }
                temp = temp.child[index];
                if(temp.isLastWord){
                    return word.substring(0, i + 1);
                }
            }
            return "";
        }
    }

