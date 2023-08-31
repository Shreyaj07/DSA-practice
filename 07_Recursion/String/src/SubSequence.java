import java.util.ArrayList;

public class SubSequence {
    public static void main(String[] args) {
        subsequent("","abc");
        System.out.println();
        subsequent("","abcd");
        System.out.println();
        ArrayList<String> al = subsequence("","abc");
        System.out.println(al);
    }
    static void subsequent(String p, String up){
        if(up.isEmpty()){
            System.out.print(p+" ");
            return;
        }
        char ch = up.charAt(0);
        subsequent(p,up.substring(1));
        subsequent(p+ch,up.substring(1));
    }
    static ArrayList<String> subsequence(String p, String up){
        ArrayList<String> al = new ArrayList<>();
        if (up.isEmpty()) {
            al.add(p);
            return al;
        }
        char ch = up.charAt(0);
        al.addAll(subsequence(p, up.substring(1)));
        al.addAll(subsequence(p + ch, up.substring(1)));
        return al;
    }
}
