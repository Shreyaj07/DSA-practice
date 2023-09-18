
import java.util.ArrayList;

public class Solution {
    public static ArrayList<ArrayList<String>> phoneDirectory(ArrayList<String> contactList, String queryStr) {
       //create a trie
        Trie t = new Trie();
        //insert all contacts in trie
        for(int i=0; i<contactList.size(); i++){
            t.insert(contactList.get(i));
        }
        //return suggestions
        ArrayList<ArrayList<String>> suggestions = new ArrayList<>();
        return getSuggestions(queryStr);
    }

    private static ArrayList<ArrayList<String>> getSuggestions(String queryStr) {

    }
}
class Trie{
    TrieNode root;
    Trie(){
        root = new TrieNode('\0');
    }
    void insert(String word){
        insertUtil(word,root);
    }
    void insertUtil(String word, TrieNode node){
        //base case
        if(word.length()==0){
            return;
        }
        TrieNode child;
        int index = node.data - 'a';
        if(node.children[index] != null){
            child = node.children[index];
        }else{
            child = new TrieNode(word.charAt(0));
            node.children[index] = child;
        }
        insertUtil(word.substring(1),child);
    }
}
class TrieNode{
    char data;
    TrieNode[] children;
    boolean isTerminal;

    TrieNode(char data){
        this.data = data;
        this.children = new TrieNode[26];
        this.isTerminal = false;
    }
}