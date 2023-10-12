import java.util.HashSet;
import java.util.Scanner;

//https://cses.fi/problemset/task/1621/
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> hs = new HashSet<>();
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
           int temp = sc.nextInt();
           hs.add(temp);
        }
        System.out.println(hs.size());
    }
}