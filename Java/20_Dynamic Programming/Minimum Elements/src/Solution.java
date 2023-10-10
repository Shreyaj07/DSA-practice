import java.util.* ;
import java.io.*;
import java.util.stream.IntStream;

//https://www.codingninjas.com/studio/problems/minimum-elements_3843091
public class Solution {
    public static void main(String[] args) {
        int[] num = IntStream.range(1,4).toArray();
        System.out.println(minimumElements(num,7));
        System.out.println(minimumElements(new int[]{1},0));
        System.out.println(minimumElements(new int[]{12,1,3},4));
        System.out.println(minimumElements(new int[]{3 ,20 ,21 ,6 ,16 ,4 ,19 ,8 ,7 ,18, 22}, 65));
    }
    public static int minimumElements(int num[], int x) {
        if(x == 0){
            return 0;
        }
        Arrays.sort(num);
//        System.out.println(Arrays.toString(num));
        int sum = 0;
        int count =0;
        for(int i=num.length-1; i>=0; i--){
            int div = (x-sum)/num[i];
            int tempSum = sum+ (div*num[i]);
            if(tempSum<=x){
                sum=tempSum;
                count+=div;
            }
        }
        if(sum==x){
            return count;
        }
        return -1;
    }
}