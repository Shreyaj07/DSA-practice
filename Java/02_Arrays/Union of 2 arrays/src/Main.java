public class Main {
    public static void main(String[] args) {
        int[] num1 = {1,2,3,4,5};
        int[] num2 = {1,2,3};
        int ans = Solution.doUnion(num1,num1.length,num2,num2.length);
        System.out.println(ans);
    }
}