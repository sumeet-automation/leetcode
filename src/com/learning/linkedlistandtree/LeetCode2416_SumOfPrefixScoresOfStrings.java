package com.learning.linkedlistandtree;

public class LeetCode2416_SumOfPrefixScoresOfStrings {


    //Prefix Count
    //Create Prefix T
    public int[] sumPrefixScores(String[] words) {
        Trie trie = new Trie();
        int count[] = new int[words.length];
        for (String word : words) {
            trie.addWord(word);
        }
        int index=0;
        for (String word : words) {
            count[index] = trie.findPrefixCount(word);
            index++;
        }
        return count;
    }

    class Node{
        Node child[];
        int count;
        Node(){
            child = new Node[26];
            count = 0;
        }
    }

    class Trie{
        Node root;
        Trie(){
            root = new Node();
        }

        public void addWord(String word){
            Node temp = root;
            for (char ch : word.toCharArray()) {
                int index = ch - 'a';
                if (temp.child[index] == null) {
                    temp.child[index] = new Node();
                }
                temp.child[index].count++;
                temp = temp.child[index];
            }
        }

        public int findPrefixCount(String word) {
            Node temp = root;
            int count=0;
            for (char ch : word.toCharArray()) {
                int index = ch - 'a';
                count += temp.child[index].count;
                temp = temp.child[index];
            }
            return count;
        }
    }
}
