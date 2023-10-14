import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class Solution {
    public static void main(String[] args) {
        System.out.println(kThCharaterOfDecryptedString("a2b3cd3",8L));
        System.out.println(kThCharaterOfDecryptedString("ab12c3",20L));
    }
    public static char kThCharaterOfDecryptedString(String s, Long k) {
        // Write your code here
        StringBuilder sb = new StringBuilder();
        String[] alphabet = s.split("[0-9]");
        String[] number = s.split("[a-z]");
        ArrayList<String> alpha = new ArrayList<>();
        ArrayList<String> len = new ArrayList<>();
        for (String item : alphabet) {
            if (!Objects.equals(item, "")) {
                alpha.add(item);
            }
        }
        for (String value : number) {
            if (!Objects.equals(value, "")) {
                len.add(value);
            }
        }
//        System.out.println(Arrays.toString(alphabet));
//        System.out.println(Arrays.toString(number));
//        System.out.println(alpha);
//        System.out.println(len);
        for(int i=0; i<len.size(); i++){
            String temp = alpha.get(i);
            for(int j=1; j<=Integer.parseInt(len.get(i));j++){
                sb.append(temp);
            }
        }
//        System.out.println(sb);
        return sb.toString().charAt((int) (k-1));
    }
}