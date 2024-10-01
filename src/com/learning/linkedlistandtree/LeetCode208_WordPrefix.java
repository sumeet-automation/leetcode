package com.learning.linkedlistandtree;


public class LeetCode208_WordPrefix {

}

class TrieNode {
    TrieNode[] children = new TrieNode[26];
    boolean isWordEnded = false;
}

class Trie2 {

    TrieNode root;

    public Trie2() {
        root = new TrieNode();
    }

    public void insert(String word) {
        TrieNode node = root;
        for (char ch : word.toCharArray()) {
            if (node.children[ch - 'a'] == null) {
                node.children[ch - 'a'] = new TrieNode();
            }
            node = root.children[ch - 'a'];
        }
        node.isWordEnded = true;
    }

    public boolean search(String word) {
        TrieNode node = root;
        for (char ch : word.toCharArray()) {
            if (node.children[ch - 'a'] == null) {
                return false;
            }
            node = root.children[ch - 'a'];
        }
        return node.isWordEnded;
    }

    public boolean startsWith(String prefix) {
        TrieNode node = root;
        for (char ch : prefix.toCharArray()) {
            if (node.children[ch - 'a'] == null) {
                return false;
            }
            node = root.children[ch - 'a'];
        }
        return true;
    }
}
