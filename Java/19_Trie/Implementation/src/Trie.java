//https://www.codingninjas.com/studio/problems/implement-trie_631356?topList=love-babbar-dsa-sheet-problems&leftPanelTab=2&utm_source=youtube&utm_medium=affiliate&utm_campaign=Lovebabbar

public class Trie {
    TrieNode root;
    public class TrieNode {
        char data;
        boolean isTerminal;
        TrieNode[] children;
        TrieNode(char data) {
            this.data = data;
            isTerminal = false;
            children = new TrieNode[26];
        }
    }

    //Initialize your data structure here
    Trie() {
        root = new TrieNode('\0');
    }

    //Inserts a word into the trie
    public void insert(String word) {
        //Write your code here
        insertUtil(root, word);
    }

    public void insertUtil(TrieNode node, String word) {
        //base case
        if (word.length() == 0) {
            node.isTerminal = true;
            return;
        }
        int index = word.charAt(0) - 'a';
        TrieNode child;
        //present
        if (node.children[index] != null) {
            child = node.children[index];
        } else {
            //absent
            child = new TrieNode(word.charAt(0));
            node.children[index] = child;
        }
        insertUtil(child, word.substring(1));
    }

    //Returns if the word is in the trie

    public boolean search(String word) {
        //Write your code here
        return searchUtil(root, word);
    }
    public boolean searchUtil(TrieNode node, String word) {
        //base case
        if (word.length() == 0) {
            return node.isTerminal;
        }
        int index = word.charAt(0) - 'a';
        TrieNode child;
        //character present
        if (node.children[index] != null) {
            child = node.children[index];
        } else {
            return false;
        }
        return searchUtil(child, word.substring(1));
    }
    //Returns if there is any word in the trie that starts with the given prefix
    public boolean startsWith(String prefix) {
        //Write your code here
        return startsWith(root, prefix);
    }
    public boolean startsWith(TrieNode node, String prefix) {
        if (prefix.length() == 0) {
            return true;
        }
        int index = prefix.charAt(0) - 'a';
        TrieNode child;
        if (node.children[index] != null) {
            child = node.children[index];
        } else {
            return false;
        }
        return startsWith(child, prefix.substring(1));
    }
}




