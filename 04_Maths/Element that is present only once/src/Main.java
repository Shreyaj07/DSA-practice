import java.util.Arrays;

public class Main {
    /*
    find the element that is present once in an arry
    where every other element is present twice
    * */
    public static void main(String[] args) {
        int[] arr = {1,3,5,6,6,3,1};
        System.out.println(presentOnce(arr));
    }

    private static int presentOnce(int[] arr) {
        int xor = 0;
        for (int j : arr) {
            xor ^= j;
        }
        return xor;
    }
}