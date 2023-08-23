public class Solution {
    public static int countSetBits(int n) {
        StringBuilder sb = new StringBuilder();
        int count=0;
        while(n>0){
            int rem = n%2;
            n /=2;
            sb.insert(0, rem);
            if(rem==1){
                count++;
            }
        }
        System.out.println(count);
        return count;
    }
}