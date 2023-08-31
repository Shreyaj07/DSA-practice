import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
       Solution solution = new Solution();
       int[] arr = {3,2,3};
       List<Integer> list = solution.majorityElement(arr);
        System.out.println("Element occuring more that n/3 times in an array "+ Arrays.toString(arr) + " is/are: " + list);
    }
}