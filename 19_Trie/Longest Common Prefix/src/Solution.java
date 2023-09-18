
public class Solution {

	public static String longestCommonPrefix(String[] arr, int n) {
		Trie t = new Trie();
		for(int i=0; i<n; i++){
			t.insert(arr[i]);
		}
		return t.longestPrefix();
	}

}
class TrieNode{
	char data;
	TrieNode[] children = new TrieNode[26];
	TrieNode(char data){
		this.data = data;
		this.children = new TrieNode[26];
	}
}

class Trie{
	TrieNode root;
	Trie(){
		root = new TrieNode('\0');
	}
	 void insert(String word){
		insertUtils(word,root);
	 }
	 void insertUtils(String word, TrieNode node){
		//base case
		if(word.length()==0){
			return;
		}
		int index = word.charAt(0) - 'a';
		TrieNode child;
		if(node.children[index]!=null){
			child = node.children[index];
		}else{
			child = new TrieNode(word.charAt(0));
			node.children[index] = child;
		}
		insertUtils(word.substring(1),child);
	}
	  int noOfChildren(TrieNode node){
		int count = 0;
		for(TrieNode child: node.children){
			if(child!=null){
				count++;
			}
		}
		return count;
	}
	 String longestPrefix() {
		StringBuilder prefix = new StringBuilder();
		TrieNode current = root;
		while(current!=null && noOfChildren(current)==1){
			char nextChar = 0;
			for(int i=0; i<26; i++){
				if(current.children[i]!=null){
					nextChar = (char)('a'+i);
					current = current.children[i];
					break;
				}

			}
			prefix.append(nextChar);
		}
		return prefix.toString();
	}
}



