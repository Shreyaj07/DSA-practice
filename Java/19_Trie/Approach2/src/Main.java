public class Main {
    public static void main(String[] args) {
        Trie t = new Trie();
        t.insert("ARE");
        t.insert("GO");
        t.insert("TIME");
        System.out.println(t.search("A"));
        System.out.println(t.search("ARE"));
        System.out.println(t.startsWith("A"));
        System.out.println(t.startsWith("H"));
        System.out.println(t.search("ARE"));
    }
}