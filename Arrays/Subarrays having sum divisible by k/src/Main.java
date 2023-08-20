import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 4, 5, 2));
        System.out.println(Solution.subArrayCount(arr,3));
    }
}