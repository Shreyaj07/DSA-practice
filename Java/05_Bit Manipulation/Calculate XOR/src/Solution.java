public class Solution {
    public static void main(String[] args) {
        System.out.println(calculateXOR(3));
        System.out.println(calculateXOR(7));
        System.out.println(calculateXOR(9));
        System.out.println(normalApproach(7));
    }
    public static int normalApproach(int n){
        int sum =0;
        for(int i=0; i<=n; i++){
            sum ^= i;
        }
        return sum;
    }
	public static int calculateXOR(int n) {
        int xor = 0;
        if (n % 4 == 0) {
            xor = n;
        } else if (n % 4 == 1) {
            xor = 1;
        } else if (n % 4 == 2) {
            xor = n + 1;
        } else {
            xor = 0;
        }

        return xor;
	}
}
