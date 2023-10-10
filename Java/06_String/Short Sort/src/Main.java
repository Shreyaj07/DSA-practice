import java.util.Arrays;
import java.util.Scanner;

//https://codeforces.com/problemset/problem/1873/Ahttps://codeforces.com/problemset/problem/1873/A
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int noOfTestCases = sc.nextInt();
        String[] ans = new String[noOfTestCases];
        for(int i=0; i<noOfTestCases; i++){
            String s = sc.next();
            if(s.equals("abc") || s.equals("bac") || s.equals("acb") || s.equals("cba")){
                ans[i] = "YES";
            }else{
                ans[i] = "NO";
            }
        }
        for(int i=0; i<noOfTestCases; i++){
            System.out.println(ans[i]);
        }
    }
}