public class Solution{
    public static void swapNumber(int []a, int []b) {
        if (a.length != b.length) {
            throw new IllegalArgumentException("Arrays must have the same length");
        }
        int[] temp = new int[a.length];
        System.arraycopy(a, 0, temp, 0, a.length);
        System.arraycopy(b, 0, a, 0, b.length);
        System.arraycopy(temp, 0, b, 0, temp.length);
    }
}