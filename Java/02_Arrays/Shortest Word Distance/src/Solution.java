import java.util.* ;
import java.io.*; 
public class Solution {
    public static void main(String[] args) {
        String[] bookShelf = {"alpha","beta","gamma","theta","beta","theta","beta"};
        System.out.println(minimumDistance(bookShelf,"theta","beta"));
        String[] bookShelf2 = {"be","cool","whatever","the","situation","is"};
        System.out.println(minimumDistance(bookShelf2,"situation","cool"));
    }
    public static int minimumDistance(String[] arr, String book1, String book2) {
   		// // Write your code here
           int minDis = Integer.MAX_VALUE;
        //    for(int i=0; i<arr.length; i++){
        //        for(int j=i+1; j<arr.length; j++){
        //            if((arr[i].equals(book1) && arr[j].equals(book2))||(arr[i].equals(book2) && arr[j].equals(book1))){
        //                minDis = Math.min(minDis, Math.abs(i-j));
        //            }
        //        }
        //    }
        //    return minDis;
        int index1=-1,index2=-1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(book1)) {
                index1 = i;
            } else if (arr[i].equals(book2)) {
                index2 = i;
            }
            
            if (index1 != -1 && index2 != -1) {
                minDis = Math.min(minDis, Math.abs(index1 - index2));
            }
        }
        return minDis;

    }   
}