import java.util.ArrayList;

public class Subsequence {

    public static void main(String[] args) {
        Subsequence.subseq("", "abc");
        System.out.println();
        System.out.println(Subsequence.subsequent("", "abc"));
    }

    public static void subseq(String p, String up) {
        if (up.isEmpty()) {
            System.out.print(p + ' ');
            return;
        }
        char ch = up.charAt(0);
        subseq(p + ch, up.substring(1));
        subseq(p, up.substring(1));
    }

    public static ArrayList subsequent(String p, String up) {
        ArrayList<String> al = new ArrayList<>();
        if (up.isEmpty()) {
            if (!p.isEmpty()) {
                al.add(p);
            }
            return al;
        }
        char ch = up.charAt(0);
        al.addAll(subsequent(p + ch, up.substring(1)));
        al.addAll(subsequent(p, up.substring(1)));
        return al;
    }
}