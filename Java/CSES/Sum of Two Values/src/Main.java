import java.util.HashMap;
import java.util.Scanner;

//https://cses.fi/problemset/task/1640
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int target = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        HashMap<Integer, Integer> hmap = new HashMap<>();
        boolean gotAns = false;
        for (int i = 0; i < size; i++) {
            int rem = target - arr[i];
            if (hmap.containsKey(rem)) {
                System.out.println(arr[hmap.get(rem)] + " " + arr[i]);
                gotAns = true;
            }
            hmap.put(arr[i], i); // Put the element as the key and its index as the value.
        }
        if (!gotAns) {
            System.out.println("IMPOSSIBLE");
        }
//        boolean gotAns = false;
//        for(int i=0; i<size-1; i++){
//            for(int j=i+1; j<size; j++){
//                if(arr[i] + arr[j]==target){
//                    System.out.println(arr[i] + " "+arr[j]);
//                    gotAns = true;
//                    break;
//                }
//            }
//        }
//        if(!gotAns){
//            System.out.println("IMPOSSIBLE");
//        }
    }
}