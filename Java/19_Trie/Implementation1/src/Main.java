public class Main {
    public static void main(String[] args) {
        Trie t = new Trie();
        t.insertWord("ABCDE");
        t.insertWord("ARM");
        t.insertWord("DO");
        t.insertWord("TIME");
        System.out.println("Present or not: "+t.search("ABCDE"));
        System.out.println("Present or not: "+t.search("ABCD"));
        System.out.println("Present or not: "+t.search("ARM"));
        t.remove("ARM");
        System.out.println("Present or not: "+t.search("ARM"));
    }
}
/*
Time complexity
    insertion - O(l) [l-> length of word]
    search - O(l)
 =================
 remove -> search and isTerminal - false
* */