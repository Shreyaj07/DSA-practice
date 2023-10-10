import java.util.HashMap;

public class TrieNode {
    HashMap<Integer, TrieNode> child;
    boolean isEnd;

    TrieNode(){
        child = new HashMap<Integer,TrieNode>();
        isEnd = false;
    }
}
