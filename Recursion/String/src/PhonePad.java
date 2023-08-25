import java.util.ArrayList;

public class PhonePad {
    public static void main(String[] args) {
        pad("","12");
        System.out.println(padList("","12"));
        System.out.println(padCount("","12"));
    }
    static void pad(String p, String up){
        if(up.isEmpty()){
            System.out.print(p + " ");
            return;
        }
        int digit = up.charAt(0)-'0'; // this will convert '2' to 2
        for(int i=(digit-1)*3; i<digit*3; i++){
            char ch =(char)('a'+i);
            pad(p+ch,up.substring(1));
        }
    }
    static int padCount(String p, String up){
        if(up.isEmpty()){
            System.out.print(p + " ");
            return 1;
        }
        int count=0;
        int digit = up.charAt(0)-'0'; // this will convert '2' to 2
        for(int i=(digit-1)*3; i<digit*3; i++){
            char ch =(char)('a'+i);
            count+=padCount(p+ch,up.substring(1));
        }
        return count;
    }
    static ArrayList<String> padList(String p, String up){
        ArrayList<String> al = new ArrayList<>();
        if(up.isEmpty()){
            al.add(p);
            return al;
        }
        int digit = up.charAt(0)-'0'; // this will convert '2' to 2
        for(int i=(digit-1)*3; i<digit*3; i++){
            char ch =(char)('a'+i);
            al.addAll(padList(p+ch,up.substring(1)));
        }
        return al;
    }

}