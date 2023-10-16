import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution1 {
    public static void main(String[] args) {
        System.out.println(printPascal(4));
        System.out.println();
        System.out.println(printPascal(1));
        System.out.println();
        System.out.println(printPascal(2));
        System.out.println();
        System.out.println(printPascal(3));
    }
    public static ArrayList<ArrayList<Long>> printPascal(int n) {
        // Write your code here.
        ArrayList<ArrayList<Long>> al = new ArrayList<>();
        al.add(new ArrayList<>(Arrays.asList(1L)));
        if(n==0){
            return al;
        }
        al.add(new ArrayList<>(Arrays.asList(1L,1L)));
        if(n==1){
            return al;
        }
        for(int i=2; i<n; i++){
            ArrayList<Long> temp = new ArrayList<>();
            temp.add(1L);
            for(int j=1; j<i; j++){
                temp.add(al.get(i-1).get(j-1)+al.get(i-1).get(j));
            }
            temp.add(1L);
            al.add(temp);
        }
        return al;
    }
}
