public class Trie {
    Trie(){
        root = new TrieNode('\0'); //null character
    }
    TrieNode root;
    void insertUtil(TrieNode root,String word){
        //base case
        if(word.length()==0){
            root.isTerminal  = true;
        }
        //assumption - word will be in caps
        int index = word.charAt(0) - 'A';
        TrieNode child;
        //present
        if(root.children[index] != null){
            child = root.children[index];
        }else{
            //absent
            child = new TrieNode(word.charAt(0));
            root.children[index] = child;
        }
        //recursion
        insertUtil(child,word.substring(1));
    }
    void insertWord(String word){
        insertUtil(root,word);
    }
}
