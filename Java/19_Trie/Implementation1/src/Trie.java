public class Trie {
    Trie(){
        root = new TrieNode('\0'); //null character
    }
    TrieNode root;
    void insertUtil(TrieNode root,String word){
        //base case
        if(word.length()==0){
            root.isTerminal  = true;
            return;
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
    boolean search(String word){
        return searchUtil(root,word);
    }

    private boolean searchUtil(TrieNode root, String word) {
        //base case
        if(word.length()==0){
            return root.isTerminal;
        }
        int index = word.charAt(0) - 'A';
        TrieNode child;
        //char present
        if(root.children[index] != null){
            child = root.children[index];
        }else {
            ///absent
            return false;
        }
        return searchUtil(child,word.substring(1));
    }
    void remove(String word){
        boolean isPresent = search(word);
        if(!isPresent){
            return;
        }
        removeUtil(root,word,0);
    }

    private void removeUtil(TrieNode node, String word, int index) {
        //base case: we reached the end of the word
        if(index==word.length()){
            node.isTerminal = false;
            return;
        }
        //calculate the index for the current character
        int charIndex = word.charAt(index)- 'A';
        TrieNode child = node.children[charIndex];
        removeUtil(child,word,index+1);
    }
}
