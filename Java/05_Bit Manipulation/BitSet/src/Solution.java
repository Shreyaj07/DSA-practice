import java.io.*;
import java.util.*;
//https://www.hackerrank.com/challenges/java-bitset
public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        //size of both bitsets
        int n = sc.nextInt();
        //no. of operations to perform
        int m = sc.nextInt();
        BitSet b1 = new BitSet(n);
        BitSet b2 = new BitSet(n);
        for(int i=0; i<n; i++){
            b1.set(0);
        }
        for(int i=0; i<m; i++){
            String operation = sc.next();
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            switch (operation){
                case "AND":
                    System.out.println(b1.hashCode());
                    break;
                case "OR":
                    break;
                case "XOR":
                    break;
                case "FLIP":
                    break;
                case "SET":
                    break;
                default:
                    System.out.println("Invalid operation");
            }
        }
    }

}