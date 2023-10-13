import java.util.*;
public class Solution {
    public static List<Integer> solve(int n, int[] arr, int q, int[][] queries) {
        // Write your code here.
        List<Integer> list = new ArrayList<Integer>();
        for(int j=0; j<q; j++){
            int operation = queries[j][0];
            int num1 = queries[j][1];
            int num2 = queries[j][2];
            switch(operation){
                case 0:
                    arr[num1] = num2;
                    break;
                case 1:
                    int even =0;
                    for(int i=num1; i<=num2; i++){
                        if(arr[i]%2==0){
                            even++;
                        }
                    }
                    list.add(even);
                    break;
                case 2:
                    int odd =0;
                    for(int i=num1; i<=num2; i++){
                        if(arr[i]%2!=0){
                            odd++;
                        }
                    }
                    list.add(odd);
                    break;
            }
        }
        return list;
    }

}
