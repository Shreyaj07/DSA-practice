import java.util.ArrayList;

public class Permutation {
    //no of recursive call = size of processed + 1
    public static void main(String[] args) {
        permutations("","abc");
        System.out.println();
        System.out.println(permutation("","abc"));
        System.out.println(permutationsCount("","abcd"));
    }
    static void permutations(String p, String up){
        if(up.isEmpty()){
            System.out.print(p +" ");
            return;
        }
        char ch = up.charAt(0);
        int count=0;
        for(int i =0; i<=p.length(); i++){
            String f = p.substring(0,i);
            String s = p.substring(i);
            permutations(f+ch+s,up.substring(1));
        }
    }

    static int permutationsCount(String p, String up){
        if(up.isEmpty()){
            return 1;
        }
        char ch = up.charAt(0);
        int count=0;
        for(int i =0; i<=p.length(); i++){
            String f = p.substring(0,i);
            String s = p.substring(i);
            count = count + permutationsCount(f+ch+s,up.substring(1));
        }
        return count;
    }

    static ArrayList<String> permutation(String p, String up){
        ArrayList<String> al = new ArrayList<>();
        if(up.isEmpty()){
            al.add(p);
            return al;
        }
        char ch = up.charAt(0);
        for(int i =0; i<=p.length(); i++){
            String f = p.substring(0,i);
            String s = p.substring(i);
            al.addAll(permutation(f+ch+s,up.substring(1)));
        }
        return al;
    }
}
