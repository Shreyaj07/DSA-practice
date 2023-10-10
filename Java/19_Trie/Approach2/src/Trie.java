public class Trie {
    TrieNode root;
    Trie(){
        root = new TrieNode();
    }

    void insert(String word){
       TrieNode current = root;
       for(int i=0; i<word.length(); ++i){
           int index = word.charAt(i) - 'a';
           if(!current.child.containsKey(index)){
               current.child.put(index,new TrieNode());
           }
           current = current.child.get(index);
       }
       current.isEnd = true;
    }

    boolean search(String word){
        TrieNode current = root;
        for(int i=0; i<word.length(); ++i){
            int index = word.charAt(i)- 'a';
            if(!current.child.containsKey(index)){
                return false;
            }
            current = current.child.get(index);
        }
        return current.isEnd;
    }
    boolean startsWith(String prefix){
        TrieNode current = root;
        for(int i=0; i<prefix.length(); ++i){
            int index = prefix.charAt(i) - 'a';
            if(!current.child.containsKey(index)){
                return false;
            }
            current = current.child.get(index);
        }
        return true;
    }
}
