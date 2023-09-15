public class TrieNode {
    char data;
    TrieNode[] children = new TrieNode[26];
    boolean isTerminal;
    TrieNode(char ch){
        data = ch;
        for(int i=0; i<26; i++){
            children[i] = null;
        }
        isTerminal = false;
    }
}
