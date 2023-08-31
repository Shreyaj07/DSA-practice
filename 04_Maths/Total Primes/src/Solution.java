import java.util.* ;
import java.io.*;
import java.util.Scanner;
class CountPrime {
    int totalPrime(int start, int end){
        return noOfPrimes(end) - noOfPrimes(start-1);
    }
    static int noOfPrimes(int n) {
        int count = 0;
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                count++;
            }
        }
        return count;
    }
    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}

class Solution {
    public static void main(String args[]) {

        CountPrime obj = new CountPrime();
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int e = sc.nextInt();
        System.out.println(obj.totalPrime(s, e));
    }
}

